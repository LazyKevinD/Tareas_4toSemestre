import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

class VentanaInicio extends JFrame {

	GridBagLayout gbl0 = new GridBagLayout();
	GridBagConstraints gbc0 = new GridBagConstraints();
	GridBagLayout gbl1 = new GridBagLayout();
	GridBagConstraints gbc1 = new GridBagConstraints();
	GridBagLayout gbl2 = new GridBagLayout();
	GridBagConstraints gbc2 = new GridBagConstraints();
	GridBagLayout gbl3 = new GridBagLayout();
	GridBagConstraints gbc3 = new GridBagConstraints();
	GridBagLayout gbl4 = new GridBagLayout();
	GridBagConstraints gbc4 = new GridBagConstraints();
	GridBagLayout gbl5 = new GridBagLayout();
	GridBagConstraints gbc5 = new GridBagConstraints();
	
	JInternalFrame IF_Pac;
	
	Font f1 = new Font("Arial", 1, 26);
	Font f2 = new Font("Arial", 1, 14);

	
	public VentanaInicio() {
		getContentPane().setLayout(gbl0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		//setSize(1000,1000);
		//setResizable(false);

//---------------------------------MENU BAR------------------------------------------------------------------	
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Masters");
		menuBar.add(menu1);
		JMenu menu2 = new JMenu("Booking");
		menuBar.add(menu2);
		JMenu menu3 = new JMenu("Test Perform");
		menuBar.add(menu3);
		JMenu menu4 = new JMenu("Printing");
		menuBar.add(menu4);
		JMenu menu5 = new JMenu("Transaction");
		menuBar.add(menu5);
		JMenu menu6 = new JMenu("Lab Reports");
		menuBar.add(menu6);
		JMenu menu7 = new JMenu("Settings");
		menuBar.add(menu7);
		JMenu menu8 = new JMenu("Utilities");
		menuBar.add(menu8);
		JMenu menu9 = new JMenu("Windows");
		menuBar.add(menu9);
		JMenu menu10 = new JMenu("Web");
		menuBar.add(menu10);
		
		setJMenuBar(menuBar);
//---------------------------------TOOL BAR------------------------------------------------------------------
		JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
		
		JButton btnToolBar1 = new JButton("Add");
		btnToolBar1.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar1);
		JButton btnToolBar2 = new JButton("Edit");
		btnToolBar2.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar2);
		JButton btnToolBar3 = new JButton("Back");
		btnToolBar3.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar3);
		JButton btnToolBar4 = new JButton("Next");
		btnToolBar4.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar4);
		JButton btnToolBar5 = new JButton("List");
		btnToolBar5.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar5);
		JButton btnToolBar6 = new JButton("Save");
		btnToolBar6.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar6);
		JButton btnToolBar7 = new JButton("Print");
		btnToolBar7.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar7);
		JButton btnToolBar8 = new JButton("Test");
		btnToolBar8.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar8);
		JButton btnToolBar9 = new JButton("Cancel");
		btnToolBar9.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar9);
		JButton btnToolBar10 = new JButton("Settings");
		btnToolBar10.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar10);
		JButton btnToolBar11 = new JButton("Delete");
		btnToolBar11.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar11);
		JButton btnToolBar12 = new JButton("Slip");
		btnToolBar12.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar12);
		JButton btnToolBar13 = new JButton("Exit");
		btnToolBar13.setIcon(new ImageIcon("./assets/save.png"));
		toolBar.add(btnToolBar13);
		
		//metodoAcomodo(toolBar, 0,0,2,1);
