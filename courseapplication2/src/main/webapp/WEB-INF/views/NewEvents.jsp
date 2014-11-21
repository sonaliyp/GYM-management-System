<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" scope="request" value="<%= request.getContextPath()%>" />

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>         <style>
body {
 background-color: lightblue;
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
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body><fieldset>
            <legend></legend>
            
       <section>
               
        <h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">New Events</h4>

     <h4>Free 5 Visit Pass</h4>
            You can try our gym , you will get 5 free pass.
            <br>
            you can use these passes in next 2 months any time.
            <h4>Member Referral Program</h4>
            If you refer our gym to your friend or any person.
            you will get one month free.
            
        
<br>
<br>
<h1> </h1>
<br>
<p>
 <br><br>
   
<a href="${context}/home">Home Page</a><br>
<h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2014  Residential. All Rights Reserved...</h4>

</section>
        </fieldset>             
     
    </body>
</html>
