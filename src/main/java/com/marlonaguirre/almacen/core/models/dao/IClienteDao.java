package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, String> {
}