package day45_Inheritance.EmployeeTask;



    public class Tester extends Employee { // Tester Is An Employee, Tester Is A person

        public Tester(String name, char gender, int age, long id, String jobTitle, double salary) {
            super(name, gender, age, id, jobTitle, salary);
        }

        public void testing(){
            System.out.println(jobTitle+" "+name+" is testing");
        }


    }

/*
6 variables inherited from Employee
7 methods inherited from employee
 */

