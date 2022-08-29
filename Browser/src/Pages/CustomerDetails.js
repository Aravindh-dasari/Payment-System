import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
//import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import { useNavigate } from "react-router";
import axios from "axios"
import { useState,useEffect } from "react"
import { CircularProgress } from "@mui/material/CircularProgress"
import { Link } from "react-router-dom"
import { CustTable } from './CustTable';


export function CustomerDetails(){
  
            
    return (
   <CustTable/> 

    )  
}