import javax.swing.*;  
class checkup 
{  
	public static void main(String args[])  
    	{  
    		JFrame f= new JFrame("CHECKUP");  
    		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;  

    		l1=new JLabel("CHECKUP FORM");  
    		l1.setBounds(330,20,1000,70);  
    
		    l2=new JLabel("FirstName");  
    		l2.setBounds(50,100, 100,30); 

            l3=new JLabel("LastName");  
            l3.setBounds(50,150, 100,30);  

            l4=new JLabel("Address");  
            l4.setBounds(50,200, 100,30);

        
            l5=new JLabel("Email");  
            l5.setBounds(50,250, 100,30);

            l6=new JLabel("Age");  
            l6.setBounds(50,300, 100,30); 

            l9=new JLabel("height(in cm)");  
            l9.setBounds(50,350, 100,30);  

            l10=new JLabel("Weight(in KG)");  
            l10.setBounds(50,400, 100,30);

            l7=new JLabel("Gender");  
            l7.setBounds(50,450, 100,30);
    
            l8=new JLabel("Contact");  
            l8.setBounds(50,500, 100,30);


            l11=new JLabel("PAST DISEASES");  
            l11.setBounds(550,75, 100,20);

		f.add(l1); 
		f.add(l2);  
        f.add(l3); 
        f.add(l4); 
        f.add(l5);  
        f.add(l6); 
        f.add(l7); 
        f.add(l8); 
        f.add(l9); 
        f.add(l10); 
        f.add(l11);
        


JTextField t1,t2,t3,t4,t5,t6,t7;  
            t1=new JTextField("");  
            t1.setBounds(160,100, 200,30);  
            f.add(t1); 

            t2=new JTextField("");  
            t2.setBounds(160,250, 200,30);  
            f.add(t2);

            t3=new JTextField("");  
            t3.setBounds(160,300, 200,30);  
            f.add(t3);

            t4=new JTextField("");  
            t4.setBounds(160,350, 200,30);  
            f.add(t4);

            t5=new JTextField("");  
            t5.setBounds(160,500, 200,30);  
            f.add(t5);
          
            t6=new JTextField("");  
            t6.setBounds(160,150, 200,30);  
            f.add(t6);

            t5=new JTextField("");  
            t5.setBounds(160,400, 200,30);  
            f.add(t5);

JTextArea area=new JTextArea("");  
                area.setBounds(160,200, 200,40);  
        
        f.add(area);  

          

        JRadioButton r1=new JRadioButton("Male");    
        JRadioButton r2=new JRadioButton("Female");    
        JRadioButton r3=new JRadioButton("Others");  
        
        r1.setBounds(160,450,100,30);    
        r2.setBounds(260,450,100,30);   
        r3.setBounds(360,450,100,30);  
        
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);    
        bg.add(r3);
        
        f.add(r1);
        f.add(r2);   
        f.add(r3);  



        JCheckBox checkBox1 = new JCheckBox("Allergies");  
        checkBox1.setBounds(550,100, 100,50);  
        
        JCheckBox checkBox2 = new JCheckBox("Fever");  
        checkBox2.setBounds(550,150, 150,50); 
    
        JCheckBox checkBox3 = new JCheckBox("Nausea");  
        checkBox3.setBounds(550,200, 150,50);

        JCheckBox checkBox4 = new JCheckBox("Hypertension");  
        checkBox4.setBounds(550,250, 200,50);  
        
        JCheckBox checkBox5 = new JCheckBox("Fobia");  
        checkBox5.setBounds(550,300, 250,50); 
    
        JCheckBox checkBox6 = new JCheckBox("Fatigue");  
        checkBox6.setBounds(550,350, 250,50);   
        
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.add(checkBox3);  
        f.add(checkBox4);  
        f.add(checkBox5);  
        f.add(checkBox6); 

        JButton b=new JButton("Cancel");  
            b.setBounds(350,600,90,40);  
            f.add(b);  

            JButton b1=new JButton("SUBMIT");  
            b1.setBounds(500,600,90,40);  
            f.add(b1);
            

    		f.setSize(1000,800);  
    		f.setLayout(null);  
    		f.setVisible(true);  
   	}  
}  