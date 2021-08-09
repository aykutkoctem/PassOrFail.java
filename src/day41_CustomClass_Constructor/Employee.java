package day41_CustomClass_Constructor;

public class Employee {
  public String name,jobTile;
  public double salary;

    public Employee(String name, String jobTile, double salary) {
        this.name = name;
        this.jobTile = jobTile;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTile='" + jobTile + '\'' +
                ", salary=" + salary +
                '}';
    }
}
