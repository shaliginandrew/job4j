package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (cell + row) % 2 == 0; // добавить условие, по которому нужно определить ставить ли символ или нет.
               boolean right = (((cell + row) % 2 == 0) & (((size % 2) != 1))); // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                }  else if (right) {
                    System.out.print("0");
                }   else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by ");
        draw(5);
      //  System.out.println("Draw by 5");
       // draw(5);
    }
}
