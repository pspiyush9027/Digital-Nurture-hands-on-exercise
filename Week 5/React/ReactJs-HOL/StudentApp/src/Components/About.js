import React, { Component } from 'react';

class About extends Component {
  render() {
    return React.createElement(
      'section',
      { className: 'portal-panel about-panel' },
      'Welcome to the About page of the Student Management Portal',
    );
  }
}

export default About;
