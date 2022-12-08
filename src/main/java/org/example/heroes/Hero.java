package org.example.heroes;

public abstract class Hero {
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

    public abstract void attackEnemy(Enemy enemy);
}
