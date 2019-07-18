package com.marlonaguirre.almacen.core.models.dao;

import com.marlonaguirre.almacen.core.models.entity.EmailProveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmailProveedorDao extends JpaRepository<EmailProveedor, Long> {
}