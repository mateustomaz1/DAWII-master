package br.edu.ifpb.es.daw;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.Empregado;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainEmpregadoUpdate {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			EmpregadoDAO dao = new EmpregadoDAOImpl(emf);
			Empregado empregado = new Empregado();

			empregado.setNome("Mateus");
			empregado.setSobrenome("Tomaz");
			empregado.setCpf("111111111-11");
			empregado.setDataNascimento(LocalDate.now());
			empregado.setEndereco("Joaquim Manoel 42");
			empregado.setSalario(BigDecimal.valueOf(1245,24));
			empregado.setSexo('M');
			empregado.setNdepedentes(4);

			dao.save(empregado);

			System.out.println(empregado);

			empregado.setNome("Tomaz");
			empregado.setSalario(BigDecimal.valueOf(4587.45));

			dao.update(empregado);

			System.out.println(empregado);
		}
	}

}
