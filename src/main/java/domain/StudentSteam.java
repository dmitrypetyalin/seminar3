package domain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author PetSoft
 * @date 23.03.2024 9:46
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private int steamId;
    private List<StudentGroup> groups;

    public StudentSteam(List<StudentGroup> group, int steamId) {
        this.steamId = steamId;
        this.groups = group;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Steam: ").append(steamId).append(", groups are: ").append(groups.size()).append("\n");

        for (StudentGroup group : groups) {
            sb.append("\t").append(group).append("\n");
        }
        return sb.toString();
//        return "Steam: " + steamId + ", groups are: " + groups.size() + ", " + Arrays.toString(new List[]{groups});
    }
}
