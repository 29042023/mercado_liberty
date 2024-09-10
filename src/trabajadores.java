import javax.swing.JOptionPane;

public class trabajadores {
	String nombre;
	String mail;
	String contraseña;
	double salario;
	
	public trabajadores(String nombre, String mail, String contraseña, double salario) {
		this.nombre = nombre;
		this.mail = mail;
		this.contraseña = contraseña;
		this.salario = salario;
	}
	
	public trabajadores(String nombre, String mail, String contraseña) {
		this.nombre = nombre;
		this.mail = mail;
		this.contraseña = contraseña;
	}
	
	public trabajadores(String nombre, double contraseña) {
		this.nombre = nombre;
		this.contraseña = "default";
	
	}
	
	public trabajadores(String nombre) {
		this.nombre = nombre;
		this.contraseña = "default";
		
	}
	
	public String toString() {
		return "Nombre de la cuenta = " + nombre ;
	}
	
	public String tusdatos() {
		return "Tu nombre es = " + nombre + " tu mail dentro de la empresa es " + mail ;
	}
	
	 public void ingresar(double monto) {
	        if (monto > 0) {
	        salario += monto;
	        } else {
	            JOptionPane.showMessageDialog(null, "El monto a ingresar en la cuenta no es valido");
	        }
	    }
	 
	 public double Salario() {
	        return salario;
	    }
	 
}