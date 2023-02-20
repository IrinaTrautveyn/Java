import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        // 1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи 1-ю строку: ");
        StringBuilder string1 = new StringBuilder(scanner.nextLine());

        System.out.println("Введи 2-ю строку: ");
        StringBuilder string2 = new StringBuilder(scanner.nextLine());

        if (string1.toString().contains(string2.toString())) {
            System.out.println("Вхождение в строке есть");
        } else System.out.println("Вхождения в строке нет");


        // 2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
        // (вхождение в обратном порядке).
        StringBuilder string2Reverse = string2.reverse();
        if (string1.toString().contains(string2Reverse.toString())) {
            System.out.println("Данные строки являются вращением друг друга");
        } else System.out.println("Данные строки не являются вращением друг друга");

        // 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.println("Введи строку для разворота: ");
        String inputString = new String(scanner.nextLine());
        System.out.println(reverseString(inputString));


        // 4.Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //   3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        System.out.println("Задание 4");
        System.out.println("Введи первое число: ");
        StringBuilder num1 = new StringBuilder(scanner.nextLine());

        System.out.println("Введи второе число: ");
        StringBuilder num2 = new StringBuilder(scanner.nextLine());

        int n1 = Integer.parseInt(num1.toString());
        int n2 = Integer.parseInt(num2.toString());

        System.out.println(sumOperation(num1, num2, n1, n2));
        System.out.println(diffOperation(num1, num2, n1, n2));
        System.out.println(multiOperation(num1, num2, n1, n2));

        // 5. Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println(sumOperation(num1, num2, n1, n2)
                .deleteCharAt(sumOperation(num1, num2, n1, n2).indexOf("="))
                .insert(sumOperation(num1, num2, n1, n2).indexOf("="), "равно"));
        System.out.println(diffOperation(num1, num2, n1, n2)
                .deleteCharAt(diffOperation(num1, num2, n1, n2).indexOf("="))
                .insert(diffOperation(num1, num2, n1, n2).indexOf("="), "равно"));
        System.out.println(multiOperation(num1, num2, n1, n2)
                .deleteCharAt(multiOperation(num1, num2, n1, n2).indexOf("="))
                .insert(multiOperation(num1, num2, n1, n2).indexOf("="), "равно"));

        // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(sumOperation(num1, num2, n1, n2)
                .replace(sumOperation(num1, num2, n1, n2).indexOf("="),
                        sumOperation(num1, num2, n1, n2).indexOf("=") + 1, "равно"));
        System.out.println(diffOperation(num1, num2, n1, n2)
                .replace(diffOperation(num1, num2, n1, n2).indexOf("="),
                        diffOperation(num1, num2, n1, n2).indexOf("=") + 1, "равно"));
        System.out.println(multiOperation(num1, num2, n1, n2)
                .replace(multiOperation(num1, num2, n1, n2).indexOf("="),
                        multiOperation(num1, num2, n1, n2).indexOf("=") + 1, "равно"));

    }

    public static String reverseString(String inputString) {
        String rightPart;
        String leftPart;
        int lengthString = inputString.length();

        if (lengthString <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, lengthString / 2);
        rightPart = inputString.substring(lengthString / 2, lengthString);

        return reverseString(rightPart) + reverseString(leftPart);
    }

    public static StringBuilder sumOperation(StringBuilder num1, StringBuilder num2, int n1, int n2) {

        int sumInt = n1 + n2;
        StringBuilder sum = new StringBuilder(num1.toString())
                .append(" + ")
                .append(num2)
                .append(" = ")
                .append(sumInt);
        return sum;
    }

    public static StringBuilder diffOperation(StringBuilder num1, StringBuilder num2, int n1, int n2) {

        int diffInt = n1 - n2;
        StringBuilder diff = new StringBuilder(num1.toString())
                .append(" - ")
                .append(num2)
                .append(" = ")
                .append(diffInt);
        return diff;
    }

    public static StringBuilder multiOperation(StringBuilder num1, StringBuilder num2, int n1, int n2) {

        int multiInt = n1 * n2;
        StringBuilder multi = new StringBuilder(num1.toString())
                .append(" * ")
                .append(num2)
                .append(" = ")
                .append(multiInt);
        return multi;
    }

}