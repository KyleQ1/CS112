import java.util.Scanner;

public class EmployeeDemo
{
    private static final Scanner keyboard = new Scanner(System.in);

    public static void printInfo(Employee e)
    {
        System.out.printf("%12s", e.getName());
        System.out.printf("%13s", e.getIdNumber());
        System.out.printf("%13s", e.getDepartment());
        System.out.printf("%13s%n", e.getPosition());
    }

    public static Employee storeInfo() {
        System.out.println("-- Employee Entry Form --");

        System.out.println("Enter name");
        String name = keyboard.nextLine();
        System.out.println("Enter ID");
        int id = keyboard.nextInt();
        // Scanner stays on track for next index
        keyboard.nextLine();
        System.out.println("Enter department");
        String department = keyboard.nextLine();
        System.out.println("Enter position");
        String position = keyboard.nextLine();
        return new Employee(name, id, department, position);
    }

    public static void main(String[] args)
    {
        Employee e1 = storeInfo();
        Employee e2 = storeInfo();
        Employee e3 = storeInfo();

        System.out.printf("%12s", "Name");
        System.out.printf("%13s", "ID");
        System.out.printf("%13s", "Department");
        System.out.printf("%13s%n", "Position");
        printInfo(e1);
        printInfo(e2);
        printInfo(e3);
    }
}
