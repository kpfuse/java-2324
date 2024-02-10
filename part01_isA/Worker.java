package part01_isA;

public class Worker extends Person {
    private double grossSalary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        super(name, age);
        this.grossSalary = salary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    public double getTax() {
        return grossSalary * 0.13;
    }
    public double getNetSalary() {
        return grossSalary * 0.87;
    }

    @Override
    public String toString() {
        return "Worker{" +
                ", name='" + name + '\'' +
                ", age='" + getAge() + '\'' +
                "salary=" + grossSalary +
                '}';
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("gross-salary = " + grossSalary
                + " income tax = " + getTax()
                + ", net-salary = " + getNetSalary() + "; ");
    }
}
