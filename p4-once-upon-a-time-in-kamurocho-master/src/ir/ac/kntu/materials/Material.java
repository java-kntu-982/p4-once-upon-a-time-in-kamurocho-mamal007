package ir.ac.kntu.materials;

public abstract class Material {
    private String name;
    private int durability;

    public Material(String name, int durability) {
        this.name = name;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
