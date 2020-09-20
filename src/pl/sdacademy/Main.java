package pl.sdacademy;

import static pl.sdacademy.ConsoleUtils.*;

public class Main {

    public static void main(String[] args) {

        ConsoleUtils.debugMode = true;
        HeroBuilder hb = HeroBuilder.getInstance();
        Hero hero = hb.buildHero();
        hero.printInfo();
//       Hero hero = new Hero("Macius", Sex.MALE, 100, 10, 10, 10, 10, 10);
//       hero.printInfo();
//       hero.applyDamage((byte) 10);
//       hero.applyDamage((byte) 10);
//       hero.applyDamage((byte) 10);
//       hero.applyDamage((byte) 10);
//       hero.applyDamage((byte) 10);
//       printDebug("postac zaraz zginie");
//       hero.applyDamage((byte) 10);
        System.exit(1);


      /*  System.out.println("Just a " + C_PURPLE_UNDERLINED + "RED" + C_RESET + " test...");

        System.out.println(String.format("%20sD %5s C", 93, "X"));
        System.out.printf("My name is %s%n", "joe");

        hero.printInfo();

        String names[] = {"A", "B", "C"};

        Enemy enemy = new Enemy(names[0]);
        enemy.name = "wrog";

        System.out.println(hero.getThing().getName());
        Enemy e = hero.getThing();
        e.setName("FAKEY NEMEMEY!");
        System.out.println(hero.getThing().getName());
        //enemy.applyDamage((byte)5);
        //enemy.getInfo();
        enemy.getRandomTaunt();

        String attackType = "";
        do {
            if (enemy.isDead()) {
                // spawning new enemy
                enemy = new Enemy(names[0]);
                enemy.getRandomTaunt();
            }
            attackType = ConsoleUtils.promptForString("ATTACK WITH [S]word [A]xe [F]ire [I]ce - [E]xit TO END >");
            hero.attack(attackType.charAt(0), enemy);

            System.out.println("Enemy health: " + enemy.getHealth());
            System.out.println("Already killed " + c_purple("" + Enemy.enemiesCount) + " enemies");
        } while (!attackType.isEmpty());*/
    }
}
