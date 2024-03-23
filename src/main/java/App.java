import domain.Student;
import domain.StudentGroup;
import domain.StudentSteam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author PetSoft
 * @date 23.03.2024 9:37
 */
public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group5830 = new StudentGroup(listStud, 5830);
        System.out.println(group5830);

        for (Student std : group5830) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group5830.getGroup());

        for (Student std : group5830.getGroup()) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        StudentGroup group5520 = new StudentGroup(Arrays.asList(new Student("Helen", 22),
                new Student("Helga", 23),
                new Student("Astrid", 24),
                new Student("Maria", 25)), 5520);

        StudentGroup group5680 = new StudentGroup(Arrays.asList(new Student("Robert", 20),
                new Student("Donald", 20),
                new Student("John", 22),
                new Student("Bill", 21),
                new Student("Ronald", 23)), 5680);

        StudentSteam steam = new StudentSteam(Arrays.asList(group5830, group5520, group5680));

        for (StudentGroup group : steam) {
            System.out.println(group.getIdGroup() + ": " + group.getGroup());
        }

        Collections.sort(steam.getGroups());

        System.out.println("=========================================================");

        for (StudentGroup group : steam) {
            System.out.println(group.getIdGroup() + ": " + group.getGroup());
        }


    }
}
