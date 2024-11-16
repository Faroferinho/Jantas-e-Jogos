package org.example.services;

import org.example.models.Funcionario;
import org.example.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findAll(){
        return repository.findAll();
    }

    public Optional<Funcionario> findOne(long index){
        return repository.findById(index);
    }

    public Funcionario save(Funcionario funcionario){
        return repository.save(funcionario);
    }

    public void delete(long index){
        repository.deleteById(index);
    }

}
