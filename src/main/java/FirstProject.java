import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import production.Tool;
import production.Worker;
import production.WorkerConfig;
import production.WorkerMotto;

import java.util.List;

public class FirstProject
{
    public static void main(String[] args)
    {
        String [] beans = new String []{"tools.xml"};
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
        Worker testWorker =  xmlApplicationContext.getBean(Worker.class);
        System.out.println("\n\n" +testWorker+"\n\n");
        ApplicationContext annotationApplicationContext =
                            new AnnotationConfigApplicationContext(WorkerConfig.class);
       WorkerMotto annotationWorkerMotto =  annotationApplicationContext.getBean(WorkerMotto.class);
        System.out.println(annotationWorkerMotto);


    }
}
