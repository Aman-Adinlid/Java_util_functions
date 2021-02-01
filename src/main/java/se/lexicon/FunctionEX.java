package se.lexicon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEX {
    public static void main(String[] args) {


        String[] strings = {"I", "Love", "Java"};
        Function<String[], String> arrayToString = array -> {
            String target = "";
            for (String s : array) {
                target += s + "";
            }
            return target;
        };
        System.out.println(arrayToString.apply(strings));


        Function<Person, String> extractFullName = person -> person.getFirstName() + " " + person.getLastName();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Test", "Test",
                LocalDate.of(1990, 03, 1), true));
        personList.add(new Person("Test1",
                "Test1", LocalDate.of(2012, 12, 12), true));

        List<String> result = extractFN(personList, extractFullName);
        result.forEach(s -> System.out.println(s));

    }

    public static List<String> extractFN(List<Person> list, Function<Person, String> extract) {
        List<String> names = new ArrayList<>();
        for (Person personFN : list) {
            names.add(extract.apply(personFN));
        }
        return names;
    }
}