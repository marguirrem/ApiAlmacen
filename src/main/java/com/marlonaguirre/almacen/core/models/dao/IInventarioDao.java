package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInventarioDao extends JpaRepository<Inventario, Long> {
}