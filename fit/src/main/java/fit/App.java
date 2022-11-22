package fit;

import fit.basics.FollowControl;
import fit.basics.Operators;
import fit.basics.Types;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Types.doTry();
        Operators.doTry();
        FollowControl.doTry(2);
    }
}
