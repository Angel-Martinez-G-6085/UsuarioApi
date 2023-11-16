package com.angel.UsuariosService.Services;

import com.angel.UsuariosService.Models.Usuario;
import com.angel.UsuariosService.Repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpUsuarioService implements  IUsuarioService{
    @Autowired
    private IUsuarioRepository usuariosRepo;
    @Override
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) usuariosRepo.findAll();
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuariosRepo.findById(id).orElse(null);
    }

    @Override
    public void crearUsuario(Usuario newUser) {
        usuariosRepo.save(newUser);
    }

    @Override
    public Usuario editarUsuario(Long id, Usuario usuarioEditado) {
        Usuario viejoUsuario = this.getUsuarioById(id);
        viejoUsuario.setNombre(usuarioEditado.getNombre());
        viejoUsuario.setApellido(usuarioEditado.getApellido());
        viejoUsuario.setEdad(usuarioEditado.getEdad());
        viejoUsuario.setDireccion(usuarioEditado.getDireccion());
        viejoUsuario.setTelefono(usuarioEditado.getTelefono());
        return usuariosRepo.save(viejoUsuario);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuariosRepo.deleteById(id);
    }
}
