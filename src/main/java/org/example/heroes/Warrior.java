package org.example.heroes;

public class Warrior extends Hero{
    private static final int damage = 5;
    public Warrior(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Warrior " + name + " attacks!");;
    }
}
