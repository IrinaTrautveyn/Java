/*
1. Создать множество, ключь и значение строки.
2. Добавить шесть элементов.
3. Вывести в консоль значения.
4. Добавить ко всем значениям символ "!"
5. Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
6. Объеденить значания во втором множестве и первом если ключи совподают.
7. Вывести результат в консоль.*/

import java.util.HashMap;

public class HW5 {
    public static void main(String[] args) {
        //задание 1
        HashMap<String, String> HW = new HashMap<>();

        //задание 2
        HW.put("Первый", "один");
        HW.put("Второй", "два");
        HW.put("Третий", "три");
        HW.put("Четвертый", "четыре");
        HW.put("Пятый", "пять");
        HW.put("Шестой", "шесть");

        //задание 3
        HW.forEach((k, v) -> System.out.println(v));
        System.out.println();

        //задние 4
        for (String key : HW.keySet()) {
            HW.compute(key, (k, v) ->  v + "!");
        }
        HW.forEach((k, v) -> System.out.println(v));
        System.out.println();

        //задание 5
        HashMap<String, String> HW2 = new HashMap<>();
        HW2.put("Первый", "1");
        HW2.put("Второй", "2");
        HW2.put("Третий!!!", "3");
        HW2.put("Четвертый", "4");
        HW2.put("Пятый", "5");
        HW2.put("Шестой!!!", "6");


        //задание 6
        for (String k : HW2.keySet()) {
            HW2.merge(k,HW.getOrDefault(k,""), String::concat);
        }

        //задание 7
        for (String k : HW2.keySet()) {
            System.out.println(k + " " + HW2.get(k));
        }
    }
}