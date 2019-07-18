package com.marlonaguirre.almacen.core.models.services;

import com.marlonaguirre.almacen.core.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public Cliente save(Cliente cliente);
    public Cliente findByNit(String nit);
    public void delete(Cliente cliente);
    public void delete(String id);
}
