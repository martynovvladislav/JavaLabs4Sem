package lab2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static List<Human> humanList = new ArrayList<>(List.of(
            new Human(33,
                    "Alexey",
                    "Alexeev",
                    LocalDate.of(1990, 11, 11),
                    90
            ),
            new Human(
                    23,
                    "Ivan",
                    "Ivanov",
                    LocalDate.of(2000, 12, 12),
                    76
            ),
            new Human(
                    13,
                    "Kirill",
                    "Kirillov",
                    LocalDate.of(2010, 10, 10),
                    67
            ),
            new Human(
                    20,
                    "Alexander",
                    "Alexandrov",
                    LocalDate.of(2003, 10, 13),
                    75
            ),
            new Human(
                    21,
                    "Maxim",
                    "Maximov",
                    LocalDate.of(2002, 9, 11),
                    90
            ),
            new Human(
                    31,
                    "Alexander",
                    "Alexandrov",
                    LocalDate.of(1992, 10, 13),
                    66
            )
    ));

    public static void main(String[] args) {
        System.out.println("Сортировка по сумме веса и возраста:");
        humanList.stream()
                .sorted(Comparator.comparing(human -> human.weight() + human.age()))
                .toList()
                .forEach(System.out::println);
        System.out.println("\nФильтрация по весу кратно 5:");
        humanList.stream()
                .filter(human -> human.weight() % 5 == 0)
                .toList()
                .forEach(System.out::println);
        System.out.println("\nВыбор первых четырех элементов:");
        humanList.stream()
                .limit(4)
                .toList()
                .forEach(System.out::println);
        System.out.println("\nКонкатенация имен через пробел:");
        System.out.println(
                humanList.stream()
                .map(Human::firstName)
                .collect(Collectors.joining(" "))
        );
    }
}
