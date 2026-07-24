import CohortDetails from './components/CohortDetails.jsx';

const cohorts = [
  {
    name: 'Java FSE - February 2026',
    status: 'Ongoing',
    startDate: '10 Feb 2026',
    coach: 'Anita Sharma',
    learners: 32,
  },
  {
    name: 'React Learning Path',
    status: 'Completed',
    startDate: '03 Nov 2025',
    coach: 'Rahul Mehta',
    learners: 28,
  },
  {
    name: 'Spring Boot Foundation',
    status: 'Ongoing',
    startDate: '22 Mar 2026',
    coach: 'Kavita Nair',
    learners: 25,
  },
];

function App() {
  return (
    <main className="dashboard">
      <header>
        <p className="eyebrow">MY ACADEMY</p>
        <h1>Cohort dashboard</h1>
        <p className="intro">Track the current and completed learning cohorts in one place.</p>
      </header>

      <section className="cohort-list" aria-label="Cohort details">
        {cohorts.map((cohort) => (
          <CohortDetails key={cohort.name} cohort={cohort} />
        ))}
      </section>
    </main>
  );
}

export default App;
