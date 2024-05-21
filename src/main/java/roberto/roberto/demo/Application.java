package roberto.roberto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		// SpringApplication.run(Application.class);
		app.setAdditionalProfiles("roberto");
        app.run(args);
	}

}
