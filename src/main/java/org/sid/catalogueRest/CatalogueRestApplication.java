package org.sid.catalogueRest;

import org.sid.catalogueRest.dao.ProduitRepository;
import org.sid.catalogueRest.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CatalogueRestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(CatalogueRestApplication.class, args);

		ProduitRepository produitRepository = ((ConfigurableApplicationContext) ctx).getBean(ProduitRepository.class);

		produitRepository.save(new Produit(1L,"Livre", 512, 250));
		produitRepository.save(new Produit(2L,"Cahier", 312, 215));
		produitRepository.save(new Produit(3L,"Stylo", 342, 12));
		produitRepository.save(new Produit(4L,"Valise", 52, 1550));
		produitRepository.save(new Produit(5L,"Ram papier", 112, 125));
		produitRepository.save(new Produit(6L,"LXXXXXX", 622, 250));
		produitRepository.save(new Produit(7L,"LDDDDDD", 422, 275));
		produitRepository.save(new Produit(8L,"LZZZZZZ", 612, 650));


	}



}

