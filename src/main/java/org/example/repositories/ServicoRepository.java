package org.example.repositories;

import org.example.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
    /*
    private static List<Servico> lst = new ArrayList<>();

    public Servico add(Servico servico){
        lst.add(servico);
        return servico;
    }

    public List<Servico> getAll(){
        return lst;
    }
     */
}
