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


       <form:form method="post" action="save" modelAttribute="dto"> 
        <h1 class="jumbotron" HEIGHT=100>Udate Employee</h1> 
               <table  >    
         <tr>    
         <form:hidden path="id" value=""></form:hidden> 
         
         </tr> 
            
         <tr>    
          <td>Name :</td>    
          <td><form:input path="name"  id="name" value=""/></td>
          </tr> 
          
           <tr>    
          <td>salary :</td>    
          <td><form:input path="salary"  id="salary" value=""/></td>
          </tr>
            
             <tr>    
          <td>addr :</td>    
          <td><form:input path="addr"  id="addr" value=""/></td>
          </tr>
          
           <tr>    
          <td>dept :</td>    
          <td><form:input path="dept"  id="dept" value=""/></td>
          </tr>
          
          
          
          <tr>    
          <td><br/> </td>    
          <td><input type="submit"  value="Save" /></td>    
         </tr>  
           
        </table>   
       
       </form:form>  
</body>
</html>