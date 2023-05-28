package com.java.lessons.annotations;

import com.java.lessons.annotations.controller.MyController;
import com.java.lessons.annotations.controller.PizzaController;
import com.java.lessons.annotations.lazy.LazyLoader;
import com.java.lessons.annotations.propertsource.PropertySourceDemo;
import com.java.lessons.annotations.repository.MyRepository;
import com.java.lessons.annotations.scope.PrototypeBean;
import com.java.lessons.annotations.scope.SingletonBean;
import com.java.lessons.annotations.service.MyService;
import com.java.lessons.annotations.service.VegPizza;
import com.java.lessons.annotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootAnnotatitonsApplication {

	public static void main(String[] args) {

		var context= SpringApplication.run(SpringBootAnnotatitonsApplication.class, args);

	//@Scope annotation
	//SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
	//System.out.println(singletonBean1.hashCode());

	//SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
	//System.out.println(singletonBean2.hashCode());

	//SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
	//System.out.println(singletonBean3.hashCode());

	//PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
	//System.out.println(prototypeBean1.hashCode());

	//PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
	//System.out.println(prototypeBean2.hashCode());

	//PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
	//System.out.println(prototypeBean3.hashCode());

	//@Value annotation
	//ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
	//System.out.println(valueAnnotationDemo.getDefaultName()); //Default Name
	//System.out.println(valueAnnotationDemo.getHost());
	//System.out.println(valueAnnotationDemo.getEmail());
	//System.out.println(valueAnnotationDemo.getPassword());
	//System.out.println(valueAnnotationDemo.getJavaHome());
	//System.out.println(valueAnnotationDemo.getHomeDir());

		/*
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
		*/
		/*
		//MyController running
		MyController myController =  context.getBean(MyController.class);
		System.out.println(myController.hello());

		//MyService running
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());

		//MyRepository running
		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.hello());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

		//Bean isim verildiği için bu şekilde de çağırılabilir.
		//VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
		//System.out.println(vegPizza.getPizza());
*/

		//@PropertySource annotation
		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDescription());


	}

}
