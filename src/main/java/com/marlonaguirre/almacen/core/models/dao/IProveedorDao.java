package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorDao extends JpaRepository<Proveedor, Long> {
}