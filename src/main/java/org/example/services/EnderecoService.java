package org.example.services;

import org.example.models.Endereco;
import org.example.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll(){
        return repository.findAll();
    }

    public Optional<Endereco> findOne(int index){
        return repository.findById(index);
    }

    public Endereco save(Endereco endereco){
        return repository.save(endereco);
    }

    public void delete(int index){
        repository.deleteById(index);
    }

}
