package company;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(-2, 4, 6);
        Box box3 = new Box(3, 6, 9);
        Box box4 = new Box(4, 8, 12);
        Box box5 = new Box(5, 10, 15);

        System.out.println("Volume of box 1 is -  " + box1.volume());
        System.out.println("Volume of box 2 is -  " + box2.volume());
        System.out.println("Volume of box 3 is -  " + box3.volume());
        System.out.println("Volume of box 4 is -  " + box4.volume());
        System.out.println("Volume of box 5 is -  " + box5.volume());
        System.out.println();

        box1.setB(-2);
        box2.setA(2);
        System.out.println("Volume of box 1 is -  " + box1.volume());
        System.out.println("Volume of box 2 is -  " + box2.volume());

        ColorBox cBox1 = new ColorBox(1,2,3,Material.METAL,Color.BLACK);
        System.out.println();
        System.out.println( "The volume of " + cBox1.getMaterial() + " " + cBox1.getColor() + " box is " + cBox1.volume());

    }
}
