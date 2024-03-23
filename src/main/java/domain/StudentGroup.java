package domain;

import java.util.Iterator;
import java.util.List;

/**
 * @author PetSoft
 * @date 23.03.2024 9:41
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(o.getGroup().size(), this.getGroup().size());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }
    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }
    // @Override

    // public Iterator<Student> iterator() {

    //    return new Iterator<Student>() {
    //     private int counter;

    //     @Override
    //     public boolean hasNext() {
    //         if(counter<group.size())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;

    //         }
    //     }
    //     @Override
    //     public Student next() {

    //         return group.get(counter++);

    //     }

    //    };

    // }
}
