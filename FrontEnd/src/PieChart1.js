import React from "react";
import { VictoryPie } from "victory-pie";
const myData = [
  { x: "CHQB", y: 77 },
  { x: "CORT", y: 23.1 },
  { x: "HOLD", y: 15.4 },
  { x: "PHOB", y: 53.8 },
];
const PieChart1 = () => {
  return (
    <div>
      <VictoryPie
        data={myData}
        colorScale={["blue", "yellow", "red","green"]}
        radius={50}
      />
    </div>
  );
};
export default PieChart1;