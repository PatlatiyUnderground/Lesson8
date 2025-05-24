public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

//        int[] array  {1,2,3,4,5,6,7,8,9,10};
            // or
//        int[] array = new int[10];
//        array[0] = 0;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 3;
//        array[4] = 4;
//        array[5] = 5;
//        array[6] = 6;
//        array[7] = 7;
//        array[8] = 8;
//        array[9] = 9;
            //or
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }



        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

//        for (int i = 9; i >= 0; i--) {
//            System.out.println(array[i]);
//        }



        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo

//        int[] array = new int[10];
//        int key;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (i + 1) * 10;
//        }
//
//        for (int i = 0; i < array.length / 2; i++) {
//            key = array[i];
//            array[i] = array[array.length -1 - i];
//            array[array.length -1 - i] = key;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // or

        int[] array = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
            array2[array2.length - 1 -i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
