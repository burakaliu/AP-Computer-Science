
/**
 * A small example of using the Button
 * interface in a program
 * Note the polymorphism!
 */
public class InterfaceTry
{
    public static void main(String [] args){
        Button x = new StopLight();  // POLYMORPHISM
        
        x.push();
        System.out.println(x.buttonState());
    }
}