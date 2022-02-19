import java.awt.*;
import javax.swing.*;



class VentanaInicio extends JFrame{
	public VentanaInicio() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setSize(980, 570);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(20, 20, 300, 500);
		
		JLabel txtP1 = new JLabel("The Classic Form includes all visible fields for this list");
		txtP1.setBounds(20, 20, 200, 20);
		txtP1.setFont(new Font("Arial", 0, 12));
		panel1.add(txtP1);
		
		JLabel txtP2 = new JLabel("Form options                                                    ");
		txtP2.setBounds(20, 20, 200, 20);
		txtP2.setFont(new Font("Arial", 0, 14));
		panel1.add(txtP2);
		
		JLabel txtP3 = new JLabel("Include the following:                                                                ");
		txtP3.setBounds(20, 20, 200, 20);
		txtP3.setFont(new Font("Arial", 0, 11));
		panel1.add(txtP3);
		
		JCheckBox checkP1 = new JCheckBox("a title for you form                                                          ");
		panel1.add(checkP1);
		
		JTextField caja1 = new JTextField(27);
		caja1.setBounds(20, 20, 300, 20);
		panel1.add(caja1);
		
		JLabel txtE1 = new JLabel("                                                              ");
		txtE1.setBounds(20, 20, 200, 20);
		panel1.add(txtE1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields                                                      ");
		bg.add(radio1);
		panel1.add(radio1);
		JRadioButton radio2 = new JRadioButton("all fields                                                                          ");
		bg.add(radio2);
		panel1.add(radio2);
		
		JLabel txtP4 = new JLabel("(edit required fields in the form builder)               ");
		txtP4.setBounds(20, 20, 200, 20);
		txtP4.setFont(new Font("Arial", 0, 11));
		panel1.add(txtP4);
		
		JLabel txtE2 = new JLabel("                                                              ");
		txtE2.setBounds(20, 20, 200, 20);
		panel1.add(txtE2);
		
		JCheckBox checkP2 = new JCheckBox("interest group fields                                                        ");
		panel1.add(checkP2);
		JCheckBox checkP3 = new JCheckBox("required field indicators                                                 ");
		panel1.add(checkP3);
		
		JLabel txtE4 = new JLabel("                                                              ");
		txtE4.setBounds(20, 20, 200, 20);
		panel1.add(txtE4);
		
		JLabel txtP5 = new JLabel("Set form widht                                                                           ");
		txtP5.setBounds(20, 20, 200, 20);
		txtP5.setFont(new Font("Arial", 0, 11));
		panel1.add(txtP5);
		
		JTextField caja2 = new JTextField(27);
		caja2.setBounds(20, 20, 200, 20);
		panel1.add(caja2);
		
		JLabel txtP6 = new JLabel("Enchance you form                                                                    ");
		txtP6.setBounds(20, 20, 200, 20);
		txtP6.setFont(new Font("Arial", 0, 11));
		panel1.add(txtP6);
		
		JCheckBox checkP4 = new JCheckBox("enable evil popup mode                                                 ");
		panel1.add(checkP4);
		JCheckBox checkP5 = new JCheckBox("disable all JavaScript (i)info                                         ");
		panel1.add(checkP5);
		JCheckBox checkP6 = new JCheckBox("include archive link (i)info                                             ");
		panel1.add(checkP6);
		JCheckBox checkP7 = new JCheckBox("include MonkeyRewards Link                                      ");
		panel1.add(checkP7);
		
		panel1.setPreferredSize(new Dimension(this.getWidth()/2 - 20, this.getHeight()));
		add(panel1);
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(340, 20, 600, 500);
		
		JLabel txtP7 = new JLabel("Preview                                                                                                                                  ");
		txtP7.setBounds(20, 20, 200, 20);
		txtP7.setFont(new Font("Arial", 0, 16));
		panel2.add(txtP7);
		
		{
			JPanel panel3 = new JPanel();
			panel3.setBounds(20, 40, 20, 20);
			
			JLabel txtE3 = new JLabel("                     ");
			txtE3.setBounds(20, 20, 200, 20);
			txtE3.setFont(new Font("Arial", 0, 11));
			panel3.add(txtE3);
			
			JLabel txtP8 = new JLabel("Email Address                                                                                                                                                ");
			txtP8.setBounds(20, 20, 200, 20);
			txtP8.setFont(new Font("Arial", 0, 12));
			panel3.add(txtP8);
			JTextField caja3 = new JTextField(47);
			caja3.setBounds(20, 20, 300, 20);
			panel3.add(caja3);
			
			JLabel txtP9 = new JLabel("First Name                                                                                                                                                       ");
			txtP9.setBounds(20, 20, 200, 20);
			txtP9.setFont(new Font("Arial", 0, 12));
			panel3.add(txtP9);
			JTextField caja4 = new JTextField(47);
			caja4.setBounds(20, 20, 300, 20);
			panel3.add(caja4);
			
			JLabel txtP10 = new JLabel("Last Name                                                                                                                                                        ");
			txtP10.setBounds(20, 20, 200, 20);
			txtP10.setFont(new Font("Arial", 0, 12));
			panel3.add(txtP10);
			JTextField caja5 = new JTextField(47);
			caja5.setBounds(20, 20, 300, 20);
			panel3.add(caja5);
			
			JButton btn1 = new JButton("Suscribe");
			panel3.add(btn1);
			
			panel3.setPreferredSize(new Dimension(this.getWidth()/2 + 60, this.getHeight()/3 - 40));
			panel2.add(panel3);
		}
		JLabel txtP11 = new JLabel("                                                                                                                            ");
		txtP11.setBounds(20, 20, 200, 20);
		txtP11.setFont(new Font("Arial", 0, 12));
		panel2.add(txtP11);
		
		JLabel txtP12 = new JLabel("Copy/paste onto your site                                                                                             ");
		txtP12.setBounds(20, 20, 200, 20);
		txtP12.setFont(new Font("Arial", 0, 16));
		panel2.add(txtP12);
		
		JTextArea area1 = new JTextArea(10, 49);
		area1.setText("enter the text....");
		area1.setLineWrap(true);
		area1.setWrapStyleWord(true);
		panel2.add(area1);
		
		panel2.setPreferredSize(new Dimension(this.getWidth()/2 - 20, this.getHeight()));
		add(panel2);
	}
}

public class PruebaLayoutNulo {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}
}
