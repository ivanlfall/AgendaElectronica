package ar.ilf.gui;

import ar.ilf.core.Contacto;
import ar.ilf.core.RecorridoAgenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;


public class Agenda extends JFrame {
    
    private Contacto contacto = new Contacto();
    
    private JTextField anioInput;
    private JTextField apellidoInput;
    private JButton btnAdelante;
    private JButton btnAtras;
    private JButton btnGrabar;
    private JLabel contactoNro;
    private JTextField diaInput;
    private JTextField direccionInput;
    private JTextField dniInput;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField mesInput;
    private JTextField nombreInput;
    private JTextField telInput;

    public Agenda() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    
    private void initComponents() {

        jSeparator1 = new JSeparator();
        btnGrabar = new JButton();
        btnAdelante = new JButton();
        btnAtras = new JButton();
        jLabel1 = new JLabel();
        jSeparator2 = new JSeparator();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        dniInput = new JTextField();
        nombreInput = new JTextField();
        apellidoInput = new JTextField();
        direccionInput = new JTextField();
        telInput = new JTextField();
        diaInput = new JTextField();
        contactoNro = new JLabel();
        mesInput = new JTextField();
        anioInput = new JTextField();
        jLabel8 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnAdelante.setText(">>");
        btnAdelante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        btnAtras.setText("<<");
        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Agenda Electrónica");

        jLabel2.setText("DNI");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("F. DE NAC");

        jLabel6.setText("TELEFONO");

        jLabel7.setText("DIRECCIÓN");

        diaInput.setText("dd");
        diaInput.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                diaInputFocusGained(evt);
            }
        });

        contactoNro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactoNro.setText("0");

        mesInput.setText("mm");
        mesInput.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                mesInputFocusGained(evt);
            }
        });

        anioInput.setText("aaaa");
        anioInput.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                anioInputFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel8.setText("Contacto N°");

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(dniInput)
                                            .addComponent(nombreInput, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(38, 38, 38)
                                        .addComponent(telInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(33, 33, 33)
                                            .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(diaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(mesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(anioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addGap(35, 35, 35)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdelante)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(contactoNro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(apellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactoNro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
        );

        pack();
    }

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {
        
        int posActual = Integer.parseInt(contactoNro.getText());
        int nuevaPos = RecorridoAgenda.recorrer(posActual, RecorridoAgenda.ATRAS, Contacto.CONTACTOSMAXIMO-1);
        mostrarDatos(nuevaPos, contacto);
        contactoNro.setText(""+nuevaPos);

    }

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        
        String nombre, apellido, direccion, telefono;
        int dni, posicionActual;
        Date fechaNacimiento;        
        
        nombre = nombreInput.getText();
        apellido = apellidoInput.getText();
        direccion = direccionInput.getText();
        telefono = telInput.getText();
        try {
        	dni = Integer.parseInt(dniInput.getText());
		} catch (Exception e) {
			dniInput.setText("Valor no valido");
			dni = 0;
		}
        
        fechaNacimiento = new Calendar.Builder()
                .setDate(
                        Integer.parseInt(anioInput.getText()),
                        Integer.parseInt(mesInput.getText()),
                        Integer.parseInt(diaInput.getText()))
                .build()
                .getTime();
        
        posicionActual = Integer.parseInt(contactoNro.getText());
        
        contacto.nuevoContacto(posicionActual, nombre, apellido, direccion, telefono, dni, fechaNacimiento);
        System.out.println("Guardado correcto");
        
    }

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {
        
        int posActual = Integer.parseInt(contactoNro.getText());
        int nuevaPos = RecorridoAgenda.recorrer(posActual, RecorridoAgenda.ADELANTE, Contacto.CONTACTOSMAXIMO-1);
        contactoNro.setText(""+nuevaPos);
        mostrarDatos(nuevaPos, contacto);
        
    }


    private void diaInputFocusGained(java.awt.event.FocusEvent evt) {
        diaInput.setText("");
    }

    private void mesInputFocusGained(java.awt.event.FocusEvent evt) {
        mesInput.setText("");
    }

    private void anioInputFocusGained(java.awt.event.FocusEvent evt) {
        anioInput.setText("");
    }

    private void mostrarDatos(int posicion, Contacto contacto){
        
        if (contacto.getNombre()[posicion] == null){
                nombreInput.setText("");
                apellidoInput.setText("");
                direccionInput.setText("");
                telInput.setText("");
                dniInput.setText("");
                diaInput.setText("dd");
                mesInput.setText("mm");
                anioInput.setText("aaaa");
            
        }else{
                
                nombreInput.setText(contacto.getNombre()[posicion]);
                apellidoInput.setText(contacto.getApellido()[posicion]);
                direccionInput.setText(contacto.getDireccion()[posicion]);
                telInput.setText(contacto.getTelefono()[posicion]);
                dniInput.setText(""+contacto.getDni()[posicion]);
                diaInput.setText(""+contacto.getFechaNacimiento()[posicion].getDate());
                mesInput.setText(""+contacto.getFechaNacimiento()[posicion].getMonth());
                anioInput.setText(""+contacto.getFechaNacimiento()[posicion].getYear());
        }
 
    }

    

}
