import logo from './logo.svg';
import './App.css';

import React from "react";

import CalculateScore from "./Components/CalculateScore";

function App() {

    return (

        <div>

            <CalculateScore

                Name="XYZ"

                School="ABC Public School"

                Total={450}

                Goal={500}

            />

        </div>

    );

}



export default App;
