package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 1; i < 2; i++) {
            if (word[word.length - i] != post[post.length - i]) {
                result = false;
                break;
            }
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}