import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        Thread.sleep(1000);
        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean == bean2);
        System.out.println(bean3 == bean4);
    }
}