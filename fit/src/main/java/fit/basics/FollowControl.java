package fit.basics;

import java.util.List;

public class FollowControl {
    public static void doTry(int numero ){
        boolean isEven = ((numero % 2) == 0);

        if(isEven){
            String texto = "";
            System.out.println();
            switch(numero){
                case(2):
                System.out.println("dois..");
                texto = "dois";
                break;
                case(3):
                System.out.println("3...9");
                texto = "3...9";
                break;
                case(9):
                System.out.println("9...");
                texto = "9";
                break;
            default:
                System.out.println("padrao...");
            }

            for(int i = 0; i < texto.length(); i ++){
                System.out.println(texto.charAt(i));

            }

        }
    }

}
