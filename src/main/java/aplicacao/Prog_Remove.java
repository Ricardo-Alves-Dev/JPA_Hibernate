package aplicacao;//Removendo dados salvos no Banco de Dados MySQL - metodo remove
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Prog_Remove {

	public static void main(String[] args) {
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p =em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println(p);
		
		em.close();
		emf.close();
		
		System.out.println( "Pronto");
		
	}

}
