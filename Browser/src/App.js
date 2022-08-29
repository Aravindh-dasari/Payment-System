//import logo from './logo.svg';

import { LoginPage } from "./Pages/LoginPage";
import { HomePage } from "./Pages/HomePage";
import { Transfer } from "./Pages/Transfer";
import {TransactionPage} from "./Pages/TransactionPage";
import {CustomerDetails} from "./Pages/CustomerDetails";
import { Dashboard } from "./Pages/Dashboard";
import { Route, Routes } from "react-router-dom";
import { CustDetails } from "./Pages/CustDetails";
import {CustTable} from "./Pages/CustTable";
import { PieChart, Pie} from 'recharts';
// import {Route,Routes} from 'react-router-dom';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
//import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import { useNavigate } from "react-router";


//import ReactDOM from "react-dom";
import './App.css';


function App() {

  let navigate=useNavigate();
  const transferNav=()=>{
      navigate("/transfer");}
    const homeNav=()=>{
        navigate("/home");}
    const transactionNav=()=>{
            navigate("/transactionpage");}
    const dashboardNav=()=>{
                navigate("/dashboard");}
    const customerdetailsNav=()=>{
     navigate("/customerdetails");
                }
  
   return (
     <div>
        <Box sx={{ flexGrow: 1 }}>
          <AppBar position="static">
            <Toolbar>
              {/* <Button color="inherit" onClick={homeNav}>Home</Button> */}
              <Button color="inherit" onClick={transactionNav}>Transactions</Button> 
              <Button color="inherit" onClick={dashboardNav}>Dashboard</Button>
              <Button color="inherit" onClick={customerdetailsNav}>Customer Details</Button>
              <Button color="inherit"  onClick={transferNav}>Transfer</Button>
            </Toolbar>
          </AppBar>
        </Box>
       <Routes>
         <Route path="/" element={<LoginPage />}/>
         <Route path="/home" element={<HomePage />}/>
         <Route path="/transfer" element={<Transfer />} />
         <Route path="/transactionpage" element={<TransactionPage />} />
         <Route path="/customerdetails" element={<CustomerDetails />} />
         <Route path="/dashboard" element={<Dashboard />} />
         <Route path="/customers" element={<CustTable />} />
        <Route path="/customers/:id" element={<CustDetails />}/>
         
       </Routes>
     </div>

   ) 
  }
export default App;

