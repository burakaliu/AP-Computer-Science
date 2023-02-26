/**
 * A simple 3 state button that has 3 colors
 * Note that while the interface as no variables, this class that
 * implements the interface does.
 */
public class StopLight implements Button
{
    String color = "green";
    
    public void push( String string){
        if (color.equals("green")){
            color = "yellow";
        } else if (color.equals("yellow")){
            color = "red";
        } else if (color.equals("red")){
            color = "green";
        }
    }
    
    public String buttonState(){
        return color;
    }
}