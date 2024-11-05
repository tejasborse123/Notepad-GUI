import java.awt.*;
import javax.swing.*;

class Notepad extends JFrame 
{
     public Notepad()
      {
		  
	this.setFont(new Font("Arial",Font.BOLD,12));
	
	MenuBar mb = new MenuBar();
	
	Menu m1 = new Menu ("File");
	Menu m2 = new Menu ("Edit");
	Menu m3 = new Menu ("Format");
	Menu m4 = new Menu ("View");
	Menu m5 = new Menu ("Help");

	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	mb.add(m4);
	mb.add(m5);
	
	MenuItem mi1 = new MenuItem("New");
	MenuItem mi2 = new MenuItem("New Window");
	MenuItem mi3 = new MenuItem("Open...");
	MenuItem mi4 = new MenuItem("Save");
	MenuItem mi5 = new MenuItem("Save As...");
	MenuItem mi6 = new MenuItem("Page Setup...");
	MenuItem mi7 = new MenuItem("Print...");
	MenuItem mi8 = new MenuItem("Exit");

	MenuItem a1  = new MenuItem("Undo");
	MenuItem a2  = new MenuItem("Cut");
	MenuItem a3  = new MenuItem("Copy");
	MenuItem a4  = new MenuItem("Paste");
	MenuItem a5  = new MenuItem("Delete");
	MenuItem a6  = new MenuItem("Search with bing...");
	MenuItem a7  = new MenuItem("Find...");
	MenuItem a8  = new MenuItem("Find-Next");	
	MenuItem a9  = new MenuItem("Find-Previous");	
	MenuItem a10 = new MenuItem("Replace...");
	MenuItem a11 = new MenuItem("Go-To...");
	MenuItem a12 = new MenuItem("Select All..");
	MenuItem a13 = new MenuItem("Time/Date");

	CheckboxMenuItem b1  = new CheckboxMenuItem("Word-Wrap");
	MenuItem b2  = new MenuItem("Font...");

	Menu m6 = new Menu("Zoom");
	MenuItem d1  = new MenuItem("Zoom-in");
	MenuItem d2  = new MenuItem("Zoom-out");
	MenuItem d3  = new MenuItem("Restore Default Zoom");
	m6.add(d1);
	m6.add(d2);
	m6.add(d3);
	CheckboxMenuItem c2  = new CheckboxMenuItem("Word-Wrap");

	MenuItem e1  = new MenuItem("View Help");
	MenuItem e2  = new MenuItem("Send Feedback");
	MenuItem e3  = new MenuItem("About NOTEPAD");

	m1.add(mi1);
	m1.add(mi2);
	m1.add(mi3);
	m1.add(mi4);
	m1.add(mi5);
	m1.add(mi6);
	m1.add(mi7);
	m1.add(mi8);

	m2.add(a1);
	m2.add(a2);
	m2.add(a3);
	m2.add(a4);
	m2.add(a5);
	m2.add(a6);
	m2.add(a7);
	m2.add(a8);
	m2.add(a9);
	m2.add(a10);
	m2.add(a11);
	m2.add(a12);
	m2.add(a13);

	m3.add(b1);
	m3.add(b2);

	m4.add(m6);
	m4.add(c2);

	m5.add(e1);
	m5.add(e2);
	m5.add(e3);

	setMenuBar(mb);

	TextArea ta = new TextArea();
	add(ta);

      }
	public static void main(String args[])
	{
		Notepad mn1 = new Notepad();
		mn1.setSize(400,400);
		mn1.setVisible(true);
		mn1.setTitle("!!...NOTEPAD...!!");
	}
}