package guru.springframework.sfgdiproject;

import guru.springframework.sfgdiproject.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// We removed the component scan ComponentScan annotation because there is no component no more
@SpringBootApplication
public class SfgDiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiProjectApplication.class, args);

		// PetController
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("------ The Best Pet is -----");
		System.out.println(petController.whichPetIsTheBest());

		// Bean with profile
		System.out.println("-------- i18n Bean");
		i18nController i18nController = (i18nController) ctx.getBean(("i18nController"));
		System.out.println(i18nController.sayHello());

		// This is how we ask Spring context for controller, the name should always start with lower case note that
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("-------- Primary Bean");
		System.out.println(myController.sayHi());

		System.out.println("-------- Property");
		// How to retrieve beans and use them
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
