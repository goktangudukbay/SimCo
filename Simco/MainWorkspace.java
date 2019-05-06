import java.awt.*;
import javax.swing.*;

public class MainWorkspace extends JFrame
{
   public MainWorkspace()
   {
      JPanel mainPanel = new JPanel();
      add( mainPanel);
      mainPanel.setLayout(new BorderLayout());
      JMenuBar menuBar;
      Font font = new Font("Arial", Font.PLAIN, 20);
      JMenu fileMenu, editMenu, viewMenu, helpMenu;
      menuBar = new JMenuBar();
      menuBar.setBackground( new Color( 203, 237, 255));
      fileMenu = new JMenu( "File");
      menuBar.add( fileMenu);
      JMenuItem file1, file2, file3, file4, file5, file6;
      file1 = new JMenuItem( "New");
      file2 = new JMenuItem( "Open");
      file3 = new JMenuItem( "Save");
      file4 = new JMenuItem( "Save As");
      file5 = new JMenuItem( "Export");
      file6 = new JMenuItem( "Quit");
      fileMenu.add( file1);
      fileMenu.add( file2);
      fileMenu.add( file3);
      fileMenu.add( file4);
      fileMenu.add( file5);
      fileMenu.add( file6);
      fileMenu.setFont(font);
      
      editMenu = new JMenu( "Edit");
      editMenu.setFont(font);
      JMenuItem edit1, edit2, edit3, edit4;
      edit1 = new JMenuItem( "Cut");
      edit2 = new JMenuItem( "Copy");
      edit3 = new JMenuItem( "Paste");
      edit4 = new JMenuItem( "Clear");
      editMenu.add( edit1);
      editMenu.add( edit2);
      editMenu.add( edit3);
      editMenu.add( edit4);
      menuBar.add( editMenu);
      
      viewMenu = new JMenu( "View");
      viewMenu.setFont( font);
      JCheckBox view1, view2, view3, view4;
      view1 = new JCheckBox( "Functions");
      view2 = new JCheckBox( "Components");
      view3 = new JCheckBox( "Switches");
      view4 = new JCheckBox( "Grid Lines");
      viewMenu.add( view1);
      viewMenu.add( view2);
      viewMenu.add( view3);
      viewMenu.add( view4);
      menuBar.add( viewMenu);
      
      helpMenu = new JMenu( "Help");
      helpMenu.setFont( font);
      JMenuItem help1, help2;
      help1 = new JMenuItem( "Tutorial");
      help2 = new JMenuItem( "Instructions");
      helpMenu.add( help1);
      helpMenu.add( help2);
      add(new ComponentPanel(), BorderLayout.SOUTH);
      menuBar.add( helpMenu);
      
      mainPanel.add( menuBar, BorderLayout.NORTH);
      setSize( new Dimension( 1000, 800));
      setLocationRelativeTo(null);
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setVisible( true);

      
      
   }
   
   
}