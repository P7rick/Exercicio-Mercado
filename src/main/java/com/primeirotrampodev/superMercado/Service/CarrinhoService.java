package com.primeirotrampodev.superMercado.Service;

import com.primeirotrampodev.superMercado.Entidade.Carrinho;
import com.primeirotrampodev.superMercado.Entidade.Produto;
import com.primeirotrampodev.superMercado.Entidade.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarrinhoService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ProdutoService produtoService;


    public Carrinho retornarCarrinhodeCompras( String nomeUsuario, String telefone, List<Integer> produtoIdList) {

        Carrinho carrinho = new Carrinho();

        Usuario usuario = usuarioService.getUsuario(nomeUsuario,telefone);

        carrinho.setUsuario(usuario);

        List<Produto> produtoList = produtoService.retornaListadeProdutos(produtoIdList);

        carrinho.setProdutoList(produtoList);

        return carrinho;
    }
}





