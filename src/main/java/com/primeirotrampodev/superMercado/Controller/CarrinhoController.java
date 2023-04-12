package com.primeirotrampodev.superMercado.Controller;

import com.primeirotrampodev.superMercado.Entidade.Carrinho;
import com.primeirotrampodev.superMercado.Entidade.Produto;
import com.primeirotrampodev.superMercado.Service.CarrinhoService;
import com.primeirotrampodev.superMercado.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;
@GetMapping("/getcarrinho")
    public Carrinho getCarrinho(@RequestParam("nomeUsuario") String nomeUsuario, @RequestParam("telefone") String telefone, @RequestParam("produtoIdList")List<Integer> produtoIdList){

            return carrinhoService.retornarCarrinhodeCompras(nomeUsuario,telefone,produtoIdList);

    }

}
