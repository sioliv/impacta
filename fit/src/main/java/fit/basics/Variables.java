package fit.basics;

public class Variables {
    public static void doTry(){
        String name = "Emilio";
        int age = 33;
        double height = 1.77;

        //boxing
        //consigo fazer operações, pois é um objeto
        Double heightObj = 1.77;

        //unboxing
        double hightNonObj = heightObj;

        System.out.println(hightNonObj);
        System.out.println(heightObj);

        System.out.printf("%s %d %.2f %.2f", name, age, height, heightObj);

       

    }
}
