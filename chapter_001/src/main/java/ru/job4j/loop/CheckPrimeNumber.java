package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int a=0;//счетчик делений без остатка
        boolean prime=false;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                a++;
 //выходим из цикла,как только встретили два деления без остатка и последнее
// деление не есть загаданное число,таким образом не перебираем цикл до конца
// либо , если загаданное число 1
                if (((a == 2) && (i != number))|(number==1)) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }
     return prime;
    }
    public static void main(String[] args) {
       boolean result=CheckPrimeNumber.check(11);
        System.out.println(result);
    }
}
