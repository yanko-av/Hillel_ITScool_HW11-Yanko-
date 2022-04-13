package company;

import java.util.Arrays;

public class Warehouse {
    int boxQuantity;
    Box[] boxes;

    public Warehouse(int boxQuantity) {
        if (boxQuantity > 0) {
            this.boxQuantity = boxQuantity;
            this.boxes = new Box[boxQuantity];
        } else {
            throw new IllegalArgumentException("Incorrect size of Warehouse");
        }
    }

    public void addBoxes(Box box) {
        if (boxes[boxes.length - 1] != null) {
            System.out.println("Warehouse is full");
        }

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == null) {
                boxes[i] = box;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Box quantity in the warehouse is - " + boxQuantity + Arrays.toString(boxes);
    }
}
