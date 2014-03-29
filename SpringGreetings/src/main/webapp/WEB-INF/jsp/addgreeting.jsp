<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" language="javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js"></script>
<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/json2.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Jquery Ajax Demo</title>
<style>
Table.GridOne {
	padding: 3px;
	margin: 0;
	background: lightyellow;
	border-collapse: collapse;	
	width:35%;
}
Table.GridOne Td {	
	padding:2px;
	border: 1px solid #ff9900;
	border-collapse: collapse;
}
</style>
<h1>Spring Framework Jquery Ajax Demo</h1>
	<div id="result"></div>


</head>
<body>
<h1>Spring Greetings</h1>
<form:form action="greetings.html"> 	
	<table>
		<tr>
			<td>Add your greeting:</td>
			<td><input type="text" name="greetingText" size="100"/></td>
		</tr>	
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Submit" />	
			</td>
		</tr>
	</table>
</form:form>
<form>	
			
		
	</form>
	 </body>
</html>