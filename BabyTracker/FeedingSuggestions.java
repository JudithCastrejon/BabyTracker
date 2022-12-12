import javax.swing.*;

public class FeedingSuggestions {
    private int suggAge;
    private String suggName;

    // constructor
    // feeding contructor
    public FeedingSuggestions(int babyAge, String babyName) {
        this.suggAge = babyAge;
        this.suggName = babyName;

    }

    public void scheduleSugg() {

        System.out.println(
                "Welcome to the Suggestion page, in this page you will see an example feeding guide and then some fun foods to try with your baby when they are a little older!! ");

        // calling the table method to make the table
        suggTable();

        // calling method for recipies
        babyRecipies(suggAge, suggName);

    }

    // method for table
    public void suggTable() {

        // creating a table frame for schedule
        JFrame frame = new JFrame("Worried about feeding baby too much or two little, use this guide to help track");

        // giving column names
        String[] columnNames = { "Age", "Ounces", "Frequuency" };

        // adding data to table
        Object[][] data = {
                { "Newborn (1-2 Weeks)", "1.5 -3 oz", "Every 2-3 hrs around 6-10x a day" },
                { "2-4 Weeks", "2-4 oz", "6-8x a day" },
                { "2 Months", "5-6 oz", "5-6x a day" },
                { "3-4 Months", "6-7 oz", "5-6x a day" },
                { "5-8 Months", "Max 32oz per 24hrs", "4-5x a day" },
                { "9 Months", "Max 32oz per 24hrs", "3-5x a day" },
                { "10-12 Months", "Max 32oz per 24hrs", "3-4x a day" }
        };

        // populating table
        JTable suggTable = new JTable(data, columnNames);

        // setting parameters for table
        frame.add(suggTable);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    // information taken from
    // https://www.happiestbaby.com/blogs/baby/best-baby-foods-6-to-9-months
    public void babyRecipies(int babyAge, String babyName) {

        JFrame frame1;
        JLabel label1;

        if (suggAge <= 5) {
            frame1 = new JFrame("Younger than 6 months");

            label1 = new JLabel(babyName + " Is to young to eat second foods right now, come back when " + babyName
                    + " older then 6 months.");
            // creating pane
            JPanel panel1 = new JPanel();

            // adding lable to panel
            panel1.add(label1);

            // adding pabel to frame
            frame1.add(panel1);

            // setting size of frame
            frame1.setSize(800, 100);
            frame1.setVisible(true);

        } else
            switch (suggAge) {

                case 6:
                    frame1 = new JFrame("6 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> " + babyAge + " months old " + babyName
                            + " can now eat foods such as: Blended Mashed or soft cooked </li>" +
                            "<li>Broccoli</li>" +
                            "<li>Potato & Sweet Potato</li>" +
                            "<li>Yam</li>" +
                            "<li>Carots</li>" +
                            "<li>Apples & Pears</li>" +
                            "<li>For the most part this stage is introducing your baby to food and get them excited and curious to try new things</li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel = new JPanel();

                    // adding lable to panel
                    panel.add(label1);

                    // adding pabel to frame
                    frame1.add(panel);

                    // setting size of frame
                    frame1.setSize(900, 300);
                    frame1.setVisible(true);
                    break;

                case 7:
                    frame1 = new JFrame("7 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> " + babyAge + " months old " + babyName + " can now eat foods such as: </li>" +
                            "<li>Peas pureed with breastmilk (or formula), sweet potatoes, or squash</li>" +
                            "<li>Kale pureed with blueberry, squash, potatoes, sweet potatoes, peas, pears, or bananas</li>"
                            +
                            "<li>Chicken pureed with carrots and potatoes</li>" +
                            "<li>Chickpeas pureed with bananas, apples, or sweet potato</li>" +
                            "<li>Beef pureed with broccoli</li>" +
                            "<li>Seven months is also the perfect age to start giving your baby a plate, bowl, and plastic utensils so they can begin to practice feeding themselves. </li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel2 = new JPanel();

                    // adding lable to panel
                    panel2.add(label1);

                    // adding pabel to frame
                    frame1.add(panel2);

                    // setting size of frame
                    frame1.setSize(900, 300);
                    frame1.setVisible(true);
                    break;

                case 8:
                    frame1 = new JFrame("8 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> " + babyAge + " months old " + babyName + " can now eat foods such as: </li>" +
                            "<li>Whole eggs, scrambled</li>" +
                            "<li>Well-cooked (think over-cooked until falling apart) pasta such as elbows or alphabet shapes</li>"
                            +
                            "<li>Full-fat yogurt</li>" +
                            "<li>Fully cooked fish, like salmon or tuna </li>" +
                            "<li>Mashed meat with mashed or ground vegetables such as peas and potatoes or kale and squash</li>"
                            +
                            "<li> Many families often feel more comfortable waiting to introduce these foods until around this age. Of course, consult with your little one’s pediatrician if you have concerns about potential allergen foods.  </li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel3 = new JPanel();

                    // adding lable to panel
                    panel3.add(label1);

                    // adding pabel to frame
                    frame1.add(panel3);

                    // setting size of frame
                    frame1.setSize(900, 300);
                    frame1.setVisible(true);
                    break;

                case 9:
                    frame1 = new JFrame("9 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> As you begin to focus on meal planning for your baby, there are few things to keep in mind:</li>"
                            +
                            "<li>Babies need four to five servings of fruits and vegetables a day. A serving size for a 9-month-old is less than a quarter cup.</li>"
                            +
                            "<li>'Eat the rainbow' is excellent advice because it gives your baby exposure to lots of different fruits, vegetables, grains, and starches. </li>"
                            +
                            "<li>Breakfast Ideas:</li>" +
                            "<li>Whole-grain waffles or pancakes </li>" +
                            "<li>Soft scrambled eggs</li>" +
                            "<li>Full-fat yogurt mixed with mashed or pureed berries such as blueberries, blackberries, strawberries, or raspberries </li>"
                            +
                            "<li>Lunch Ideas: </li>" +
                            "<li> Spread hummus on soft crackers or bread  </li>" +
                            "<li> Quesadilla made with pureed spinach, squash, or beans </li>" +
                            "<li> Grilled cheese sandwich with cooled tomato soup</li>" +
                            "<li> Snack Ideas: </li>" +
                            "<li>Apple and carrot slaw</li>" +
                            "<li>Cheese slices </li>" +
                            "<li>Avocado slices</li>" +
                            "<li>There are endless variations on what you can serve your baby for dinner. As long as your baby is safe and happy, try to encourage lots of food exploration! </li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel4 = new JPanel();

                    // adding lable to panel
                    panel4.add(label1);

                    // adding pabel to frame
                    frame1.add(panel4);

                    // setting size of frame
                    frame1.setSize(1500, 400);
                    frame1.setVisible(true);

                    break;

                // same label as 9 (switch case)
                case 10:
                    frame1 = new JFrame("10 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> As you begin to focus on meal planning for your baby, there are few things to keep in mind:</li>"
                            +
                            "<li>Babies need four to five servings of fruits and vegetables a day. A serving size for a 9-month-old is less than a quarter cup.</li>"
                            +
                            "<li>'Eat the rainbow' is excellent advice because it gives your baby exposure to lots of different fruits, vegetables, grains, and starches. </li>"
                            +
                            "<li>Breakfast Ideas:</li>" +
                            "<li>Whole-grain waffles or pancakes </li>" +
                            "<li>Soft scrambled eggs</li>" +
                            "<li>Full-fat yogurt mixed with mashed or pureed berries such as blueberries, blackberries, strawberries, or raspberries </li>"
                            +
                            "<li>Lunch Ideas: </li>" +
                            "<li> Spread hummus on soft crackers or bread  </li>" +
                            "<li> Quesadilla made with pureed spinach, squash, or beans </li>" +
                            "<li> Grilled cheese sandwich with cooled tomato soup</li>" +
                            "<li> Snack Ideas: </li>" +
                            "<li>Apple and carrot slaw</li>" +
                            "<li>Cheese slices </li>" +
                            "<li>Avocado slices</li>" +
                            "<li>There are endless variations on what you can serve your baby for dinner. As long as your baby is safe and happy, try to encourage lots of food exploration! </li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel5 = new JPanel();

                    // adding lable to panel
                    panel5.add(label1);

                    // adding pabel to frame
                    frame1.add(panel5);

                    // setting size of frame
                    frame1.setSize(1500, 400);
                    frame1.setVisible(true);

                    break;

                case 11:
                    // same label as 9, 10 (switch case)
                    frame1 = new JFrame("11 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> As you begin to focus on meal planning for your baby, there are few things to keep in mind:</li>"
                            +
                            "<li>Babies need four to five servings of fruits and vegetables a day. A serving size for a 9-month-old is less than a quarter cup.</li>"
                            +
                            "<li>'Eat the rainbow' is excellent advice because it gives your baby exposure to lots of different fruits, vegetables, grains, and starches. </li>"
                            +
                            "<li>Breakfast Ideas:</li>" +
                            "<li>Whole-grain waffles or pancakes </li>" +
                            "<li>Soft scrambled eggs</li>" +
                            "<li>Full-fat yogurt mixed with mashed or pureed berries such as blueberries, blackberries, strawberries, or raspberries </li>"
                            +
                            "<li>Lunch Ideas: </li>" +
                            "<li> Spread hummus on soft crackers or bread  </li>" +
                            "<li> Quesadilla made with pureed spinach, squash, or beans </li>" +
                            "<li> Grilled cheese sandwich with cooled tomato soup</li>" +
                            "<li> Snack Ideas: </li>" +
                            "<li>Apple and carrot slaw</li>" +
                            "<li>Cheese slices </li>" +
                            "<li>Avocado slices</li>" +
                            "<li>There are endless variations on what you can serve your baby for dinner. As long as your baby is safe and happy, try to encourage lots of food exploration! </li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel6 = new JPanel();

                    // adding lable to panel
                    panel6.add(label1);

                    // adding pabel to frame
                    frame1.add(panel6);

                    // setting size of frame
                    frame1.setSize(1500, 400);
                    frame1.setVisible(true);

                    break;

                case 12:
                    // same label as 9, 10 & 11 (switch case)
                    frame1 = new JFrame("12 Months label");

                    label1 = new JLabel("<html><ul>" +
                            "<li> As you begin to focus on meal planning for your baby, there are few things to keep in mind:</li>"
                            +
                            "<li>Babies need four to five servings of fruits and vegetables a day. A serving size for a 9-month-old is less than a quarter cup.</li>"
                            +
                            "<li>'Eat the rainbow' is excellent advice because it gives your baby exposure to lots of different fruits, vegetables, grains, and starches. </li>"
                            +
                            "<li>Breakfast Ideas:</li>" +
                            "<li>Whole-grain waffles or pancakes </li>" +
                            "<li>Soft scrambled eggs</li>" +
                            "<li>Full-fat yogurt mixed with mashed or pureed berries such as blueberries, blackberries, strawberries, or raspberries </li>"
                            +
                            "<li>Lunch Ideas: </li>" +
                            "<li> Spread hummus on soft crackers or bread  </li>" +
                            "<li> Quesadilla made with pureed spinach, squash, or beans </li>" +
                            "<li> Grilled cheese sandwich with cooled tomato soup</li>" +
                            "<li> Snack Ideas: </li>" +
                            "<li>Apple and carrot slaw</li>" +
                            "<li>Cheese slices </li>" +
                            "<li>Avocado slices</li>" +
                            "<li>There are endless variations on what you can serve your baby for dinner. As long as your baby is safe and happy, try to encourage lots of food exploration! </li>"
                            +
                            "</ul><html>");

                    // creating pane
                    JPanel panel7 = new JPanel();

                    // adding lable to panel
                    panel7.add(label1);

                    // adding pabel to frame
                    frame1.add(panel7);

                    // setting size of frame
                    frame1.setSize(1500, 400);
                    frame1.setVisible(true);

                    break;

                default:
                    System.out.println("Error -- Switch case babyRecipes invalid baby age ");
                    break;
            }

    }

}
