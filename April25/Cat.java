package April25;

public class Cat {

    private String name, breed;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

}
