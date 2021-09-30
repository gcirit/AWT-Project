package awt_project;

import java.awt.*;  
public class ToolkitResolutionExample {  
  public static void main(String[] args) {  
      Toolkit t = Toolkit.getDefaultToolkit();  
      System.out.println("Screen resolution = " + t.getScreenResolution());  
      Dimension d = t.getScreenSize();  
      System.out.println("Screen width = " + d.width);  
      System.out.println("Screen height = " + d.height);  
  }  
}  
