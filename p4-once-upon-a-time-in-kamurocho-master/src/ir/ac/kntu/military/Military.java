package ir.ac.kntu;

public abstract class Military extends Enemy{
    public int fieldOfView;

    public Military(String name, int health, int attack, int attackRange, int fieldOfView) {
        super(name, health, attack, attackRange);
        this.fieldOfView = fieldOfView;
    }

    public int getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(int fieldOfView) {
        this.fieldOfView = fieldOfView;
    }
}
