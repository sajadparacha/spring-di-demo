package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.externalproperties.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"controllers","guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getFakeDataSourceBean().getUsername());
		System.out.println(fakeDataSource.getFakeDataSourceBean().getCast());
//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
