import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import './App.css';
import FarmerLogin from './Components/FarmerLogin';
import BuyerLogin from './Components/BuyerLogin';
import AdminLogin from './Components/AdminLogin';
import FarmerReg from './Components/FarmerReg';
import BuyerReg from './Components/BuyerReg';
import AddProduct from './Components/AddProduct';
import Home from './Components/Home';
import BuyerCart from "./Components/BuyerCart";
import BuyerProfile from "./Components/BuyerProfile";
import BuyerWelcome from "./Components/BuyerWelcome";

function App() {
  return (
    <div className="App">
          <Routes>
          <Route path="/" element={<Home/>} />
            <Route path="/farmer-login" element={<FarmerLogin/>} />
            <Route path="/buyer-login" element={<BuyerLogin/>} />
            <Route path="/admin-login" element={<AdminLogin/>} />
            <Route path="/farmer-reg" element={<FarmerReg/>} />
            <Route path="/buyer-reg" element={<BuyerReg/>} />
            <Route path="/add-product" element={<AddProduct/>} />
            <Route path="/buyerprofile" element={<BuyerProfile/>} />
            <Route path="/BuyerWelcome" element={<BuyerWelcome/>} />
          </Routes>
        
      {/* <FarmerLogin></FarmerLogin>
      <BuyerLogin></BuyerLogin>
      <AdminLogin></AdminLogin>  
      <FarmerReg></FarmerReg>  
      <BuyerReg></BuyerReg>  
  <AddProduct></AddProduct>*/}
    </div>
  );
}

export default App;
