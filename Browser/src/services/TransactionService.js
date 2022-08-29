import axios from "axios";

const TRANSACTION_BASE_REST_API_URL="http://localhost:8080/transfer"

class TransactionService{
    
    createTransaction(transaction){
        // console.log(transaction)
        console.log("Sending Data to Server")
        return axios.post(TRANSACTION_BASE_REST_API_URL, transaction);
    }

    getAllTransaction(){
        return axios.get(TRANSACTION_BASE_REST_API_URL);
    }

    getAllTransactionById(transaction_Id){
        return axios.get(TRANSACTION_BASE_REST_API_URL+"/"+transaction_Id);
    }
}

export default new TransactionService();