//import { ChargingStation } from "@mui/icons-material";
import axios from "axios";
import React, { useEffect, useState } from "react";
// import { VictoryPie } from "victory-pie";


import Chart from "react-apexcharts";


// const myData = [
//   { x: "CHQB", y: 50 },
//   { x: "CORT", y: 15.1 },
//   { x: "HOLD", y: 10.4 },
//   { x: "PHOB", y: 45.8 },
// ];
// const PieChart1 = () => {
//   return (
//     <div>

//       <h1> <b>Message Codes</b> </h1>
//       <h2>CHQB</h2>
//       <h2>CORT</h2>
//       <h2>HOLD</h2>
//       <h2>PHOB</h2>
      
//       <VictoryPie
//         data={myData}
//         width={1394} height={550}
//         colorScale={["blue", "yellow", "red","green"]}
//         radius={150}

        
//       />
//     </div>
//   );
// };

function PieChart1(){
  const [seri, setSeri] = useState([])
  const [lab, setLab] = useState([])

  // const params = useParams()
  // const navigate = useNavigate()

  useEffect(() => {
      axios.get("http://localhost:8080/message/pie")
          .then(res => {
            console.log(res.data)
            setLab(res.data.pieMessage)
            setSeri(res.data.pieFrequency)
            
          })
          .catch(err => console.log("Couldnt fetch customer details"))
  }, [seri,lab])

  return(
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
  )
};
export default PieChart1;