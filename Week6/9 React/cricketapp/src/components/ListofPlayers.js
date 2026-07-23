import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 88 },
        { name: "Gill", score: 65 },
        { name: "Rahul", score: 55 },
        { name: "Hardik", score: 80 },
        { name: "Jadeja", score: 45 },
        { name: "Ashwin", score: 78 },
        { name: "Bumrah", score: 25 },
        { name: "Shami", score: 60 },
        { name: "Siraj", score: 72 },
        { name: "Kuldeep", score: 50 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            <h3>All Players</h3>

            <ul>
                {
                    players.map((player, index) => (
                        <li key={index}>
                            {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>

            <h3>Players with score below 70</h3>

            <ul>
                {
                    below70.map((player, index) => (
                        <li key={index}>
                            {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>

        </div>
    );
}

export default ListofPlayers;