package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index=0;index<data.length;index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
       int[] data=new int[] {1,5,14,23,78,155,45} ;
       int resultat=indexOf(data,23);
        System.out.println(resultat);
    }
}
