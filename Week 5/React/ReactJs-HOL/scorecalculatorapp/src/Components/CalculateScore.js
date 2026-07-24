import React from 'react';

function CalculateScore({ name, school, total, goal }) {
  const averageScore = total / goal;

  return React.createElement(
    'section',
    { className: 'score-card' },
    React.createElement('p', { className: 'card-kicker' }, 'STUDENT RESULT'),
    React.createElement('h2', null, 'Score Calculator'),
    React.createElement(
      'dl',
      { className: 'score-details' },
      React.createElement('dt', null, 'Name'),
      React.createElement('dd', null, name),
      React.createElement('dt', null, 'School'),
      React.createElement('dd', null, school),
      React.createElement('dt', null, 'Total Score'),
      React.createElement('dd', null, total),
      React.createElement('dt', null, 'Goal'),
      React.createElement('dd', null, goal),
    ),
    React.createElement('p', { className: 'average-score' }, `Average Score: ${averageScore.toFixed(2)}`),
  );
}

export default CalculateScore;
