package com.primeirotrampodev.superMercado.Entidade;

import java.util.List;

public class Carrinho {

   private Usuario usuario;

   private List<Produto> produtoList;

   public Usuario getUsuario() {
      return usuario;
   }

   public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
   }

   public List<Produto> getProdutoList() {
      return produtoList;
   }

   public void setProdutoList(List<Produto> produtoList) {
      this.produtoList = produtoList;
   }
}
