<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" cellpadding="10">
       
            <tr>
                <th>empId</th>
                <th>name</th>
                <th>address</th>
                <th>department</th>
                <th>salary</th>
                <th></th>
                <th></th>
            </tr>
      <c:forEach var="inv" items="${objInventory}">
      <tr>
				<td>${inv.bookId }</td>
				<td>${inv.bookName }</td>
				<td>${inv.author }</td>
				<td>${inv.price }</td>
				
				<td><a href="<%=request.getContextPath()%>/edit?id=${inv.bookId}">Edit</a></td>
				<td><a href="<%=request.getContextPath()%>/delete?id=${inv.bookId}">Delete</</a></td>
			</tr>
		</c:forEach>
      




</table>
</body>
</html>