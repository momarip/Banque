package org.sid;

/*import java.util.Date;
import org.sid.dao.ClientRepository;
import org.sid.dao.CompteRepository;
import org.sid.dao.OperationRepository;
import org.sid.metier.BanqueServices;
import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpBanqueApplication implements CommandLineRunner{
	
	/*@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private BanqueServices banque;*/
	
	public static void main(String[] args) {
		SpringApplication.run(TpBanqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Client c1 =  clientRepository.save(new Client("Hassan","elami@gmail.com"));
		Client c2 =  clientRepository.save(new Client("Ayoub","aub@gmail.com"));
		Compte cp1 = compteRepository.save(new CompteCourant("c1",new Date(),9000,c1,6000));
		Compte cp2 = compteRepository.save(new CompteEpargne("c2",new Date(),6000,c1,6.5));
		banque.verser("c1", 1000);
		banque.retirer("c2", 10);
		banque.verser("c2", 1500);
		banque.verser("c1", 160);
		banque.verser("c1", 1000);
		*/
	}

}
