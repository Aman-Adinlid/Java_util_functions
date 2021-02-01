package se.lexicon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {
        Consumer<String> PrintMessage = s -> System.out.println(s);
        PrintMessage.accept("Hi Java");
        Consumer<Person> PrintFullName = person -> System.out.println(person.getFirstName()+person.getLastName()+person.getBirthDate()
                +person.getId()+person.isActive());
        Consumer<Person> personInformation = person -> System.out.println(person.toString());

        Person person = new Person("Test","Test", LocalDate.of(199,12,
                1),false);
        PrintFullName.accept(person);
        personInformation.accept(person);


        Consumer<List<Person>> activePerson = List ->{
            for (int i = 0; i< List.size(); i++){
                Person person1 = List.get(i);
                person1.setActive(true);
                List.add(i,person1);
            }
        };
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Test1","Test2",
                LocalDate.of(2012,7,1),true));
        personList.add(new Person("Test2","Test2",LocalDate.of(2012,
                6,6),false));

        personList.forEach(p-> p.setActive(true));
        personList.forEach(personInformation);
    }
}
