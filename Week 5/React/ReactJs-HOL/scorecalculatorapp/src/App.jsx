import CalculateScore from './Components/CalculateScore.js';

function App() {
  return (
    <main className="app-shell">
      <CalculateScore
        name="Piyush Agarwal"
        school="Digital Nurture Academy"
        total={450}
        goal={5}
      />
    </main>
  );
}

export default App;
