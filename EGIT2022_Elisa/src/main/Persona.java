package main;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void cumpleaños() {
		int edadactual = this.edad+1;
		System.out.println(edadactual);
	}
}
