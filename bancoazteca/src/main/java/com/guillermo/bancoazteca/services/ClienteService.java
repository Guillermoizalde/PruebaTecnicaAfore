package com.guillermo.bancoazteca.services;

import java.util.List;
import java.util.Optional;

import com.guillermo.bancoazteca.entity.Cliente;

public interface ClienteService {

    List<Cliente> findAll();

    Optional<Cliente> getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    void deleteCliente(Long id);

    Cliente updateCliente(Long id, Cliente cliente);


}
