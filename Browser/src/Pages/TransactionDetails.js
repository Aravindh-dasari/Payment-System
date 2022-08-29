import axios from "axios";
import { useState,useEffect } from "react";
import { useParams } from "react-router-dom";
export function TransactionDetails(){
    const[transaction,setTransaction]=useState(null)
    const params=useParams()

    useEffect(()=>{
        axios.get("http://localhost:8080/transaction/"+params.id)
        .then(res=>{
            setTransaction(res.data)
            console.log(transaction)
        })
        .catch(err=>{
            console.log("couldn't fetch customers details")
        })
    },[params])

 const displayDetails =()=>{
     return(
     <div>
    <h4>Transaction ID -{transaction.transactionid}</h4>
    <h4>Sender ID -{transaction.customerid}</h4>
    <h4>Sender BIC -{transaction.senderbic}</h4>
    <h4>Receiver BIC -{transaction.receiverbic}</h4>
    <h4>Receiver Account Holder Number -{transaction.receiveraccountholdernumber}</h4>
    <h4>Receiver Account Holder Name -{transaction.receiveraccountholdername}</h4>
    <h4>Currency Amount -{transaction.currencyamount}</h4>
    <h4>Currency Code -{transaction.currencycode}</h4>
    <h4>Message Code -{transaction.messagecode}</h4>
    <h4>INR Amount -{transaction.inramount}</h4>
    <h4>Transfer Type Code -{transaction.transfertypecode}</h4>
    <h4>Transfer Fee -{transaction.tranferfees}</h4>
    </div>
     )
 }

return(
    <div>{transfer? displayDetails():<p>Loading..</p>
    }
        {/* <Link to ="/customers">Bact to customers</Link>
        {
            customers?getCustomerDiv():<h3>Loading..</h3>
        } */}
    </div>
)}
    