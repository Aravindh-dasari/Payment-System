import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';

export function TransferPage() {
    return (
      <div className="App">
        <h1>MONEY TRANSFER</h1>
        <Box
        component="form"
        sx={{
          '& > :not(style)': { m: 1, width: '25ch' }
        }}
        noValidate
        autoComplete="off"
      >
        {/* <TextField id="outlined-basic" label="Outlined" variant="outlined" />
        <TextField id="filled-basic" label="Filled" variant="filled" />
        <TextField id="standard-basic" label="Standard" variant="standard" /> */}
      </Box>
        {/* <ul>
          <li><a href="#Transfer">Transfer</a></li>
          <li><a href="#Dashboard">Dashboard</a></li>
          <li><a href="#Transactions">Transactions</a></li>
          <li><a href="#Profile">Profile</a></li>
          <li><a href="#Signup">Signup</a></li>
        </ul> */}
      <form>
        <b><label>CUSTOMER ID</label></b>
        <input type="text" name="cutomer id" placeholder="Enter Customer Id"></input><br></br>
        <b><label>ACCOUNT HOLDER NAME</label></b>
        <input type="text" name="customer name" placeholder="Enter Account Holder Name"></input><br></br>
        <b><label>CLEAR BALANCE</label></b>
        <input type="text" name="amount"></input><br></br>
        <b><label for="cur">CURRENCY CODE</label></b>
        <select name="" id="cur">
          <option value="select">SELECT</option>
          <option value="inr">INR</option>
          <option value="usd">USD</option>
          <option value="eud">EUD</option>
          <option value="jpy">JPY</option>
        </select><br></br>
      
      
        <b><label>RECEIEVER BIC</label></b>
        <input type="text" name="bic"></input><br></br>
        <b><label>RECEIEVER BANK NAME</label></b>
        <input type="text" name="bname"></input><br></br>
        <b><label for="tcode">TRANSFER TYPE</label></b>
        <select name="select" id="tcode">
          <option value="select">SELECT</option>
          <option value="current">BANK TRANSFER</option>
          <option value="fix">CUSTOMER TRANSFER</option>
        </select><br></br>
        <b><label for="mcode">MESSAGE CODE</label></b>
        <select name="" id="mcode">
          <option value="select">SELECT</option>
          <option value="current"></option>
          <option value="fix"></option>
        </select><br></br>
        <b><label>RECEIEVER ACCOUNT HOLDER NUMBER</label></b>
        <input type="text" name="rahn"></input><br></br>
        <b><label>RECEIEVER ACCOUNT HOLDER NAME</label></b>
        <input type="text" name="ahn"></input><br></br>
        
      </form>
      <button type="submit"><b>Submit</b></button>
      </div>
    )
  }