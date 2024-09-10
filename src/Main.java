import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trabajadores Franco = new trabajadores ("Franco_Russo", "franrusso@meli.com.ar", "29042023", 10000 );
		trabajadores Diamela = new trabajadores ("Diamela_Aversano", "diameaversano@meli.com.ar", "10000", 250 );
		trabajadores Nicolas = new trabajadores ("Nicolas_Santone", "nicosantone@meli.com.ar", "10000", 250 );
		trabajadores Alex = new trabajadores ("Alex_Condoleo", "alecondoleo@meli.com.ar", "10000", 250 );
		
		int dia = 10;
		int mes = 12;
		int año = 2003;
		LocalDate hoy = LocalDate.now();
		
		String mail = JOptionPane.showInputDialog("Ingrese el mail de la empresa:");
		while (!mail.equals(Franco.mail)) {
			 mail = JOptionPane.showInputDialog("mail no existe");
			 Franco = new trabajadores("Franco_Russo", mail , "29042023", 10000 );
		}
		
		String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña de su mail");
		while (!contraseña .equals(Franco.contraseña )) {
			contraseña  = JOptionPane.showInputDialog("Contraseña incorrecta");
			 Franco = new trabajadores("Franco_Russo", "franrusso@meli.com.ar", contraseña , 10000 );
		}
		
		String opciones = JOptionPane.showInputDialog("Ingrese una de las opciones = "
				+ " 1.  Mandar un mensaje a alguien de la empresa "
				+ " 2.  Pedir tiempo de antiguedad "
				+ " 3.  pedir salario (actualizado con los años de antiguedad)"
				+ " 4.  Pedir tus datos como nombre, mail y tiempo trabajado");
		
		int menu_opciones = Integer.parseInt(opciones);
		switch(menu_opciones) {
		
		case 1:
			
			String mail_mensaje = JOptionPane.showInputDialog("Ingrese el mail de la empresa:");
			while (!mail_mensaje.equals(Diamela.mail)) {
				 mail = JOptionPane.showInputDialog("mail no existe");
				 Diamela = new trabajadores ("Diamela_Aversano", mail, "10000", 250 );
			}
			String mensaje = JOptionPane.showInputDialog("Ingrese el mensaje que desea enviar");
			JOptionPane.showMessageDialog(null, "Tu mensaje es: " +mensaje+ ". a sido enviado");
			break;
			
		case 3:
			int años_trabajado = 2024 - año;
			int bonus = años_trabajado * 1000;
			Franco.salario += bonus;
			JOptionPane.showMessageDialog(null, "Tu salario seria de: $" +Franco.Salario());
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Tus datos son los siguientes: " +Franco.tusdatos());
			break;
		}
	}

}
