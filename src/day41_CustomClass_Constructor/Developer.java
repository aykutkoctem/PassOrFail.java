package day41_CustomClass_Constructor;

public class Developer {
    public String name;
    public  char gender;
    public String jobTitle;
    public int id;
    public  double salary;

    public static boolean isEmployeed;
    public static boolean hatesTester;

    static {

    }

    public Developer(String name, char gender, String jobTitle, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }
}
