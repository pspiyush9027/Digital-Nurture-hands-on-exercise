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
      return React.createElement(
        "p",
        { className: "loading-message" },
        "Loading blog posts..."
      );
    }

    return React.createElement(
      "main",
      { className: "blog-page" },
      React.createElement("h1", null, "Blog Posts"),
      this.state.posts.map((post) =>
        React.createElement(
          "article",
          { className: "post-card", key: post.id },
          React.createElement("h2", null, post.title),
          React.createElement("p", null, post.body)
        )
      )
    );
  }
}

export default Posts;
