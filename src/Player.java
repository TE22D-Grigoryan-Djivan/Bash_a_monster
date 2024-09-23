public class Player {
    String name;
    int health;
    int damaged;

    public void dealDamage() {
        health = health-damaged;

        System.out.println("The monster attacks you and deals " + damaged + " damage. The " + name + " has " + health + "HP left.");

    }
}
