package tr.com.testautomation;

public class Personnel {
    public enum Gender {
        MALE,
        FEMALE,
    }

    private final String name;
    private final String surname;
    private final int age;
    private final Gender gender;

    public static int calculateRetirementAge(Personnel p) {
        if(p.getGender() == Gender.FEMALE)
            return 60 - p.getAge();
        else
            return 65 - p.getAge();
    }

    public int calculate() {
        if(this.gender == Gender.FEMALE)
            return 60 - this.age;
        else
            return 65 - this.age;
    }

    public Personnel(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
