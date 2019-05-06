import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeFrame extends JFrame
{
   public WelcomeFrame()
   {
      JPanel panel = new JPanel();
      ImageIcon image = new ImageIcon("logo.png", null);
      JLabel label = new JLabel(image, JLabel.CENTER);
      JButton newFileButton = new PlainButton( "New File");
      JButton openFileButton = new PlainButton( "Open File");
      panel.setLayout(new BoxLayout( panel, BoxLayout.PAGE_AXIS));
      newFileButton.setFont(new Font("Arial", Font.PLAIN, 40));
      openFileButton.setFont(new Font("Arial", Font.PLAIN, 40));
      newFileButton.addActionListener( new ActionListener(){
         public void actionPerformed( ActionEvent e)
         {
            new MainWorkspace();
            dispose();
         }
      });
      panel.add( label);
      panel.add( newFileButton);
      panel.add( openFileButton);
      panel.setBackground( new Color( 203, 237, 255));
      add( panel);
      setSize( new Dimension( 500, 500));
      setLocationRelativeTo(null);
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setVisible( true);
   }
   
   private class PlainButton extends JButton
   {
      private PlainButton( String s)
      {
         super( s);
         setBorderPainted(false);
         setOpaque(false);
         setContentAreaFilled(false);
      }
   }
   
}