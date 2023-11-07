import java.awt.*;

public class Main {
    public static void main(String[] args) {

        String[] commands = {"Sidet", "Lejat", "Bejat"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Dog dog = new Dog("Ofelia", "Korgi", commands,
                ColorEnum.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гов гов");


        Shelter shelter1  = new Shelter("Keez", "Frunze 23");
        Dog dog1 = new Dog("Gina", "Taksa", ColorEnum.WHITE, shelter1);
        System.out.println(dog1.getInfo());
        dog.makeVoice();
        dog.makeVoice("Уф Уф");

        String [] commands1 = {"Lapu", "Sidet", "Bejat"};
        Shelter shelter2 = new Shelter("Oblachko", "Sovetskaya 14");
        Dog dog2 = new Dog("Robert Pattinson", "Doberman",commands1,ColorEnum.BLUE, shelter2);
        System.out.println(dog2.getInfo());
        dog.makeVoice();
        dog.makeVoice("Яп Яп");
    }
}
