<%@ include file="./include.jsp"%>
<html>
<head>
	<title>New Student Information</title>
	<style>
		.error {
		    font-size: 0.8em;
			color: #ff0000;
		}

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
</head>
<body><section>
 <h1 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">Sign up</h1>
  

 <fieldset>
                    <legend></legend>
                    
<h1><fmt:message key="studentDataForm.title" /></h1>

  <form:form action="./signupNew" method="POST" commandName="user">
  <table>
                <tr>
  	<td><form:label path="firstName">First Name</form:label></td>
        <td><form:input path="firstName" type="text"/>
            <form:errors path="firstName" cssClass="error"/>
        </td>
    </tr>
                <tr>
  	<td><form:label path="emailAddress">Email Address</form:label></td>
        <td><form:input path="emailAddress" type="text"/>
            <form:errors path="emailAddress" cssClass="error"/>
        </td>
    </tr>
               <tr>
  	<td><form:label path="password">Password</form:label></td>
        <td><form:input path="password" type="password"/>
            <form:errors path="password" cssClass="error"/>
        </td>
    </tr>
    
   
        <tr>
  	<td><form:label path="lastName">Last Name</form:label></td>
        <td><form:input path="lastName" type="lastName"/>
            <form:errors path="lastName" cssClass="error"/>
        </td>
    </tr>
    <tr>
  	<td><form:label path="city">city</form:label></td>
        <td><form:input path="city" type="city"/>
            <form:errors path="city" cssClass="error"/>
        </td>
    </tr>
    <tr>
  	<td><form:label path="state">State</form:label></td>
        <td><form:input path="state" type="state"/>
            <form:errors path="state" cssClass="error"/>
        </td>
    </tr>
      <tr>
  	<td><form:label path="country">country</form:label></td>
        <td><form:input path="country" type="country"/>
            <form:errors path="country" cssClass="error"/>
        </td>
    </tr>
    <tr>
    <td><form:label path="isAdmin">Admin</form:label></td></td>
    <td><form:radiobutton path="isAdmin" value="1" checked="true"/> Yes<br>
	<form:radiobutton path="isAdmin" value="2"/> No<br></td>
	</tr>
       
         </fieldset>
                 <td><input type="submit" value="<fmt:message key="enterBtn1" />"> </td>
    </tr>
                    </table>  
                    <br><br><br><br><br><br>

<h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2014 GYM Mgt Center Inc.</h4>
                    
  </form:form>
   </fieldset>
 </section>
</body>
</html>
