<%@ include file="./include.jsp"%>
<html>
<head><style>

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

</style>
<title>New Student Profile Created</title>
</head>
<body><fieldset><section>
<legand></legand>
<h2>A new profile has been successfully created for:
      <font color="blue"/>${user.firstName} ${user.city} </font></h2>
<br>
<h2>
<a href="${context}/home""><h3>Home</h3></a>
</h2>
  </section>   </fieldset> 
</body>
</html>
