import java.awt.*;
import javax.swing.*;
/**
 * Auto Generated Java Class.
 */
public class ComponentPanel extends JPanel {
   //properties
   ImageIcon switchPic;
   ImageIcon memoryPic;
   ImageIcon wirePic;
   ImageIcon paperPic;
   ImageIcon computationunitPic;
   public ComponentPanel() 
   { 
      switchPic = new ImageIcon( "switch2.png");
      memoryPic = new ImageIcon( "memoryBox.png"); ;
      wirePic= new ImageIcon( "wire.png");
      computationunitPic = new ImageIcon( "calc1.png");
      setPreferredSize( new Dimension( 300,200)); 
      setBackground( Color.RED);
   }
   
   
}
