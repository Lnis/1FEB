package prueba.graficos;
import javax.swing.*;
import java.awt.*;
public class Gui02 extends JFrame {
public Gui02() {
super("Ejemplo de Layout");
// Configurar componentes ;
// Configurar layout ;
setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
for(int i = 1; i <= 10; i++)
add(new JButton("Componente " + i));
setSize(200,200);//pack();
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String args[]) {
Gui02 aplicacion = new Gui02();
}
}