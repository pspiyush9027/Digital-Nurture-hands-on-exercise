import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      isLoading: true
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => {
        if (!response.ok) {
          throw new Error("Posts could not be loaded");
        }
        return response.json();
      })
      .then((data) => {
        const posts = data.map((item) => new Post(item.id, item.title, item.body));
        this.setState({ posts, isLoading: false });
      })
      .catch((error) => {
        this.setState({ isLoading: false });
        alert("Error while loading posts: " + error.message);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error) {
    alert("Something went wrong in Posts: " + error.message);
  }

  render() {
    if (this.state.isLoading) {
      return <p className="loading-message">Loading blog posts...</p>;
    }

    return (
      <main className="blog-page">
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <article className="post-card" key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </article>
        ))}
      </main>
    );
  }
}

export default Posts;
