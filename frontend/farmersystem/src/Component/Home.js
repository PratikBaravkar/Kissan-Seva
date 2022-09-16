import React from "react";
import { Link } from "react-router-dom";

export default function Home()
{
    return(
    <><hr/>
    <Link to="/farmer-login">FarmerLogin</Link><hr/>
    <Link to="/buyer-login">BuyerLogin</Link><hr/>
    <Link to="/farmer-reg">Farmer Registration</Link><hr/>
    <Link to="/buyer-reg">Buyer Registration</Link><hr/>
    <Link to="/add-product">Add Product</Link><hr/>
    </>
    )
}