import java.awt.*;
import javax.swing.*;

public class BarGraphWriter2 {
   public static void main(String[]args)  {
      BarGraphWriter e = new BarGraphWriter();
    
      String title = JOptionPane.showInputDialog("Jepe titullin");
      String label = JOptionPane.showInputDialog("Numri maksimal i grafit");
      int height = Integer.parseInt(label);
      int graph1 = Integer.parseInt(JOptionPane.showInputDialog("Vlera e grafit 1"));
      int graph2 = Integer.parseInt(JOptionPane.showInputDialog("Vlera e grafit 2"));
      int graph3 = Integer.parseInt(JOptionPane.showInputDialog("Vlera e grafit 3"));
      int graph4 = Integer.parseInt(JOptionPane.showInputDialog("Vlera e grafit 4"));
      int graph5 = Integer.parseInt(JOptionPane.showInputDialog("Vlera e grafit 5"));
      int graph6 = Integer.parseInt(JOptionPane.showInputDialog("Vlera e grafit 6"));
      
      e.setTitle(title);
      e.setAxes(20,120,label,height*2);
      e.setBar1("1",graph1*2,Color.red);
      e.setBar2("2",graph2*2,Color.blue);
      e.setBar3("3",graph3*2,Color.yellow);
      e.setBar4("4",graph4*2,Color.pink);
      e.setBar5("5",graph5*2,Color.green);
      e.setBar6("6",graph6*2,Color.gray);
   }   
}