<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style>
            
        html, body, div, span, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, code,
del, dfn, em, img, q, dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, dialog, figure, footer, header,
hgroup, nav, section {
  margin: 0;
  padding: 0;
  border: 0;
  font-weight: inherit;
  font-style: inherit;
  font-size: 100%;
  font-family: inherit;
  vertical-align: baseline;
}
 
#accordion {
    position: relative;
    width: 795px;
    height: 290px;
    margin: 60px auto;
}
 
#slides {
    list-style: none;
    width: 795px;
    overflow: hidden;
    height:290px
}
 
#slides li.slide {
    overflow: hidden;
    clear: both;
    width: 640px;
    background:lightgray;
    height: 290px;
}
 
#slides .slide-content {
    width: 590px;
    height: 290px;
    color: #444;
    margin-left: 50px;
    padding: 5px 0;
}

#slide-1 { position: absolute; top: 0; left: 150px; z-index: 4; }
 
#slide-2 { position: absolute; top: 0; left: 100px; z-index: 3; }
 
#slide-3 { position: absolute; top: 0; left: 50px; z-index: 2; }
 
#slide-4 { position: absolute; top: 0; left: 0px; z-index: 1;}
#slides a.slidebutton {
    display: block;
    -webkit-transform: rotate(270deg);
    -moz-transform: rotate(270deg);
    -webkit-transform-origin: 120px 120px;
    -moz-transform-origin: 130px 130px;
    width: 300px;
    height: 50px;
    position: absolute;
    top: 70px;
    text-align: right;
}
body{
                background-image: url("${context}/courseapp/resources/images/seamless-background-simply-sky.jpg");
                }
        </style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<title></title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.9.1.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
$(document).ready(function() {
 
    $('.slide')
        .bind('open', function(){
            if(! $(this).hasClass('open')){
                $(this).next().trigger('open');
                $(this).addClass('open');
                $(this).animate({left: "-=590px"});
            }
            else{
                $(this).prev().trigger('close');
            }
            $(this).siblings().removeClass('active');
            $(this).addClass('active');
        })
        .bind('close', function(){
            if($(this).hasClass('open')){
                $(this).removeClass('open');
                $(this).animate({left: "+=590px"});
                $(this).prev().trigger('close');
            }
        });
 
    $('.slidebutton')
        .click(function(){
            $(this).parent().trigger('open');
            $('#content-' + $(this).parent().attr('id')).trigger('show');
        });
 
});
</script>
</head>
<body>
<a href="${context}/courseapp/home"><h3> Home</h3></a>
 
<div id="accordion">
    <ul id="slides">
 
        <li class="slide open active" id="slide-1">
            <a class="slidebutton" href="javascript:void(0);">Indoor Cycling</a>
            <div class="slide-content">
                <img src="${context}/courseapp/resources/images/Spin_Cycle_Indoor_Cycling_Class_at_a_Gym.jpg" alt="image1" width="590" height="290" />
            </div><!-- slide content -->
        </li><!-- slide 1 -->

        <li class="slide open active" id="slide-2">
            <a class="slidebutton" href="javascript:void(0);">Gym Machines</a>
            <div class="slide-content">
                <img src="${context}/courseapp/resources/images/gym2013.jpg" alt="image2" width="590" height="290" />
            </div><!-- slide content -->
        </li><!-- slide 2 -->
 
        <li class="slide open active" id="slide-3">
            <a class="slidebutton" href="javascript:void(0);">Yoga </a>
            <div class="slide-content">
                <img src="${context}/courseapp/resources/images/yoga.jpg" alt="image3" width="590" height="290" />
            </div><!-- slide content -->
        </li><!-- slide 3 -->
 
        <li class="slide open active" id="slide-4">
            <a class="slidebutton" href="javascript:void(0);">Personal Trainer</a>
            <div class="slide-content">
                <img src="${context}/courseapp/resources/images/tranners.jpg" alt="image4" width="590" height="290" />
            </div><!-- slide content -->
        </li><!-- slide 4 -->
   
    </ul>
</div><!-- accordion -->

 <br><br><br><br><br><br>

<h4 style="background-color:#3B5998; text-align:center;color:white; font-family: Times New Roman;">2014 GYM Mgt Center Inc.</h4>
</body>
</html>