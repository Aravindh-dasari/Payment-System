//import { ThemeContext } from "@mui/styled-engine"
import axios from "axios"
import { useState,useEffect } from "react"
import { CircularProgress } from "@mui/material/CircularProgress"
import { Link } from "react-router-dom"
export function TransactionTable(){
    const[transactions,setTransactions]=useState(null)
    useEffect(()=>{
        axios.get("http://localhost:8080/transaction")
        .then(res=>{
            setTransactions(res.data)
            console.log(res.data)
        })
        .catch(err=>{
            console.log("Error Occured!")
        })
    },[])
    const getTableRows=()=>{
        const rows=transactions.map(t=>{
            return (<tr key={t.transactionid}>
                <td>{t.transactionid}</td>
                <td>{t.customerid}</td>
                <td>{t.receiveraccountholdernumber}</td>
                <td>{t.inramount}</td>
                <td>
                    <Link to={"/transaction/"+t.transactionid}> View </Link>
                </td>

            </tr>
            )
        })
        return rows
    }
    return(
        <div>
            <h2>Transaction History</h2>
            {transactions ?
            <table>
                <thead>
                <tr>
                    <th>Transaction ID</th>
                    <th>Sender ID</th>
                    <th>Receiver Account Holder Numeber</th>
                    <th>Amount transferred</th>
                    
                </tr>
                </thead>
                <tbody>
                        {/* {customers?getTableRows():<h3>Loading</h3>} */}
                    
                        {getTableRows()}
                        
                </tbody>
            </table> : <h4>Loading...</h4>}
        </div>
    );
}

    <div>
        <h3>Transaction History</h3>
        {/* {customers?getTableRows:<h3>Loading</h3>} */}
        
    </div>

