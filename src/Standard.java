import javax.swing.*;

import java.awt.Cursor;
import java.awt.event.*;
import java.lang.Math.*;

class Standard implements ActionListener{
    public JFrame standardlayout;
    String op="",pre="", op2="", pre2="";
    private JMenuBar jmb;
    private JMenu jmFile;
    private JMenuItem jmiScientific, jmiStandard;
    private JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r;
    private JTextField txtid;
    
    public Standard() {
		initialize();
	}
    
    private void initialize() {
    	standardlayout = new JFrame("Kalkulator");
    	standardlayout.setBounds(300,200,325,370);
    	standardlayout.setLayout(null);
    	standardlayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	jmb = new JMenuBar();
    	standardlayout.add(jmb);
        
    	jmFile = new JMenu ("Mode");
        jmb.add(jmFile);
        
        jmiStandard = new JMenuItem ("Standard");
        jmiStandard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        jmiScientific = new JMenuItem ("Scientific");
        jmiScientific.addActionListener(this);
        jmiScientific.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        standardlayout.getContentPane().add(jmiScientific);
        
        jmFile.add(jmiStandard);
        jmFile.add(jmiScientific);
        
        standardlayout.add(jmb);
        standardlayout.setJMenuBar(jmb);
        
        txtid = new JTextField();
        txtid.setBounds(10,10,290,50);
        standardlayout.add(txtid);
        txtid.setFont(new java.awt.Font("Lucida Grande", 0, 19));
        txtid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtid.setText("0");
        txtid.disable();
        
        a = new JButton ("1");
        a.setBounds(10,70,50,50);
        a.addActionListener(this);
        standardlayout.add(a);
        
        b = new JButton ("2");
        b.setBounds(70,70,50,50);
        b.addActionListener(this);
        standardlayout.add(b);
        
        c = new JButton ("3");
        c.setBounds(130,70,50,50);
        c.addActionListener(this);
        standardlayout.add(c);
        
        d = new JButton ("4");
        d.setBounds(10,130,50,50);
        d.addActionListener(this);
        standardlayout.add(d);
        
        e = new JButton ("5");
        e.setBounds(70,130,50,50);
        e.addActionListener(this);
        standardlayout.add(e);
        
        f = new JButton ("6");
        f.setBounds(130,130,50,50);
        f.addActionListener(this);
        standardlayout.add(f);
        
        g = new JButton ("7");
        g.setBounds(10,190,50,50);
        g.addActionListener(this);
        standardlayout.add(g);
        
        h = new JButton ("8");
        h.setBounds(70,190,50,50);
        h.addActionListener(this);
        standardlayout.add(h);
        
        i = new JButton ("9");
        i.setBounds(130,190,50,50);
        i.addActionListener(this);
        standardlayout.add(i);
        
        j = new JButton ("0");
        j.setBounds(10,250,110,50);
        j.addActionListener(this);
        standardlayout.add(j);
        
        k = new JButton ("+");
        k.setBounds(190,70,50,50);
        k.addActionListener(this);
        standardlayout.add(k);
        
        l = new JButton ("-");
        l.setBounds(190,130,50,50);
        l.addActionListener(this);
        standardlayout.add(l);
        
        m = new JButton ("*");
        m.setBounds(190,190,50,50);
        m.addActionListener(this);
        standardlayout.add(m);
        
        n = new JButton ("/");
        n.setBounds(190,250,50,50);
        n.addActionListener(this);
        standardlayout.add(n);
        
        o = new JButton ("=");
        o.setBounds(250,190,50,110);
        o.addActionListener(this);
        standardlayout.add(o);
        
        p = new JButton (".");
        p.setBounds(130,250,50,50);
        p.addActionListener(this);
        standardlayout.add(p);
        
        q = new JButton ("C");
        q.setBounds(250,130,50,50);
        q.addActionListener(this);
        standardlayout.add(q);
        
        r = new JButton ("AC");
        r.setBounds(250,70,50,50);
        r.addActionListener(this);
        standardlayout.add(r);
    }
    
