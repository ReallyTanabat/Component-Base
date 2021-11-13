<%-- 
    Document   : update
    Created on : Nov 13, 2021, 4:24:58 PM
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
        <h1>Update Student</h1>
        <form method="POST" action="UpdateStudent">
            ID : <input type="number" name="id" value="" />
            New Name : <input type="text" name="name" value="" />
            New GPA : <input type="number" name="gpa" value="" />
            <input type="submit" value="Update" />
        </form>
    </body>
</html>
