<%-- 
    Document   : delete
    Created on : Nov 13, 2021, 4:25:46 PM
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
        <h1>Delete Student</h1>
        <form method="POST" action="DeleteStudent">
            ID : <input type="number" name="id" value="" />
            <input type="submit" value="Delete" style="background: red; border-style: none" />
        </form>
    </body>
</html>
