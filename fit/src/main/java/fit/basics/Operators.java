package fit.basics;

public class Operators {
    public static void doTry(){

        int result = 1 + 2 + 3 - 5 / 4 % 2;

        boolean less = 1 < 2;

        boolean lessResult = 1 < result;

        boolean more = 2 > 1;

        boolean isTrue = true && true;

        boolean isTrueTwo = true || false;

        System.out.printf("%s : %s%n", isTrue, isTrueTwo);
    }
    
}
