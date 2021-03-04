import java.util.Scanner;

public class Marketing {
    public static void main(String[] args) {
        Person person1 = createPerson();
        Person person2 = createPerson();
        Person person3 = createPerson();

        person1.printSalaries();
        person2.printSalaries();
        person3.printSalaries();
    }

    public static Person createPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create new person.");

        System.out.print("Name? ");
        String name = scanner.nextLine();

        System.out.print("Salary? ");
        int salary = Integer.parseInt(scanner.nextLine());

        System.out.print("Hosting hours? ");
        int hostingHours = Integer.parseInt(scanner.nextLine());

        System.out.print("Subscription Hours? ");
        int subsHours = Integer.parseInt(scanner.nextLine());

        System.out.print("Holding hours? ");
        int holdingHours = Integer.parseInt(scanner.nextLine());

        System.out.print("Percentage on iOS? ");
        double iOSRate = Double.parseDouble(scanner.nextLine());

        return new Person(name, salary, hostingHours, subsHours, holdingHours, iOSRate);
    }
}
