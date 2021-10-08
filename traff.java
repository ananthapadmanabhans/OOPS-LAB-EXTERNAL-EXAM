package q;
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class traff extends Applet implements ItemListener 
{ 
Choice ch;
 int Select;
	public void init()
	 {
	 ch = new Choice();
	 ch.addItem("--SELECT A COLOUR--");
	 ch.addItem("RED!");
	 ch.addItem("GREEN !");
	 ch.addItem("YELLOW !");
	 ch.addItem("NO OPTION !");
		 add(ch);
	 ch.addItemListener(this);
	 }
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
		  Select = ch.getSelectedIndex(); 	

	 if (Select==1)
	 {try {System.out.print("\n Elements in the File: \n");
			FileReader ra = new FileReader("C:\\Users\\Admin\\Desktop\\Files\\all.txt");
			int i;
			  
			while((i=ra.read())!=-1)
			  System.out.print((char)i);
			ra.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  			
	 }
	 if (Select==2)
	 {
		try {System.out.print("\n Elements in the Even File: \n");
			FileReader re = new FileReader("C:\\Users\\Admin\\Desktop\\Files\\even.txt");
			int i;
			while((i=re.read())!=-1)
				  System.out.print((char)i);
			re.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	 }
			
	 if (Select==3)
	 { 
		try {System.out.print("\n Elements in the Odd File: \n");
			FileReader rk = new FileReader("C:\\Users\\Admin\\Desktop\\Files\\odd.txt");
			int i;
			while((i=rk.read())!=-1)
				  System.out.print((char)i);
			rk.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	 	 
	 }
	 if(Select>3)
	 { System.out.print("\n Invalid Option !!!! \n");}
	 }
	}

	 
	
	