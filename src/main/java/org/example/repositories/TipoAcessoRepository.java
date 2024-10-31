package org.example.repositories;

import org.example.models.TipoAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAcessoRepository extends JpaRepository<TipoAcesso, Integer> {
    /*
    private static List<TipoAcesso> lst = new ArrayList<>();

    public TipoAcesso add(TipoAcesso tipoAcesso) {
        lst.add(tipoAcesso);
        return tipoAcesso;
    }
    public List<TipoAcesso> getAll(){
        return lst;
    }
    */
}
