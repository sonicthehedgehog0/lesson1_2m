import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String [] commamds;

    public Dog(String name, String breed, String[] commamds, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commamds = commamds;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

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

    public String[] getCommamds() {
        return commamds;
    }

    public void setCommamds(String[] commamds) {
        this.commamds = commamds;
    }
    public void makeVoice(){
        System.out.println(" Собака гав гав");
    }
    public void makeVoice(String voice){
        System.out.println(" Собака " + voice);
    }

    @Override
    public final String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commamds);
    }
}
