package by.gsu.epamlab.task2;

public class Subject {
    private String name;
    private Material material;
    private double volume;

    public Subject() {
    }

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return this.material.getDENSITY() * volume;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%f;%f", name, this.material.getName(), this.material.getDENSITY(), getMass());
    }
}
