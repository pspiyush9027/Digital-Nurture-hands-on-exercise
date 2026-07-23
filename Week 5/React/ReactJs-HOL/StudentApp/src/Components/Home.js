import React, { Component } from 'react';

class Home extends Component {
  render() {
    return React.createElement(
      'section',
      { className: 'portal-panel home-panel' },
      'Welcome to the Home page of Student Management Portal',
    );
  }
}

export default Home;
