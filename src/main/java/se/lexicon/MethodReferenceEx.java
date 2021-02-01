package se.lexicon;

import java.util.Random;
import java.util.function.IntUnaryOperator;

public class MethodReferenceEx {

    public static int getRandomInt(int max){
        return new Random().nextInt(max -1) + 1;
    }

    public static void main(String[] args) {
        IntUnaryOperator OpM = MethodReferenceEx::getRandomInt;
        IntUnaryOperator OpL= num ->MethodReferenceEx.getRandomInt(num);

        System.out.println( OpL.applyAsInt(300));
        System.out.println(OpM.applyAsInt(400));
    }
}
