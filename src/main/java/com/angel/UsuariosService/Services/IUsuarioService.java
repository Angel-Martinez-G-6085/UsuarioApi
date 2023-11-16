package com.angel.UsuariosService.Services;

import com.angel.UsuariosService.Models.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> getAllUsuarios();
    public Usuario getUsuarioById(Long id);
    public void crearUsuario(Usuario newUser);
    public Usuario editarUsuario(Long id, Usuario usuarioEditado);
    public void borrarUsuario(Long idBorrar);
}
