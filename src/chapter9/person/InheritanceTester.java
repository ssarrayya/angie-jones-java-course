package chapter9.person;

import chapter9.person.Employee;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
//        person.getAge();
//        employee.getAge(); //employee has access to member of person class because it inherits from person
        Mother mom  = new Mother();
        mom.setName("Adeyinka");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
