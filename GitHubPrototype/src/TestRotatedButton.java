/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
/**
 *
 * @author Muy
 */
public class TestRotatedButton {
    JFrame frame;
    void makeUI() {
      frame = new JFrame("Test Rotated Button");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 400);
      frame.setLayout(new FlowLayout());
      frame.add(new RotatedButton("Test Clockwise", true));
      frame.add(new RotatedButton("Test Anticlockwise", false));
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new TestRotatedButton().makeUI();
         }
      });
   }
    
}
