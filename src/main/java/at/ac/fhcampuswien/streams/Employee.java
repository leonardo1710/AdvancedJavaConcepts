package at.ac.fhcampuswien.streams;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){

    }

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }
}
