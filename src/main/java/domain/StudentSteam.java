package domain;

import java.util.Iterator;
import java.util.List;

/**
 * @author PetSoft
 * @date 23.03.2024 9:46
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> group;

    public StudentSteam(List<StudentGroup> group) {
        this.group = group;
    }

    public List<StudentGroup> getGroups() {
        return group;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
//        return new StudentGroup ;
        return new StudentSteamIterator(group);
    }
}