//---------------------------------PANEL 1-------------------------------------------------------------------
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(gbl1);
		
		
		panel1.setBackground(Color.WHITE);
		
		JLabel lblP1_1 = new JLabel("Patient ID");
		metodoAcomodoPanel(lblP1_1,0,0,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_1 = new JTextField(7);
		metodoAcomodoPanel(txtP1_1,1,0,2,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_2 = new JLabel("Date");
		metodoAcomodoPanel(lblP1_2,4,0,1,1, gbl1, gbc1, panel1);
		JComboBox comboP1_1 = new JComboBox<String>();
		comboP1_1.addItem("02/12/2012");
		metodoAcomodoPanel(comboP1_1,6,0,3,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_3 = new JLabel("* Time(hh:mm)");
		metodoAcomodoPanel(lblP1_3,9,0,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_2 = new JTextField("0",2);
		metodoAcomodoPanel(txtP1_2,10,0,1,1, gbl1, gbc1, panel1);
		JLabel lblP1_4 = new JLabel(":");
		metodoAcomodoPanel(lblP1_4,11,0,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_3 = new JTextField("0",2);
		metodoAcomodoPanel(txtP1_3,12,0,1,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_5 = new JLabel("Lab No");
		metodoAcomodoPanel(lblP1_5,14,0,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_4 = new JTextField(7);
		metodoAcomodoPanel(txtP1_4,15,0,2,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_6 = new JLabel("Name");
		metodoAcomodoPanel(lblP1_6,0,1,1,1, gbl1, gbc1, panel1);
		JComboBox comboP1_2 = new JComboBox<String>();
		comboP1_2.addItem("MR.");
		metodoAcomodoPanel(comboP1_2,1,1,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_5 = new JTextField();
		metodoAcomodoPanel(txtP1_5,2,1,6,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_7 = new JLabel("Sex");
		metodoAcomodoPanel(lblP1_7,0,2,1,1, gbl1, gbc1, panel1);
		JComboBox comboP1_3 = new JComboBox<String>();
		comboP1_3.addItem("MALE");
		metodoAcomodoPanel(comboP1_3,1,2,1,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_8 = new JLabel("Age");
		metodoAcomodoPanel(lblP1_8,2,2,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_6 = new JTextField("0",2);
		metodoAcomodoPanel(txtP1_6,3,2,1,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_9 = new JLabel("Mons");
		metodoAcomodoPanel(lblP1_9,4,2,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_7 = new JTextField("0",2);
		metodoAcomodoPanel(txtP1_7,5,2,1,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_10 = new JLabel("Days");
		metodoAcomodoPanel(lblP1_10,6,2,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_8 = new JTextField("0",2);
		metodoAcomodoPanel(txtP1_8,7,2,1,1, gbl1, gbc1, panel1);

		JLabel lblP1_11 = new JLabel("Sample By");
		metodoAcomodoPanel(lblP1_11,9,2,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_9 = new JTextField(8);
		metodoAcomodoPanel(txtP1_9,10,2,4,1, gbl1, gbc1, panel1);
		
		JLabel lblP1_12 = new JLabel("Referred By");
		metodoAcomodoPanel(lblP1_12,0,3,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_10 = new JTextField();
		metodoAcomodoPanel(txtP1_10,1,3,2,1, gbl1, gbc1, panel1);
		JTextField txtP1_11 = new JTextField();
		txtP1_11.setEditable(false);
		metodoAcomodoPanel(txtP1_11,4,3,4,1, gbl1, gbc1, panel1);


		JLabel lblP1_13 = new JLabel("Panel Code");
		metodoAcomodoPanel(lblP1_13,9,3,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_12 = new JTextField(8);
		metodoAcomodoPanel(txtP1_12,10,3,4,1, gbl1, gbc1, panel1);

		JLabel lblP1_14 = new JLabel("Panel ID");
		metodoAcomodoPanel(lblP1_14,9,4,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_13 = new JTextField(8);
		metodoAcomodoPanel(txtP1_13,10,4,4,1, gbl1, gbc1, panel1);

		JLabel lblP1_15 = new JLabel("e-mail");
		metodoAcomodoPanel(lblP1_15,9,5,1,1, gbl1, gbc1, panel1);
		JTextField txtP1_14 = new JTextField(8);
		metodoAcomodoPanel(txtP1_14,10,5,4,1, gbl1, gbc1, panel1);
		
		//metodoAcomodo(panel1, 0,1,2,1);

//---------------------------------PANEL 2-------------------------------------------------------------------
		JPanel panel2 = new JPanel();
		panel2.setLayout(gbl2);
		panel2.setBackground(Color.WHITE);
		
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		panel2.setLayout(new BorderLayout());
		panel2.add(table.getTableHeader(), BorderLayout.PAGE_START);
		panel2.add(table, BorderLayout.CENTER);
	
		//metodoAcomodo(panel2, 0,2,1,1);


//---------------------------------PANEL 3-------------------------------------------------------------------
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(gbl3);
		panel3.setBackground(Color.WHITE);
		
		JLabel lblP3_1 = new JLabel("Total Less");
		metodoAcomodoPanel(lblP3_1,0,0,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_1 = new JTextField(8);
		txtP3_1.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_1,1,0,1,1, gbl3, gbc3, panel3);
	
		JLabel lblP3_2 = new JLabel("Lest Amt.");
		metodoAcomodoPanel(lblP3_2,0,1,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_2 = new JTextField(8);
		txtP3_2.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_2,1,1,1,1, gbl3, gbc3, panel3);

		JLabel lblP3_3 = new JLabel("Concession");
		metodoAcomodoPanel(lblP3_3,0,2,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_3 = new JTextField(8);
		txtP3_3.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_3,1,2,1,1, gbl3, gbc3, panel3);

		JLabel lblP3_4 = new JLabel("Home Collection");
		metodoAcomodoPanel(lblP3_4,0,3,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_4 = new JTextField(8);
		txtP3_4.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_4,1,3,1,1, gbl3, gbc3, panel3);

		JLabel lblP3_5 = new JLabel("Tax Amt");
		metodoAcomodoPanel(lblP3_5,0,4,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_5 = new JTextField(8);
		txtP3_5.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_5,1,4,1,1, gbl3, gbc3, panel3);

		JLabel lblP3_6 = new JLabel("Net Amt");
		metodoAcomodoPanel(lblP3_6,0,5,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_6 = new JTextField(8);
		txtP3_6.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_6,1,5,1,1, gbl3, gbc3, panel3);

		JLabel lblP3_7 = new JLabel("Balance");
		metodoAcomodoPanel(lblP3_7,0,6,1,1, gbl3, gbc3, panel3);
		JTextField txtP3_7 = new JTextField(8);
		txtP3_7.setBackground(Color.BLUE);
		metodoAcomodoPanel(txtP3_7,1,6,1,1, gbl3, gbc3, panel3);
	
		//metodoAcomodo(panel3, 1,2,1,1);
//---------------------------------PANEL 4-------------------------------------------------------------------
		JPanel panel4 = new JPanel();
		panel4.setLayout(gbl4);
		panel4.setBackground(Color.WHITE);
		
		JLabel lblP4_1 = new JLabel("Home Collection");
		metodoAcomodoPanel(lblP4_1,0,0,1,1, gbl4, gbc4, panel4);
		JTextField txtP4_1 = new JTextField(4);
		metodoAcomodoPanel(txtP4_1,1,0,1,1, gbl4, gbc4, panel4);

		JLabel lblP4_2 = new JLabel("Paid");
		metodoAcomodoPanel(lblP4_2,2,0,1,1, gbl4, gbc4, panel4);
		JTextField txtP4_2 = new JTextField("0",4);
		metodoAcomodoPanel(txtP4_2,3,0,1,1, gbl4, gbc4, panel4);

		JLabel lblP4_3 = new JLabel("Pay Tipe");
		metodoAcomodoPanel(lblP4_3,4,0,1,1, gbl4, gbc4, panel4);
		JComboBox comboP4_1 = new JComboBox<String>();
		comboP4_1.addItem("CASH");
		metodoAcomodoPanel(comboP4_1,5,0,1,1, gbl4, gbc4, panel4);

		JLabel lblP4_4 = new JLabel("Receipt No.");
		metodoAcomodoPanel(lblP4_4,6,0,1,1, gbl4, gbc4, panel4);
		JTextField txtP4_3 = new JTextField(8);
		metodoAcomodoPanel(txtP4_3,7,0,1,1, gbl4, gbc4, panel4);
		
		JTextArea txtAreaP4_1 = new JTextArea(3,3);
		txtAreaP4_1.setBackground(Color.BLUE);
		txtAreaP4_1.setText("Muchos comandos.....");/*
		txtAreaP4_1.setWrapStyleWord(true);
		txtAreaP4_1.setLineWrap(true);*/
		metodoAcomodoPanel(txtAreaP4_1,0,1,10,1, gbl4, gbc4, panel4);
	
		//metodoAcomodo(panel4, 0,3,2,1);
//----------------------INTERNAL FRAME-----------------------------------------------------------------
				IF_Pac = new JInternalFrame();
				IF_Pac.getContentPane().setLayout(gbl5);
				IF_Pac.setDefaultCloseOperation(HIDE_ON_CLOSE);
				IF_Pac.setVisible(true);
				IF_Pac.setClosable(true);
				IF_Pac.setMaximizable(true);
				IF_Pac.setIconifiable(true);
				IF_Pac.setResizable(true);


				metodoAcomodo2(toolBar, 0,0,1,1);
				metodoAcomodo2(panel1, 0,1,1,1);
				metodoAcomodo2(panel2, 0,2,2,1);
				metodoAcomodo2(panel3, 2,2,1,1);
				metodoAcomodo2(panel4, 0,3,1,1);
				
				
				metodoAcomodo(IF_Pac, 0, 4, 1, 1);

//---------------------------------FIN -------------------------------------------------------------------
		
		pack();
	}
	
	public void metodoAcomodo(Component c, int x, int y, int w, int h) {
		gbc0.gridx = x;
		gbc0.gridy = y;
		gbc0.gridwidth = w;
		gbc0.gridheight = h;
		gbc0.fill = GridBagConstraints.HORIZONTAL;
		gbl0.setConstraints(c, gbc0);
		c.setFont(f2);
		add(c);
	}
	public void metodoAcomodo2(Component c, int x, int y, int w, int h) {
		gbc5.gridx = x;
		gbc5.gridy = y;
		gbc5.gridwidth = w;
		gbc5.gridheight = h;
		gbc5.fill = GridBagConstraints.HORIZONTAL;
		gbl5.setConstraints(c, gbc5);
		c.setFont(f2);
		IF_Pac.add(c);
	}
	public void metodoAcomodoPanel(Component c, int x, int y, int w, int h, GridBagLayout gbl, GridBagConstraints gbc, JPanel panel) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
		c.setFont(f2);
		panel.add(c);
	}	
}
	

public class programaGUI {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}
}