    @Override
    public void actionPerformed(ActionEvent key) {
    	if (key.getSource()==jmiScientific){
    		
    		standardlayout.setVisible(false);
    		
    		Scientific window = new Scientific();
    		window.scientificlayout.setVisible(true);
    	}
    	else if(key.getSource() == a)
    	{
    		if(op.equals("=")){
                txtid.setText("1");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("1");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"1");
    		}
        }
    	else if(key.getSource() == b)
    	{
    		if(op.equals("=")){
                txtid.setText("2");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("2");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"2");
    		}
        }
    	else if(key.getSource() == c)
    	{
    		if(op.equals("=")){
                txtid.setText("3");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("3");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"3");
    		}
        }
    	else if(key.getSource() == d)
    	{
    		if(op.equals("=")){
                txtid.setText("4");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("4");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"4");
    		}
        }
    	else if(key.getSource() == e)
    	{
    		if(op.equals("=")){
                txtid.setText("5");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("5");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"5");
    		}
        }
    	else if(key.getSource() == f)
    	{
    		if(op.equals("=")){
                txtid.setText("6");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("6");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"6");
    		}
        }
    	else if(key.getSource() == g)
    	{
    		if(op.equals("=")){
                txtid.setText("7");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("7");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"7");
    		}
        }
    	else if(key.getSource() == h)
    	{
    		if(op.equals("=")){
                txtid.setText("8");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("8");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"8");
    		}
        }
    	else if(key.getSource() == i)
    	{
    		if(op.equals("=")){
                txtid.setText("9");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("9");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"9");
    		}
        }
    	else if(key.getSource() == j)
    	{
    		if(op.equals("=")){
                txtid.setText("0");
                op="";
            }
    		else if(txtid.getText().equals("0"))
    		{
    			txtid.setText("0");
    		}
    		else
    		{
    			txtid.setText(txtid.getText()+"0");
    		}
        }
    	else if(key.getSource() == k)
    	{
    		op="+";
            pre=txtid.getText();
            txtid.setText("");
        }
    	else if(key.getSource() == l)
    	{
    		op="-";
            pre=txtid.getText();
            txtid.setText("");
        }
    	else if(key.getSource() == m)
    	{
    		op="*";
            pre=txtid.getText();
            txtid.setText("");
        }
    	else if(key.getSource() == n)
    	{
    		op="/";
            pre=txtid.getText();
            txtid.setText("");
        }
    	else if(key.getSource() == o)
    	{
    		switch(op){
            case "":
                txtid.setText("0");
                break;
            case"+":
                txtid.setText((Float.parseFloat(pre)+Float.parseFloat(txtid.getText()))+"");
                break;
            case "-":
                txtid.setText((Float.parseFloat(pre)-Float.parseFloat(txtid.getText()))+"");
                break;
            case"*":
                txtid.setText((Float.parseFloat(pre)*Float.parseFloat(txtid.getText()))+"");
                break;
            case"/":
                txtid.setText((Float.parseFloat(pre)/Float.parseFloat(txtid.getText()))+"");
                break;
            case "=":
                break;
    		}
    		op="=";
        }
    	else if(key.getSource() == p)
    	{
    		if(op.equals("=")){
                txtid.setText("0.");
                op="";
            }
            else
            {
            	txtid.setText(txtid.getText()+".");
            }
        }
    	else if(key.getSource() == q)
    	{
    		op="del";
            String str=txtid.getText();
            int p = str.length();
            if(p-1!=0)
            {
            	txtid.setText(txtid.getText().substring(0,p-1));
            }                
            else
            {
            	txtid.setText("0");
            }
        }
    	else if(key.getSource() == r)
    	{
    		op="";
            pre="";
            txtid.setText("0");
        }
    }
}