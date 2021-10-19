package guru.springframework.sfgdiproject;

import guru.springframework.sfgdiproject.controllers.ConstructorDependencyInjectionController;
import guru.springframework.sfgdiproject.controllers.MyController;
import guru.springframework.sfgdiproject.controllers.PropertyInjectedController;
import guru.springframework.sfgdiproject.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiProjectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		// This is how we ask Spring context for controller, the name start with lower case note that

		String greeting = myController.sayHi();

		System.out.println(greeting);
		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor"); // remember the bean name convention should be lowercase first letter
		ConstructorDependencyInjectionController constructorInjectedController = (ConstructorDependencyInjectionController) ctx.getBean("constructorDependencyInjectionController");
		System.out.println(constructorInjectedController.getGreeting());

	}


}
