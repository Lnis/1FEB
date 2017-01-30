package entorno.grafico.uno;

import javax.swing.JFrame;
import javax.swing.JTextPane;

public class VentanaTexto {
	

	public static void main(String[] args) {
		//Creamos una ventana
		JFrame miVentana = new JFrame();
		miVentana.setTitle ("Trolorolorolo"); //le ponemos t�tulo a nuestra ventana
		//Creamos un campo de texto
		JTextPane miCampoDeTexto = new JTextPane();
		miCampoDeTexto.setText("CORRE PL�TANO, HUYE T� QUE PUEDES");
		//ahora metemos el campo de texto en la ventana
		miVentana.add(miCampoDeTexto);
	        
		//Detalles importantes
		//1- le decimos a la ventana que cierre el programa si alguien pulsa la X de cierre
		miVentana.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
		//2- ponemos como tama�o de ventana el m�nimo necesario para que se vea todo lo que contiene
		miVentana.pack();
		//3- decimos que la ventana sea visible
		miVentana.setVisible(true);
	        
	    }

	}
