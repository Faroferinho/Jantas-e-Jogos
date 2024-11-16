package org.example.services;

import org.example.models.Servico;
import org.example.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repository;

    public List<Servico> findAll(){
        return repository.findAll();
    }

    public Optional<Servico> findOne(long index){
        return repository.findById(index);
    }

    public Servico save(Servico servico){
        return repository.save(servico);
    }

    public void delete(long index){
        repository.deleteById(index);
    }

}
