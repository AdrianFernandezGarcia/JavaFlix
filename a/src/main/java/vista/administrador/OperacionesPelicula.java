package vista.administrador;

import controlador.GestionContenido;
import controlador.GestorImagenesContenido;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.ErrorUI;
import modelo.Pelicula;
/**
 * 
 * @author Adrián Fernández García
 */
public class OperacionesPelicula extends javax.swing.JFrame implements ErrorUI {

    private final JFrame principal;
    //archivo donde guardar la imagen de portada
    private File archivoPortada;
    //lista de actores
    private final ArrayList<String> actores = new ArrayList<>();
    //lista con los titulos de los contenidos
    private final ArrayList<String> titulosPeliculas = new ArrayList<>();
    //flag que determina si el contenido va a modificarse o a crearse
    private boolean modificar = false;
    //indice de modificación
    private int indice;
    //gestor de la imágen de portada
    private GestorImagenesContenido gestor = new GestorImagenesContenido();

    //Constructor para añadir una nueva película
    public OperacionesPelicula(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);

    }

    //Constructor para modificar una película
    public OperacionesPelicula(JFrame v, int indice) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        modificar = true;
        this.indice = indice;

        //cargar los datos de la pelicula a modificar.
        Pelicula pelicula = (Pelicula) GestionContenido.contenidos.get(indice);
        tfTitulo.setText(pelicula.getTitulo());
        cbGenero.setSelectedItem(pelicula.getGenero());
        tfAnio.setText(String.valueOf(pelicula.getAnio()));
        taSinopsis.setText(pelicula.getSinopsis());
        actores.addAll(pelicula.getActores());
        archivoPortada = new File("imagenes/" + pelicula.getTitulo() + ".jpg");
        tfDuracion.setText(String.valueOf(pelicula.getDuracionMinutos()));
        tfDirector.setText(pelicula.getDirector());

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelAnio = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        labelActores = new javax.swing.JLabel();
        labelCorreo1 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        tfTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSinopsis = new javax.swing.JTextArea();
        tfAnio = new javax.swing.JFormattedTextField();
        tfActores = new javax.swing.JTextField();
        tfDuracion = new javax.swing.JFormattedTextField();
        labelDirector = new javax.swing.JLabel();
        tfDirector = new javax.swing.JTextField();
        botonImagen = new javax.swing.JButton();
        labelPortada = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        botonActores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador_GestionPelicula");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelAnio.setText("Año");

        labelDuracion.setText("Duración");

        labelActores.setText("Actores");

        labelCorreo1.setText("Sinopsis");

        labelCorreo.setText("Género");

        labelDNI.setText("Titulo");

        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taSinopsis.setColumns(2);
        taSinopsis.setLineWrap(true);
        taSinopsis.setRows(5);
        taSinopsis.setTabSize(5);
        taSinopsis.setAutoscrolls(false);
        jScrollPane1.setViewportView(taSinopsis);

        try {
            tfAnio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfDuracion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelDirector.setText("Director");

        botonImagen.setText("AÑADIR IMÁGEN");
        botonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenActionPerformed(evt);
            }
        });

        labelPortada.setText("Portada");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventuras", "Ciencia-Ficción", "Suspense" }));

        botonActores.setText("AÑADIR ACTOR");
        botonActores.setPreferredSize(new java.awt.Dimension(6, 22));
        botonActores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfAnio))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(labelDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfTitulo)
                                .addComponent(cbGenero, 0, 166, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelDirector)
                            .addGap(18, 18, 18)
                            .addComponent(tfDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfDuracion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelActores)
                            .addComponent(labelPortada))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(tfActores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonActores, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDNI)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCorreo)
                                    .addComponent(botonImagen)
                                    .addComponent(labelPortada)
                                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelActores)
                                    .addComponent(tfActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDuracion)
                                    .addComponent(tfDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDirector)
                                    .addComponent(tfDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAnio)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(757, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * Comprueba que el String introducido no esté vacío.
     * @param cadena cadena a comprobar.
     * @return true si la cadena está vacío.
     */
    private boolean comprobarNulo(String cadena) {

        return cadena.isEmpty();
    }

    /**
     * El título es el ID de los contenidos.
     * Este método comprueba que el título a añadir no sea el de otro contenido ya añadido.
     * @param titulo
     * @return true si el título está repetido.
     */
    private boolean tituloRepetido(String titulo) {

        GestionContenido.contenidos.forEach(c -> {

            titulosPeliculas.add(c.getTitulo().toLowerCase());

        });

        return titulosPeliculas.contains(titulo.toLowerCase());

    }

    /**
     * Método que comprueba que todos los campos del registro han sido rellenados correctamente.
     * @param evt 
     */
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        //Caso en el que alguno de los campos(o todos) no ha sido rellenado.
        if ((comprobarNulo(tfTitulo.getText())) || (comprobarNulo(tfAnio.getText())) || (comprobarNulo(taSinopsis.getText())) || (comprobarNulo(labelActores.getText())) || (comprobarNulo(tfDuracion.getText())) || (comprobarNulo(tfDirector.getText()))) {
            MostrarError("Todos los campos deben ser rellenados", ERROR_MESSAGE);
        } //Caso en el que la imagen no se ha asignado
        else if (archivoPortada == null) {
            MostrarError("Se debe introducir una imágen de portada.", ERROR_MESSAGE);
        } else if (actores.isEmpty()) {
            MostrarError("Se debe añadir al menos un actor.", ERROR_MESSAGE);
        } else if (tituloRepetido(tfTitulo.getText()) && (!modificar)) {
            MostrarError("El contenido introducido ya se encuentra en la plataforma.", ERROR_MESSAGE);
        } //Si no hay nulos ni errores de formato: crear el contenidp e introducirlo en la lista.
        else {
            Pelicula peliculaRegistrada;
            System.out.println(cbGenero.getSelectedItem().toString());
            try {

                peliculaRegistrada = new Pelicula(tfTitulo.getText(), taSinopsis.getText(), cbGenero.getSelectedItem().toString(), Integer.parseInt(tfAnio.getText()),
                    actores, new ImageIcon(ImageIO.read(gestor.escalarImagen(archivoPortada, tfTitulo.getText()))),
                        Integer.parseInt(tfDuracion.getText()), tfDirector.getText());

                if (!modificar) {
                    GestionContenido.crearContenido(peliculaRegistrada);
                } else {
                    GestionContenido.modificarContenido(peliculaRegistrada, indice);
                    dispose();
                }

            } catch (IOException ex) {
                Logger.getLogger(OperacionesPelicula.class.getName()).log(Level.SEVERE, null, ex);
            }

            //resetear campos para añadir una nueva película
            tfTitulo.setText("");
            taSinopsis.setText("");
            cbGenero.setSelectedIndex(0);
            tfAnio.setText("");
            tfActores.setText("");
            tfDuracion.setText("");
            tfDirector.setText("");

        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    /**
     * Método que añade la imágen de portada de la serie.ç
     * @see controlador.GestorImagenesContenido
     * @param evt 
     */
    private void botonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenActionPerformed

        archivoPortada = gestor.seleccionarImagen(archivoPortada, this);

    }//GEN-LAST:event_botonImagenActionPerformed

    /**
     * Método que comprueba que el campo de los actores no esté vacío y los añade a la lista de actores.
     * @param evt 
     */
    private void botonActoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActoresActionPerformed
        if (!(tfActores.getText().equals(""))) {
            actores.add(tfActores.getText());
            tfActores.setText("");
        } else {
            MostrarError("El nombre del actor a añadir no puede estar vacío", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonActoresActionPerformed

    @Override
    public void MostrarError(String textoError, int tipoMensaje) {
        JOptionPane.showMessageDialog(this, textoError, "Error", tipoMensaje);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonActores;
    private javax.swing.JButton botonImagen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelActores;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCorreo1;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDirector;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelPortada;
    private javax.swing.JTextArea taSinopsis;
    private javax.swing.JTextField tfActores;
    private javax.swing.JFormattedTextField tfAnio;
    private javax.swing.JTextField tfDirector;
    private javax.swing.JFormattedTextField tfDuracion;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
