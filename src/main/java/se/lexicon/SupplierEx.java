package se.lexicon;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Supplier<LocalDate> sysDate = () -> LocalDate.now();
        System.out.println(sysDate.get());

    }
}
