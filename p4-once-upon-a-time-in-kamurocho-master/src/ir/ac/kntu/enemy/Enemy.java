package ir.ac.kntu;

public abstract class Enemy {
    private String name;
    private int health, attack, attackRange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public Enemy(String name, int health, int attack, int attackRange) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.attackRange = attackRange;
    }
}
