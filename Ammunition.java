import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;

public abstract class Ammunition
{
  public BufferedImage img = null;
  
  public abstract int move();
  public abstract int paint();
  public abstract int collision();
}