<%-- 
    Document   : update
    Created on : Nov 7, 2021, 7:32:42 PM
    Author     : Pitcha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <form method="POST">
           <lebel>ID : </lebel>
            <input type="text" name="Id" value="" />
            <br>
            <lebel>New Name : </lebel>
            <input type="text" name="Name" value="" />
            <br>
            <lebel>New Gpa : </lebel>
            <input type="text" name="Gpa" value="" />
            <br>
            <input type="submit" value="Submit" formaction="StudentServlet"/>
 
        </form>
    </body>
</html>
