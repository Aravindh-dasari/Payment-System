import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
//import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import { useNavigate } from "react-router";
import { TransactionTable } from './TransactionTable';

export function TransactionPage(){
  let navigate = useNavigate();
  const transactionNav = () => {
    navigate("/transactionpage");
  }
  const homeNav = () => {
    navigate("/home");
  }
  const transferNav = () => {
    let date = new Date()

    if (date.getDay() % 6 === 0) {

      window.alert("Sorry! Transactions are not allowed in weekends.")

    } else {

      navigate("/transfer");
    }

  }
  const dashboardNav = () => {
    navigate("/dashboard");
  }
  const customerdetailsNav = () => {
    navigate("/customerdetails");
  }
  return (
    <>
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
      {/* {localStorage.getItem('NavBar')} */}
    </Box>
    <TransactionTable/>
    </>
  );
    
}