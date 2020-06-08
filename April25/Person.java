package April25;

public class Person {

    private String name, gender;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void person(String name, String gender, int id) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

}
