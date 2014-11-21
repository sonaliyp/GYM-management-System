
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
   <title>Student Enrollment</title>
</head>
<body>
<section>
  <h1>Equipment Information ${courseName}:</h1>
  <table BORDER="8" bgcolor="lightgray" cellspacing="6" cellpadding="10">
<tr>
	<th>Equipment ID</th>
	<th>Equipment Name</th>
	<th>Equipment Details</th>
	<th>Delete </th>
</tr>
	<c:forEach var="equipmentList" items="${EquipmentList}">
		<tr>
		   <td>${equipmentList.equipmentID}</td>
		   <td>${equipmentList.equipmentName}</td>
		   <td>${equipmentList.equipmentDetails}</td>
		   
		   <td><form action="./delete" method="post">
                                <input type="hidden" name="action"
                                       value="delete_book" />
                                <input type="hidden" name="equipmentID" 
                                       value="${equipmentList.equipmentID}" />
                                    <input type="submit" value="Delete" />
                            </form></td>
		</tr>
	</c:forEach>
</table>

<br><br>

<h4>
<a href="${context}/instructorList2">Instructor list</a><br>
<a href="${context}/eqipment">Add new Equipment</a><br>
<a href="${context}/home">Home Page</a><br>
<a href="${context}/home">Log out</a>
</section>
</h4>
</body>
</html>