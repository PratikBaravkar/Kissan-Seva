import React from "react";
import { Link } from "react-router-dom";

function Home() {
  return (
    <div>
      <h1>This is the home page</h1>
      <Link to="/farmer-login">Farmer Login</Link><br/>
      <Link to="/buyer-login">Buyer Login</Link><br/>
      <Link to="/admin-login">Admin Login</Link><br/>
      <Link to="/farmer-reg">Farmer Registration</Link><br/>
      <Link to="/buyer-reg">Buyer Registration</Link><br/>
      <Link to="/add-product">Add Product</Link><br/>
      <Link to="/buyer-cart">Add to cart</Link><br/>
      <Link to="/Farmers-Profile">Farmers Profile</Link><br/>
      <Link to="/buyerprofile">BuyerProfile</Link><br/>
      <Link to="/BuyerWelcome">BuyerWelcome</Link><br/>
    </div>
  );
}

export default Home;
