import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router";
import { toast } from "react-toastify";
import {
  getAllOrders,
  getAllOrdersCount,
  getAllOrdersDate,
} from "../../Services/AdminService";
import Header from "./Header";
import {
  Chart as ChartJS,
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend,
} from "chart.js";
import { Bar } from "react-chartjs-2";
ChartJS.register(BarElement, CategoryScale, LinearScale, Tooltip, Legend);
function Dashboard() {
  const navigate = useNavigate();
  const [orders, setorders] = useState({});
  //   const labelslist=orders.map((item)=>{
  //         return item;
  //   })
  const [orderdate, setorderdate] = useState([]);
  const [ordercount, setOrderCount] = useState([]);

  // const setOrderDateandCount=async()=>{
  const data = {
    labels: orderdate,
    datasets: [
      {
        label: "Oders",
        data: ordercount,
        backgroundColor: "aqua",
        borderColor: "black",
        borderWidth: 1,
      },
    ],
  };
  //}
  const options = {};
  const getAllOrdersDatefromServer = async () => {
    const response = await getAllOrdersDate();
    console.log(response.data);
    setorderdate(response.data);
  };
  const getAllOrdersCountfromServer = async () => {
    const response = await getAllOrdersCount();
    console.log(response.data);
    setOrderCount(response.data);
  };
  const getAllOrdersfromServer = async () => {
    const response = await getAllOrders();
    console.log(response.data);
    setorders(response.data);
  };
  useEffect(() => {
    let role = sessionStorage.getItem("role");
    // if(!role && role=="student"){
    if (role === null || role === "student" || role === "teacher") {
      sessionStorage.clear();
      toast.error("Security alert!!! Logging you out");
      return navigate("/");
    }
    //getAllOrdersfromServer();
    getAllOrdersDatefromServer();
    getAllOrdersCountfromServer();
    //setOrderDateandCount();
  }, []);
  return (
    <>
      <Header></Header>
      <div>
        <h1 style={{ margin: "80px" }}>Admin Dashboard over Orders</h1>
        <div style={{ height: "50vh", margin: "80px" }}>
          <Bar data={data} options={options}></Bar>
        </div>
      </div>
    </>
  );
}

export default Dashboard;
