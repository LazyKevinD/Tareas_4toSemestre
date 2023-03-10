import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class ConversorTemperaturas{
	public double CAF(double temperatura){
		return temperatura * 9/5 + 32;
	}
	public double CAK(double temperatura){
		return temperatura + 273.15;
	}
	public double CAR(double temperatura){
		return (temperatura + 32) * 9/5;
	}
	public double FAC(double temperatura){
		return (temperatura - 32) * 5/9;
	}
	public double FAK(double temperatura){
		return (temperatura + 459.67) * 5/9;
	}
	public double FAR(double temperatura){
		return temperatura + 459.67;
	}
	public double KAC(double temperatura){
		return temperatura - 273.15;
	}
	public double KAF(double temperatura){
		return (temperatura * 9/5) - 459.67;
	}
	public double KAR(double temperatura){
		return temperatura * 9/5;
	}
	public double RAC(double temperatura){
		return (temperatura - 491.67) * 5/9;
	}
	public double RAF(double temperatura){
		return (temperatura * 9/5) - 459.67;
	}
	public double RAK(double temperatura){
		return temperatura * 5/9;
	}
}

class VentanaInicio extends JFrame implements ActionListener, KeyListener{

	ConversorTemperaturas c1 = new ConversorTemperaturas();
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	JComboBox<String> comboTemp1, comboTemp2;
	JTextField cajaGrados, cajaResultado;
	Font font1 = new Font("Calibri", Font.BOLD , 14);
	
	
	public VentanaInicio() {			
		getContentPane().setLayout(gbl);
		gbc.insets = new Insets(5,20,5,20);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setSize(300, 280);
		setLocationRelativeTo(null);
		setVisible(true);
		gbc.fill = GridBagConstraints.BOTH;
		
		JLabel txtTitulo = new JLabel("Conversor Temperaturas");
		txtTitulo.setFont(font1);
		alinearElemento(txtTitulo, 0, 0, 4, 1);
		
		JLabel txt1 = new JLabel("Convertir:");
		alinearElemento(txt1, 0, 1, 1, 1);
		
		cajaGrados = new JTextField(3);
		alinearElemento(cajaGrados, 1, 1, 1, 1);
		cajaGrados.addKeyListener(this);
		
        comboTemp1 = new JComboBox<String>();
        comboTemp1.addItem("Seleccione una....");
        comboTemp1.addItem("°C");
		comboTemp1.addItem("°F");
		comboTemp1.addItem("°K");
		comboTemp1.addItem("°R");
		alinearElemento(comboTemp1, 2, 1, 1, 1);
		comboTemp1.addActionListener(this);
		
		JLabel txt2 = new JLabel("A:");
		alinearElemento(txt2, 0, 2, 1, 1);
		
        comboTemp2 = new JComboBox<String>();
        comboTemp2.addItem("Seleccione una....");
        comboTemp2.addItem("°C");
		comboTemp2.addItem("°F");
		comboTemp2.addItem("°K");
		comboTemp2.addItem("°R");
		alinearElemento(comboTemp2, 1, 2, 1, 1);
		comboTemp2.addActionListener(this);
		
		JLabel txt3 = new JLabel("=");
		alinearElemento(txt3, 3, 2, 1, 1);
		
		cajaResultado = new JTextField(6);
		cajaResultado.setEditable(false);
		cajaResultado.setFont(font1);
		alinearElemento(cajaResultado, 4, 2, 1, 1);
		
		pack();
			
	}
		
	public void alinearElemento(Component c, int x, int y, int w, int h) {
			gbc.gridx = x;
			gbc.gridy = y;
			gbc.gridwidth = w;
			gbc.gridheight = h;
			gbl.setConstraints(c, gbc);
			add(c);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		boolean s = cajaGrados.getText().contains(".");
		char car = e.getKeyChar();
		if(!(car == '.' && s == false) && (car<'0' || car>'9'))
			e.consume();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			byte index1 = (byte) comboTemp1.getSelectedIndex();
			byte index2 = (byte) comboTemp2.getSelectedIndex();
			
			double grados = Double.parseDouble(cajaGrados.getText());
				
			if (e.getSource() == comboTemp2 || e.getSource() == comboTemp1) {
				if(index1 == index2) {
					cajaResultado.setText(cajaGrados.getText());
				}else if (index1 == 1 && index2 == 2) {
					cajaResultado.setText(String.valueOf(c1.CAF(grados)));
				}else if (index1 == 1 && index2 == 3) {
					cajaResultado.setText(String.valueOf(c1.CAK(grados)));
				}else if (index1 == 1 && index2 == 4) {
					cajaResultado.setText(String.valueOf(c1.CAR(grados)));
				}else if (index1 == 2 && index2 == 1) {
					cajaResultado.setText(String.valueOf(c1.FAC(grados)));
				}else if (index1 == 2 && index2 == 3) {
					cajaResultado.setText(String.valueOf(c1.FAK(grados)));
				}else if (index1 == 2 && index2 == 4) {
					cajaResultado.setText(String.valueOf(c1.FAR(grados)));
				}else if (index1 == 3 && index2 == 1) {
					cajaResultado.setText(String.valueOf(c1.KAC(grados)));
				}else if (index1 == 3 && index2 == 2) {
					cajaResultado.setText(String.valueOf(c1.KAF(grados)));
				}else if (index1 == 3 && index2 == 4) {
					cajaResultado.setText(String.valueOf(c1.KAR(grados)));
				}else if (index1 == 4 && index2 == 1) {
					cajaResultado.setText(String.valueOf(c1.RAC(grados)));
				}else if (index1 == 4 && index2 == 2) {
					cajaResultado.setText(String.valueOf(c1.RAF(grados)));
				}else if (index1 == 4 && index2 == 3) {
					cajaResultado.setText(String.valueOf(c1.RAK(grados)));
				}
			}
		} catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(getContentPane(), "Recuerda que Primero Necesitas un Numero de una Temperatura a Convertir");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class ConversorComboBox {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {				
				new VentanaInicio();
			}
		});
	}
}
