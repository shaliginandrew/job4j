package ru.job4j.condition;

public class DummyBot {

    @SuppressWarnings("checkstyle:RightCurly")
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос";
              if ("Привет, Бот".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
             rsl = "Привет, умник";
        } else if ("Пока".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "До скорой встречи";
        }
        return rsl;
    }
        public static void main(String[] args) {
             String question = "Пока";
             System.out.println(DummyBot.answer(question));

        }
    }