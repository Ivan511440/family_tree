import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
     public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Human member1 = new Human("John", sdf.parse("01/01/1990"), Gender.MALE);
        Human member2 = new Human("Alice", sdf.parse("15/07/1995"), Gender.FEMALE);
        Human member3 = new Human("Bob", sdf.parse("20/03/1985"), Gender.MALE);
        Human member4 = new Human("Claire", sdf.parse("10/11/1992"), Gender.FEMALE);

        Family family = new Family();
        family.addMember(member1);
        family.addMember(member2);
        family.addMember(member3);
        family.addMember(member4);

        System.out.println("Family members:");
        for (Human member : family) {
            System.out.println(member);
        }

        family.sortByName();
        System.out.println("\nFamily members sorted by name:");
        for (Human member : family) {
            System.out.println(member);
        }

        family.sortByBirthDate();
        System.out.println("\nFamily members sorted by birth date:");
        for (Human member : family) {
            System.out.println(member);
        }
    }
}

