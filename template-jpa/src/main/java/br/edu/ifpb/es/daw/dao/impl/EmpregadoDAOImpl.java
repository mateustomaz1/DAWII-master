package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.EmpregradoDAO;
import br.edu.ifpb.es.daw.entities.Empregado;
import jakarta.persistence.EntityManagerFactory;

public class EmpregadoDAOImpl extends AbstractDAOImpl<Empregado, Integer> implements EmpregradoDAO {
    
    public EmpregadoDAOImpl(EntityManagerFactory emf) {
            super(Empregado.class, emf);
    }

}