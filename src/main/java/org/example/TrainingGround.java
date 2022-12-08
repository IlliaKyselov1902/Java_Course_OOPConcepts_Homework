package org.example;

import org.example.heroes.*;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy myEnemy = new Enemy(50);

        Warrior myWarrior = new Warrior("Fitzgerald");
        myWarrior.attackEnemy(myEnemy);

        Mage myMage = new Mage("Camelot");
        myMage.attackEnemy(myEnemy);

        Archer myArcher = new Archer("Fivio");
        myArcher.attackEnemy(myEnemy);
    }
}
