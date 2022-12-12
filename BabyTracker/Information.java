
//[Information class which stores babies name and age]

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information {
    private int Age;
    private String Name;

    // constructor
    public Information(int babyAge, String babyName) {
        this.Age = babyAge;
        this.Name = babyName;
    }

    // milestones taken from
    // https://www.babycenter.com/baby/baby-development/baby-milestones-1-to-6-months_1496585#1-month-old-milestones
    public void babyMilestone(int Age) {

        // creating label and frame
        JFrame mileFrame;
        JLabel mileLabel;

        switch (Age) {
            case 1:

                // creating new frame
                mileFrame = new JFrame("1 Month old");

                // creating label
                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Recognize your smell</li>" +
                        "<li>See things 8 to 12 inches away</li>" +
                        "<li>Tries on different facial expressions</li>" +
                        "<li>Enjoy high contract patterns</li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel = new JPanel();

                // adding lable to panel
                panel.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 2:

                mileFrame = new JFrame("2 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Start to make cooing noises</li>" +
                        "<li>May smile</li>" +
                        "<li>Turns head toward sounds</li>" +

                        "</ul><html>");

                // creating pane
                JPanel panel1 = new JPanel();

                // adding lable to panel
                panel1.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel1);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 3:

                mileFrame = new JFrame("3 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>May laugh</li>" +
                        "<li>Follows objects with eyes</li>" +
                        "<li>May reach for toys</li>" +
                        "<li>May begin rolling from tummy to back</li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel2 = new JPanel();

                // adding lable to panel
                panel2.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel2);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 4:

                mileFrame = new JFrame("4 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Holds head steady without support</li>" +
                        "<li>Pushes body up onto elbows during tummy-time</li>" +
                        "<li>Recognizes objects</li>" +
                        "<li>May begin to babble </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel3 = new JPanel();

                // adding lable to panel
                panel3.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel3);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 5:

                mileFrame = new JFrame("5 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Enjoys playing games such as Peek-A-Boo</li>" +
                        "<li>May be able to sit when propped up with pillows</li>" +
                        "<li>Understand cause and effect(drops toy to make sound)</li>" +
                        "<li>Picks up objects with hands  </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel4 = new JPanel();

                // adding lable to panel
                panel4.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel4);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 6:

                mileFrame = new JFrame("6 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>May try to 'talk' with you</li>" +
                        "<li>Explores objects using mouth</li>" +
                        "<li>May be able to sit without support</li>" +
                        "<li>May bounce on legs when supported  </li>" +
                        "<li>Responds to own name </li>" +
                        "<li>Recognizes familiar people</li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel5 = new JPanel();

                // adding lable to panel
                panel5.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel5);

                // setting size of frame

                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 7:

                mileFrame = new JFrame("7 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Roll both ways</li>" +
                        "<li>Reaches with one hand</li>" +
                        "<li>Notices and tracks distant objects with eyes</li>" +
                        "<li>May start saying ma ma ma or da da da</li>" +
                        "<li>Reacts to emotion in voices  </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel6 = new JPanel();

                // adding lable to panel
                panel6.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel6);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 8:
                mileFrame = new JFrame("8 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Sits without support</li>" +
                        "<li>Babbles</li>" +
                        "<li>May grasp smaller objects</li>" +
                        "<li>May start to crawl</li>" +
                        "<li>May pull themselves up to stand</li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel7 = new JPanel();

                // adding lable to panel
                panel7.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel7);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 9:

                mileFrame = new JFrame("9 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Claps their hands</li>" +
                        "<li>May attempt to wave</li>" +
                        "<li>Make many different sounds</li>" +
                        "<li>Can get into sitting position without help</li>" +
                        "<li>Remember location of toys and other objects </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel8 = new JPanel();

                // adding lable to panel
                panel8.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel8);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 10:

                mileFrame = new JFrame("10 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Copies your pattern of speech  </li>" +
                        "<li>May communicate using hands or gestures  </li>" +
                        "<li>May take a few steps on their own  </li>" +
                        "<li>Experiments with toys by shaking, throwing, or banging   </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel9 = new JPanel();

                // adding lable to panel
                panel9.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel9);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 11:

                mileFrame = new JFrame("11 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>May say their first official word  </li>" +
                        "<li>Looks at objects when named  </li>" +
                        "<li>May startt to holding onto furniture or a walking toy  </li>" +
                        "<li>Understand more words </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel10 = new JPanel();

                // adding lable to panel
                panel10.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel10);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            case 12:

                mileFrame = new JFrame("12 Month old");

                mileLabel = new JLabel("<html><ul>" +
                        "<li> " + Age + " at months old " + Name + " can now : </li>" +
                        "<li>Tries to imitate words  </li>" +
                        "<li>Uses gestures such as shaking head no  </li>" +
                        "<li>Points at objects  </li>" +
                        "<li>May show preferences for certain people or toys  </li>" +
                        "<li>May use sippy cup </li>" +
                        "</ul><html>");

                // creating pane
                JPanel panel11 = new JPanel();

                // adding lable to panel
                panel11.add(mileLabel);

                // adding pabel to frame
                mileFrame.add(panel11);

                // setting size of frame
                mileFrame.setSize(400, 300);
                mileFrame.setLocationRelativeTo(null);
                mileFrame.setVisible(true);

                break;

            default:
                System.out.println("\nThe selection is invalid");
                ;
        }

    }
    // getters and setters

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
