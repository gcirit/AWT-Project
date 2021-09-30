package awt_project;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.datatransfer.Clipboard;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.Map;
import java.util.Properties;  
public class ToolkitBeepExample {  
public static void main(String[] args) {  
    Frame f=new Frame("ToolkitExample");  
    Button b=new Button("beep");  
    b.setBounds(50,100,60,30);  
    f.add(b);     
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
        	Toolkit t = new Toolkit() {
				
				@Override
				public void sync() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public boolean prepareImage(Image image, int width, int height, ImageObserver observer) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public Map<TextAttribute, ?> mapInputMethodHighlight(InputMethodHighlight highlight) throws HeadlessException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public boolean isModalityTypeSupported(ModalityType modalityType) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isModalExclusionTypeSupported(ModalExclusionType modalExclusionType) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				protected EventQueue getSystemEventQueueImpl() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Clipboard getSystemClipboard() throws HeadlessException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Dimension getScreenSize() throws HeadlessException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getScreenResolution() throws HeadlessException {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public PrintJob getPrintJob(Frame frame, String jobtitle, Properties props) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Image getImage(URL url) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Image getImage(String filename) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public FontMetrics getFontMetrics(Font font) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public String[] getFontList() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public ColorModel getColorModel() throws HeadlessException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Image createImage(byte[] imagedata, int imageoffset, int imagelength) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Image createImage(ImageProducer producer) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Image createImage(URL url) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Image createImage(String filename) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int checkImage(Image image, int width, int height, ImageObserver observer) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public void beep() {
					// TODO Auto-generated method stub
					
				}
			};
        	t.getDefaultToolkit().beep();
        }  
    });       
}  
}  
