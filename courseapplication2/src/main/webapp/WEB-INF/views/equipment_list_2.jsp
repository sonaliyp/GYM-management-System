<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" scope="request" value="<%= request.getContextPath()%>" />


<html>
<head>
<style>
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

                
</style>
   <title></title>
</head>
<body>
<fieldset>
                    <legend></legend><section>
                    <h4 style="background-color:purple; text-align:center;color:white; font-family: Times New Roman;">Available Equipment</h4>

  <table  cellpadding="10">
<tr>

	<th>Equipment Name</th>
	<th>Equipment Details</th>

</tr>
	<c:forEach var="equipmentList" items="${EquipmentList}">
		<tr>
	
		   <td>${equipmentList.equipmentName}</td>
		   <td>${equipmentList.equipmentDetails}</td>
		   
		  
		</tr>
	</c:forEach>
</table>

<br><br>

<h4>

<a href="${context}/home">Home Page</a><br>
<h4 style="background-color:purple; text-align:center;color:white; font-family: Times New Roman;">©2014 GYM mgt...</h4>
     
</h4>
</section>
</fieldset>
</body>
</html>