package org.example.heroes;

public class Hero {
    protected String name;

    protected static final int damage = 0;
    public Hero(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Enemy has been attacked!");
    }
}
