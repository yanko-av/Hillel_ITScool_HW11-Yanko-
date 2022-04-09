package company;

public class Box {
    private int a;
    private int b;
    private int c;
    private Material material;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Box(int a, int b, int c, Material material) {
        this(a, b, c);
        this.material = material;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a <= 0) {
            System.out.println("Incorrect size A");
        } else this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b <= 0) {
            System.out.println("Incorrect size B");
        } else this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        if (c <= 0) {
            System.out.println("Incorrect size C");
        } else this.c = c;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int volume() {
        int volume = a * b * c;
        return volume;
    }
}

