<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Q</title>

    <!-- Bootstrap core CSS -->	
    <spring:url value="/resources/lib/bootstrap-3.3.6-dist/css/bootstrap.min.css" var="bootstrapCSS" />
	<link href="${bootstrapCSS}" rel="stylesheet" />
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <spring:url value="/resources/lib/assets/css/ie10-viewport-bug-workaround.css" var="ie10bug" />
	<link href="${ie10bug}" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <spring:url value="/resources/lib/bootstrap-3.3.6-dist/css/starter-template.css" var="templateCSS" />
	<link href="${templateCSS}" rel="stylesheet" />
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Cool Tools</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <div class="starter-template">
        <h1> Enter XML stuff </h1>
			<form class="lead" action="index.jsp" method="get">
			
			<label for="input">Xpath Expression</label>
			<input type="text" class="form-control" id="input" name="expression" value="${response}">
			
			<label for="input">Input XML:</label>
			<textarea class="form-control" rows="5" id="input" name="inputXml"></textarea>
			
			<label for="output">Output XML:</label>
			<textarea class="form-control" rows="5" id="output" name="outputXml">${response}</textarea>
			<!--
			Input XML: <input type="text" name="inputXml">
			Output XML: <input type="text" name="outputXml">
			-->
			<br>
			<input type="submit" value="clear">
			
			</form>
      </div>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <spring:url value="/resources/lib/assets/js/vendor/jquery.min.js" var="jquery" />
    <spring:url value="/resources/lib/bootstrap-3.3.6-dist/js/bootstrap.min.js" var="bootstrapJS" />
    <spring:url value="/resources/lib/assets/js/ie10-viewport-bug-workaround.js" var="ie10bugJS" />
    <script>window.jQuery || document.write('<script src="${jquery}"><\/script>')</script>
    <script src="${bootstrapJS}"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${ie10bugJS}"></script>
  </body>
</html>