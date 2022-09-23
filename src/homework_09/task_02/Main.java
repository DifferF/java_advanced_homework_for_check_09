package homework_09.task_02;

/*
Задание 2+
Создать список и заполнить рандомными числами 10 ячеек,
нужно вывести сумму квадратов всех элемента списка.
Мы используем метод map() для возведения в квадрат каждого элемента,
а потом применяем метод reduce() для свертки всех элементов в одно число.
 */

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int i = list.stream()
                .mapToInt(e -> (int) Math.pow(e, 2))
                .sum();
        System.out.println( i );
    }
}

