package com.guillermo.bancoazteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.guillermo.bancoazteca.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
