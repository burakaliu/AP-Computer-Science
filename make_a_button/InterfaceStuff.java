/**
 * An interface is a way of using something. For example,
 * the interfaces to a car is the steering wheel, dash
 * buttons, and pedals.
 * In Java, an interface is a promise to implement certain
 * methods. Doing so may allow that object to use some
 * features of Java.
 * This program will use the example of the KeyListener,
 * which is an interface in Java that lets the keyboard
 * trigger events.
 * Another nice thing about interfaces is that a single
 * class can implement more than one (unlike extends)
 */
import java.awt.event.*;
import javax.swing.*;
public class InterfaceStuff implements KeyListener
{
    static int number = 0;
    public void keyReleased(KeyEvent e){

    }

    public void keyPressed(KeyEvent e){

    }

    public void keyTyped(KeyEvent e){
        if (number == 0){
            System.out.println("hacker");
            number++;
        } else if (number == 1){
            number = 0;
            System.out.println("typer");
        }
    }

    public static void main(String [] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    InterfaceStuff listener = new InterfaceStuff();
                    frame.addKeyListener(listener);
                    frame.pack();
                    frame.setVisible(true);
                }
            });
    }
}




