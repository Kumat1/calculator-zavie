import javax.swing.*;

import java.awt.Cursor;
import java.awt.event.*;
import java.lang.Math.*;

class Scientific implements ActionListener{
    public JFrame scientificlayout;
    String op="",pre="", op2="", pre2="";
    private JMenuBar jmb;
    private JMenu jmFile;
    private JMenuItem jmiScientific, jmiStandard;
    private JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v;
    private JTextField txtid;
    
    public Scientific() {
		initialize();
	}
    
    private void initialize() {
    	scientificlayout = new JFrame("Kalkulator");
    	scientificlayout.setBounds(300,200,445,370);
    	scientificlayout.setLayout(null);
    	scientificlayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	jmb = new JMenuBar();
    	scientificlayout.add(jmb);
        
    	jmFile = new JMenu ("Mode");
        jmb.add(jmFile);
        
        jmiStandard = new JMenuItem ("Standard");
        jmiStandard.addActionListener(this);
        jmiStandard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        scientificlayout.getContentPane().add(jmiStandard);
        
        jmiScientific = new JMenuItem ("Scientific");
        jmiScientific.addActionListener(this);
        jmiScientific.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        scientificlayout.getContentPane().add(jmiScientific);
        
        jmFile.add(jmiStandard);
        jmFile.add(jmiScientific);
        
        scientificlayout.add(jmb);
        scientificlayout.setJMenuBar(jmb);
        
        txtid = new JTextField();
        txtid.setBounds(10,10,410,50);
        scientificlayout.add(txtid);
        txtid.setFont(new java.awt.Font("Lucida Grande", 0, 19));
        txtid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtid.setText("0");
        txtid.disable();
        
        a = new JButton ("1");
        a.setBounds(10,70,50,50);
        a.addActionListener(this);
        scientificlayout.add(a);
        
        b = new JButton ("2");
        b.setBounds(70,70,50,50);
        b.addActionListener(this);
        scientificlayout.add(b);
        
        c = new JButton ("3");
        c.setBounds(130,70,50,50);
        c.addActionListener(this);
        scientificlayout.add(c);
        
        d = new JButton ("4");
        d.setBounds(10,130,50,50);
        d.addActionListener(this);
        scientificlayout.add(d);
        
        e = new JButton ("5");
        e.setBounds(70,130,50,50);
        e.addActionListener(this);
        scientificlayout.add(e);
        
        f = new JButton ("6");
        f.setBounds(130,130,50,50);
        f.addActionListener(this);
        scientificlayout.add(f);
        
        g = new JButton ("7");
        g.setBounds(10,190,50,50);
        g.addActionListener(this);
        scientificlayout.add(g);
        
        h = new JButton ("8");
        h.setBounds(70,190,50,50);
        h.addActionListener(this);
        scientificlayout.add(h);
        
        i = new JButton ("9");
        i.setBounds(130,190,50,50);
        i.addActionListener(this);
        scientificlayout.add(i);
        
        j = new JButton ("0");
        j.setBounds(10,250,110,50);
        j.addActionListener(this);
        scientificlayout.add(j);
        
        k = new JButton ("+");
        k.setBounds(190,70,50,50);
        k.addActionListener(this);
        scientificlayout.add(k);
        
        l = new JButton ("-");
        l.setBounds(190,130,50,50);
        l.addActionListener(this);
        scientificlayout.add(l);
        
        m = new JButton ("*");
        m.setBounds(190,190,50,50);
        m.addActionListener(this);
        scientificlayout.add(m);
        
        n = new JButton ("/");
        n.setBounds(190,250,50,50);
        n.addActionListener(this);
        scientificlayout.add(n);
        
        o = new JButton ("=");
        o.setBounds(370,190,50,110);
        o.addActionListener(this);
        scientificlayout.add(o);
        
        p = new JButton (".");
        p.setBounds(130,250,50,50);
        p.addActionListener(this);
        scientificlayout.add(p);
        
        q = new JButton ("C");
        q.setBounds(370,130,50,50);
        q.addActionListener(this);
        scientificlayout.add(q);
        
        r = new JButton ("AC");
        r.setBounds(370,70,50,50);
        r.addActionListener(this);
        scientificlayout.add(r);
        
        s = new JButton ("Sin");
        s.setBounds(250,70,110,50);
        s.addActionListener(this);
        scientificlayout.add(s);
        
        t = new JButton ("Cos");
        t.setBounds(250,130,110,50);
        t.addActionListener(this);
        scientificlayout.add(t);
        
        u = new JButton ("Tan");
        u.setBounds(250,190,110,50);
        u.addActionListener(this);
        scientificlayout.add(u);
        
        v = new JButton ("Log");
        v.setBounds(250,250,110,50);
        v.addActionListener(this);
        scientificlayout.add(v);
    }
    
    @Override
    public void actionPerformed(ActionEvent key) {
    	if (key.getSource()==jmiStandard){
    		
    		scientificlayout.setVisible(false);
    		
    		Standard window = new Standard();
    		window.standardlayout.setVisible(true);
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
    		switch(op2)
    		{
	            case "":
	                txtid.setText("0");
	                break;
	            case"+":
	                txtid.setText((Float.parseFloat(pre2)+Float.parseFloat(txtid.getText()))+"");
	                pre2="";
	                break;
	            case "-":
	                txtid.setText((Float.parseFloat(pre2)-Float.parseFloat(txtid.getText()))+"");
	                pre2="";
	                break;
	            case"*":
	                txtid.setText((Float.parseFloat(pre2)*Float.parseFloat(txtid.getText()))+"");
	                pre2="";
	                break;
	            case"/":
	                txtid.setText((Float.parseFloat(pre2)/Float.parseFloat(txtid.getText()))+"");
	                pre2="";
	                break;
	            case "=":
	                pre2="";
	                break;
	            case "sin":
	                txtid.setText((Float.parseFloat(pre2)*Math.sin(Float.parseFloat(txtid.getText())))+"");
	                break;
	            case "cos":
	                txtid.setText(Float.parseFloat(pre2)*Math.cos(Float.parseFloat(txtid.getText()))+"");
	                break;
	            case "tan":
	                txtid.setText(Float.parseFloat(pre2)*Math.tan(Float.parseFloat(txtid.getText()))+"");
	                break;
	            case "log":
	                txtid.setText(Float.parseFloat(pre2)*Math.log(Float.parseFloat(txtid.getText()))+"");
	                break;
	        }
	        op2="=";
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
    	else if(key.getSource() == s)
    	{
    		op2="sin";
            if (txtid.getText().equals("")||txtid.getText().equals("0"))
            {
                pre2="1";
            }
            else
            {
            	pre2=txtid.getText();
            }
                
            txtid.setText("");
        }
    	else if(key.getSource() == t)
    	{
    		op2="cos";
            if (txtid.getText().equals("")||txtid.getText().equals("0"))
            {
                pre2="1";
            }
            else
            {
            	pre2=txtid.getText();
            }
                
            txtid.setText("");
        }
    	else if(key.getSource() == u)
    	{
    		op2="tan";
            if (txtid.getText().equals("")||txtid.getText().equals("0"))
            {
                pre2="1";
            }
            else
            {
            	pre2=txtid.getText();
            }                
            
            txtid.setText("");
        }
    	else if(key.getSource() == v)
    	{
    		op2="log";
            if (txtid.getText().equals("")||txtid.getText().equals("0"))
            {
                pre2="1";
            }
            else
            {
            	pre2=txtid.getText();
            }
            
            txtid.setText("");
        }
    }
}