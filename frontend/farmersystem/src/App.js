import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import './App.css';
import FarmerLogin from "./Component/FarmerLogin";
import BuyerLogin from "./Component/BuyerLogin";
import FarmerReg from "./Component/FarmerReg";
import BuyerReg from "./Component/BuyerReg";
import Home from "./Component/Home";
import { Link } from "react-router-dom";
import CustomProduct from "./Component/CustomProduct";

function App() {
  return (
    <div className="App">
      <Link to="/">Home</Link>
          <Routes>
          <Route path="/" element={<Home/>} />
            <Route path="/farmer-login" element={<FarmerLogin/>} />
            <Route path="/buyer-login" element={<BuyerLogin/>} />
            <Route path="/farmer-reg" element={<FarmerReg/>} />
            <Route path="/buyer-reg" element={<BuyerReg/>} />
            <Route path="/add-product" element={<CustomProduct/>} />
          </Routes>
    </div>
  );
}

export default App;
