package com.angel.UsuariosService.Controllers;

import com.angel.UsuariosService.Models.Usuario;
import com.angel.UsuariosService.Services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioservicio;
    @GetMapping("/")
    public List<Usuario> allUsuarios() {
        return usuarioservicio.getAllUsuarios();
    }
    @GetMapping("/obtener/{id}")
    public Usuario findUsuario(@PathVariable Long id) {
        return usuarioservicio.getUsuarioById(id);
    }
    @PostMapping("/crear")
    public void guardarUsuario(@RequestBody Usuario nuevoUsuaeio) {
        usuarioservicio.crearUsuario(nuevoUsuaeio);
    }
    @PutMapping("/editar/{id}")
    public String editUsuario(@PathVariable Long id, @RequestBody Usuario nuevoUsuario) {
        usuarioservicio.editarUsuario(id, nuevoUsuario);
        return "Usuario actualizado correctamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarUsuario(@PathVariable Long id) {
        usuarioservicio.borrarUsuario(id);
        return "Usuario borrado correctamente";
    }
}
