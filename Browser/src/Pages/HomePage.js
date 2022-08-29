import { Transfer} from "./Transfer"
import { useNavigate } from "react-router";
import { Link } from "react-router-dom"

import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
//import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
export function HomePage()
{
 // return( 
    //<Link to={"/transferpage/"}> <Button color="inherit">Transfer</Button> </Link>)
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
   

}
