<%-- 
    Document   : index
    Created on : 21/02/2020, 20:22:53
    Author     : ZAMBONI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Produto" %>
<%@page import="dao.ProdutoDao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        Produto p = new Produto();    
        ProdutoDao prod = new ProdutoDao();
        out.println(prod.inserir(p));
        %>
    </body>
</html>
