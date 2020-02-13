<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Registartion Page</title>
</head>
<body>
	<h1>Registration Form</h1>
	<p></p>
	<c:out value="${value}"/>
	<c:if test="${value == 0}">
	<form:form action="saveForm" commandName="validationForm">
		<table>
		  <tr>
            <td>User Name:</td>
            <td><form:input path="name" /><font color="red">  <form:errors
                path="name" /> </font></td>
        </tr>
		
		 <tr>
            <td>Password:</td>
            <td><form:password path="password" /><font color="red"> <form:errors path="password" /> </font></td>
        </tr>
		 <tr>
            <td>Age:</td>
            <td><form:input path="age" /><font color="red"> <form:errors
                path="age" /> </font></td>
        </tr>
		
		
		
			<p></p>
			<tr>
				<td colspan="2"><input type="submit" name="action1" value="Save Changes" /></td>
				<td colspan="2"><input type="submit" name="action2"  value="Edit Changes" /></td>
			</tr>
		</table>
	</form:form>
	</c:if>
	<br/>
	<br/>
	<c:if test="${value == 1}">
	<form:form action="saveForm" commandName="validform">
		<table>
		  <tr>
            <td>User Name:</td>
            <td><form:input path="name" /><font color="red">  <form:errors
                path="name" /> </font></td>
        </tr>
		
		 <tr>
            <td>Password:</td>
            <td><form:password path="password" /><font color="red"> <form:errors path="password" /> </font></td>
        </tr>
	
		
		
		
			<p></p>
			<tr>
				<td colspan="2"><input type="submit" name="action1" value="Save Changes" /></td>
				<td colspan="2"><input type="submit" name="action2"  value="Edit Changes" /></td>
			</tr>
		</table>
	</form:form>
	</c:if>
</body>
</html>



