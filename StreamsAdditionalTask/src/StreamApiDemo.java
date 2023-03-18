/*
 1 Підрахувати кількість різних слів у тексті,
        використовуючи Stream API.
 2 Знайти всі пари елементів у списку, які мають суму,
        рівну заданому значенню.
 3 Знайти найбільший спільний дільник для списку цілих чисел,
        використовуючи Stream API.
 4 Відсортувати список об'єктів за декількома полями, використовуючи Stream API.
 5 Підрахувати кількість елементів у списку, які повторюються більше одного разу.
 6 Знайти всі підпослідовності списку, які містять не менше заданої кількості елементів.
 7 Знайти всі паліндроми в списку рядків, використовуючи Stream API.
 8 Знайти всі неперервні підсписки списку, сума елементів яких є найбільшою.
 9 Знайти всі комбінації елементів списку, які дають задану суму.
 10 Об'єднати два списки у один, відфільтрувавши дублікати, використовуючи Stream API.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        // Task1
        System.out.println("\n*** Task 1 ***");
        String text = "aa aa :\" aa bb 34 bb cc";
        System.out.println(text);
        StreamService service = new StreamService();
        int res = service.countDifferentWords(text);
        System.out.println(res);

        // Task1 v2.
        System.out.println("\n*** Task 1 v2 ***");
        text = "aa aa aa bb   bb cc";
        System.out.println(text);
        res = service.countDifferentWordsSplit(text);
        System.out.println(res);

        // Task2
        System.out.println("\n*** Task 2 naive solution ***");
        LinkedList<Integer> inArray = new LinkedList<>(List.of(1, 2, 3,
                4, 4, 5, 6, 7, 8, 9, 10));
        int sum = 8;
        LinkedList<Integer[]> results;
        System.out.println(inArray);

        results = service.findPairOfElementsSumNaive(inArray, sum);
        for(Integer[] arr: results) {
            System.out.println("elements: " + arr[0] + ", " + arr[1]);
        }

        System.out.println("\n*** Task 2 ***");
        results = service.findPairOfElementsSum(inArray, sum);

        for(Integer[] arr: results) {
            System.out.println("elements: " + arr[0] + ", " + arr[1]);
        }
    }
}
