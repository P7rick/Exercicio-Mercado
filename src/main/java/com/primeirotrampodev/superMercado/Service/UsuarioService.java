package com.primeirotrampodev.superMercado.Service;

import com.primeirotrampodev.superMercado.Entidade.Produto;
import com.primeirotrampodev.superMercado.Entidade.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    public Usuario getUsuario(String nome, String telefone){

        Usuario usuario = new Usuario(); // estanciando usuario

        usuario.setId(1);
        usuario.setNome(nome);
        usuario.setTelefone(telefone);

        return usuario;
    }
}
