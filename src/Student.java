enum Gender {
    MALE,
    FEMALE, 
    NB
};


public class Student {
    private int age       = 0;
    private String name   = "";
    private Gender gender = Gender.NB;


    // ─────────────────────────────────────────────────────────────── GETTERS ─────

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }


    // ─────────────────────────────────────────────────────────────── SETTERS ─────

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
