package absisters.nimet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NimetApplication {

	public static void main(String[] args) {
		SpringApplication.run(NimetApplication.class, args);
	}

}
