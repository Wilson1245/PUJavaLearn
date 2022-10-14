public class Animal {

    public static void main(String[] args) {
        Lion lion = new Lion("Steak", true, "USA");
        lion.hunger();
        lion.eat();
        lion.roam();
        lion.sleep();
    }

    Animal(String food, boolean hunger, String location) {
        this.hunger = hunger;
        this.location = location;
        this.food = food;
    }
    String food;
    boolean hunger;
    String location;
    void hunger() {
        System.out.println("isHunger : " + hunger);
    }
    void eat() {
        System.out.println("eat : " + food);
    }
    void sleep() {
        System.out.println("sleep: " + location);
    }
    void roam() {
        System.out.println("roam");
    }
}

class Lion extends Animal{
    Lion(String food, boolean hunger, String location) {
        super(food, hunger, location);
    }

    // 覆寫
//    @Override
//    void hunger() {
//        System.out.println("Lion Hunger");
//    }

    @Override
    void eat() {
        super.eat();
    }

//    @Override
//    void sleep() {
//        System.out.println("sleep");
//    }

    @Override
    void roam() {
        super.roam();
    }
}
