package net.home.simplecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "net.home.simplecrud")
public class SimpleCrudApplication {

	public static void main(String[] args) {
        System.out.println(help());
		SpringApplication.run(SimpleCrudApplication.class, args);
	}

    public static String help() {
        return "Testing -------------------- ";
    }

}
