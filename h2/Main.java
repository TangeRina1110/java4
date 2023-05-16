package Asem4.h2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human(46, "Masha", "Zhurina", LocalDate.of(1976, 8, 16), 60 ));
        list.add(new Human(13, "Sonya", "Istomina", LocalDate.of(2013, 2, 23), 40 ));
        list.add(new Human(49, "Mickhail", "Petrov", LocalDate.of(1973, 6, 3), 80 ));

        System.out.println("Уменьшение веса на 5");
        list.stream().forEach(human->human.setWeight(human.getWeight()-5));
        System.out.println(list);

        System.out.println("Фильтрация по дате рождения");
        System.out.println(list.stream().filter(human -> human.getBirthDate().isBefore(LocalDate.of(1999, 2, 3))).collect(Collectors.toList()));

        System.out.println("Объединение фамилий");
        System.out.println(list.stream().map(Human::getLastName).collect(Collectors.joining(" ")));


    }
}
