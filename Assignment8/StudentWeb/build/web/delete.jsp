<%-- 
    Document   : delete
    Created on : Nov 7, 2021, 7:32:52 PM
    Author     : Pitcha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        DELETE
        <form method="POST">
           <lebel>ID : </lebel>
            <input type="text" name="Id" value="" />
            <br>
            <input type="submit" value="Submit" formaction="StudentServlet"/>
 
        </form>
    </body>
</html>
