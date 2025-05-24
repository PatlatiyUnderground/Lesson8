import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        //Написать программу, которая сгенерирует случайный вес 10 людям в пределах от 40 до 100 кг.
        // (Нужно самостоятельно найти информацию, как генерировать числа в заданном диапазоне).
        //
        //Далее вам нужно будет вычислить несколько показателей:
        //1. Средний вес всех людей.
        //2. Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно.

        int max = 100;
        int min = 40;
        int focus = 0;
        int sum = 0;

       int[] array = new int[10];
       for (int i = 0; i < array.length; i++) {
          int r = (int) (Math.random() * (max - min + 1)) +min;
           array[i] = r;
           sum += array[i];
           if (array[i] >= 60 && array[i] <= 80) {
               focus++;
           }
           System.out.println(array[i]);
       }
        System.out.println("\nКолличество людей от 60 до 80 кг равно " + focus);
       System.out.println("\nСредний вес всех людей равен " + sum + "/" + array.length+ "=" + sum/array.length);

    }
}
