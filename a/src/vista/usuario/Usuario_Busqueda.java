package vista.usuario;

import controlador.GestionClientes;
import controlador.GestionContenido;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import modelo.Calificacion;
import modelo.Cliente;
import modelo.Contenido;

public class Usuario_Busqueda extends javax.swing.JFrame {

    private final Cliente clienteIniciado = Usuario.usuarioLogueado;
    private final ArrayList<Contenido> contenidos = GestionContenido.contenidos;
    private final JFrame principal;
    private final DefaultListModel modeloLista = new DefaultListModel();
    //Flag booleano que determina si el usuario ha realizado una búsqueda o no.
    private boolean buscado = false;

    /**
     * Constructor
     *
     * @param v
     */
    public Usuario_Busqueda(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        this.labelError.setVisible(false);
        disposicionLista(contenidos);

    }

    /**
     * Dispone la lista dada en el JList
     *
     * @param contenidos lista a presentar.
     */
    private void disposicionLista(ArrayList<Contenido> contenidos) {

        //Crear un modelo de lista, rellenarlo y añadirlo al JList
        modeloLista.clear();

        contenidos.forEach(c -> {
            modeloLista.addElement(c);

        });

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
        labelError = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        botonCalificar = new javax.swing.JButton();
        botonFavoritos = new javax.swing.JButton();

        jLabel2.setText("Filtros");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Contenidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
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

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Acción", "Aventuras", "Ciencia-FIcción", "Suspense" }));

        labelActor.setText("Actor");

        labelAnio.setText("Año");

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        labelError.setForeground(new java.awt.Color(204, 0, 0));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("jLabel3");

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 0, 0));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Calificación");

        botonCalificar.setText("CALIFICAR");
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(labelBusqueda)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelActor)
                                                .addComponent(labelAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(botonBuscar)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tfActor)
                                                    .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel3)
                                            .addGap(55, 55, 55)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(botonCalificar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonFavoritos)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonFavoritos)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBusqueda)
                            .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfGenero)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelActor)
                            .addComponent(tfActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAnio)
                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(botonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(botonCalificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelError)))
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
                    } else if ((c.getGenero().equals(cbGenero.getSelectedItem().toString())) && !(busquedaFiltro.contains(c))) {
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

        if (!(jList1.isSelectionEmpty())) {
            if (!buscado) {

                if (!(clienteIniciado.getListaSeguimiento().contains(GestionContenido.contenidos.get(jList1.getSelectedIndex())))) {
                    Usuario.usuarioLogueado.getListaSeguimiento().add(GestionContenido.contenidos.get(jList1.getSelectedIndex()));
                    GestionClientes.guardarClientes();
                }

            } else {
                GestionContenido.contenidos.forEach((c) -> {
                    for (Object co : modeloLista.toArray()) {
                        if (c.equals((Contenido) co)) {
                            if (!(clienteIniciado.getListaSeguimiento().contains((Contenido) co))) {
                                Usuario.usuarioLogueado.getListaSeguimiento().add((Contenido) co);
                                GestionClientes.guardarClientes();

                            }

                        }

                    }
                });
            }

        } else {
            //error

        }


    }//GEN-LAST:event_botonFavoritosActionPerformed

    /**
     * Método para la calificación de contenidos.
     *
     * @param evt evento del botón de calificar.
     */
    private void botonCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalificarActionPerformed
        boolean calificado = false;
        Calificacion calificacion = null;

        //Primero comprobar que no se haya buscado
        //Esto es necesario porque al buscar los índices se desincronizan con la lista y se referenciarían objetos erróneos.
        if (buscado) {
            for (Contenido c : GestionContenido.contenidos) {

                for (Object co : modeloLista.toArray()) {
                    if (c.equals((Contenido) co)) {
                        calificacion = new Calificacion((Integer) jSpinner1.getValue(), Usuario.usuarioLogueado, (Contenido) co);
                    }

                }
            }
        } //Si no se ha buscado, referenciar el indice de la JList para crear el objeto
        else {
            calificacion = new Calificacion((Integer) jSpinner1.getValue(), Usuario.usuarioLogueado, contenidos.get(jList1.getSelectedIndex()));
        }

        if (jList1.isSelectionEmpty() || calificacion == null) {
            //error
        } //Si el cliente no había calificado nada antes 
        else if (clienteIniciado.getCalificaciones().isEmpty()) {
            agregarCalificacion(calificacion);
        } else {

            for (Calificacion contenido : clienteIniciado.getCalificaciones()) {
                //Comprobar que el cliente no haya calificado antes el mismo contenido.
                //Si esto ocurre, se modificará la calificación en vez de añadirla de nuevo a a la lista.
                if (contenido.equals(calificacion)) {
                    calificado = true;
                }
                //Si el cliente no ha calificado el contenido seleccionado.

            }

            if (!calificado) {
                agregarCalificacion(calificacion);

            }

            //Recorrer y comprobar ambas listas y sobreescribir puntuaciones.
            if (calificado) {

                //modificar la calificación de las listas de clientes.
                clienteIniciado.getCalificaciones().forEach((cal) -> {
                    cal.setPuntuacion((Integer) jSpinner1.getValue());
                });

                //modificar la calificación de las listas de contenidos.
                contenidos.forEach((contenido) -> {
                    contenido.getCalificaciones().stream().filter((calificacionContenido) -> (calificacionContenido.equals(calificacionContenido))).forEachOrdered((cal) -> {
                        cal.setPuntuacion((Integer) jSpinner1.getValue());
                    });
                });

            }

            //modificar la nota media del contenido calificado
            calcularMediaCalificacion(calificacion.getContenidoCalificado());
            //guardar cambios en los ficheros correspondientes
            guardarCambiosCalificacion();
            disposicionLista(contenidos);

        }


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
        contenidos.set(jList1.getSelectedIndex(), contenido);
    }

    private void agregarCalificacion(Calificacion calificacionAgregar) {
        clienteIniciado.getCalificaciones().add(calificacionAgregar);
        contenidos.get(jList1.getSelectedIndex()).getCalificaciones().add(calificacionAgregar);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCalificar;
    private javax.swing.JButton botonFavoritos;
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
    private javax.swing.JLabel labelError;
    private javax.swing.JTextField tfActor;
    private javax.swing.JFormattedTextField tfAnio;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JLabel tfGenero;
    // End of variables declaration//GEN-END:variables
}
