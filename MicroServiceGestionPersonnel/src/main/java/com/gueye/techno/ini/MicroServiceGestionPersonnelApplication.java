package com.gueye.techno.ini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gueye.techno.ini.entities.Membre;
import com.gueye.techno.ini.repo.MembreRepo;

@SpringBootApplication
public class MicroServiceGestionPersonnelApplication implements CommandLineRunner{
	@Autowired
	private MembreRepo membreRepo;
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceGestionPersonnelApplication.class, args);
		System.out.println("Testing Git");
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Membre m1 = new Membre();
		m1.setAdresse("toto");
		m1.setNom("lolo");
		m1.setPrenom("nana");
		this.membreRepo.save(m1);
		System.out.println("couou"+m1.toString());
		
	}
}
