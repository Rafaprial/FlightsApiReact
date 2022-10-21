import axios from "axios";
import { useEffect, useState } from "react";

function Booking(){
    const [posts, setPosts] = useState(null);

    function loadData(){
        axios.get("http://localhost:8080/flights/getAll").then((response)=>{
            setPosts(response.data)
        })
    }

   useEffect(()=>{
        loadData();
    },[]);

    return posts ?(
        <select  name="from" id="from">
            {posts.map(m=>{
            <option key={m.id} value={m.fromDestin}>{m.fromDestin}</option>
        })} </select>
       
    ):"loading"
}
export default Booking;