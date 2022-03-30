package company;

public class Box {
    int a;
    int b;
    int c;

    Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int volume() {
        int volume = a * b * c;
        return volume;
    }
}

