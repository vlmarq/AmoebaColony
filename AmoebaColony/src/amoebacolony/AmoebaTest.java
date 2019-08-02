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


public class AmoebaTest {

    public static void main(String[] args) {
    
        AmoebaColony yourColony = new AmoebaColony();
        
        yourColony.startDialog();
        yourColony.setSuccessBreed();
        yourColony.getSuccessBreed();
        yourColony.setReproduceAmoeba();
        yourColony.getReproduceAmoeba();
        yourColony.vitaminSickness();
        yourColony.deathBySickness();
        yourColony.amoebaDead();
        yourColony.endDialog();

}
        
       
    }

