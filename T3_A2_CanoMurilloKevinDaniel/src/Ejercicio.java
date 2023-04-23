import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

class Ventana extends JFrame{
	ArrayList<String> lista = new ArrayList<String>();
	JTextArea areaTexto1, areaTexto2;
	JScrollPane scroll1, scroll2;
	
	public Ventana() {
		getContentPane().setLayout(new FlowLayout());
		setTitle("Tarea de concurrencia");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for(int i=0; i<1000; i++) { //Me explota el PC con 10M de datos pero se cambia el i a 10000000 (Nota se cambia tambien en un set maximum y en la variable "b" en la clase ProgresBar)
			if((int)(Math.random()*10)%2 == 1) {
				lista.add("Si");
			}else {
				lista.add("No");
			}
		}
		areaTexto1=new JTextArea(15,15);
		areaTexto1.setBackground(getForeground().GREEN);
		areaTexto2=new JTextArea(15,15);
		areaTexto2.setBackground(getForeground().RED);
		areaTexto1.setEditable(false);
		areaTexto2.setEditable(false);
		
		scroll1=new JScrollPane(areaTexto1);
		scroll2=new JScrollPane(areaTexto2);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(scroll1);
		panel.setBorder(BorderFactory.createTitledBorder("Coincidencias 'SI´ "));
		add(panel);
		
		add(new JLabel(" "));

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(scroll2);
		panel2.setBorder(BorderFactory.createTitledBorder("Coincidencias 'NO´ "));
		add(panel2);
		
		JProgressBar pb = new JProgressBar(0, 2);
		pb.setValue(0);
		pb.setStringPainted(true);
		pb.setString("---Espera---");
		JProgressBar pb2 = new JProgressBar(0, 2);
		pb2.setValue(0);
		pb2.setStringPainted(true);
		pb2.setString("---Espera---");
		
		Completar comp = new Completar(lista, areaTexto1, areaTexto2, pb, pb2);
		Thread hiloComp = new Thread(comp);
		hiloComp.start();
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.setPreferredSize(new Dimension(200,250));
		panel3.add(new JLabel("Total de Si"));
		panel3.add(pb);
		panel3.add(new JLabel("Total de NO"));
		panel3.add(pb2);
		add(panel3);
		
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	
	}
}

class Completar implements Runnable{
	ArrayList<String> ArLi;
	JTextArea areaTexto1,areaTexto2;
	JProgressBar pb,pb2;
	
	public Completar(ArrayList<String> ArLi, JTextArea areaTexto1, JTextArea areaTexto2, JProgressBar pb,JProgressBar pb2) {
		super();
		this.ArLi = ArLi;
		this.areaTexto1 = areaTexto1;
		this.areaTexto2 = areaTexto2;
		this.pb = pb;
		this.pb2 = pb2;
	}

	@Override
	public void run() {
		long totalSi = 0, totalNo=0;
		for(String posicion: ArLi) {
			if(posicion.equals("Si")) {
				areaTexto1.append((totalSi++) + " " + posicion + "\n");
			}else {
				areaTexto2.append((totalNo++) + " " + posicion + "\n");
			}
				
		}
		
		ProgresBar pb3 = new ProgresBar(pb, totalSi);
		ProgresBar pb4 = new ProgresBar(pb2,totalNo);
		Thread t=new Thread(pb3);
		Thread t2=new Thread(pb4);	
		t.start();
		t2.start();
	}
}

class ProgresBar implements Runnable{
	JProgressBar pb;
	long tam;
	
	
	public ProgresBar(JProgressBar pb, long tam) {
		super();
		this.pb = pb;
		this.tam = tam;
	}
	
	@Override
	public void run() {
		pb.setMaximum(1000);
		
		for(int i=1; i<=tam;i+=10) {
			pb.setString("Calculando...");
			
		pb.setValue(i);
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		   }
	    }
		double porcentaje=0.0;
		double a=tam;
		double b=1000;
		porcentaje=a/b;
		porcentaje=porcentaje*100;
       	pb.setString(porcentaje+"%");
		
	}
	
}

public class Ejercicio {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				new Ventana();
			}
		});
	}
}
