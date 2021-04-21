import javax.swing.*;  
class developer
{  
	public static void main(String args[])  
    	{  
    		JFrame f= new JFrame("SURVEY FORM");  
    		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;  

    		 l1=new JLabel("YOU ARE?");  
            l1.setBounds(1100,75, 300,20);
    
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


            l7=new JLabel("Gender");  
            l7.setBounds(50,350, 100,30);
    
            l8=new JLabel("Contact");  
            l8.setBounds(50,400, 100,30);


            l9=new JLabel("PAST EXPERIENCES");  
            l9.setBounds(550,75, 200,20);

            l10=new JLabel("PREFFERED CODING TIME");  
            l10.setBounds(850,75, 300,20);

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

            JTextField t1,t2,t3,t4,t5;  
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
            t4.setBounds(160,400, 200,30);  
            f.add(t4);
          
            t5=new JTextField("");  
            t5.setBounds(160,150, 200,30);  
            f.add(t5);


            JTextArea area=new JTextArea("");  
            area.setBounds(160,200, 200,40);  
            f.add(area);  

          
        JRadioButton r1=new JRadioButton("Male");    
        JRadioButton r2=new JRadioButton("Female");    
        JRadioButton r3=new JRadioButton("Others");  
        
        r1.setBounds(160,350,100,30);    
        r2.setBounds(260,350,100,30);   
        r3.setBounds(360,350,100,30);  
        
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);    
        bg.add(r3);
        
        f.add(r1);
        f.add(r2);   
        f.add(r3);  


        JRadioButton r4=new JRadioButton("Early Morning");    
        JRadioButton r5=new JRadioButton("Mid-Day");    
        JRadioButton r6=new JRadioButton("Late Night");  
        
        r4.setBounds(850,150,200,30);    
        r5.setBounds(850,200,100,30);   
        r6.setBounds(850,250,100,30);  
        
        ButtonGroup bg1=new ButtonGroup();    
        bg1.add(r4);
        bg1.add(r5);    
        bg1.add(r6);
        
        f.add(r4);
        f.add(r5);   
        f.add(r6);  



        JCheckBox checkBox1 = new JCheckBox("SWIFT");  
        checkBox1.setBounds(550,100, 100,50);  
        
        JCheckBox checkBox2 = new JCheckBox("C");  
        checkBox2.setBounds(550,150, 150,50); 
    
        JCheckBox checkBox3 = new JCheckBox("C#");  
        checkBox3.setBounds(550,200, 150,50);

        JCheckBox checkBox4 = new JCheckBox("Hadoop");  
        checkBox4.setBounds(550,250, 200,50);  
        
        JCheckBox checkBox5 = new JCheckBox("Lisp");  
        checkBox5.setBounds(550,300, 250,50); 
    
        JCheckBox checkBox6 = new JCheckBox("JAVA");  
        checkBox6.setBounds(550,350, 250,50);   
        
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.add(checkBox3);  
        f.add(checkBox4);  
        f.add(checkBox5);  
        f.add(checkBox6); 


        JCheckBox checkBox7 = new JCheckBox("Web Developer");  
        checkBox7.setBounds(1100,100, 400,50);  
        
        JCheckBox checkBox8 = new JCheckBox("App Developer");  
        checkBox8.setBounds(1100,150, 450,50); 
    
        JCheckBox checkBox9 = new JCheckBox("FullStack Developer");  
        checkBox9.setBounds(1100,200, 450,50);

        JCheckBox checkBox10 = new JCheckBox("Backend Developer");  
        checkBox10.setBounds(1100,250, 400,50);  
        
        JCheckBox checkBox11 = new JCheckBox("DevOps Developer");  
        checkBox11.setBounds(1100,300, 450,50); 
    
        JCheckBox checkBox12 = new JCheckBox("Software Developer");  
        checkBox12.setBounds(1100,350, 450,50);   
        
        f.add(checkBox7);  
        f.add(checkBox8);  
        f.add(checkBox9);  
        f.add(checkBox10);  
        f.add(checkBox11);  
        f.add(checkBox12);


        JButton b=new JButton("Cancel");  
        b.setBounds(550,600,90,40);  
        f.add(b);  

        JButton b1=new JButton("SUBMIT");  
        b1.setBounds(750,600,90,40);  
        f.add(b1);
            

    	f.setSize(1000,800);  
    	f.setLayout(null);  
    	f.setVisible(true);  
   	}  
}  