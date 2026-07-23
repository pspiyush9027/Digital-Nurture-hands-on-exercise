import React, { Component } from 'react';

class Contact extends Component {
  render() {
    return React.createElement(
      'section',
      { className: 'portal-panel contact-panel' },
      'Welcome to the Contact page of the Student Management Portal',
    );
  }
}

export default Contact;
