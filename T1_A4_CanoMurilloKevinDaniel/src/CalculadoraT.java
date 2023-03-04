import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
class VentanaInicio extends JFrame implements ActionListener, KeyListener{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	JButton btnSum, btnRes, btnMul, btnDiv;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	JButton btnSqrt, btnPer, btnPow2, btnPowN1;
	JButton btnClear, btnBack, btnSim, btnPnt, btnEql;
	JTextField op1;
	Font f1 = new Font("Arial", 1, 26);
	Font f2 = new Font("Arial", 1, 16);
	
	Double num1, num2;
	String cad = "0";
	byte oper = 0, oper2, punto = 0, sim = 0, igual = 0;
	
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		
		if(c == btn0) {
			comp0("0");
		}else if(c == btn1) {
			comp0("1");
		}else if(c == btn2) {
			comp0("2");
		}else if(c == btn3) {
			comp0("3");
		}else if(c == btn4) {
			comp0("4");
		}else if(c == btn5) {
			comp0("5");
		}else if(c == btn6) {
			comp0("6");
		}else if(c == btn7) {
			comp0("7");
		}else if(c == btn8) {
			comp0("8");
		}else if(c == btn9) {
			comp0("9");
		}else if(c == btnPnt) {
			if(punto == 0) {
				cad = cad + ".";
				punto = 1;
			}
			op1.setText(cad);
		}else if(c == btnSim) {
			if(sim == 0) {
				cad = "-" + cad;
				sim = 1;
			}else {
				cad = cad.substring(1);
				sim = 0;
			}
			op1.setText(cad);
		}else if(c == btnBack) {
			if(cad.length() > 1 && cad != "0") {
				cad = cad.substring(0, cad.length()-1);
			}else if(cad.length() == 1){
				cad = "0";
			}
			op1.setText(cad);
		}else if(c == btnClear) {
			cad = "0";
			sim = 0;
			oper = 0;
			punto = 0;
			num1 = 0.0;
			num2 = 0.0;
			igual = 0;
			op1.setFont(f1);
			op1.setText("0");
		}else if(c == btnSum) {
			operBas();
			oper = 1;
			igual = 0;
			cad = "0";
		}else if(c == btnRes) {
			operBas();
			oper = 2;
			igual = 0;
			cad = "0";
		}else if(c == btnMul) {
			operBas();
			oper = 3;
			igual = 0;
			cad = "0";
		}else if(c == btnDiv) {
			operBas();
			oper = 4;
			igual = 0;
			cad = "0";
		}else if(c == btnPer) {
			oper2 = oper;
			oper = 5;
			operBas();
			oper = oper2;
			op1.setText(cad);
		}else if(c == btnSqrt) {
			oper2 = oper;
			oper = 6;
			operBas();
			oper = oper2;
			op1.setText(cad);
		}else if(c == btnPow2) {
			oper2 = oper;
			oper = 7;
			operBas();
			oper = oper2;
			op1.setText(cad);
		}else if(c == btnPowN1) {
			oper2 = oper;
			oper = 8;
			operBas();
			oper = oper2;
			op1.setText(cad);
		}else if(c == btnEql) {
			if(oper != 0) {
				if(igual == 0) {
					operBas();
					oper = 0;
					igual = 1;
				}
			}
		}
	}

	public void comp0(String n) {
		if(cad!="0") {
			cad = cad + n;
		}else {
			cad = n;
		}
		op1.setText(cad);
	}
	
	public void redondeo() {
		if(cad.length()>2 && cad.length()<12) {
			if(cad.substring(cad.length()-2, cad.length()).equals(".0")) {
				cad = cad.substring(0, cad.length()-2);
			}
		}else if(cad.length()>13) {
			if(cad.substring(cad.length()-2, cad.length()).equals(".0")) {
				cad = cad.substring(0, cad.length()-2);
			}
			op1.setFont(f2);
		}
		op1.setText(cad);
	}

	public void operBas() {
		switch(oper) {
		case 0:
			num1 = Double.parseDouble(cad);
			cad = "0";
		break;
		case 1:
			num2 = Double.parseDouble(cad);
			num1 = num1 + num2;
			cad = String.valueOf(num1);
			redondeo();
		break;
		case 2:
			num2 = Double.parseDouble(cad);
			num1 = num1 - num2;
			cad = String.valueOf(num1);
			redondeo();
		break;
		case 3:
			num2 = Double.parseDouble(cad);
			num1 = num1 * num2;
			cad = String.valueOf(num1);
			redondeo();
		break;
		case 4:
			if(cad.equals("0")) {
				JOptionPane.showMessageDialog(op1, "No se puede dividir entre 0");
			}else {
				num2 = Double.parseDouble(cad);
				num1 = num1 / num2;
				cad = String.valueOf(num1);
				redondeo();
			}
		break;
		case 5:
			cad = String.valueOf(Double.parseDouble(cad)/100.0);
			redondeo();
		break;
		case 6:
			if(cad.charAt(0)=='-') {
				JOptionPane.showMessageDialog(op1, "No existes las raices cuadradas de numeros negativos");
			}else {
				cad = String.valueOf(Math.sqrt(Double.parseDouble(cad)));
				redondeo();
			}
		break;
		case 7:
			cad = String.valueOf(Math.pow(Double.parseDouble(cad),2));
			redondeo();
		break;
		case 8:
			cad = String.valueOf(Double.parseDouble(cad)*1.0);
			redondeo();
			if(cad.equals("0")) {
				JOptionPane.showMessageDialog(op1, "No se puede dividir entre 0");
			}else {
				cad = String.valueOf(Math.pow(Double.parseDouble(cad),-1));
				redondeo();
			}
		break;
		}
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if(c>=48 && c<=57) { //numeros encima de las letras
			comp0(String.valueOf(e.getKeyChar()));
		}else if(c>=96 && c<=105) { //numeros de la parte derecha del teclado
			comp0(String.valueOf(e.getKeyChar()));
		}else if(c==8 || c==111 || c==106 || c==109 || c==107 || c==110 || c==10) { //operaciones del teclado derecho y el back y enter
			switch(c) {
				case 8: 
					if(cad.length() > 1 && cad != "0") {
						cad = cad.substring(0, cad.length()-1);
					}else if(cad.length() == 1){
						cad = "0";
					}
					op1.setText(cad);
				break;
				case 111: 
					operBas();
					oper = 4;
					igual = 0;
					cad = "0";
				break;
				case 106: 
					operBas();
					oper = 3;
					igual = 0;
					cad = "0";
				break;
				case 109: 
					operBas();
					oper = 2;
					igual = 0;
					cad = "0";
				break;	
				case 107: 
					operBas();
					oper = 1;
					igual = 0;
					cad = "0";
				break;
				case 110: 
					if(punto == 0) {
						cad = cad + ".";
						punto = 1;
					}
				break;
				case 10: 
					if(oper != 0) {
						if(igual == 0) {
							operBas();
							oper = 0;
							igual = 1;
						}
					}
				break;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		setResizable(false);

		
		//Caja de Texto--------------------------------------------------------------------
		op1 = new JTextField("0");
		op1.setEditable(false);
		op1.setHorizontalAlignment(JTextField.RIGHT);
		op1.addKeyListener(this);
		metodoAcomodo(op1, 0, 0, 4, 1);
		op1.setFont(f1);
		//1ra fila--------------------------------------------------------------------------
		btnPer = new JButton("%");
		btnPer.addActionListener(this);
		metodoAcomodo(btnPer, 0, 1, 1, 1);

		btnSqrt = new JButton("V");
		btnSqrt.addActionListener(this);
		metodoAcomodo(btnSqrt, 1, 1, 1, 1);

		btnPow2 = new JButton("x2");
		btnPow2.addActionListener(this);
		metodoAcomodo(btnPow2, 2, 1, 1, 1);

		btnPowN1 = new JButton("1/x");
		btnPowN1.addActionListener(this);
		metodoAcomodo(btnPowN1, 3, 1, 1, 1);
		//2da fila--------------------------------------------------------------------------
		btnClear = new JButton("CE");
		btnClear.addActionListener(this);
		metodoAcomodo(btnClear, 0, 2, 2, 1);
		
		btnBack = new JButton("<=");
		btnBack.addActionListener(this);
		metodoAcomodo(btnBack, 2, 2, 1, 1);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		metodoAcomodo(btnDiv, 3, 2, 1, 1);
		//3ra fila--------------------------------------------------------------------------
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		metodoAcomodo(btn7, 0, 3, 1, 1);
		
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		metodoAcomodo(btn8, 1, 3, 1, 1);
		
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		metodoAcomodo(btn9, 2, 3, 1, 1);
		
		btnMul = new JButton("x");
		btnMul.addActionListener(this);
		metodoAcomodo(btnMul, 3, 3, 1, 1);
		//4ta fila--------------------------------------------------------------------------
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		metodoAcomodo(btn4, 0, 4, 1, 1);
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		metodoAcomodo(btn5, 1, 4, 1, 1);
		
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		metodoAcomodo(btn6, 2, 4, 1, 1);
		
		btnRes = new JButton("-");
		btnRes.addActionListener(this);
		metodoAcomodo(btnRes, 3, 4, 1, 1);
		//5ta fila--------------------------------------------------------------------------
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		metodoAcomodo(btn1, 0, 5, 1, 1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		metodoAcomodo(btn2, 1, 5, 1, 1);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		metodoAcomodo(btn3, 2, 5, 1, 1);
		
		btnSum = new JButton("+");
		btnSum.addActionListener(this);
		metodoAcomodo(btnSum, 3, 5, 1, 1);
		//6ta fila--------------------------------------------------------------------------
		btnSim = new JButton("±");
		btnSim.addActionListener(this);
		metodoAcomodo(btnSim, 0, 6, 1, 1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(this);
		metodoAcomodo(btn0, 1, 6, 1, 1);
		
		btnPnt = new JButton(".");
		btnPnt.addActionListener(this);
		metodoAcomodo(btnPnt, 2, 6, 1, 1);
		
		btnEql = new JButton("=");
		btnEql.addActionListener(this);
		metodoAcomodo(btnEql, 3, 6, 1, 1);
		
		
		
		pack();
	}
	
	public void metodoAcomodo(Component c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
		c.setFont(f2);
		add(c);
	}
}

public class CalculadoraT {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
		System.out.println();
	}
}
