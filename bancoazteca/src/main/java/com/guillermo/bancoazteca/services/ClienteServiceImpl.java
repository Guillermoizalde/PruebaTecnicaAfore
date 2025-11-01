package com.guillermo.bancoazteca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guillermo.bancoazteca.entity.Cliente;
import com.guillermo.bancoazteca.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
        
    }

    @Override
    public Optional<Cliente> getClienteById(Long id) {
        return Optional.ofNullable(clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado")));
        
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        if(cliente.getCorreoElectronico() == null || cliente.getCorreoElectronico().isEmpty()) {
            throw new IllegalArgumentException("El correo es obligatorio");
        }
        return clienteRepository.save(cliente);
        
    }

    @Override
    public void deleteCliente(Long id) {
        if(!clienteRepository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar: usuario no existe");
        }
        clienteRepository.deleteById(id);
        
    }

    @Override
    public Cliente updateCliente(Long id, Cliente cliente) {
        return cliente;
        
    }


}

