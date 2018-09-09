package br.com.ciadasbolsas.CiaDasBolsas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "br.com.ciadasbolsas.CiaDasBolsas.domain" })
@EnableJpaRepositories(basePackages = { "br.com.ciadasbolsas.CiaDasBolsas.repositories" })
public class CiaDasBolsasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiaDasBolsasApplication.class, args);
	}
}
