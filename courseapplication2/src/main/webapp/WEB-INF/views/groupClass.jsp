<%@ include file="./include.jsp"%>
<%@ page session="false" %>
<c:set var="context" scope="request" value="<%= request.getContextPath()%>" />
<!doctype html>
<html lang="en">
<head>
     <style>
        h3{color:blue;}
          h2{color:blue}
        li {color: lightseagreen;}
        p{
            color: lightseagreen;
        }
    </style>
<meta charset="utf-8">
<title>jQuery UI Accordion - Default functionality</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
$(function() {
$( "#accordion" ).accordion();
});
</script>
</head>
<body>
  <a href="${context}/home">Home Page</a>
<div id="accordion">
<h3>Mind & Body Classes</h3>
<div>
<p>
Quiet the chatter of daily life with Mind & Body classes such as yoga and Pilates. Mind & Body classes focus on improving your flexibility, strength and balance while enhancing posture, coordination and mental focus. You will leave class feeling stronger, centered and more relaxed.
<h2>Yoga Classes</h2> <font color="lightseagreen"> 
Designed to enhance vitality and a sense of well-being, our yoga classes use gentle movements to improve flexibility, balance, strength and posture. The class may incorporate basic poses from various yoga styles.
<p><h2>LES MILLS BODYFLOW</h2>
Combining Yoga, Tai Chi and Pilates, LES MILLS BODYFLOW classes build flexibility and strength and leave you feeling centered and calm. Controlled breathing, concentration and a carefully structured series of stretches, moves and poses create a holistic workout that brings the body into a state of harmony and balance.<p>
</font>
</p>
</p>
</div>
<h3>Cycle Classes</h3>
<div>
<p>
 Take our cycling classes and pedal your way to great health. Combining energizing music with unique workouts, cycle exercise classes deliver a great fitness workout with powerful results, including cardiovascular strength, lower total cholesterol, decreased stress and improved quality of life.
<p><h2>Cycle Classes</h2><font color="lightseagreen"> 
Experience the thrill of outdoor cycling inside the club. In our authentic and athletic cycling class, motivating instructors and up-tempo music keep you energized as you sweat through grueling hill climbs, flat terrain, head winds, tail winds and anaerobic intervals.
</font><p><h2>LES MILLS RPM</h2><font color="lightseagreen"> 
Ride to the rhythm of powerful music in RPM®, the LES MILLS® popular indoor cycling class. Take on challenging terrain as your coach leads the pack through hills, flats, mountain peaks, time trials and interval training. Discover your athlete within – and sweat and burn to reach your endorphin high.
</font></p>
</div>
<h3>Strength Training Classes</h3>
<div>
<p>
Find inspiration in numbers with high-intensity strength training classes that not only build muscle, but improve bone density, burn calories and boost metabolism. During your weight or strength training class, you can expect to burn 400 – 600 calories*, and also maintain a significant metabolism boost throughout the day. 24 Hour Fitness strength training classes are suitable for all levels of fitness and exercise experience.
<p><h2>LES MILLS BODYPUMP<h2></h2><font color="lightseagreen"> 
BODYPUMP is the original barbell class that strengthens your entire body. This 60-minute workout challenges all your major muscle groups by using weight-room exercises like squats, presses, lifts and curls. Great music, incredible instructors and your choice of weight inspire you to get the results you came in for – fast.
</font><p><h2>Total Body Conditioning Classes</h2><font color="lightseagreen"> 

Challenge every muscle in this total body strength training class that incorporates a variety of Group X equipment. Shape and tone your body from head to toe using hand weights, barbells, your own body weight and more.
</font></p>

</div>

</div>
</body>
</html>




        