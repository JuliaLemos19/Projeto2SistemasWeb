// Dupla: Julia de Lemos Alves da Silva
package controller;

import model.Banco;
import model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        int unidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
        String descricao = request.getParameter("descricao");
        double qtdPrevistoMes = Double.parseDouble(request.getParameter("qtdPrevistoMes"));
        double precoMaxComprado = Double.parseDouble(request.getParameter("precoMaxComprado"));

        Produto p = new Produto(0, nome, unidadeCompra, descricao, qtdPrevistoMes, precoMaxComprado);
        Banco.adicionar(p);

        response.sendRedirect("listarProdutos.jsp");
    }
}
