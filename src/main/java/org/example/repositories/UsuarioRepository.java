package org.example.repositories;

import org.example.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    /*
    private static List<Usuario> lst = new ArrayList<>();

    public Usuario add(Usuario usuario){
        lst.add(usuario);
        return usuario;
    }

    public List<Usuario> getAll(){
        return lst;
    }
     */
}
