package com.vvmotax.git.project.repository;

import com.vvmotax.git.project.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
