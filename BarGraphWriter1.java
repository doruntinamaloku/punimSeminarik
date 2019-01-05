import java.awt.*;
import javax.swing.*;
public class BarGraphWriter1  {
   public static void main(String []args) {
      BarGraphWriter e = new BarGraphWriter();
        int dollars;
        int cents;
        
       
       String input=JOptionPane.showInputDialog("Jepe vleren e dollareve");
       dollars = new Integer(input).intValue();
       
       String input2=JOptionPane.showInputDialog("Jepe vleren e centeve");
       cents = new Integer(input2).intValue();
 
       int money = (dollars * 100) + cents;
       int quarter=(money / 25);
        money= money % 25;
       int dimes=(money / 10);
        money= money % 10;
       int nickles=(money / 5);
        money= money % 5;
       int pennies= money;
       
      e.setTitle("Monedhat");
      e.setAxes(20,120,"30",90);
      e.setBar1("q",quarter, Color.red);
      e.setBar2("d",dimes,Color.gray);
      e.setBar3("n",nickles,Color.yellow);
      e.setBar4("p",pennies,Color.pink);
   }
}