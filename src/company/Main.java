package company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
//            Box box1 = new Box(1, 2, 3,Material.METAL);
//            Box box2 = new Box(2, 4, 6, Material.PLASTIC);
//            Box box3 = new Box(3, 6, 9, Material.WOOD;
//            Box box4 = new Box(4, 8, 12, Material.STONE);
//            Box cBox1 = new ColorBox(1, 2, 3, Material.METAL, Color.BLACK);
//            Box cBox2 = new ColorBox(2, 4, 6, Material.PLASTIC, Color.WHITE);
//            Box cBox3 = new ColorBox(3, 6, 9, Material.WOOD, Color.RED);
//            Box cBox4 = new ColorBox(4, 8, 12, Material.STONE, Color.BLUE);
//            System.out.println("Volume of box 1 is -  " + box1.volume());
//            System.out.println("The volume of " + cBox1.getMaterial() + " " + cBox1.getColor() + " box is " + cBox1.volume());

            Warehouse wh1 = new Warehouse(8);

            wh1.addBoxes(new Box(1, 2, 3,Material.METAL));
            wh1.addBoxes(new Box(2, 4, 6, Material.PLASTIC));
            wh1.addBoxes(new Box(3, 6, 9, Material.WOOD));
            wh1.addBoxes(new Box(4, 8, 12, Material.STONE));
            wh1.addBoxes(new ColorBox(1, 2, 3, Material.METAL, Color.BLACK));
            wh1.addBoxes(new ColorBox(2, 4, 6, Material.PLASTIC, Color.WHITE));
            wh1.addBoxes(new ColorBox(3, 6, 9, Material.WOOD, Color.RED));
            wh1.addBoxes(new ColorBox(4, 8, 12, Material.STONE, Color.BLUE));

            System.out.println(wh1);


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
