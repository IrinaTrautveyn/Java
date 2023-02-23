/*
1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
3. Вставить элемент в список в первой позиции.
4. Извлечь элемент (по указанному индексу) из заданного списка.
5. Обновить определенный элемент списка по заданному индексу.
6. Удалить третий элемент из списка.
7. Поиска элемента в списке по строке.
8. Создать новый список и добавить в него несколько елементов первого списка.
9. Удалить из первого списка все элементы отсутствующие во втором списке.
10. *Сортировка списка.
11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
*/

import java.util.*;
import java.util.stream.Collectors;

public class HW3 {
    public static void main(String[] args) {

        // задание 1

        List<String> colors = new ArrayList<String>();

        colors.add("White");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Purple");

        System.out.println("#1: " + colors);

        // задание 2

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println("#2: " + colors);

        // задание 3

        colors.add(0, "Black");
        System.out.println("#3: " + colors);

        // задание 4

        System.out.println("#4: " + colors.get(3));

        // задание 5

        colors.set(3, "Pink");
        System.out.println("#5: " + colors);

        // задание 6

        colors.remove(3);
        System.out.println("#6: " + colors);

        // задание 7

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название цвета по английски: ");
        String findColor = new String(scanner.nextLine());

        List<String> resElem = colors.stream()
                .filter(color -> color.contains(findColor))
                .collect(Collectors.toList());
        if (resElem.size() > 0) {
            System.out.println("#7: " + "Element: " + resElem);
        } else System.out.println("#7: " + "Такого элемента нет");

        // задание 8
        List<String> newList = new ArrayList<>();
        newList.add("Black");
        newList.add("Purple!");
        newList.add("Grey");
        System.out.println("#8: " + newList);

        // задание 9
        colors.removeAll(newList);
        System.out.println("#9: " + colors);

        // задание 10

        Collections.sort(colors);
        System.out.println("#10: " + colors);

        // задание 11
        int qtyRepeat = 10000;
        timer(qtyRepeat);

    }

    public static void timer(int qtyRepeat) {

        List<String> flowers1 = new ArrayList<>();
        flowers1.add("Aster");
        flowers1.add("Gerber");
        flowers1.add("Peony");

        long startTimer = System.currentTimeMillis();
        for (int i = 0; i <= qtyRepeat; i++) {
            flowers1.add(0, "Rose");
        }
        long stopTimer = System.currentTimeMillis();
        long time1 = stopTimer - startTimer;
        System.out.println("Время работы ArrayList: " + time1);


        List<String> flowers2 = new LinkedList<>();
        flowers2.add("Aster");
        flowers2.add("Gerber");
        flowers2.add("Peony");

        long startTimer2 = System.currentTimeMillis();
        for (int i = 0; i <= qtyRepeat; i++) {
            flowers1.add(0, "Rose");
        }
        long stopTimer2 = System.currentTimeMillis();
        long time2 = stopTimer2 - startTimer2;
        System.out.println("Время работы LinkedList: " + time2);

    }

}