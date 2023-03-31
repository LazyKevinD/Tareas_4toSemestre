import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.tecjerez.topicos.figuras.dosdimensiones.*;
import edu.tecjerez.topicos.figuras.tresdimensiones.*;
import edu.tecjerez.topicos.figuras.Figuras;
import edu.tecjerez.topicos.figuras.Triangulo;
import edu.tecjerez.topicos.geometria.Punto;

public class Ventana extends JFrame implements ActionListener{

	JComboBox <String>combo;
	JButton btn = new JButton("Seleccionar");
	
	
	public Ventana() {

		getContentPane().setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Figuras");
		
		String elementos[] = {"Circulo", "Elipse", "Rombo", "Cono", "Triangulo", "Piramide"}; 
		combo = new JComboBox<String>(elementos);
		
		add(combo);
		add(btn);
		
		btn.addActionListener(this);
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			String item = (String)combo.getSelectedItem();
			
			if(item.equals("Circulo")) {
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio: "));
				
				Circulo c = new Circulo(radio);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(c.area())+"\nPerimetro: "+String.valueOf(c.perimetro()));
			}else if(item.equals("Rombo")) {
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce un lado: "));
				double d = Double.parseDouble(JOptionPane.showInputDialog("Introduce diagonal menor: "));
				double D = Double.parseDouble(JOptionPane.showInputDialog("Introduce diagonal mayor: "));
				
				Rombo r = new Rombo(lado, D, d);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(r.area())+"\nPerimetro: "+String.valueOf(r.perimetro()));
			}else if(item.equals("Cono")) {
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio: "));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));
				double generatriz = Double.parseDouble(JOptionPane.showInputDialog("Introduce generatriz: "));
				
				Rombo r = new Rombo(radio, altura, generatriz);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(r.area())+"\nPerimetro: "+String.valueOf(r.perimetro()));
			}else if(item.equals("Elipse")) {
				double radioMa = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio mayor: "));
				double radioMe = Double.parseDouble(JOptionPane.showInputDialog("Introduce un radio menor: "));
				
                Elipse el = new Elipse(radioMa, radioMe);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(el.area())+"\nPerimetro: "+String.valueOf(el.perimetro()));
			}else if(item.equals("Triangulo")) {
				double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado 1: "));
				double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado 2: "));
				double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce lado 3: "));
				
                Triangulo t = new Triangulo(lado1, lado2, lado3);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(t.area())+"\nPerimetro: "+String.valueOf(t.perimetro()));
			}else {
				double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor de a: "));
				double a2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor de a': "));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));
				
                Piramide p = new Piramide(a, a2, altura);
				JOptionPane.showMessageDialog(null, "Area: "+String.valueOf(p.area())+"\nVolumen: "+String.valueOf(p.volumen()));
			}	
		}	
	}
}
