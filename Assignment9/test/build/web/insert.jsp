<%-- 
    Document   : insert
    Created on : Nov 13, 2021, 4:07:21 PM
    Author     : Pitcha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert Student</h1>
        <form method="POST" action="InsertStudent">
            ID : <input type="number" name="id" value="" /> 
            Name : <input type="text" name="name" value="" />
            GPA :  <input type="number" name="gpa" value="" />
            <input type="submit" value="Insert" />
        </form>
    </body>
</html>
