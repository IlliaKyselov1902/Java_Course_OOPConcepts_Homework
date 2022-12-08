package org.example.heroes;

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        System.out.println("OUCH, I received " + damage + " points of damage!");
        setHealth(Math.max(0, getHealth() - damage));
    }
}
