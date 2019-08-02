//********************************************************************************
// PantherID: 4041939
// CLASS: COP 2210 – Fall 2015
// ASSIGNMENT # 2
// DATE: 10/7/2015
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package amoebacolony;

import java.util.Random;
import javax.swing.JOptionPane;

public class AmoebaColony {
        
        //Instance variables
        private String colonyName;
        private String caretakerName;
        
        private int colonySize; 
        private int newColonySize;
        private int daysFed;
        private int timesBreed;
        private int successBreed;
        private int numDead;
        
        private boolean vitamins;
        private boolean illness;
        
   
        public void startDialog(){  
        caretakerName = JOptionPane.showInputDialog("Welcome to your Amoeba Colony builder! \n\nWhat is your name?\n"); 
        
        //Prompts user for colony name
        colonyName = JOptionPane.showInputDialog("Hello there, " + caretakerName + "! What's your colony's name?\n");

        //Prompts user for size of colony
        colonySize = Integer.parseInt(JOptionPane.showInputDialog(colonyName + "? Cool name! \nHow many amoeba would you like to start your " + colonyName + " colony off with?\n"));
          
        JOptionPane.showMessageDialog(null, "Amoeba colony building in process.\n");
        
        //Explains what can be done with colony
        JOptionPane.showMessageDialog(null, "Welcome to your " + colonyName + " colony, " + caretakerName + "! \nIn your " + colonyName + 
                   " colony you can do some really cool things like breeding your amoeba to grow your colony, "
                   + "\nfeeding them, and choosing whether to give them vitamins or not. \n\nBe careful though! They can get sick and vitamins can help to lessen this chance. \n\nNow, enjoy your colony!\n");

        //Asks user how many days to feed
        daysFed = Integer.parseInt(JOptionPane.showInputDialog("So, " + caretakerName + ", one thing to know is that if you want to breed the amoeba \nof your " 
                    + colonyName + " you have to feed them. Each day fed is another day they can breed. \n\nHow many days would you like to feed them?\n"));

        //Asks user how many times to breed
        timesBreed = Integer.parseInt(JOptionPane.showInputDialog("Now, since we have some food for your amoeba now comes the fun part!"
                    + "\nEach time you successful breed your amoeba, the population doubles. "
                    + "\n\nThat being said, how many times would you like to breed them?\n"));

        
         }
        
        public void setSuccessBreed() {
        if(timesBreed <= daysFed){
            successBreed = timesBreed;
             } else {
            successBreed = daysFed;    
             } 
    }
        
        public int getSuccessBreed() {
        return successBreed;
    }
        
        public void setReproduceAmoeba() {
      
        if(timesBreed <= daysFed){
            newColonySize = (int) (timesBreed * Math.pow(2, colonySize));
             } else {
            newColonySize = (int)(daysFed * Math.pow(2, colonySize));    
             }
        
        JOptionPane.showMessageDialog(null, "The total population of your " + colonyName + " colony is now " + getReproduceAmoeba() + " amoebas.");

    }  
        
        public int getReproduceAmoeba() {
            return newColonySize;
        }         
                 
        public void vitaminSickness() {
        Random i = new Random ();
        int ill = i.nextInt(21);
        
        if (vitamins == true) {
            if (ill <= 20) {
                illness = true;
            }
            else
                {
                    
                } 
        }else
            {
            if (vitamins == false) {
                if (ill <= 25){
                    illness = true;
                }
                else
                {
                }
            }
            }
        JOptionPane.showConfirmDialog(null,
             "Would you like to give your amoeba vitamins?", "\nChoose yes or no.", JOptionPane.YES_NO_OPTION);

    }      
        
        public void deathBySickness() {
        if (illness == true) {
            numDead = (int)(newColonySize * 0.1);
            newColonySize -= numDead;
            } else {
        }
         
    }
        
        public int amoebaDead() {
            return numDead;
        }
        
        public void endDialog(){
        JOptionPane.showMessageDialog(null,"Colony Name: " + colonyName + "\nCaretaker Name: " + caretakerName + "\nStarting Size: " + colonySize 
                + "\nTimes Fed: " + daysFed + "\nRequested amount to breed: " + timesBreed + "\nNumber of Successful Bred: " + successBreed 
                +"\nNumber sick and dead: " + numDead + "\nFinal Number of Amoebas: " + newColonySize);
    }
    

    }
