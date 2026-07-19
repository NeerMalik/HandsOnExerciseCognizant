import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = (props.Total / props.Goal) * 100;

    return (

        <div className="container">

            <h1>Student Score Calculator</h1>

            <h2>Name : {props.Name}</h2>

            <h2>School : {props.School}</h2>

            <h2>Total Marks : {props.Total}</h2>

            <h2>Goal Marks : {props.Goal}</h2>

            <h2>Average : {average.toFixed(2)}%</h2>

        </div>

    );

}

export default CalculateScore;