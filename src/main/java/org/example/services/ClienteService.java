package org.example.services;

import org.example.models.Cliente;
import org.example.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Optional<Cliente> findOne(long index){
        return repository.findById(index);
    }

    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }

    public void delete(long index){
        repository.deleteById(index);
    }

}
