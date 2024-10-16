package aplicacao;//buscando dados salvos no Banco de Dados MySQL - metodo find

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Prog_Find {

	public static void main(String[] args) {
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p =em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		em.close();
		emf.close();
		
		System.out.println( "Pronto");
		
	}

}
