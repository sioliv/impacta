package fit.basics;

public class Variables {
    public static void doTry(){
        String name = "Emilio";
        int age = 33;
        double height = 1.77;

        //boxing
        Double heightObj = 1.77;

        //unboxing
        double hightNonObj = heightObj;

        System.out.println(hightNonObj);
        System.out.println(heightObj);
        
       

    }
}
