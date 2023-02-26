

/**
 * Button interface
 * An example of creating our own interface.
 * This is an interface that is meant to describe the
 * function of a simple button.
 * An interface is an ABSTRACT class - this means
 * its methods don't have to have code, and you can
 * never actually create an object of this class.
 * "Button x = new Button();" wouldn't compile
 */
public interface Button
{
    /**
     * The push method is what should happen if the button is pushed.
     * The intention is that the internal state of the button should change
     */
    public void push(String string);
    
    /**
     * The buttonState method should simple return a String that somehow
     * describes the current state of the button.
     */
    public String buttonState();
}
