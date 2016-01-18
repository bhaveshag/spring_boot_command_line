/**
 * 
 */
package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bhavesh
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired HelloWorld helloWorld;
	public static void main(String[] args) throws Exception {

		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		helloWorld.print(args);
	}

}
