import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }


    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + colorEnum +
                "\nShelter address: " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }
}
