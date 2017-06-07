import java.awt.image.BufferedImage ;
import java.awt.Image;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public  class SpikeTower extends Tower
{
  public SpikeTower(BloonGame bg, int x, int y) 
  {
    this.x= x;
    this.y= y;
    this.bg = bg;
  }
  public SpikeTower(BloonGame bg) 
  {
    
    this.bg = bg;
  }
   public void paint(Graphics g)
  {
    g.drawImage(spikeTower, x+400, y, null);
  }
   public void placeTower(int[][] path, int arrayX, int arrayY)
   {
     path[arrayY][arrayX] = 9;
   }
}
