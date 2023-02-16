import java.util.Random;

public class HW1 {


    public static void main(String[] args) {

        Random rand = new Random();
        int х1[] = new int[Short.MAX_VALUE / 2];
        int х2[] = new int[Math.abs(Short.MIN_VALUE) / 2];
        int array1 = 0;
        int array2 = 0;

        // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = rand.nextInt(2001);
        System.out.println(i);

        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int m = i;
        int res = 0;
        while (m != 1) {
            m >>= 1;
            res++;
        }
        System.out.println("n = " + res);


        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        for (int y = i; y <= Short.MAX_VALUE; y++) {
            if (y % i == 0) {
                х1[array1] = y;
                array2 ++;
            }
        }

        // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        for (int y = i; y <= Short.MIN_VALUE; y++) {
            if (y % i != 0) {
                х2[array2] = y;
                array2 ++;
            }
        }
    }
}