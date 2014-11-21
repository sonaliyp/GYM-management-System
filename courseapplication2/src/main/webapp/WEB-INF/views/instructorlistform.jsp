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
<fieldset>
                    <legend></legend><section>
  <h1>Instructor Information </h1>
  <table BORDER="8" bgcolor="lightblue" cellspacing="6" cellpadding="10">
<tr>
	<th>Instructor Name</th>
	<th>Instructor address</th>
	<th>Instructor Contact Info</th>
	<th>Instructor  Experience</th>
	<th>Instructor fee </th>
	
	<th>Delete </th>

</tr>
	<c:forEach var="instructorlist" items="${instructorlist}">
		<tr>
		   <td>${instructorlist.instructorName}</td>
	     <td>${instructorlist.instructorAddress}</td>
		  <td>${instructorlist.instructorCInfo}</td>
		  <td>${instructorlist.instructorExp} years</td>
		<td>$${instructorlist.price}</td>
		
		 <td><form action="./deleteInstr" method="post">
                                <input type="hidden" name="action"
                                       value="delete_book" />
                                <input type="hidden" name="instructorID" 
                                       value="${instructorlist.instructorID}" />
                                    <input type="submit" value="Delete" />
                            </form></td>
                           
		</tr>
	</c:forEach>
</table>

<br><br>



<a href="${context}/home">Home Page</a><br>
</fieldset></section>

</body>
</html>