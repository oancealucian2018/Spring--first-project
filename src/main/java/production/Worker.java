package production;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Worker
{
    private  String proffesion;
    private int age;
    private List<Tool> tools;

    @Autowired private WorkerMotto workerMotto;

    public Worker(String proffesion, int age, WorkerMotto workerMotto)
    {
        this.proffesion = proffesion;
        this.age = age;
        this.workerMotto = workerMotto;
    }

    public WorkerMotto getWorkerMotto()
    {
        return workerMotto;
    }

    public void setWorkerMotto(WorkerMotto workerMotto)
    {
        this.workerMotto = workerMotto;
    }

    public String getProffesion()
    {
        return proffesion;
    }

    public void setProffesion(String proffesion)
    {
        this.proffesion = proffesion;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public List<Tool> getTools()
    {
        return tools;
    }

    public void setTools(List<Tool> tools)
    {
        this.tools = tools;
    }

    @Override
    public String toString()
    {
        return "Worker{" +
                "proffesion='" + proffesion + '\'' +
                ", age=" + age +
                ", tools=" + tools +
                ", workerMotto=" + workerMotto +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        if (!proffesion.equals(worker.proffesion)) return false;
        if (!tools.equals(worker.tools)) return false;
        return workerMotto.equals(worker.workerMotto);
    }

    @Override
    public int hashCode()
    {
        int result = proffesion.hashCode();
        result = 31 * result + age;
        result = 31 * result + tools.hashCode();
        result = 31 * result + workerMotto.hashCode();
        return result;
    }
}
