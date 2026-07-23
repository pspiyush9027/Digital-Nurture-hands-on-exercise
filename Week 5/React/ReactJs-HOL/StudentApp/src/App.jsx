import About from './Components/About.js';
import Contact from './Components/Contact.js';
import Home from './Components/Home.js';

function App() {
  return (
    <main className="portal-shell">
      <header>
        <p className="portal-label">STUDENTAPP</p>
        <h1>Student Management Portal</h1>
      </header>
      <div className="portal-grid">
        <Home />
        <About />
        <Contact />
      </div>
    </main>
  );
}

export default App;
