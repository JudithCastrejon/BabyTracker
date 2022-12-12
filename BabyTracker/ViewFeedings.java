import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewFeedings {


    public ViewFeedings( ) {

    }
    public void reading() throws FileNotFoundException{
        File txtfile = new File("View_Feeding.txt");

        Scanner scan = new Scanner(txtfile);
        JFrame feedFrame = new JFrame("View Feedings");
        JLabel lab = new JLabel();
        JPanel pan = new JPanel();


        //reading each line of the file using scanner 
        //int linenum = 1;
        while (scan.hasNextLine()){

           // JFrame feedFrame = new JFrame("View Feedings");

            String line = scan.nextLine();
            lab = new JLabel("Feed at " + line);
            

        //adding label to frame
        pan.add(lab);

        //adding pabel to frame
        feedFrame.add(pan);

            
            
        }
        //creating panel 
        //JPanel pan = new JPanel();

        //adding label to frame
       // pan.add(lab);

        //adding pabel to frame
       // feedFrame.add(pan);

        //setting size of frame 
        feedFrame.setSize(300, 300);
        feedFrame.setVisible(true);

    

  
    }

    
    


    /*
     * //reading each line of the file using scanner 
        int linenum = 1;
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            JLabel lab = new JLabel("Feed at " + line);
            //System.out.println("Feed at " + line);


            //creating panel 
            JPanel pan = new JPanel();

            //adding label to frame
            pan.add(lab);

            //adding pabel to frame
            feedFrame.add(pan);

            //setting size of frame 
            feedFrame.setSize(300, 300);
            feedFrame.setVisible(true);

            
        }
     */


}
