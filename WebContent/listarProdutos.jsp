<%@ page import="java.util.*, model.Banco, model.Produto" %>
<html>
<head><title>Lista de Produtos</title></head>
<body>
    <h2>Produtos Cadastrados</h2>
    <ul>
    <%
        for (Produto p : Banco.getProdutos()) {
    %>
        <li><%= p.getId() %> - <%= p.getNome() %> - <%= p.getDescricao() %></li>
    <%
        }
    %>
    </ul>
</body>
</html>
