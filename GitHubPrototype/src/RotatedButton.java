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

class RotatedButton extends JButton {
   
   XButton template;
   boolean clockwise;
   
   RotatedButton(String text, boolean clockwise) {
      template = new XButton(text);
      this.clockwise = clockwise;
      
      Dimension d = template.getPreferredSize();
      setPreferredSize(new Dimension(d.height, d.width));
   }
   
   public void changeText(String text)
   {
       template = new XButton(text);
   }
   
   @Override
   protected void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g.create();
      
      Dimension d = getSize();
      template.setSize(d.height, d.width);
      
      if (clockwise) {
         g2.rotate(Math.PI / 2.0);
         g2.translate(0, -getSize().width);
      } else {
         g2.translate(0, getSize().height);
         g2.rotate(- Math.PI / 2.0);
      }
      template.setSelected(this.getModel().isPressed());
      template.paintComponent(g2);
      g2.dispose();
   }
   
   private class XButton extends JToggleButton {
      XButton(String text) {
         super(text);
      }
      
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
      }
   }
}
