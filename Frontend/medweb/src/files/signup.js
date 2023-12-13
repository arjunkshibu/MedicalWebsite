// signup.js

import React from 'react';
import './signup.css';

function Signup() {
  return (
    <div className="signup-container">
      <h1 className='sptitle'>Get Started!</h1>
      <form className="signup-form">
        <label htmlFor="name">Name</label>
        <input type="text" id="name" name="name" />

        <label htmlFor="email">Email</label>
        <input type="email" id="email" name="email" />

        <label htmlFor="phone">Phone</label>
        <input type="tel" id="phone" name="phone" />

        <label htmlFor="address">Address</label>
        <input type="text" id="address" name="address" />

        <label htmlFor="password">Password</label>
        <input type="password" id="password" name="password" />

        <label htmlFor="cpassword">Confirm Password</label>
        <input type="password" id="cpassword" name="cpassword" />
        
        <button type="submit" className='spbutton'>Sign up</button>
        <button type="goback" className='back'>Back</button>
      </form>
    </div>
  );
}

export default Signup;
