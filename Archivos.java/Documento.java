
import javax.swing.*;

public class Documento extends JFrame {
    private JTextArea hojaDocumento;
    
    // Variables para recuperar los datos de la clase Formulario
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String numero;
    private String direccion;
    private String correo;
    private String dia;
    private String mes;
    private String año;
    private String departamento;
    private String ciudad;
    
    public Documento() {
        setTitle("Documento Generado");
        setLayout(null);
        
        Formulario objeto = new Formulario();
        
        nombres = objeto.nombres;
        apellidos = objeto.apellidos;
        identificacion = objeto.identificacion;
        numero = objeto.numero;
        direccion = objeto.direccion;
        correo = objeto.correo;
        dia = objeto.dia;
        mes = objeto.mes;
        año = objeto.año;
        departamento = objeto.departamento;
        ciudad = objeto.ciudad;
        
        hojaDocumento = new JTextArea();
        hojaDocumento.setBounds(0, 0, 520, 650);
        hojaDocumento.setText("\n" +
                              "\n" +
                              "\n" + 
                              "\n                    Fecha: " + dia + " / " + mes + " / " + año +
                              "\n" +
                              "\n" +
                              "\n" +
                              "\n                    Asunto: Informe - Contrato - Documento - ETC." +
                              "\n" + 
                              "\n" +
                              "\n" +
                              "\n                    Nombre del cliente: " + nombres + " " + apellidos +
                              "\n                    Domicilio del cliente: " + direccion +
                              "\n                    Telefono: " + correo +
                              "\n" + 
                              "\n" +
                              "\n                    1. Primer Tema:" + 
                              "\n" +       
                              "\n                    Este informe proporciona una actualización sobre el progreso del" +
                              "\n                    proyecto de desarrollo de la plataforma de e-commerce durante el" + 
                              "\n                    período del 1 al 24 de mayo de 2024. El proyecto avanza según el" +
                              "\n                    cronograma establecido, con hitos clave cumplidos y tareas críticas" +
                              "\n                    en curso." +
                              "\n" +
                              "\n" +
                              "\n" +
                              "\n                    " + nombres + " " + apellidos +
                              "\n                    C.c. " + identificacion +
                              "\n                    " + correo +
                              "\n                    " + departamento + ", " + ciudad
                );
        
        add(hojaDocumento);
    }
    
    public static void main(String[] args) {
        Documento ventanaHojaDocumento = new Documento();
        ventanaHojaDocumento.setBounds(0, 0, 520, 650);
        ventanaHojaDocumento.setResizable(false);
        ventanaHojaDocumento.setLocationRelativeTo(null);
        ventanaHojaDocumento.setVisible(true);
    }
}
