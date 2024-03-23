package domain;

/**
 * @author PetSoft
 * @date 23.03.2024 9:39
 */
public class Employee extends Person {
    private String special;

    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
