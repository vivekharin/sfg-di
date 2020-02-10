package vivek.guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vivek.guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import vivek.guru.springframework.sfgdi.controllers.MyController;
import vivek.guru.springframework.sfgdi.controllers.PropertyInjectedController;
import vivek.guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  ctx.getBean("propertyInjectedController");
		SetterInjectedController setterInjectedController = (SetterInjectedController)  ctx.getBean("setterInjectedController");

		System.out.println("Constructor Greeting");
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println("Property Greeting");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter Greeting");
		System.out.println(setterInjectedController.getGreeting());
	}
}