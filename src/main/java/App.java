import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1.getMessage());

        Cat cat = applicationContext.getBean("Cat", Cat.class);


        Cat catBean = applicationContext.getBean("Cat", Cat.class);


        System.out.println(cat.equals(catBean));
        System.out.println(bean.equals(bean1));
    }
}