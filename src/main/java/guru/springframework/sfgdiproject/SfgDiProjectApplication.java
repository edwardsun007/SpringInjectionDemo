package guru.springframework.sfgdiproject;

import guru.springframework.sfgdiproject.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiProjectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController"); // This is how we ask Spring context for controller, the name start with lower case note
		String greeting = myController.sayHi();

		System.out.println(greeting);
	}

}
