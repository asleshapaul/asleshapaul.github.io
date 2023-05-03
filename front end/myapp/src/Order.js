import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import Navbar from "./Navbar";
import './Order.css'

const Order = () => {

  const [order, setOrder] = useState();
  const history=useNavigate();
  useEffect(() => {
   
      if(sessionStorage.getItem("loginStatus")!="success")
          history("/login")
      
  
  }, [])
  useEffect(() => {
   
    const fetchOrder= async()=>{
      const res= await fetch("http://localhost:8082/backend/getorder/?personId=1",{

      method:'GET',headers:{
        "Content-Type":"application/json",
        "Access-Control-Allow-Origin":"*"
    }})
    console.log(res.status)
    if(res.status==200)
{    const data=await res.json();
    console.log(data);
    setOrder(data);
 } 
else
 setOrder(null)
}
    fetchOrder();
  }, []);
  return (
    
<>

<h1>
  Thanks for contacting
</h1>
<p>Please write us @ asleshapaul08@gmail.com</p>
</>
  );
}

export default Order;
