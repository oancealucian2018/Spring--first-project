import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import production.Worker;

@RunWith(SpringRunner.class)
@ContextConfiguration (locations = "/test-application-context.xml")
public class WorkerTest
{
   @Autowired // aici il injectam
    private Worker worker;

   @Test
    public void getTools(){
//       Assert.assertNotNull(worker);
//       Assert.assertNotNull(worker.getTools());
//       Assert.assertEquals(worker.getAge(),50);
       // Assert.assertEquals(worker.getProffesion(),"Carpenter");
        Assert.assertEquals(2,worker.getTools().size()); /// asa e corecta ordinea
   }
}
