import React, { Component } from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from './components/Login';
// import MainPage from "./components/MainPage";
import Register from './components/Register';
// import Home from "./components/Home"
import Reservation from "./components/Reservation";
import Profile from "./components/Profile";
import FutureTours from "./components/FutureTours";
import PastTours from "./components/PastTours";
// import Route_Review from "./components/Route_Review";

class App extends Component {
  render() {
    return (
        <div className="App">
          <Routes>
            <Route path="/login" element={<Login />}/>
            {/*<Route path="/" element={<MainPage />} />*/}
            <Route path="/register" element={<Register />} />
            {/*<Route path="/home" element={<Home />}/>*/}
            <Route path="/reservation" element={<Reservation />}/>
            <Route path="/profile" element={<Profile />}/>
            <Route path="/futureTours" element={<FutureTours />}/>
            <Route path="/pastTours" element={<PastTours />}/>
            {/*<Route path="routeReviews" element={<Route_Review />}/>*/}
          </Routes>

        </div>
    );
  }
}

export default App;
