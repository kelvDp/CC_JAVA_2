package practice6_1;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        // test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        // test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        Cat c = new Cat();
        Cat c2 = new Cat("Belle");

        c.eat();
        // c2.play();
        playWithAnimal(c2);

        Fish f = new Fish();
        f.setName("Bubbles");
        f.eat();

        Pet fish = new Fish();
        fish.setName("Nemo");
        // fish.play();
        playWithAnimal(f);

    }

    public static void playWithAnimal(Animal a) {
        // completed in practice

        if (a instanceof Pet) {
            Pet pet = (Pet) a;
            pet.play();
        } else {
            System.out.println("Danger, Wild Animal.");
        }
    }

}