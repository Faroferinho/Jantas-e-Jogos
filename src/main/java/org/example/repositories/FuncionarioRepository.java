package org.example.repositories;

import org.example.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    /*
    private static List<Funcionario> lst = new ArrayList<>();

    public Funcionario add(Funcionario funcionario){
        lst.add(funcionario);
        return funcionario;
    }

    public List<Funcionario> getAll(){
        return lst;
    }
     */
}
