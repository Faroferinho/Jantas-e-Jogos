package org.example.services;

import org.example.models.Usuario;
import org.example.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Optional<Usuario> findOne(long index){
        return repository.findById(index);
    }

    public Usuario save(Usuario usuario){
        return repository.save(usuario);
    }

    public void delete(long index){
        repository.deleteById(index);
    }

}
