import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.util.Scanner;


public class hack{
    public static void main(String[] args) throws AWTException, InterruptedException {
       int x = 1;
       Robot robot = new Robot();
       Scanner me = new Scanner(System.in);
       System.out.println("enter your text:");
       String Text = me.nextLine();

       StringSelection stringSelection = new StringSelection(Text);
       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("the spamming will start in 5 seconds");
       
        Thread.sleep(50);
        
        


        while(x<=10000){
        Thread.sleep(50);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        x++;

        }
    }
}
