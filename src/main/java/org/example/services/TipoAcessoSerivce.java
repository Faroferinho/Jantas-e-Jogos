package org.example.services;

import org.example.models.TipoAcesso;
import org.example.repositories.TipoAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoAcessoSerivce {

    @Autowired
    private TipoAcessoRepository repository;

    public List<TipoAcesso> findAll(){
        return repository.findAll();
    }

    public Optional<TipoAcesso> findOne(int index){
        return repository.findById(index);
    }

    public TipoAcesso save(TipoAcesso endereco){
        return repository.save(endereco);
    }

    public void delete(int index){
        repository.deleteById(index);
    }

}
