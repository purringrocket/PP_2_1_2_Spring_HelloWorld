import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld anotherBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat anotherCat = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean.equals(anotherBean));
        System.out.println(cat.equals(anotherCat));
    }
}