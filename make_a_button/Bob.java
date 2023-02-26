import java.util.Random;

public class Bob implements Button{

    String[] phrases = {"hey there", "did i do something wrong?", "can you stop pushing me?", "Stop pushing me!", "I said STOP!", "OK thats it. You want a piece of me? Come and get it punk!"};
    
    /*
     * @state is Bob's mental state
     * 1 = happy
     * 2 = confused
     * 3 = annoyed
     * 4 = frustrated
     * 5 = angry
     * 6 = ready to fight
     */
    int state = 1;

    public void push(String whatToDo){
        if (whatToDo.equals("give chocolate")){
            giveChocolate();
        } else {
            aggravate();
        }
    }
    
    private void speech(){
        System.out.println(phrases[state - 1]);
    }

    private void aggravate(){
        if (state > 6){
            System.out.println("*Bob punches you. You get instantly knocked out and taken to the hospital. You come back the next day to continue harrassing Bob because you are just that nice*");
            state = 1;
            return;
        }
        speech();
        state ++;
    }

    private void giveChocolate(){
        state = 1;
        System.out.println("oh why thank you!");
    }
    
    public String buttonState(){
        return Integer.toString(state);
    }
}
