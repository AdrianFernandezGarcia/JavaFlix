package vista.usuario;

import controlador.GestionClientes;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import modelo.ErrorUI;
import modelo.Suscripcion;
/**
 * 
 * @author Adrián Fernández García
 */
public class Usuario_Suscripcion extends javax.swing.JFrame implements ErrorUI {

    private final JFrame principal;
    //precios de la suscripcion
    private final double precioBasica = 8.99;
    private final double precioEstandar = 11.99;
    private final double precioPremium = 15.99;

    /**
     * Constructor
     *
     * @param v ventana anterior
     */
    public Usuario_Suscripcion(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);

        comprobarSuscripcion();

    }

    /**
     * Inicia todos los componentes
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonSuscripcion = new javax.swing.JButton();
        botonSaldo = new javax.swing.JButton();
        tfSaldo = new javax.swing.JTextField();
        cbSuscripcion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuario_Suscripción");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        try {
            BufferedImage imagen =ImageIO.read(new File("imagenes/logo.JPG"));
            this.setIconImage(imagen);
        } catch (IOException ex) {
            
        }

        labelTitulo.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(204, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("SUSCRIPCIÓN");

        botonSuscripcion.setText("ACEPTAR PLAN");
        botonSuscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSuscripcionActionPerformed(evt);
            }
        });

        botonSaldo.setText("AÑADIR SALDO");
        botonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaldoActionPerformed(evt);
            }
        });

        cbSuscripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suscripción Básica", "Suscripción Estándar", "Suscripción Premium" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbSuscripcion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSuscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botonSaldo)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSaldo)
                    .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(cbSuscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(botonSuscripcion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setSize(new java.awt.Dimension(616, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Agrega el saldo especificado a la tarjeta del cliente.
     *
     * @param evt
     */
    private void botonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaldoActionPerformed

        if (!(tfSaldo.getText().isEmpty())) {
            //Sumar la cantidad introducida al saldo del cliente
            Usuario.usuarioLogueado.getTarjeta().setSaldo(Usuario.usuarioLogueado.getTarjeta().getSaldo() + Double.parseDouble(tfSaldo.getText()));
            MostrarError("Saldo añadido, ahora dispone de " + Usuario.usuarioLogueado.getTarjeta().getSaldo() + " €", INFORMATION_MESSAGE);
            //Guardar cambios.
            GestionClientes.guardarClientes();
        } else {
            MostrarError("Introduzca la cantidad de saldo a añadir.", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonSaldoActionPerformed

    /**
     * Establece la suscripción del cliente. Desde que el cliente selecciona una
     * suscripción GestiónSuscripciones se encarga de renovarla cada mes.
     *
     * @see controlador.GestionSuscripciones
     * @param evt
     */
    private void botonSuscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSuscripcionActionPerformed
        String opcionSeleccionada = "";
        double precioSuscripcion = 0;

        //Si el usuario todavía no se ha suscrito o ya puede cambiar su suscripcion, entonces seleccionar suscripcion.
        if ((Usuario.usuarioLogueado.getSuscripcion() == null)) {
            switch (cbSuscripcion.getSelectedIndex()) {
                case 0:
                    opcionSeleccionada = "Basica";
                    precioSuscripcion = precioBasica;
                    break;

                case 1:
                    opcionSeleccionada = "Estandar";
                    precioSuscripcion = precioEstandar;
                    break;

                case 2:
                    opcionSeleccionada = "Premium";
                    precioSuscripcion = precioPremium;
                    break;

            }

            //Comprobar que tenga suficiente saldo y que la tarjeta no esté caducada.
            if ((Usuario.usuarioLogueado.getTarjeta().getSaldo() - precioSuscripcion < 0)) {
                MostrarError("Lo sentimos, su saldo es insuficiente para completar la transacción.", ERROR_MESSAGE);
            } else if ((comprobarLimiteFecha(Usuario.usuarioLogueado.getTarjeta().getFechaCaducidad()))) {
                MostrarError("Lo sentimos, su tarjeta de crédito se encuentra caducada.", ERROR_MESSAGE);
            } else {
                MostrarError("Se ha seleccionado el plan " + cbSuscripcion.getSelectedItem().toString() + ".", INFORMATION_MESSAGE);
                //Crear la suscripción con fechaFin siendo la fecha actual más un mes.

                Usuario.usuarioLogueado.setSuscripcion(new Suscripcion(LocalDate.now(), LocalDate.now().plusMonths(1), opcionSeleccionada, precioSuscripcion));
                //Establecer la suscripcion para el cliente en cuestión.
                Usuario.usuarioLogueado.getTarjeta().setSaldo(Usuario.usuarioLogueado.getTarjeta().getSaldo() - precioSuscripcion);
                GestionClientes.guardarClientes();
                crearFicheroSuscripcion(precioSuscripcion);
                comprobarSuscripcion();

            }
        } else {
            MostrarError("Ya ha seleccionado un plan de suscripción. ", ERROR_MESSAGE);
    }//GEN-LAST:event_botonSuscripcionActionPerformed
    }

    private void comprobarSuscripcion() {
        //Si el usuario ya ha seleccionado una opcion, entonces desactivar el checkbox y establecer la opción que ha seleccionado en él.
        if (Usuario.usuarioLogueado.getSuscripcion() != null) {
            cbSuscripcion.setEnabled(false);
            cbSuscripcion.setSelectedIndex(Usuario.usuarioLogueado.getSuscripcion().getTipoSuscripcion().ordinal());

        }
    }

    /**
     *
     * @param fecha fecha limite
     * @return true si la fecha actual ha sobrepasado la fecha especificada
     */
    private boolean comprobarLimiteFecha(Date fecha) {

        Calendar fechaActual = Calendar.getInstance();
        fechaActual.set(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
        Calendar limite = Calendar.getInstance();
        limite.setTime(fecha);

        return fechaActual.after(limite);
    }

    /**
     * Método que crea un archivo de texto con la información de la suscripción
     * del cliente de manera automática cuando éste se suscribe. Este fichero se
     * guarda en el escritorio del usuario.
     */
    private void crearFicheroSuscripcion(double importe) {
        try {
            //Guardar el archivo en el escritorio con el nombre del DNI del usuario
            File archivoSuscripcion = new File(System.getProperty("user.home") + "/Desktop", Usuario.usuarioLogueado.getDni() + ".txt");
            archivoSuscripcion.createNewFile();

            try (FileWriter fWriter = new FileWriter(archivoSuscripcion)) {
                fWriter.append("Usuario: " + Usuario.usuarioLogueado.getNombre() + "\n");
                fWriter.append("DNI: " + Usuario.usuarioLogueado.getDni() + "\n");
                fWriter.append("Plan de Suscripcion: " + Usuario.usuarioLogueado.getSuscripcion().getTipoSuscripcion() + "\n");
                fWriter.append("Importe total: " + importe + " € \n");
                fWriter.close();
            }

        } catch (IOException e) {
            MostrarError("Error al crear el fichero", ERROR_MESSAGE);
        }
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    @Override
    public void MostrarError(String textoError, int tipoMensaje) {
        JOptionPane.showMessageDialog(this, textoError, "Error", tipoMensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSaldo;
    private javax.swing.JButton botonSuscripcion;
    private javax.swing.JComboBox<String> cbSuscripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField tfSaldo;
    // End of variables declaration//GEN-END:variables

}
