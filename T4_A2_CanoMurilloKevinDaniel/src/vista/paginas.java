package vista;
import controlador.AlumnoDAO;
import modelo.Alumno;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class paginas extends JFrame{
    JMenuBar menuBar;
    JMenu menuInicio;
    JMenuItem menuAltas, menuBajas, menuCambios, menuConsultas;
    JInternalFrame IF_Altas, IF_Bajas, IF_Cambios ,IF_Consultas;
    public paginas() {
        //use bd_escuelatopicos;
        //select * from alumnos;
        /*AlumnoDAO alumnoDAO = new AlumnoDAO();

        Alumno a1 = new Alumno("1", "1", "1", "1",
                (byte)1, (byte)1, "1");

        System.out.println(alumnoDAO.agregarAlumno(a1));


        AlumnoDAO alumnoDAO = new AlumnoDAO();
        System.out.println(alumnoDAO.eliminarAlumno("1"));

         */

        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Base de Datos");
        setSize(710, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

        menuBar = new JMenuBar();
        menuInicio = new JMenu("Opciones");
        menuAltas = new JMenuItem("Altas");
        menuBajas = new JMenuItem("Bajas");
        menuCambios = new JMenuItem("Cambios");
        menuConsultas = new JMenuItem("Cosultas");
        menuAltas.setMnemonic(KeyEvent.VK_A);
        menuBajas.setMnemonic(KeyEvent.VK_B);
        menuCambios.setMnemonic(KeyEvent.VK_C);
        menuConsultas.setMnemonic(KeyEvent.VK_D);
        menuAltas.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        menuAltas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IF_Altas.setVisible(true);
            }
        });
        menuBajas.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        menuBajas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IF_Bajas.setVisible(true);
            }
        });
        menuCambios.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menuCambios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IF_Cambios.setVisible(true);
            }
        });
        menuConsultas.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        menuConsultas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IF_Consultas.setVisible(true);
            }
        });
        menuInicio.add(menuAltas);
        menuInicio.add(menuBajas);
        menuInicio.add(menuCambios);
        menuInicio.add(menuConsultas);

        menuBar.add(menuInicio);
        setJMenuBar(menuBar);
        JDesktopPane desktopPane = new JDesktopPane();

        IF_Altas = new JInternalFrame();
        IF_Altas.getContentPane().setLayout(null);
        IF_Altas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Altas.setTitle("Altas");
        IF_Altas.setSize(700, 550);
        IF_Altas.setMaximizable(true);
        IF_Altas.setIconifiable(true);
        IF_Altas.setClosable(true);
        IF_Altas.setResizable(true);
        IF_Altas.setLayout(null);

        JLabel label_fondo, label_txt, label_numControl, label_nombre, label_apPaterno, label_apMaterno, label_edad, label_semestre, label_carrera;
        JTextField caja_numControl, caja_nombre, caja_apPaterno, caja_apMaterno, caja_edad;
        JComboBox<String> combo_semestre, combo_carrera;
        JButton btn_agregar, btn_borrar,btn_cancelar;

        label_txt = new JLabel("ALTAS ALUMNOS");
        label_txt.setFont(new Font("Helvetica", Font.PLAIN, 30));
        label_txt.setForeground(Color.white);
        label_txt.setBounds(60, 0, 684, 60);
        IF_Altas.add(label_txt);
        label_fondo = new JLabel();
        label_fondo.setBounds(0, 0, 684, 60);
        label_fondo.setBackground(Color.green);
        label_fondo.setOpaque(true);
        IF_Altas.add(label_fondo);

        label_numControl = new JLabel("NUMERO DE CONTROL:");
        label_numControl.setBounds(100, 95, 150, 10);
        IF_Altas.add(label_numControl);
        caja_numControl = new JTextField();
        caja_numControl.setBounds(250, 90, 170, 20);
        IF_Altas.add(caja_numControl);

        label_nombre = new JLabel("NOMBRE(S):");
        label_nombre.setBounds(100, 120, 150, 10);
        IF_Altas.add(label_nombre);
        caja_nombre = new JTextField();
        caja_nombre.setBounds(170, 115, 250, 20);
        IF_Altas.add(caja_nombre);

        label_apPaterno = new JLabel("APELLIDO PATERNO:");
        label_apPaterno.setBounds(100, 155, 150, 10);
        IF_Altas.add(label_apPaterno);
        caja_apPaterno = new JTextField();
        caja_apPaterno.setBounds(250, 150, 170, 20);
        IF_Altas.add(caja_apPaterno);

        label_apMaterno = new JLabel("APELLIDO MATERNO:");
        label_apMaterno.setBounds(100, 185, 150, 10);
        IF_Altas.add(label_apMaterno);
        caja_apMaterno = new JTextField();
        caja_apMaterno.setBounds(250, 180, 170, 20);
        IF_Altas.add(caja_apMaterno);

        label_edad = new JLabel("EDAD:");
        label_edad.setBounds(100, 215, 150, 10);
        IF_Altas.add(label_edad);
        caja_edad = new JTextField();
        caja_edad.setBounds(250, 210, 170, 20);
        IF_Altas.add(caja_edad);

        label_semestre = new JLabel("SEMESTRE:");
        label_semestre.setBounds(100, 250, 150, 10);
        IF_Altas.add(label_semestre);
        String [] items = {"Elige Semestre...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        combo_semestre = new JComboBox<>(items);
        combo_semestre.setBounds(250, 245, 170, 20);
        IF_Altas.add(combo_semestre);

        label_carrera = new JLabel("CARRERA:");
        label_carrera.setBounds(100, 280, 150, 10);
        IF_Altas.add(label_carrera);
        String [] items2 = {"Elige Carrera:", "I.S.C", "I.M", "I.I.A", "L.A", "C.P"};
        combo_carrera = new JComboBox<>(items2);
        combo_carrera.setBounds(250, 275, 170, 20);
        IF_Altas.add(combo_carrera);

        btn_agregar = new JButton("AGREGAR");
        btn_agregar.setBounds(460, 100, 100, 20);
        IF_Altas.add(btn_agregar);
        btn_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(caja_numControl.getText().equals("") || caja_nombre.getText().equals("") || caja_apPaterno.getText().equals("") || caja_apMaterno.getText().equals("") || caja_edad.getText().equals("") || combo_carrera.getSelectedIndex() == 0 || combo_semestre.getSelectedIndex() == 0){
                    System.out.println("no");
                }else{
                    AlumnoDAO alumnoDAO = new AlumnoDAO();

                    Alumno a1 = new Alumno(caja_numControl.getText(), caja_nombre.getText(), caja_apPaterno.getText(), caja_apMaterno.getText(),
                            Byte.parseByte(caja_edad.getText()), (byte) combo_semestre.getSelectedIndex(), combo_carrera.getItemAt(combo_carrera.getSelectedIndex()));

                    System.out.println(alumnoDAO.agregarAlumno(a1));
                }
            }
        });

        btn_borrar = new JButton("BORRAR");
        btn_borrar.setBounds(460, 170, 100, 20);
        IF_Altas.add(btn_borrar);
        btn_borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caja_numControl.setText("");
                caja_nombre.setText("");
                caja_apPaterno.setText("");
                caja_apMaterno.setText("");
                caja_edad.setText("");
                combo_carrera.setSelectedIndex(0);
                combo_semestre.setSelectedIndex(0);
            }
        });//ACTION LISTENER BORRAR
        btn_cancelar = new JButton("CANCELAR");
        btn_cancelar.setBounds(460, 240, 100, 20);
        IF_Altas.add(btn_cancelar);

        IF_Bajas = new JInternalFrame();
        IF_Bajas.getContentPane().setLayout(null);
        IF_Bajas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Bajas.setTitle("Bajas");
        IF_Bajas.setSize(700, 550);
        IF_Bajas.setMaximizable(true);
        IF_Bajas.setIconifiable(true);
        IF_Bajas.setClosable(true);
        IF_Bajas.setResizable(true);
        IF_Bajas.setLayout(null);


        ImageIcon imagen;
        Icon icono;
        JLabel label_txt2, label_fondo2, label_numControl2, label_nombre2, label_apPaterno2, label_apMaterno2, label_edad2, label_semestre2, label_carrera2;
        JTextField caja_nombre2, caja_numControl2 ,caja_apPaterno2, caja_apMaterno2, caja_edad2;
        JButton btn_lupa2, btn_borrar2, btn_eliminar2, btn_cancelar2;
        JComboBox<String> combo_carrera2, combo_semestre2;

        label_txt2 = new JLabel("BAJAS ALUMNOS");
        label_txt2.setFont(new Font("Helvetica", Font.PLAIN, 30));
        label_txt2.setForeground(Color.white);
        label_txt2.setBounds(60, 0, 684, 60);
        IF_Bajas.add(label_txt2);
        label_fondo2 = new JLabel();
        label_fondo2.setBounds(0, 0, 684, 60);
        label_fondo2.setBackground(Color.red);
        label_fondo2.setOpaque(true);
        IF_Bajas.add(label_fondo2);

        label_numControl2 = new JLabel("NUMERO DE CONTROL:");
        label_numControl2.setBounds(75, 95, 150, 10);
        IF_Bajas.add(label_numControl2);
        caja_numControl2 = new JTextField();
        caja_numControl2.setBounds(225, 95, 120, 20);
        IF_Bajas.add(caja_numControl2);

        label_nombre2 = new JLabel("NOMBRE(S):");
        label_nombre2.setBounds(75, 180, 150, 10);
        IF_Bajas.add(label_nombre2);
        caja_nombre2 = new JTextField();
        caja_nombre2.setBounds(250, 180, 150, 20);
        IF_Bajas.add(caja_nombre2);

        label_apPaterno2 = new JLabel("APELLIDO PATERNO:");
        label_apPaterno2.setBounds(75, 210, 150, 10);
        IF_Bajas.add(label_apPaterno2);
        caja_apPaterno2 = new JTextField();
        caja_apPaterno2.setBounds(250, 210, 150, 20);
        IF_Bajas.add(caja_apPaterno2);

        label_apMaterno2 = new JLabel("APELLIDO MATERNO:");
        label_apMaterno2.setBounds(75, 240, 150, 10);
        IF_Bajas.add(label_apMaterno2);
        caja_apMaterno2 = new JTextField();
        caja_apMaterno2.setBounds(250, 240, 150, 20);
        IF_Bajas.add(caja_apMaterno2);

        label_edad2 = new JLabel("EDAD:");
        label_edad2.setBounds(75, 270, 150, 10);
        IF_Bajas.add(label_edad2);
        caja_edad2 = new JTextField();
        caja_edad2.setBounds(250, 270, 150, 20);
        IF_Bajas.add(caja_edad2);

        label_semestre2 = new JLabel("SEMESTRE:");
        label_semestre2.setBounds(75, 300, 150, 10);
        IF_Bajas.add(label_semestre2);
        String semestres [] = {"Elige Semestre...","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        combo_semestre2 = new JComboBox<>(semestres);
        combo_semestre2.setBounds(250, 300, 150, 20);
        IF_Bajas.add(combo_semestre2);

        label_carrera2 = new JLabel("CARRERA:");
        label_carrera2.setBounds(75, 330, 150, 10);
        IF_Bajas.add(label_carrera2);
        String carrera [] = {"Elige Carrera...","I.S.C", "I.I.A", "I.M", "L.A", "C.P"};
        combo_carrera2 = new JComboBox<>(carrera);
        combo_carrera2.setBounds(250, 330, 150, 20);
        IF_Bajas.add(combo_carrera2);

        btn_eliminar2 = new JButton("ELIMINAR");
        btn_eliminar2.setBounds(515, 225, 150, 30);
        btn_eliminar2.setBackground(Color.white);
        IF_Bajas.add(btn_eliminar2);
        btn_eliminar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(caja_numControl2.getText().equals("")) {
                    JOptionPane.showMessageDialog(getParent(), "INGRESE UN NUMERO DE CONTROL CORRECTO", "AVISO", JOptionPane.ERROR_MESSAGE);
                }else {
                    AlumnoDAO alumnoDAO = new AlumnoDAO();
                    System.out.println(alumnoDAO.eliminarAlumno(caja_numControl2.getText()));
                }
            }
        });

        btn_lupa2 = new JButton("BUSQUEDA");
        btn_lupa2.setBounds(375, 95, 100, 20);
        //imagen = new ImageIcon("icono/lupa.png");
        //icono = new ImageIcon(imagen.getImage().getScaledInstance(botonLupa.getWidth(), botonLupa.getHeight(), Image.SCALE_DEFAULT));
        //btn_lupa.setIcon(icono);
        IF_Bajas.add(btn_lupa2);
        btn_lupa2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(caja_numControl2.getText().equals("")) {
                    JOptionPane.showMessageDialog(getParent(), "NO HAY NADA QUE BUSCAR", "AVISO", JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(getParent(), "SE REALIZO LA BUSQUEDA...");
                }
            }
        });
        btn_cancelar2 = new JButton("CANCELAR");
        btn_cancelar2.setBounds(515, 300, 100, 30);
        btn_cancelar2.setBackground(Color.white);
        IF_Bajas.add(btn_cancelar2);

        btn_borrar2 = new JButton("BORRAR");
        btn_borrar2.setBounds(515, 90, 100, 30);
        btn_borrar2.setBackground(Color.white);
        IF_Bajas.add(btn_borrar2);
        btn_borrar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                caja_numControl2.setText("");
                caja_nombre2.setText("");
                caja_apPaterno2.setText("");
                caja_apMaterno2.setText("");
                caja_edad2.setText("");
                combo_carrera2.setSelectedIndex(0);
                combo_semestre2.setSelectedIndex(0);
            }
        });
        IF_Cambios = new JInternalFrame();
        IF_Cambios.getContentPane().setLayout(null);
        IF_Cambios.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Cambios.setTitle("Cambios");
        IF_Cambios.setSize(700, 550);
        IF_Cambios.setMaximizable(true);
        IF_Cambios.setIconifiable(true);
        IF_Cambios.setClosable(true);
        IF_Cambios.setResizable(true);
        IF_Cambios.setLayout(null);

        JLabel label_txt3, label_fondo3, label_numControl3, label_nombre3, label_apPaterno3, label_apMaterno3, label_edad3, label_semestre3, label_carrera3;
        JTextField caja_nombre3, caja_numControl3 ,caja_apPaterno3, caja_apMaterno3, caja_edad3;
        JButton boton_lupa3, btn_borrar3, btn_cambios3, btn_cancelar3;
        JComboBox<String> combo_carrera3, combo_semestre3;

        label_txt3 = new JLabel("MODIFICACIONES ALUMNOS");
        label_txt3.setFont(new Font("Helvetica", Font.PLAIN, 30));
        label_txt3.setForeground(Color.white);
        label_txt3.setBounds(60, 0, 684, 60);
        IF_Cambios.add(label_txt3);
        label_fondo3 = new JLabel();
        label_fondo3.setBounds(0, 0, 684, 60);
        label_fondo3.setBackground(Color.orange);
        label_fondo3.setOpaque(true);
        IF_Cambios.add(label_fondo3);

        label_numControl3 = new JLabel("NUMERO DE CONTROL:");
        label_numControl3.setBounds(75, 80, 150, 10);
        IF_Cambios.add(label_numControl3);
        caja_numControl3 = new JTextField();
        caja_numControl3.setBounds(225, 80, 100, 20);
        IF_Cambios.add(caja_numControl3);

        label_nombre3 = new JLabel("NOMBRE(S):");
        label_nombre3.setBounds(75, 180, 150, 10);
        IF_Cambios.add(label_nombre3);
        caja_nombre3 = new JTextField();
        caja_nombre3.setBounds(250, 180, 150, 20);
        IF_Cambios.add(caja_nombre3);

        label_apPaterno3 = new JLabel("APELLIDO PATERNO:");
        label_apPaterno3.setBounds(75, 210, 150, 10);
        IF_Cambios.add(label_apPaterno3);
        caja_apPaterno3 = new JTextField();
        caja_apPaterno3.setBounds(250, 210, 150, 20);
        IF_Cambios.add(caja_apPaterno3);

        label_apMaterno3 = new JLabel("APELLIDO MATERNO:");
        label_apMaterno3.setBounds(75, 240, 150, 10);
        IF_Cambios.add(label_apMaterno3);
        caja_apMaterno3 = new JTextField();
        caja_apMaterno3.setBounds(250, 240, 150, 20);
        IF_Cambios.add(caja_apMaterno3);

        label_edad3 = new JLabel("EDAD:");
        label_edad3.setBounds(75, 270, 150, 10);
        IF_Cambios.add(label_edad3);
        caja_edad3 = new JTextField();
        caja_edad3.setBounds(250, 270, 150, 20);
        IF_Cambios.add(caja_edad3);

        label_semestre3 = new JLabel("SEMESTRE:");
        label_semestre3.setBounds(75, 300, 150, 10);
        IF_Cambios.add(label_semestre3);
        String semestre3 [] = {"Elija Semestre...","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        combo_semestre3 = new JComboBox<>(semestre3);
        combo_semestre3.setBounds(250, 300, 150, 20);
        IF_Cambios.add(combo_semestre3);

        label_carrera3 = new JLabel("CARRERA:");
        label_carrera3.setBounds(75, 330, 150, 10);
        IF_Cambios.add(label_carrera3);
        String carrera3 [] = {"Elija Carrera...","I.S.C", "I.I.A", "I.M", "L.A", "C.P"};
        combo_carrera3 = new JComboBox<>(carrera3);
        combo_carrera3.setBounds(250, 330, 150, 20);
        IF_Cambios.add(combo_carrera3);

        boton_lupa3 = new JButton("BUSQUEDA");
        boton_lupa3.setBounds(375, 80, 110, 20);
        //imagen = new ImageIcon("icono/lupa.png");
        //icono = new ImageIcon(imagen.getImage().getScaledInstance(botonLupa3.getWidth(), botonLupa3.getHeight(), Image.SCALE_DEFAULT));
        //boton_lupa3.setIcon(icono);
        IF_Cambios.add(boton_lupa3);
        boton_lupa3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(caja_numControl3.getText().equals("")) {
                    JOptionPane.showMessageDialog(getParent(), "INGRESE UN NUMERO DE CONTROL VALIDO", "AVISO", JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(getParent(), "SE REALIZO LA BUSQUEDA...");
                }
            }
        });
        btn_borrar3 = new JButton("BORRAR");
        btn_borrar3.setBounds(515, 90, 100, 30);
        btn_borrar3.setBackground(Color.white);
        IF_Cambios.add(btn_borrar3);
        btn_borrar3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                caja_numControl3.setText("");
                caja_nombre3.setText("");
                caja_apPaterno3.setText("");
                caja_apMaterno3.setText("");
                caja_edad3.setText("");
                combo_carrera3.setSelectedIndex(0);
                combo_semestre3.setSelectedIndex(0);
            }
        });
        btn_cambios3 = new JButton("GUARDAR CAMBIOS");
        btn_cambios3.setBounds(490, 225, 150, 30);
        btn_cambios3.setBackground(Color.white);
        IF_Cambios.add(btn_cambios3);
        btn_cambios3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(caja_numControl3.getText().equals("") || caja_nombre3.getText().equals("") || caja_apPaterno3.getText().equals("") || caja_apMaterno3.getText().equals("") || caja_edad3.getText().equals("") || combo_semestre3.getSelectedIndex() == 0 || combo_carrera3.getSelectedIndex() == 0){
                    System.out.println("no");
                }else{
                    AlumnoDAO alumnoDAO = new AlumnoDAO();

                    Alumno a1 = new Alumno(caja_numControl3.getText(), caja_nombre3.getText(), caja_apPaterno3.getText(), caja_apMaterno3.getText(),
                            Byte.parseByte(caja_edad3.getText()), (byte) combo_semestre3.getSelectedIndex(), combo_carrera3.getItemAt(combo_carrera3.getSelectedIndex()));

                    System.out.println(alumnoDAO.actualizarAlumno(a1));
                }
            }
        });

        btn_cancelar3 = new JButton("CANCELAR");
        btn_cancelar3.setBounds(490, 300, 150, 30);
        btn_cancelar3.setBackground(Color.white);
        IF_Cambios.add(btn_cancelar3);
