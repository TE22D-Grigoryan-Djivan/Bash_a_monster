public class Main {
    public static void main(String[] args) {
        System.out.println("A monster has appeared!");

        Enemy enemy1 = new Enemy();

        Player player1 = new Player();

        enemy1.health = 100;

        player1.health = 20;

        enemy1.name = "Bababooey";

        player1.name = "Player";

        enemy1.damaged = 20;

        player1.damaged = 3;

        System.out.println("The monster " + enemy1.name + " has " + enemy1.health + " HP and the " + player1.name + " has " + player1.health + " HP.");

        while (enemy1.health > 0 && player1.health > 0) {
            enemy1.dealDamage();
            player1.dealDamage();
        }

        System.out.println("You won! " + enemy1.name + "was defeated and you have " + player1.health + "HP left.");


    }
}