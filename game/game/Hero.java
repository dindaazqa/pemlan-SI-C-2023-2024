package game;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;
    private double healthPoint;

    public Hero() {}

    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }


    public void attack(Hero opponent) {
        double damage = Math.max(this.attack - opponent.getDefense(), 0);
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(this.name + " menyerang " + opponent.getName() +
                " dengan kekuatan " + this.attack + ". " + opponent.getName() +
                " memiliki sisa HP " + opponent.getHp());
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHealthPoint() {
       return healthPoint;
    }

    public double setHealthPoint(double d) {
        return healthPoint - attack;
    }
}

