<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<table>

      <tr><a href="<%=request.getContextPath()%>/register">RegisterEmployee</a></tr><br>
	  <tr><a href="<%=request.getContextPath()%>/getById">GetEmployeeById</a></th></tr><br>
	 
	  <tr><a href="<%=request.getContextPath()%>/delete">DeleteEmployee</a></th></tr><br>
	  <tr><a href="<%=request.getContextPath()%>/update">UpdateEmployee</a></th></tr><br>
	  
      <tr><a href="<%=request.getContextPath()%>/getAll">GetAllEmployee</a></th></tr>

</table>
</body>
</html>