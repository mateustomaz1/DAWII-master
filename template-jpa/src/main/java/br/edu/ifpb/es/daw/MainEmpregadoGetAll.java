package br.edu.ifpb.es.daw;

import java.util.List;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.Empregado;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainEmpregadoGetAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			EmpregadoDAO dao = new EmpregadoDAOImpl(emf);
			List<Empregado> empregados = dao.getAll();

			for (Empregado empregado : empregados) {
				System.out.println(empregado);
			}
		}
	}
}
