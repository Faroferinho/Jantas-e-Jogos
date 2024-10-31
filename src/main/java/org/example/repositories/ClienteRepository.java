package org.example.repositories;

import org.example.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    /*
    private static List<Funcionario> lst = new ArrayList<>();

    public Funcionario add(Cliente cliente){
        lst.add(cliente);
        return cliente;
    }

    public List<Cliente> getAll(){
        return lst;
    }
     */
}
