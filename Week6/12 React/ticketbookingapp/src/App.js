import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";
import Login from "./Login";
import Logout from "./Logout";

class App extends Component {

    constructor() {
        super();

        this.state = {
            isLoggedIn: false
        };
    }

    handleLogin = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    handleLogout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        let button;
        let page;

        if (this.state.isLoggedIn) {
            button = <Logout onLogout={this.handleLogout} />;
            page = <UserPage />;
        } else {
            button = <Login onLogin={this.handleLogin} />;
            page = <GuestPage />;
        }

        return (

            <div style={{ padding: "20px" }}>

                <h1>Ticket Booking App</h1>

                {button}

                <hr />

                {page}

            </div>

        );
    }
}

export default App;