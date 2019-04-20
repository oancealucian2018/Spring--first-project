import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import production.Tool;
import production.Worker;
import production.WorkerMotto;

import java.util.List;

public class FirstProject
{
    public static void main(String[] args)
    {
        String [] beans = new String []{"tools.xml"};
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
       Worker testWorker =  xmlApplicationContext.getBean(Worker.class);
      // ApplicationContext annotationApplicationContext = new ApplicationContext(AppConfig.class);

        WorkerMotto testWorkerMotto =  xmlApplicationContext.getBean(WorkerMotto.class);
        Tool testTool=  xmlApplicationContext.getBean(Tool.class);


    }
}
