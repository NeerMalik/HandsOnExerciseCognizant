import CohortDetails from "./components/CohortDetails";

function App() {
    return (
        <div>
            <h1>Cohort Dashboard</h1>

            <CohortDetails
                name="React Bootcamp"
                status="ongoing"
                trainer="John"
                coach="David"
                startDate="20 Jul 2026"
            />

            <CohortDetails
                name="Java Full Stack"
                status="completed"
                trainer="Alice"
                coach="Bob"
                startDate="10 Jan 2026"
            />
        </div>
    );
}

export default App;