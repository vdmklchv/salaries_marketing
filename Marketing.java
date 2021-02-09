import java.util.Scanner;

public class Marketing {
    public static void main(String[] args) {
        Person artem = createPerson();
        Person jenya = createPerson();
        Person inna = createPerson();

        // System.out.println("Here are the salaries per project:");
        artem.printSalaries();
        jenya.printSalaries();
        inna.printSalaries();
    }

    public static Person createPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create new person.");

        System.out.print("Name? ");
        String name = scanner.nextLine();

        System.out.print("Salary? ");
        int salary = Integer.valueOf(scanner.nextLine());

        System.out.print("Hosting hours? ");
        int hostingHours = Integer.valueOf(scanner.nextLine());

        System.out.print("Subscription Hours? ");
        int subsHours = Integer.valueOf(scanner.nextLine());

        System.out.print("Holding hours? ");
        int holdingHours = Integer.valueOf(scanner.nextLine());

        System.out.print("Percentage on iOS? ");
        double iOSRate = Double.valueOf(scanner.nextLine());

        return new Person(name, salary, hostingHours, subsHours, holdingHours, iOSRate);
    }
}
