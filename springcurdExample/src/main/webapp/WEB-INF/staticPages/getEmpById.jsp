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
<form:form method="get" action="getEmp" modelAttribute="empId"> 
        <h1 class="jumbotron" HEIGHT=100>Get Employee By Id</h1> 
               <table  >    
        
            
         <tr>    
          <td>Enter Employee ID :</td>    
          <td><form:input path="id"  id="id"/></td>
          </tr> 
          
          
          <tr>    
          <td><br/> </td>    
          <td><input type="submit"  value="ClickHere" /></td>    
         </tr>  
           
        </table>   
       
       </form:form>  
</body>
</html>