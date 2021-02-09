import java.util.Scanner;
import java.text.DecimalFormat;

public class Person {
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner scanner = new Scanner(System.in);

    private String name;

    private int salary;

    private int hostingHours;
    private int subsHours;
    private int holdingHours;

    private double iosRate;

    public Person(String name, int salary, int hostingHours, int subsHours, int holdingHours, double iOSRate) {
        this.name = name;
        this.iosRate = iOSRate;
        this.hostingHours = hostingHours;
        this.salary = salary;
        this.subsHours = subsHours;
        this.holdingHours = holdingHours;
    }

    private double calcIOSHours() {
        return this.subsHours * this.iosRate;
    }

    private double calcWebHours() {
        return this.subsHours - this.calcIOSHours();
    }

    private int calcTotalHours() {
        return this.hostingHours + this.subsHours + this.holdingHours;
    }

    private double calcPayingRate() {
        return 1.0 * this.salary / this.calcTotalHours();
    }

    public void printSalaries() {
        System.out.println("");
        System.out.println(this.name + ":");
        System.out.println("-------------");
        System.out.println("Hosting: " + df.format(this.calcPayingRate() * this.hostingHours));
        System.out.println("Subs Web: " + df.format(this.calcPayingRate() * this.calcWebHours()));
        System.out.println("Subs iOS: " + df.format(this.calcPayingRate() * this.calcIOSHours()));
        System.out.println("-------------");
        System.out.println("");
    }
}
