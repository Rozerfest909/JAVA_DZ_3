import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

//Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

//Мешканцов Александр Сергеевич

public class Main {
    public static void main(String[] args){
        max(createList(10, 20, 40));
        min(createList(10, 20, 40));
        delete_even(createList(10, 20, 40));
        avr(createList(2, 20, 40));
    }
    static void min(List<Integer> list){
        System.out.println("В массиве > " + list);
        System.out.println("Минимальное число > " + Collections.min(list));
    }
    static void max(List<Integer> list){
        System.out.println("В массиве > " + list);
        System.out.println("Максимальное число > " + Collections.max(list));

    }
    static void delete_even(List<Integer> list){
        System.out.println("В массиве > " + list);
        for (int i = list.size()-1 ; i >= 0; i--) {
            if (list.get(i) % 2 == 0) list.remove(i);
        }

        System.out.println("Удалили все четные числа > " + list);
    }
    static void avr(List<Integer> list){
        System.out.println("В массиве > " + list);
        OptionalDouble average = list.stream().mapToInt(e -> e).average();
        if (average.isPresent())
        {
            System.out.print("Среднее арифметическое > " + average.getAsDouble());
        }
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    }


