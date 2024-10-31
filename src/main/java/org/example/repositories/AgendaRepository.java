package org.example.repositories;

import org.example.models.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {
    /*
    private static List<Agenda> lst = new ArrayList<>();

    public Agenda add(Agenda agenda){
        lst.add(agenda);
        return agenda;
    }

    public List<Agenda> getAll(){
        return lst;
    }
     */
}
