package vista.usuario;

import controlador.GestionClientes;
import controlador.GestionContenido;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.Calificacion;
import modelo.Cliente;
import modelo.Contenido;
import modelo.ErrorUI;
import modelo.ListaContenidos;
import modelo.PlantillaLista;
/**
 * 
 * @author Adrián Fernández García
 */
public class Usuario_Busqueda extends javax.swing.JFrame implements ListaContenidos, ErrorUI {

    //usuario que ha iniciado sesion
    private final Cliente clienteIniciado = Usuario.usuarioLogueado;
    private final JFrame principal;
    //modelo del jList
    private final DefaultListModel modeloLista = new DefaultListModel();
    //Flag booleano que determina si el usuario ha realizado una búsqueda o no.
    private boolean buscado = false;

    /**
     * Constructor
     *
     * @param v ventana anterior
     */
    public Usuario_Busqueda(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        disposicionLista(GestionContenido.contenidos);

    }

    /**
     * Dispone la lista especificada en el JList
     *
     * @param contenidos lista a presentar.
     */
    @Override
    public final void disposicionLista(ArrayList<Contenido> contenidos) {

        //Crear un modelo de lista, rellenarlo y añadirlo al JList
        modeloLista.clear();

        modeloLista.addAll(contenidos);

        jList1.setCellRenderer(new PlantillaLista());
        jList1.setModel(modeloLista);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelBusqueda = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        tfGenero = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        labelActor = new javax.swing.JLabel();
        tfActor = new javax.swing.JTextField();
        labelAnio = new javax.swing.JLabel();
        tfAnio = new javax.swing.JFormattedTextField();
        botonBuscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        botonCalificar = new javax.swing.JButton();
        botonFavoritos = new javax.swing.JButton();
        botonRefrescar = new javax.swing.JButton();

        jLabel2.setText("Filtros");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuario_Contenidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR CONTENIDO");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane1.setViewportView(jList1);

        labelBusqueda.setText("Palabra Clave");

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 0, 0));

        tfGenero.setText("Genero");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Acción", "Aventuras", "Ciencia-Ficción", "Comedia", "Crimen", "Drama", "Misterio", "Suspense" }));

        labelActor.setText("Actor");

        labelAnio.setText("Año");

        botonBuscar.setText("BUSCAR");
        botonBuscar.setPreferredSize(new java.awt.Dimension(87, 23));
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 0, 0));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner1.setToolTipText("");
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Calificación");

        botonCalificar.setText("CALIFICAR");
        botonCalificar.setToolTipText("Pulsa para calificar");
        botonCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalificarActionPerformed(evt);
            }
        });

        botonFavoritos.setText("AÑADIR A FAVORITOS");
        botonFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFavoritosActionPerformed(evt);
            }
        });

        botonRefrescar.setText("REFRESCAR");
        botonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonFavoritos))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelActor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfActor)
                                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addGap(37, 37, 37)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(botonCalificar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonRefrescar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBusqueda))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGenero)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelActor)
                            .addComponent(tfActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnio))
                        .addGap(29, 29, 29)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(botonCalificar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(botonRefrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonFavoritos)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(717, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que gestiona la búsqueda de contenidos.
     */
    private void realizarBusqueda() {

        ArrayList<Contenido> busquedaPalabraClave = new ArrayList();
        ArrayList<Contenido> busquedaFiltro = new ArrayList<>();
        boolean resultadoGenero = true;
        boolean resultadoActor = true;
        boolean resultadoAnio = true;

        //Primero usar filtros sobre la lista general de contenidos.
        // Flitrar por Género  
        if (!(cbGenero.getSelectedIndex() == 0)) {

            GestionContenido.contenidos.stream().filter((c) -> ((c.getGenero().equals(cbGenero.getSelectedItem().toString())))).forEachOrdered((c) -> {
                busquedaFiltro.add(c);
            }); //en este caso no es necesario comprobar repetidos, ya que es el primer filtro y las listas están vacías.

        }

        //Filtrar por actor
        if (!(tfActor.getText().isEmpty())) {
            for (Contenido c : GestionContenido.contenidos) {

                for (String actor : c.getActores()) {

                    //Si el filtro no coincide y el elemento ya ha sido agregado antes, se marca el flag correspondiente como falso.
                    if (!(actor.equals(tfActor.getText())) && (busquedaFiltro.contains(c))) {
                        resultadoGenero = false;
                    } else if ((actor.toLowerCase().equals(tfActor.getText().toLowerCase())) && !(busquedaFiltro.contains(c))) {
                        busquedaFiltro.add(c);
                    }

                }

            }

        }

        //Filtrar por año de lanzamiento.
        if (!(tfAnio.getText().isEmpty())) {

            for (Contenido c : GestionContenido.contenidos) {

                //Si el filtro no coincide y el elemento ya ha sido agregado antes, se marca el flag correspondiente como falso.
                if (!(c.getAnio() == Integer.parseInt(tfAnio.getText())) && (busquedaFiltro.contains(c))) {
                    resultadoGenero = false;
                } //Si pasa el filtro, comprobar que no esté añadido ya y en ese caso, añadirlo.
                else if ((c.getAnio() == Integer.parseInt(tfAnio.getText())) && !(busquedaFiltro.contains(c))) {
                    busquedaFiltro.add(c);
                }

            }

        }

        //Si alguno de los filtros da como no válido se vacia la lista, ya que no es válido.
        if (!resultadoGenero || !resultadoActor || !resultadoAnio) {
            busquedaFiltro.clear();
        }

        //Después, comprobar si se ha buscado por palabra clave
        if (!(tfBusqueda.getText().isEmpty())) {

            //Si se han aplicado filtros, entonces filtrar por palabra clave sobre la lista con los resultados de estos.
            if (!(tfAnio.getText().isEmpty()) || !(tfAnio.getText().isEmpty()) || !(cbGenero.getSelectedIndex() == 0)) {

                busquedaFiltro.stream().filter((c) -> ((c.getTitulo().toLowerCase().contains(tfBusqueda.getText().toLowerCase())))).forEachOrdered((c) -> {
                    busquedaPalabraClave.add(c);
                });

            } //Si no se han aplicado filtros, filtrar por palabra clave sobre la lista general de contenidos.
            else {
                GestionContenido.contenidos
                        .stream()
                        .filter(busqueda -> (busqueda.getTitulo().toLowerCase().contains(tfBusqueda.getText().toLowerCase())))
                        .forEach(c -> busquedaPalabraClave.add(c));

            }

            disposicionLista(busquedaPalabraClave);
        } else {
            disposicionLista(busquedaFiltro);
        }
        buscado = true;

    }

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        realizarBusqueda();

    }//GEN-LAST:event_botonBuscarActionPerformed


    private void botonFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFavoritosActionPerformed

        if (jList1.isSelectionEmpty()) {
            MostrarError("Seleccione un contenido para añadirlo a favoritos.", ERROR_MESSAGE);

        } else {
            
            Contenido c = (Contenido) modeloLista.get(jList1.getSelectedIndex());
            
            Usuario.usuarioLogueado.getListaSeguimiento().add(c);

        }


    }//GEN-LAST:event_botonFavoritosActionPerformed

    /**
     * Método para la calificación de contenidos.
     *
     * @param evt evento del botón de calificar.
     */
    private void botonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalificarActionPerformed
        boolean calificado = false;
        Calificacion calificacion;

        if (jList1.isSelectionEmpty()) {
            MostrarError("Seleccione un contenido para calificarlo", ERROR_MESSAGE);
        } //Si el cliente no había calificado nada antes 
        else if (clienteIniciado.getCalificaciones().isEmpty()) {
            calificacion = new Calificacion((Integer) jSpinner1.getValue(), Usuario.usuarioLogueado, (Contenido) modeloLista.get(jList1.getSelectedIndex()));
            agregarCalificacion(calificacion);
            //calcular la nota media del contenido calificado.
            calcularMediaCalificacion(calificacion.getContenidoCalificado());
        } else {

            calificacion = new Calificacion((Integer) jSpinner1.getValue(), Usuario.usuarioLogueado, (Contenido) modeloLista.get(jList1.getSelectedIndex()));

            Contenido c = (Contenido) modeloLista.get(jList1.getSelectedIndex());

            //cambiar la puntuación de la calificación en la lista del cliente y en la de los contenidos.
            for (Calificacion cal : c.getCalificaciones()) {

                if (cal.equals(calificacion)) {
                    //actualizar puntuacion
                    cal.setPuntuacion((Integer) jSpinner1.getValue());
                    calificado = true;
                }

            }

            for (Calificacion cal : clienteIniciado.getCalificaciones()) {
                if (cal.equals(calificacion)) {
                    cal.setPuntuacion((Integer) jSpinner1.getValue());
                }
            }

            //Si es una nueva calificación, entonces agregarla a las listas.
            if (!calificado) {
                clienteIniciado.getCalificaciones().add(calificacion);
                c.getCalificaciones().add(calificacion);
            }
            //volver a calcular la nota media del contenido calificado.
            calcularMediaCalificacion(calificacion.getContenidoCalificado());
            buscado = false;
        }

        //guardar cambios en los ficheros correspondientes
        guardarCambiosCalificacion();
        GestionContenido.cargarContenido();
        disposicionLista(GestionContenido.contenidos);
    }//GEN-LAST:event_botonCalificarActionPerformed

    /**
     * Calcula la nota media del contenido seleccionado
     *
     * @param contenido contenido del que se quiere calcular su puntuación
     * media.
     */
    private void calcularMediaCalificacion(Contenido contenido) {

        double calificacionTotal = 0;
        int numResultados = 0;
        //recorrer la lista de calificaciones del contenido calificado
        for (Calificacion cl : contenido.getCalificaciones()) {
            //sumar todas las puntuaciones
            calificacionTotal += cl.getPuntuacion();
            //incrementar por cada calificacion de usuarios distintos
            numResultados++;

        }
        //cambiar la nota media del contenido dividiendo la puntuación total entre el número de clientes que lo han calificado.
        contenido.setMediaPuntuaciones(calificacionTotal / numResultados);

    }

    private void agregarCalificacion(Calificacion calificacionAgregar) {
        clienteIniciado.getCalificaciones().add(calificacionAgregar);
        GestionContenido.contenidos.get(jList1.getSelectedIndex()).getCalificaciones().add(calificacionAgregar);

    }

    private void guardarCambiosCalificacion() {
        jSpinner1.setValue(0);
        GestionContenido.guardarContenido();
        GestionClientes.guardarClientes();
    }

    /**
     * Permite al usuario buscar escribiendo palabras y/o aplicando filtros de
     * búsqueda.
     */

     private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void botonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescarActionPerformed
        disposicionLista(GestionContenido.contenidos);
    }//GEN-LAST:event_botonRefrescarActionPerformed

    @Override
    public void MostrarError(String textoError, int tipoMensaje) {
        JOptionPane.showMessageDialog(this, textoError, "Error", tipoMensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCalificar;
    private javax.swing.JButton botonFavoritos;
    private javax.swing.JButton botonRefrescar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel labelActor;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelBusqueda;
    private javax.swing.JTextField tfActor;
    private javax.swing.JFormattedTextField tfAnio;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JLabel tfGenero;
    // End of variables declaration//GEN-END:variables

}
