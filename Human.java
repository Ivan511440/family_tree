import java.util.Date;

public class Human {
    private String name;
    private Date birthDate;
    private Gender gender;

    public Human(String name, Date birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }
}