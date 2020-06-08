package May23;

public class Activities {

    private int hunger;
    private int energy;
    private int happy;

    private void meow() {
        System.out.println("Make cat sounds!");
    }

    public Activities() {
        this.hunger = hunger;
        this.energy = energy;
        this.happy = happy;
    }
    public void play() {
        hunger++;
        energy--;
        happy++;
    }

    public void feed() {
        hunger--;
        energy++;
        happy++;
    }

    public void sleep() {
        hunger++;
        energy--;
        happy++;
    }

    @Override
    public String toString() {
        return "{hunger: " + hunger + "energy: " + energy + "happy " + happy + "}";
    }
}



