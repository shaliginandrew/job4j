package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post
        int count = 0;
        for (int i = (post.length - 1); i >= 0; i--) {

                if (post[i] == (word[(word.length - post.length) + i])) {
                    count++;
                }
            }

            if (count == post.length) {
                result = true;
            }
            return result;

        }

    public static void main(String[] args) {

        char[] word = new char[]{'H', 'e','l', 'l', 'o'};
        char[] post = new char[]{ 'l','l','o'};
        boolean result = endsWith(word, post);
        System.out.println(result);
    }
}
