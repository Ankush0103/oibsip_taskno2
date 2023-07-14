import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.*;
import javax.swing.JOptionPane;
public class NumberGuessingGame {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        int attempts = 5;
        int score = 0;

        ImageIcon gu = new ImageIcon("guess.png");
        ImageIcon warn = new ImageIcon("warning.png");
        ImageIcon ch = new ImageIcon("check.png");
        ImageIcon cl  = new ImageIcon("close.png");
        ImageIcon arr = new ImageIcon("arrow.png");
        Random random = new Random();
        int rand = random.nextInt(max - min + 1) + min;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!", "NumberGuessingGame", JOptionPane.INFORMATION_MESSAGE, gu);

        for (int i = min; i <= attempts; i++) {

            String num = JOptionPane.showInputDialog("Guess the number between " + min + " and " + max + "");
            int userNum = Integer.parseInt(num);

            if(userNum<=0||userNum>100)
                JOptionPane.showMessageDialog(null, "Guess number between 1 and 100. Try Again." + (attempts - i) + " Attempts Left.", "Warning", JOptionPane.INFORMATION_MESSAGE, warn);
            else if (userNum == rand)
                JOptionPane.showMessageDialog(null, "Your guess number is higher than random number. Try again."  + ( attempts - i ) + " Attempts Left.", "Warning", JOptionPane.INFORMATION_MESSAGE, warn);
            else if (userNum < rand)
                JOptionPane.showMessageDialog(null, "Your guess number is lower than random number. Try again. " + ( attempts - i ) + " Attempts Left.", "Warning", JOptionPane.INFORMATION_MESSAGE, warn);
            else
            {
                JOptionPane.showMessageDialog(null, "Congratulations!!!! You've guessed the right number  " + userNum + " in " + i + " Attempts.",  "Correct", JOptionPane.INFORMATION_MESSAGE, ch);
                score = attempts - i + 1;
                break;
            }
        }

        if(score > 0){
            JOptionPane.showMessageDialog(null, "Your final score is: " + score + "",  "Marks", JOptionPane.INFORMATION_MESSAGE, arr);
        }
        else {
            JOptionPane.showMessageDialog(null, "Your final score is: " + score + "", "Marks", JOptionPane.INFORMATION_MESSAGE, cl);
        }

    }


}

//Icons Author Atrribute
/*<a href="https://www.flaticon.com/free-icons/foursquare-check-in" title="foursquare check in icons">Foursquare check in icons created by hqrloveq - Flaticon</a>
<a href="https://www.flaticon.com/free-icons/tick" title="tick icons">Tick icons created by Roundicons - Flaticon</a>
// <a href="https://www.flaticon.com/free-icons/close" title="close icons">Close icons created by Pixel perfect - Flaticon</a>
<a href="https://www.flaticon.com/free-icons/bull" title="bull icons">Bull icons created by amoghdesign - Flaticon</a>
// <a href="https://www.flaticon.com/free-icons/attention" title="attention icons">Attention icons created by sonnycandra - Flaticon</a>*/
