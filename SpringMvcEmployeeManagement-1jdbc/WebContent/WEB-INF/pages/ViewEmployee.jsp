

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home Page</title>
</head>
<body>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th>Update?</th>
			<th>Delete?</th>
		</tr>
		<c:forEach var="emp" items="${ requestScope.employeeList }">
			<c:url var="deleteUrl" value="deleteEmployee.do">
				<c:param name="employeeId" value="${ emp.employeeId }"/>
				<c:param name="employeeName" value="${ emp.employeeName }"/>
				<c:param name="employeeSalary" value="${ emp.employeeSalary }"/>
			</c:url>
			<c:url var="updateUrl" value="updateEmployeePage">
				<c:param name="employeeId" value="${ emp.employeeId }"/>
				<c:param name="employeeName" value="${ emp.employeeName }"/>
				<c:param name="employeeSalary" value="${ emp.employeeSalary }"/>
			</c:url>
			<tr>
				<td><c:out value="${ emp.employeeId }"/></td>
				<td><c:out value="${ emp.employeeName }"/></td>
				<td><c:out value="${ emp.employeeSalary }"/></td>
				<td><a href='<c:out value="${ updateUrl }"/>'>Update</a></td>
				<td><a href='<c:out value="${ deleteUrl }"/>'>Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>


<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.lti.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee</title>
</head>
<body>

  <%= request.getAttribute("employeeList") %>
 
 <body>
	<h3><a href='AddEmployee.jsp'>Add User</a> | <a href='Home.jsp'>Home</a></h3>
	<table>
		<tr>
			<th>EMP_ID</th>
			<th>EMP_NAME</th>
			<th>EMP_SAL</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
		<c:forEach var="employee" items="${ requestScope.employeeList }">
		
		
			<c:url var="deleteUrl" value="delete.do">
				<c:param name="EMP_ID" value="${ employee.employeeId}"></c:param>
			</c:url>
			<c:url var="updateUrl" value="UpdateEmployee">
			 <c:param name="EMP_ID" value ="${ employee.employeeId}"></c:param>
				<c:param name="EMP_NAME" value ="${employee. employeeName}"></c:param>
					<c:param name="EMP_SAL" value ="${employee.employeeSalary}"></c:param>
						
					</c:url> 
				
			
			<tr>
				<td> <c:out value="${ employee.employeeId}"></c:out> </td>
				<td> <c:out value="${ employee. employeeName }"></c:out> </td>
				<td> <c:out value="${ employee.employeeSalary }"></c:out> </td>
				<td><a href='<c:out value="${updateUrl}"/>'>Update</a></td>
				<td><a href='<c:out value="${ deleteUrl }"></c:out>'>Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
</body>
</html> --%>