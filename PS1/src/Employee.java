public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee()
    {
        name = "(not set)";
        idNumber = 0;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String name, int id)
    {
        this.name = name;
        this.idNumber = id;
        department = "(not set)";
        position = "(not set)";
    }

    public Employee(String name, int id, String department, String position)
    {
        this.name = name;
        this.idNumber = id;
        this.department = department;
        this.position = position;
    }

    public String getName()
    {
        return this.name;
    }

    public String getDepartment()
    {
        return this.department;
    }

    public String getPosition()
    {
        return this.position;
    }

    public int getIdNumber()
    {
        return this.idNumber;
    }
}
