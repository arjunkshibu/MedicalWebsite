import React, { useState } from "react";
import './loginpage.css';
import { Link } from "react-router-dom";

const LoginPage = () => {
  const [emailValue, setEmailValue] = useState("");
  const [passwordValue, setPasswordValue] = useState("");

  const handleEmailChange = (event) => {
    setEmailValue(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPasswordValue(event.target.value);
  };

  const handleFormSubmit = (event) => {
    event.preventDefault();
    if (emailValue === "") {
      alert("Please enter your email address.");
    } else if (passwordValue === "") {
      alert("Please enter your password.");
    } else {
      // Handle form submission here
    }
  };
  
  return (
    <div className="login">
      <div className="left-container">
        <h1 className="logintext1">Login to Your Account</h1>
        <form onSubmit={handleFormSubmit}>
          <div className="email">
            <input
              type="email"
              id="email"
              name="email"
              placeholder="Email"
              value={emailValue}
              onChange={handleEmailChange}
              
            />
          </div>
          <div className="password">
            <input
              type="password"
              id="password"
              name="password"
              placeholder="Password"
              value={passwordValue}
              onChange={handlePasswordChange}
            />
            <h6 className="forgot">Forgot Password?</h6>
            <span className="loginlink" onClick={handleFormSubmit}>Login</span>
            <Link to="/signup">
            <span className="signuplink" onClick={handleFormSubmit}>Signup</span>
            </Link>
          </div>
        </form>
      </div>
      <div className="right-container">
        <h1 className="newhere">Discover what awaits you - Sign up today.</h1>
        <p className="newheretext">
        Join now to unlock exclusive access to top-tier medications and book hassle-free appointments with your preferred doctors! Don't wait - take control of your health today!{" "}
        </p>
        <div className="signup">
          <span>Sign Up</span>
        </div>
      </div>
    </div>
  );
};

export default LoginPage;