//CONSULTAS==================================================================================================================
        JLabel label_txt4, label_fondo4;
        JTextField caja_nombre4,caja_apPaterno4, caja_apMaterno4, caja_edad4;
        JButton boton_lupa4, btn_borrar4, btn_cancelar4;
        JComboBox<String> combo_carrera4, combo_semestre4;
        JRadioButton rb_radio4, rb_nombre4, rb_apPaterno4, rb_apMaterno4, rb_edad4, rb_semestr4, rb_carrera4;

        IF_Consultas = new JInternalFrame();
        IF_Consultas.getContentPane().setLayout(null);
        IF_Consultas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Consultas.setTitle("Consultas");
        IF_Consultas.setSize(700, 550);
        IF_Consultas.setMaximizable(true);
        IF_Consultas.setIconifiable(true);
        IF_Consultas.setClosable(true);
        IF_Consultas.setResizable(true);
        IF_Consultas.setLayout(null);

        //Cuarta INTERFACE
        label_txt4 = new JLabel("CONSULTAS ALUMNOS");
        label_txt4.setFont(new Font("Helvetica", Font.PLAIN, 30));
        label_txt4.setForeground(Color.white);
        label_txt4.setBounds(60, 0, 684, 60);
        IF_Consultas.add(label_txt4);
        label_fondo4 = new JLabel();
        label_fondo4.setBounds(0, 0, 684, 60);
        label_fondo4.setBackground(Color.blue);
        label_fondo4.setOpaque(true);
        IF_Consultas.add(label_fondo4);

        JLabel lbl_seleccion4 = new JLabel("Seleccione Criterio de Busqueda");
        lbl_seleccion4.setBounds(60, 60, 500, 30);
        IF_Consultas.add(lbl_seleccion4);

        rb_radio4 = new JRadioButton("TODOS");
        rb_radio4.setBounds(60, 120, 80, 30);
        IF_Consultas.add(rb_radio4);

        rb_nombre4 = new JRadioButton("NOMBRE:");
        rb_nombre4.setBounds(200, 120, 80, 20);
        IF_Consultas.add(rb_nombre4);

        caja_nombre4 = new JTextField();
        caja_nombre4.setBounds(350, 120, 120, 20);
        IF_Consultas.add( caja_nombre4);

        rb_apPaterno4 = new JRadioButton("APELLIDO PATERNO:");
        rb_apPaterno4.setBounds(200, 150, 150, 20);
        IF_Consultas.add(rb_apPaterno4);

        caja_apPaterno4 = new JTextField();
        caja_apPaterno4.setBounds(350, 150, 120, 20);
        IF_Consultas.add(caja_apPaterno4);

        rb_apMaterno4 = new JRadioButton("APELLIDO MATERNO:");
        rb_apMaterno4.setBounds(200, 180, 150, 20);
        IF_Consultas.add(rb_apMaterno4);

        caja_apMaterno4 = new JTextField();
        caja_apMaterno4.setBounds(350, 180, 120, 20);
        IF_Consultas.add(caja_apMaterno4);

        rb_edad4 = new JRadioButton("EDAD:");
        rb_edad4.setBounds(200, 210, 150, 20);
        IF_Consultas.add(rb_edad4);

        caja_edad4 = new JTextField();
        caja_edad4.setBounds(350, 210, 120, 20);
        IF_Consultas.add(caja_edad4);

        rb_semestr4 = new JRadioButton("SEMESTRE:");
        rb_semestr4.setBounds(200, 240, 150, 20);
        IF_Consultas.add(rb_semestr4);

        String semestre4 [] = {"Elija Semestre...","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        combo_semestre4 = new JComboBox<>(semestre4);
        combo_semestre4.setBounds(350, 240, 150, 20);
        IF_Consultas.add(combo_semestre4);

        rb_carrera4 = new JRadioButton("CARRERA:");
        rb_carrera4.setBounds(200, 270, 150, 20);
        IF_Consultas.add(rb_carrera4);

        String carr4 [] = {"Elige Carrera...","I.S.C", "I.I.A", "I.M", "L.A", "C.P"};
        combo_carrera4 = new JComboBox<>(carr4);
        combo_carrera4.setBounds(350, 270, 150, 20);
        IF_Consultas.add(combo_carrera4);

        boton_lupa4 = new JButton("BUSQUEDA");
        boton_lupa4.setBounds(530, 120, 100, 40);
        //imagen = new ImageIcon("icono/lupa.png");
        //icono = new ImageIcon(imagen.getImage().getScaledInstance(boton_lupa4.getWidth(), boton_lupa4.getHeight(), Image.SCALE_DEFAULT));
        //boton_lupa4.setIcon(icono);
        IF_Consultas.add(boton_lupa4);

        btn_cancelar4 = new JButton("CANCELAR");
        btn_cancelar4.setBounds(530, 180, 100, 40);
        IF_Consultas.add(btn_cancelar4);

        btn_borrar4 = new JButton("BORRAR");
        btn_borrar4.setBounds(530, 240, 100, 40);
        IF_Consultas.add(btn_borrar4);

        desktopPane.add(IF_Altas);
        desktopPane.add(IF_Bajas);
        desktopPane.add(IF_Cambios);
        desktopPane.add(IF_Consultas);
        add(desktopPane, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new paginas();
            }
        });
    }
}