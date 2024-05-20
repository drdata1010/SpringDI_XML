import com.learning.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String config_file_loc = "/com/learning/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
        Student std= (Student) context.getBean("stdId");
        std.display();
    }
}