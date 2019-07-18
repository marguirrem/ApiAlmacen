package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompraDao extends JpaRepository<Compra, Long> {
}