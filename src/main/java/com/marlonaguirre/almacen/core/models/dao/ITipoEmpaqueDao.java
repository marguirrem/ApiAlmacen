package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.TipoEmpaque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoEmpaqueDao extends JpaRepository<TipoEmpaque, Long> {
}