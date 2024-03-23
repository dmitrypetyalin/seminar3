package domain;

/**
 * @author PetSoft
 * @date 23.03.2024 9:39
 */
public class Teacher extends Person {
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
