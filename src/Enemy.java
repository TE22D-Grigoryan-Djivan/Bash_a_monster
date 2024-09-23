public class Enemy {
    //Attributes
    String name;
    int health;
    int damaged;

    public void dealDamage() {
        health = health-damaged;

        System.out.println("The Player attacks the monster and deals " + damaged + " damage. " + name + " has " + health + "HP left.");

    }
}
