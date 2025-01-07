
/*
 * Clase principal del proyecto formulario de registro de datos.
 * Clase: Datos Personales.
 * Version: v1
 * @autor: Andres Bermudez
*/

// Librerias necesarias para el proyecto
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Formulario extends JFrame implements ActionListener, ChangeListener {
    /* 
     * Declarando componentes que usaremos en el proyecto.
     * Libreria: Java-Swing
    */ 
    private JButton buttonSend;
    private JLabel image, title, names, lastNames, id, day, month, year, date, number, departament, city, 
                   address, educationLevel, mail;
    private JTextField frameNames, frameLastNames, frameId, frameNumber, frameAddress, frameMail;
    private JComboBox comboDay, comboMonth, comboYear, comboDepartament, comboCity;
    private JRadioButton bachelor, technical, professional;
    private JTextArea areaOne;
    private JScrollPane scroll;
    private JMenuBar menuBar;
    private JMenu options, create;
    private JMenuItem creador, cleanData;
    private ButtonGroup group;
    
    public static String nombres;
    public static String apellidos;
    public static String identificacion;
    public static String numero;
    public static String direccion;
    public static String correo;
    public static String dia;
    public static String mes;
    public static String año;
    public static String departamento;
    public static String ciudad;
    public static String nivelEducativo;
    
    private String[] departamentos = {"Amazonas",
                                      "Antioquia",
                                      "Arauca",
                                      "Atlantico",
                                      "Bolivar",
                                      "Boyaca",
                                      "Caldas",
                                      "Caqueta",
                                      "Casanare",
                                      "Cauca",
                                      "Cesar",
                                      "Choco",
                                      "Cordoba",
                                      "Cundinamarca",
                                      "Guainia",
                                      "Guaviare",
                                      "Huila",
                                      "La guajira",
                                      "Magdalena",
                                      "Meta",
                                      "Nariño",
                                      "Norte de santander",
                                      "Putumayo",
                                      "Quindio",
                                      "Risaralda",
                                      "San Andres y Providencia",
                                      "Santander",
                                      "Sucre",
                                      "Tolima",
                                      "Valle del Cauca",
                                      "Vaupes",
                                      "Vichada"
};
    
    private String[] ciudades = {
                                "Leticia",
                                "Medellin",
                                "Arauca",
                                "Barranquilla",
                                "Cartagena",
                                "Tunja",
                                "Manizales",
                                "Florencia",
                                "Yopal",
                                "Popayan",
                                "Valledupar",
                                "Quibdo",
                                "Monteria",
                                "Bogota",
                                "Inirida",
                                "San Jose del Guaviare",
                                "Neiva",
                                "Riohacha",
                                "Santa Marta",
                                "Villavicencio",
                                "San Juan de Pasto",
                                "San Jose de Cucuta",
                                "Mocoa",
                                "Armenia",
                                "Pereira",
                                "San Andres",
                                "Bucaramanga",
                                "Sincelejo",
                                "Ibague",
                                "Cali",
                                "Mitu",
                                "Puerto Carreño"
};
    
    //Creacion del metodo constructor
    public Formulario() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Formulario de Registro");
        setLayout(null);
        
        menuBar = new JMenuBar(); // Creacion de la barra de menu
        setJMenuBar(menuBar);
        
        options = new JMenu("Opciones"); // Creacion del primer menu
        menuBar.add(options);
        
        cleanData = new JMenuItem("Limpiar Datos");
        cleanData.addActionListener(this);
        options.add(cleanData);
        
        create = new JMenu("Acerca de"); // Creacion del segundo menu
        menuBar.add(create);
        
        creador = new JMenuItem("Del Creador");
        creador.addActionListener(this);
        create.add(creador);
        
        // Imagen de la interfaz de bienvenida
        File file = new File("images/imagen.png");
        ImageIcon imagenPrincipal = new ImageIcon(file.getAbsolutePath());
        image = new JLabel(imagenPrincipal);
        image.setBounds(10, 10, 300, 410);
        add(image);
        
        //Titulo
        title = new JLabel("Datos Personales");
        title.setBounds(470, 0, 130, 30);
        title.setFont(new Font("Arial", 1, 15));
        add(title);
        
        // Nombres del usuario
        names = new JLabel("Nombres:");
        names.setBounds(320, 30, 60, 20);
        names.setFont(new Font("Arial", 1, 12));
        add(names);
        
        frameNames = new JTextField();
        frameNames.setBounds(320, 50, 150, 20);
        add(frameNames);
        
        //Apellidos del Usuario
        lastNames = new JLabel("Apellidos:");
        lastNames.setBounds(530, 30, 60, 20);
        lastNames.setFont(new Font("Arial", 1, 12));
        add(lastNames);
        
        frameLastNames = new JTextField();
        frameLastNames.setBounds(530, 50, 180, 20);
        add(frameLastNames);
        
        // Numero de identificacion del usuario
        id = new JLabel("No. Identificacion:");
        id.setBounds(320, 80, 110, 20);
        id.setFont(new Font("Arial", 1, 12));
        add(id);
        
        frameId = new JTextField();
        frameId.setBounds(320, 100, 180, 20);
        add(frameId);
        
        // Fecha de nacimiento
        date = new JLabel("Fecha de nacimiento:");
        date.setBounds(540, 80, 130, 20);
        date.setFont(new Font("Arial", 1, 12));
        add(date);
         
        // Dias del mes
        day = new JLabel("Dia");
        day.setBounds(540, 100, 20, 20);
        day.setFont(new Font("Arial", 1, 12));
        add(day);
        
        comboDay = new JComboBox();
        comboDay.setBounds(540, 120, 45, 20);
        comboDay.addItem("");
        
        for (int i = 1; i <= 31; i++) {
            comboDay.addItem(i);
        }
        
        add(comboDay);
        
        // Meses del año
        month = new JLabel("Mes");
        month.setBounds(595, 100, 30, 20);
        month.setFont(new Font("Arial", 1, 12));
        add(month);
        
        comboMonth = new JComboBox();
        comboMonth.setBounds(595, 120, 45, 20);
        comboMonth.addItem("");
        
        for (int i = 1; i <= 12; i++) {
            comboMonth.addItem(i);
        }
        
        add(comboMonth);
        
        // Años
        year = new JLabel("Año");
        year.setBounds(650, 100, 30, 20);
        year.setFont(new Font("Arial", 1, 12));
        add(year); 
        
        comboYear = new JComboBox();
        comboYear.setBounds(650, 120, 55, 20);
        comboYear.addItem("");
        
        for (int i = 1950; i <= 2025; i++) {
            comboYear.addItem(i);
        }
        
        add(comboYear);
        
        // Numero de telefono
        number = new JLabel("Telefono:");
        number.setBounds(320, 140, 60, 20);
        number.setFont(new Font("Arial", 1, 12));
        add(number);
        
        frameNumber = new JTextField();
        frameNumber.setBounds(320, 160, 120, 20);
        add(frameNumber);
        
        // Correo electronico
        mail = new JLabel("Correo Electronico:");
        mail.setBounds(320, 190, 120, 20);
        mail.setFont(new Font("Arial", 1, 12));
        add(mail);
        
        frameMail = new JTextField();
        frameMail.setBounds(320, 210, 200, 20);
        add(frameMail);
        
        // Departamento
        departament = new JLabel("Departamento:");
        departament.setBounds(320, 250, 100, 20);
        departament.setFont(new Font("Arial", 1, 12));
        add(departament);
        
        comboDepartament = new JComboBox();
        comboDepartament.setBounds(320, 270, 170, 20);
        comboDepartament.setFont(new Font("Arial", 0, 12));
        comboDepartament.addItem("");
        
        for(int i = 0; i != departamentos.length; i++) {
            comboDepartament.addItem(departamentos[i]);
        }
        
        add(comboDepartament);
        
        // Nivel educativo
        educationLevel = new JLabel("Nivel Educativo:");
        educationLevel.setBounds(570, 170, 130, 20);
        educationLevel.setFont(new Font("Arial", 1, 12));
        add(educationLevel);
        
        group = new ButtonGroup();
        
        bachelor = new JRadioButton("Bachiller");
        bachelor.setBounds(570, 190, 300, 30);
        bachelor.addChangeListener(this);
        add(bachelor);
        
        technical = new JRadioButton("Tecnico");
        technical.setBounds(570, 220, 300, 30);
        technical.addChangeListener(this);
        add(technical);
        
        professional = new JRadioButton("Profesional");
        professional.setBounds(570, 250, 230, 30);
        professional.addChangeListener(this);
        add(professional);
        
        group.add(bachelor);
        group.add(technical);
        group.add(professional);
        
        // Ciudad de residencia
        city = new JLabel("Ciudad de residencia:");
        city.setBounds(320, 310, 130, 20);
        city.setFont(new Font("Arial", 1, 12));
        add(city);
        
        comboCity = new JComboBox();
        comboCity.setBounds(320, 330, 150, 20);
        comboCity.setFont(new Font("Arial", 0, 12));
        comboCity.addItem("");
        
        for(int i = 0; i < ciudades.length; i++) {
            comboCity.addItem(ciudades[i]);
        }
        
        add(comboCity);
        
        // Direccion 
        address = new JLabel("Direccion:");
        address.setBounds(540, 290, 80, 20);
        address.setFont(new Font("Arial", 1, 12));
        add(address);
        
        frameAddress = new JTextField();
        frameAddress.setBounds(540, 310, 150, 20);
        add(frameAddress);
        
        // Boton enviar
        buttonSend = new JButton("Enviar");
        buttonSend.setBounds(495, 380, 80, 20);
        buttonSend.addActionListener(this);
        add(buttonSend);
    }
    
    // Metodos que escucha y ejecuta los eventos 
    
    public void actionPerformed(ActionEvent e) { // Eventos Botones
        if (e.getSource() == creador) {
            JOptionPane.showMessageDialog(null, "          Andres Bermudez"
                                              + "\n  GitHub: Andres-Bermudez"
                                              + "\n Facebook: Andres Bermudez");
            
        } else if (e.getSource() == cleanData) {
            frameNames.setText("");
            frameLastNames.setText("");
            frameId.setText("");
            frameNumber.setText("");
            frameAddress.setText("");
            frameMail.setText("");
            
            comboDay.setSelectedIndex(0);
            comboMonth.setSelectedIndex(0);
            comboYear.setSelectedIndex(0);
            comboDepartament.setSelectedIndex(0);
            comboCity.setSelectedIndex(0);
            
            group.clearSelection();
            
        } else if (e.getSource() == buttonSend) {
            nombres = frameNames.getText();
            apellidos = frameLastNames.getText();
            identificacion = frameId.getText();
            numero = frameNumber.getText();
            direccion = frameAddress.getText();
            correo = frameMail.getText();
            dia = comboDay.getSelectedItem().toString();
            mes = comboMonth.getSelectedItem().toString();
            año = comboYear.getSelectedItem().toString();
            departamento = comboDepartament.getSelectedItem().toString();
            ciudad = comboCity.getSelectedItem().toString();
            
            // Abir la siguiente interfaz
            Documento ventanaHojaDocumento = new Documento();
            ventanaHojaDocumento.setBounds(0, 0, 520, 650);
            ventanaHojaDocumento.setResizable(false);
            ventanaHojaDocumento.setLocationRelativeTo(null);
            ventanaHojaDocumento.setVisible(true);
        }
    }
    
    public void stateChanged(ChangeEvent e) {
        if (bachelor.isSelected()) {
            nivelEducativo = "Bachiller";
            
        } else if (technical.isSelected()) {
            nivelEducativo = "Tecnico";
            
        } else if (professional.isSelected()) {
            nivelEducativo = "Profesional";
        }
    }
    
    // Metodo main que ejecuta la ventana principal
    public static void main(String[] args) {
        Formulario ventanaPrincipal = new Formulario();
        ventanaPrincipal.setBounds(0, 0, 750, 490);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setVisible(true);
    }
}
