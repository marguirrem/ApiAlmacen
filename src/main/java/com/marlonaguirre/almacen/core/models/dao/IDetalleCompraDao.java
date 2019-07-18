package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleCompraDao extends JpaRepository<DetalleCompra, Long> {
}