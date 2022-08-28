import './App.css';
import React from 'react';
import { PieChart, Pie} from 'recharts';
import {TransferPage} from './TransferPage.js';
import  PieChart1 from './PieChart1.js';
import {Route,Routes} from 'react-router-dom';



function App(){
  return(
    <div>
    <div className="App">
      {/* <Muidemo/> */}
      <Routes>
        <Route path="/" element={<TransferPage/>}/>
        <Route path="/PieChart" element={<PieChart1/>}/>
      </Routes>
      </div>
      </div>
  );
}
  export default App;