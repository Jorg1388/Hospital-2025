// Importamos las clases necesarias de la librería Swing
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        
        // Crear una ventana usando JFrame
        JFrame miVentana = new JFrame(); // Se crea el objeto ventana
        miVentana.setTitle("Hospital SCL"); // Se establece el título de la ventana
        miVentana.setSize(1000, 800); // Se define el tamaño de la ventana (ancho x alto)

        // Crear un texto utilizando JLabel
        JLabel texto = new JLabel(); // Se crea un objeto de tipo JLabel
        texto.setText("Hola Mundo"); // Se establece el texto que mostrará la etiqueta
        miVentana.add(texto); // Se agrega la etiqueta a la ventana

        // Hacer visible la ventana (por defecto está oculta)
        miVentana.setVisible(true);
    }
}
