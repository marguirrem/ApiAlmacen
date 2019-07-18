package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.TelefonoProveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITelefonoProveedorDao extends JpaRepository<TelefonoProveedor, Long> {
}