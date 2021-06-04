package vista.usuario;

import controlador.GestionContenido;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import modelo.Contenido;

public class Usuario_Busqueda extends javax.swing.JFrame{

    private final JFrame principal;

    /**
     * Constructor
     * @param v
     */
    public Usuario_Busqueda(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        this.labelError.setVisible(false);
        disposicionLista(GestionContenido.contenidos);
        

    }

    private void disposicionLista(ArrayList<Contenido> contenidos) {

        //Crear un modelo de lista, rellenarlo y añadirlo al JList
        DefaultListModel modeloLista = new DefaultListModel();

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

        jLabel2.setText("Filtros");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Introducir");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(labelBusqueda)
                                        .addGap(12, 12, 12)
                                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
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
                        .addGap(28, 28, 28)
                        .addComponent(labelError)))
                .addGap(27, 27, 27))
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

        setSize(new java.awt.Dimension(717, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        realizarBusqueda();

    }//GEN-LAST:event_botonBuscarActionPerformed

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

    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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
