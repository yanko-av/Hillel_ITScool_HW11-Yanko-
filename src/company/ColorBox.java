package company;

public class ColorBox extends Box {
    private Color color;

    public ColorBox(int a, int b, int c, Material material, Color color) {
        super(a, b, c, material);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                ", material=" + getMaterial() +
                ", color=" + color +
                '}'+"\n";
    }
}
