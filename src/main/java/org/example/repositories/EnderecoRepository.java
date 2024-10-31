package org.example.repositories;

import org.example.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    /*
    private static List<Endereco> lst = new ArrayList<>();

    public Endereco add(Endereco endereco) {
        lst.add(endereco);
        return endereco;
    }
    public List<Endereco> getAll(){
        return lst;
    }
    */
}
