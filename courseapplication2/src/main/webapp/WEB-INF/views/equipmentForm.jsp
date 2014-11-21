<%@ include file="./include.jsp"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <meta charset="UTF-8">
        <style>
        body {
                background-color: lightyellow;
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
        <title>
          
        </title>
    </head>
    <body>
       <section>
<body style="background-color:lightgray; font-family: Times New Roman;">
<fieldset>
                    <legend></legend><br>
<form:form action="./processNewEquipmentForm" method="POST" commandName="equipment">
<h1 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">Equipment add</h1>
<table>

<a href="${context}/home"><h4> Home</h4></a>
  	<tr>
  	<td><form:label path="equipmentID">Equipment ID</form:label></td>
        <td><form:input path="equipmentID" />
            <form:errors path="equipmentID" cssClass="error"/>
        </td>
    </tr>
    <tr>
  	<td><fmt:message key="equipmentNameLabel" /></td>
        <td><form:input path="equipmentName" />
            <form:errors path="equipmentName" cssClass="error"/>
        </td>
    </tr>
    <tr>
  	<td><fmt:message key="equipmentDetailsLabel" /></td>
        <td><form:input path="equipmentDetails" />
            <form:errors path="equipmentDetails" cssClass="error"/>
        </td>
    </tr>   
    <td><input type="submit" value="<fmt:message key="enterBtn1" />"> </td>
    </tr>
    </table>

    <br><br><br><br>
    <h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2014 GYM Mgt Center Inc.</h4>
      </form:form>
      </fieldset>
</body></section>
    </body>
</html>