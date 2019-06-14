package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaDao extends JpaRepository<Categoria,Long> {

}
