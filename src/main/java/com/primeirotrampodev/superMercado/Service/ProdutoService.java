package com.primeirotrampodev.superMercado.Service;


import com.primeirotrampodev.superMercado.Entidade.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProdutoService {

    public List<Produto> retornaListadeProdutos(List<Integer> produtoIdList) {

        Produto produto1 = new Produto();

        produto1.setId(1);
        produto1.setNome("Arroz");
        produto1.setPreco(20.00);

        Produto produto2 = new Produto();

        produto2.setId(2);
        produto2.setNome("Feijão");
        produto2.setPreco(08.00);

        Produto produto3 = new Produto();

        produto3.setId(3);
        produto3.setNome("Macarrão");
        produto3.setPreco(05.00);

        Produto produto4 = new Produto();

        produto4.setId(4);
        produto4.setNome("Bacon");
        produto4.setPreco(25.00);

        Produto produto5 = new Produto();

        produto5.setId(5);
        produto5.setNome("Biscoito");
        produto5.setPreco(03.00);

        Produto produto6 = new Produto();

        produto6.setId(6);
        produto6.setNome("Batata Frita");
        produto6.setPreco(22.00);

        Produto produto7 = new Produto();

        produto7.setId(7);
        produto7.setNome("Picanha");
        produto7.setPreco(120.00);

        List<Produto> produto = new ArrayList<>();

        for (Integer cont = 0; cont < produtoIdList.size(); cont++) {
            Integer idProduto = produtoIdList.get(cont);

            if (idProduto.equals(1)) {
                produto.add(produto1);
            } else if (idProduto.equals(2)) {
                produto.add(produto2);
            } else if (idProduto.equals(3)) {
                produto.add(produto3);
            } else if (idProduto.equals(4)) {
                produto.add(produto4);
            } else if (idProduto.equals(5)) {
                produto.add(produto5);
            } else if (idProduto.equals(6)) {
                produto.add(produto6);
            } else if (idProduto.equals(7)) {
                produto.add(produto7);
            }
        }
        return produto;
    }
}
