
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JFileChooser.*;
import javax.swing.JMenu;

import java.io.*;
import java.util.*;

class AssignmentNo07_Editor_R34 extends JFrame implements ActionListener
{
	JMenuBar mb;

	JMenu file,edit,font;

	JMenuItem nw, open, save,cut, copy, paste, saveas, fnt;

	JTextArea ta;

	String path="";



	public AssignmentNo07_Editor_R34()
	{
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		mb=new JMenuBar();
		ta=new JTextArea();
		c.add("North",mb);
		c.add("Center",ta);

		file=new JMenu("FILE");
		edit=new JMenu("EDIT");
		font=new JMenu("FONT");
		
		mb.add(file);
		mb.add(edit);
		mb.add(font);
		
		nw=new JMenuItem("New");
		open=new JMenuItem("Open");
		save=new JMenuItem("Save");
		saveas=new JMenuItem("SaveAs");
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		fnt=new JMenuItem("Font");

		file.add(nw);
		file.add(open);
		file.add(save);
		file.add(saveas);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		font.add(fnt);
		
		nw.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		fnt.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent ae)

	{
		if(nw.isArmed())
		{
			ta.setText("");
			path="";
		}

		if(open.isArmed())
		{
			this.opFile();
		}
		if(save.isArmed())
		{
			this.saFile();
		}

		if(saveas.isArmed())
		{
			this.svFile();
		}

		if(cut.isArmed())
		{
			ta.cut();
		}

		if(copy.isArmed())
		{
			ta.copy();
		}

		if(paste.isArmed())
		{
			ta.paste();
		}

		if(fnt.isArmed())
		{
			this.setFont();
		}
	}



	void opFile()
	{
		JFileChooser fc=new JFileChooser();
		int i=fc.showOpenDialog(this);

		if(i==JFileChooser.APPROVE_OPTION)
		{
			try
			{
				File f=fc.getSelectedFile();
				String fname=f.getPath();
				String str;
				String data="";
				BufferedReader br=new BufferedReader(new FileReader(fname));
				while((str=br.readLine())!=null)
				{
					data+=str+"\n";
				}
				System.out.println(str);
				ta.setText(data);

				br.close();
				path=fname;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	void saFile()
	{
		if(path.equals(""))
		{
			JFileChooser fc=new JFileChooser();
			fc.setDialogTitle("SAVE");
			int i=fc.showSaveDialog(this);

			if(i==JFileChooser.APPROVE_OPTION)
			{
				try
				{
					File f=fc.getSelectedFile();
					String fname=f.getPath();

					FileWriter fw=new FileWriter(fname);
					fw.write(ta.getText());
					fw.close();
					path=fname;
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else
		{

			try
			{
				FileWriter fw=new FileWriter(path);
				fw.write(ta.getText());
				fw.close();
			}
			catch(Exception ex)
			{
			}
		}


	}
	void svFile()
	{

		JFileChooser fc=new JFileChooser();
		fc.setDialogTitle("SAVEAS");
		int i=fc.showSaveDialog(this);

		if(i==JFileChooser.APPROVE_OPTION)
		{
			try
			{
			File f=fc.getSelectedFile();
			String fname=f.getPath();

			FileWriter fw=new FileWriter(fname);
			fw.write(ta.getText());
			fw.close();

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	void setFont()
	{
		
	}

	
       	 
	public static void main(String[] args)
	{
		Editor te=new Editor();
		te.setSize(500,500);
		te.setTitle(" EDITOR");
		te.setVisible(true);
		te.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

           
}
