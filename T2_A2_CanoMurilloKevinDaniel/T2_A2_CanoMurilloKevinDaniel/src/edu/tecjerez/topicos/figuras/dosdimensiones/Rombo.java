package edu.tecjerez.topicos.figuras.dosdimensiones;


public class Rombo {
	
	private double lado;
	private double D;
	private double d;
	
	public Rombo(double lado, double D, double d) {
		this.lado = lado;
		this.d = d;
		this.D = D;
	}
	
	public double area() {
		return D*d/2;
	}
	
	public double perimetro() {
		return 4*lado;
	}

}
