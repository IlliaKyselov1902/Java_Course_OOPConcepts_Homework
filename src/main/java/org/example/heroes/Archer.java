package org.example.heroes;

public class Archer extends Hero{
    private static final int damage = 4;
    public Archer(String name) {
        super(name);
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Archer " + name + " attacks!");
    }
}
