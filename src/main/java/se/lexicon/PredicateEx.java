package se.lexicon;

import java.time.LocalDate;
import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        Predicate<Integer> positiveInteger = n -> n>0;
        Predicate<Integer> LessThanTen = n -> n>10;
        Predicate<Integer> greaterThanTent = integer -> integer <20;
         boolean result = positiveInteger.test(237);
        System.out.println("result = " + result);
        System.out.println(LessThanTen.test(600));
        System.out.println(greaterThanTent.test(700));

        Predicate<Person> bornInLeapYear= person -> person.getBirthDate().isLeapYear();
        Person person = new Person("Test","Test",
                LocalDate.of(1999,12,9),true);

        System.out.println(bornInLeapYear.test(person));

      // notice "and" down here it means u can add more things in one line
        boolean testAndResult = greaterThanTent.and(positiveInteger).test(400);
        System.out.println("testAndResult = " + testAndResult);

        //negate means reject

        boolean testNegate = greaterThanTent.and(positiveInteger).negate().test(15);
        System.out.println("testNegate = " + testNegate);
    }
}
