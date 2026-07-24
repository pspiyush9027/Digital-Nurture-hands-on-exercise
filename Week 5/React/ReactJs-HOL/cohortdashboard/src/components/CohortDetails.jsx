import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  const titleColor = cohort.status.toLowerCase() === 'ongoing' ? 'green' : 'blue';

  return (
    <article className={styles.box}>
      <h3 style={{ color: titleColor }}>{cohort.name}</h3>
      <dl>
        <dt>Status</dt>
        <dd>{cohort.status}</dd>
        <dt>Start date</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coach}</dd>
        <dt>Learners</dt>
        <dd>{cohort.learners}</dd>
      </dl>
    </article>
  );
}

export default CohortDetails;
