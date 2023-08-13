import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Family implements Iterable<Human>{
    private List<Human> members;

    public Family() {
        this.members = new ArrayList<>();
    }

    public void addMember(Human member) {
        members.add(member);
    }

    public void sortByName() {
        Collections.sort(members, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });
    }

    public void sortByBirthDate() {
        Collections.sort(members, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getBirthDate().compareTo(h2.getBirthDate());
            }
        });
    }

    @Override
    public Iterator<Human> iterator() {
        return members.iterator();
    }
}

