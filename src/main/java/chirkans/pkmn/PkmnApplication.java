package chirkans.pkmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PkmnApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PkmnApplication.class, args);
	}
}
