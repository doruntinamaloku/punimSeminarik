import java.awt.*;
import javax.swing.*;

public class BarGraphWriter extends JPanel {
   private int width;
   private int height;
   private JFrame korniza;
   
	
	//ndryshoret per vizatimin e boshtit kordinativ
   private int  x_pos, y_pos;
   private String x_label="", y_label="", top_label="";
   private int y_height;
	
	// kordinatat y te grafit
   private int point1,point2,point3,point4,point5,point6;
	
	//kordinatat x te bareve
   private int x1=x_pos+20;
   private int x2=x1+20;
   private int x3=x2+20;
   private int x4=x3+20;
   private int x5=x4+20;
   private int x6=x5+20;
   
   
   // labelat e bareve
   private String label1="", label2="", label3="", label4="", label5="", label6="";
   
   // ngjyrat e bareve
   private Color color1, color2, color3, color4, color5, color6;
	
   public BarGraphWriter(){
      width=400;
      height=400;
      korniza= new JFrame();
   	
   		
      korniza.setVisible(true);
      korniza.getContentPane().add(this);
      korniza.setSize(3*width, 2*height);
   }
		
   public void paintComponent(Graphics g){
      g.setColor(Color.BLACK);
   	  
   	  //vizato boshtin kordinativ
      g.drawLine(x_pos, y_pos,x_pos+y_height+100 ,y_pos);
      g.drawLine(x_pos, y_pos,x_pos ,y_pos-y_height);
      g.drawString("0", x_pos-15, y_pos);
      g.drawString(top_label, x_pos-20, y_pos-y_height);
   	  
   	  
   	  //vizatimi i bareve
        
      g.setColor(Color.BLACK);
      g.drawString(label1, x1, y_pos+15);
      g.setColor(color1);
      g.fillRect(x1, y_pos-point1, 15, point1);
      
      g.setColor(Color.BLACK);
      g.drawString(label2, x2, y_pos+15);
      g.setColor(color2);
      g.fillRect(x2, y_pos-point2, 15, point2);
      
      g.setColor(Color.BLACK);
      g.drawString(label3, x3 , y_pos+15);
      g.setColor(color3);
      g.fillRect(x3 , y_pos-point3, 15 , point3); 
      
      
      g.setColor(Color.BLACK);
      g.drawString(label4, x4, y_pos+15);
      g.setColor(color4);
      g.fillRect(x4, y_pos-point4, 15, point4); 
      
      g.setColor(Color.BLACK);
      g.drawString(label5, x5, y_pos+15);
      g.setColor(color5);
      g.fillRect(x5, y_pos-point5, 15, point5);  	  
      
      g.setColor(Color.BLACK);
      g.drawString(label6, x6, y_pos+15);
      g.setColor(color6);
      g.fillRect(x6, y_pos-point6, 15, point6); 
   
   	  
   }
	
	
   public void setTitle(String s){
      korniza.setTitle(s);
   }      	
	
   public void setAxes(int x_pos, int y_pos, String top_label, int y_height){
      this.x_pos=x_pos;
      this.y_pos=y_pos;
      this.y_height=y_height;
      this.top_label=top_label;
   	
      korniza.setSize(4*y_height, 3*y_height);
   }


   public void setBar1(String label, int height, Color c){
      label1 = label;
      point1 = height;
      color1 = c;
      korniza.repaint();
   }
   
   public void setBar2(String label, int height, Color c){
      label2 = label;
      point2 = height;
      color2 = c;
      korniza.repaint();
   }
   
   public void setBar3(String label, int height, Color c){
      label3 = label;
      point3 = height;
      color3 = c;
      korniza.repaint();
   }
   
   public void setBar4(String label, int height, Color c){
      label4 = label;
      point4 = height;
      color4 = c;
      korniza.repaint();
   }
   
   public void setBar5(String label, int height, Color c){
      label5 = label;
      point5 = height;
      color5 = c;
      korniza.repaint();
   }
   
   public void setBar6(String label, int height, Color c){
      label6 = label;
      point6 = height;
      color6 = c;
      korniza.repaint();
   }
}