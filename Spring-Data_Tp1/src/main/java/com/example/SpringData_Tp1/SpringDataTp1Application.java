package com.example.SpringData_Tp1;

import com.example.SpringData_Tp1.enmus.Genre;
import com.example.SpringData_Tp1.models.Etudiant;
import com.example.SpringData_Tp1.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.ColumnMapRowMapper;

@SpringBootApplication
public class SpringDataTp1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataTp1Application.class, args);
	}


	@Autowired
	EtudiantRepository etudiantRepository;

	@Override
	public void run(String... args) throws Exception {
		Etudiant et1 = Etudiant.builder()
				.nom("Yassir")
				.prenom("jerrari")
				.genre(Genre.Homme)
				.build();

		etudiantRepository.save(et1);
		// Perform any additional actions or initialization here
	}

}
