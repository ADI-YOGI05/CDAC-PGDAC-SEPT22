import React, { useState } from "react";
import { useNavigate } from "react-router";
import { toast } from "react-toastify";
import { forgotPasswordbyTeacher } from "../../Services/TeacherServices";
import ForgotPasswordEmail from "../ForgotPasswordEmail";
import Header from "./Header";

function TeacherForgotPassword() {
  const [email, setEmail] = useState();
  const navigate = useNavigate();
  const characters =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

  function generateString(length) {
    let result = "";
    const charactersLength = characters.length;
    for (let i = 0; i < length; i++) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }

    return result;
  }

  const handleEmail = (event) => {
    setEmail(event.target.value);
    console.log(email);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    const pwd = generateString(8);
    console.log(pwd);

    console.log(email);
    const response = await forgotPasswordbyTeacher(email, pwd);
    console.log(response.data);
    ForgotPasswordEmail(response.data.teacherName, response.data.email, pwd);
    toast.success("new password Sent to email!!!!");
    navigate("/teacher");
  };
  return (
    <>
      <Header></Header>
      <div style={{ height: "80vh" }}>
        Enter Email:
        <input
          id="email"
          name="email"
          type="text"
          onChange={handleEmail}
        ></input>
        <button onClick={handleSubmit}>Send Link</button>
      </div>
    </>
  );
}

export default TeacherForgotPassword;
