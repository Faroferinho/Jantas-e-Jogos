package org.example.services;

import org.example.models.Agenda;
import org.example.repositories.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository repository;

    public List<Agenda> findAll(){
        return repository.findAll();
    }

    public Optional<Agenda> findOne(long index){
        return repository.findById(index);
    }

    public Agenda save(Agenda agenda){
        return repository.save(agenda);
    }

    public void delete(long index){
        repository.deleteById(index);
    }

}
