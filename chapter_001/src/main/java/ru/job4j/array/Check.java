package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        int count=0;
        for (int i=1;i<data.length;i++) {
            if (data[i]==data[0]) {
                count++;
            }
        }
        if (count==((data.length-1))) {
            result=true;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = mono(data);
           System.out.println(result);

    }
}
