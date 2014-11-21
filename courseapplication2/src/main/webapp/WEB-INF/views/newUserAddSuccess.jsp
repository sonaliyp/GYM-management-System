<%@ include file="./include.jsp"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <c:set var="context" scope="request" value="<%= request.getContextPath()%>" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style>
body{
                background-image: url("${context}/resources/images/seamless-background-simply-sky.jpg");
                
             
                //border: 3px dotted black;
                margin: 10px;
                padding-bottom: 20px;
                width:50%;
                margin:auto;
            }
            section {
                background-color: white;
                //border: 2px solid black;
                width: 700px;
                margin: 20px; /* all four sides */
                padding: 10px; /* all four sides */
            }
            h1,p{
                //background-color: white; 
                //border: 1px dashed black;
                padding: 10px;
            }
            h1 ,p{

                margin: .0em 0 0em; /* .5em top, 0 right and left, .25em bottom */
                padding-left: 15px;
            }
            p {

                margin: 0; /* all four sides */
                padding-left: 15px;
            }

                .error {
		    font-size: 0.8em;
			color: #ff0000;
		}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<section>
<h1 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">Profile has been successfully created</h1>

<h2>A new profile has been successfully created for:</h2>
  <font color="blue">user name : ${user.firstName} <br> Last Name : ${user.lastName}<br>
  Email address: ${user.emailAddress}<br>
  
   </font>
      
  <a href="${context}/loginform"><h3>Login</h3></a>
     <a href="${context}/home"><h3>Home</h3></a>
    <br><br><br><br>
    <h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2014 GYM Mgt Center Inc.</h4>
     </section>
</body>
</html>