import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
//import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import { useNavigate } from "react-router";
import axios from "axios";
import { useEffect, useState } from "react";
import Chart from "react-apexcharts";

export function Dashboard(){
    let navigate=useNavigate();
    const transferNav=()=>{
        navigate("/transfer");
      }
      const customerdetailsNav=()=>{
        navigate("/customerdetails");}
      const homeNav=()=>{
          navigate("/home");}
      const transactionNav=()=>{
              navigate("/transactionpage");}
      const dashboardNav=()=>{
                  navigate("/dashboard");}
                  const [seri, setSeri] = useState([])
                  const [lab, setLab] = useState([])
                  useEffect(() => {
                    axios.get("http://localhost:8080/message/pie")
                        .then(res => {
                          console.log(res.data)
                          setLab(res.data.pieMessage)
                          setSeri(res.data.pieFrequency)
                          
                        })
                        .catch(err => console.log("Couldnt fetch customer details"))
                }, [seri,lab])
    return (
      <div>
        <Box sx={{ flexGrow: 1 }}>
      {/* <AppBar position="static">
        <Toolbar>
          <Button color="inherit" onClick={homeNav}>Home</Button>
         <Button color="inherit" onClick={transactionNav}>Transactions</Button> 
         <Button color="inherit" onClick={dashboardNav}>Dashboard</Button>
         <Button color="inherit" onClick={customerdetailsNav}>Customer Details</Button>
         <Button color="inherit"  onClick={transferNav}>Transfer</Button>
        </Toolbar>
      </AppBar> */}
    </Box>
    <React.Fragment>
      <div className="container-fluid">
        <h3>Message Codes</h3>
        <Chart 
        type="pie"
        width={900}
        height={550}

        

        // series={[50,15.1,10.4,40.8]}
        // labels:['CHQB','CORT','HOLD','PHOB']
        series = {seri}

        options={{
          labels:lab
        }}
        
        >
        </Chart>
      </div>
    </React.Fragment>
 </div>
  );
    
    
}