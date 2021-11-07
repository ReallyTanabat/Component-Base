<%-- 
    Document   : index
    Created on : Nov 7, 2021, 10:29:13 AM
    Author     : Pitcha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Temp</title>
    </head>
    <body>
        <form method="POST">
            <input type="number" name="temp" value="" />
            <input type="submit" value="c to f" formaction="TempConvert" name="button"/>
            <input type="submit" value="f to c" formaction="TempConvert" name="button" />
            
        </form>
    </body>
</html>
