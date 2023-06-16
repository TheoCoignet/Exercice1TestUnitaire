package Exercice1;

public class Employee {
    private String firstName;
    private String lastName;
    private int experience;
    private String level;

    public Employee(String firstName, String lastName, int experience, String level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.level = level;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getExperience(){
        return experience;
    }

    public String getLevel(){
        return level;
    }
}
