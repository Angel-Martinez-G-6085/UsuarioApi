package com.angel.UsuariosService.Repositories;

import com.angel.UsuariosService.Models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
