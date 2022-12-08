package org.example.heroes;

public class Mage extends Hero{
    private static final int damage = 8;
    public Mage(String name) {
        super(name);
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Mage " + name + " attacks!");
    }
}
