package production;

public class Worker
{
    private  String proffesion;
    private int age;

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

    @Override
    public String toString()
    {
        return "Worker{" +
                "proffesion='" + proffesion + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        return proffesion.equals(worker.proffesion);
    }

    @Override
    public int hashCode()
    {
        int result = proffesion.hashCode();
        result = 31 * result + age;
        return result;
    }
}
