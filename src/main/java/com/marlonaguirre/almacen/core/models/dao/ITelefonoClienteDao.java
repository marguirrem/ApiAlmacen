package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.TelefonoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITelefonoClienteDao extends JpaRepository<TelefonoCliente, Long> {
}