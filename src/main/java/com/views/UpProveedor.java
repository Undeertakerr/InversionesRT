/**
 * UpProveedor.java
 * Esta clase representa la interfaz de usuario para registrar proveedores en el sistema.
 * Proporciona campos y controles para ingresar y validar la información de un proveedor, y permite 
 * registar la información de los campos en la base de datos.
 * Este archivo es parte del paquete "com.views".
 *
 * Este archivo es parte de InversionesRT.
 *
 * InversionesRT es software libre: puedes redistribuirlo y/o modificarlo
 * bajo los términos de la Licencia Pública General GNU publicada por
 * la Free Software Foundation, ya sea la versión 3 de la Licencia, o
 * (a su elección) cualquier versión posterior.
 *
 * InversionesRT se distribuye con la esperanza de que sea útil,
 * pero SIN NINGUNA GARANTÍA; incluso sin la garantía implícita de
 * COMERCIABILIDAD o APTITUD PARA UN PROPÓSITO PARTICULAR. Consulta la
 * Licencia Pública General GNU para más detalles.
 *
 * Deberías haber recibido una copia de la Licencia Pública General GNU
 * junto con [nombre del proyecto]. En caso contrario, consulta
 * <https://www.gnu.org/licenses/gpl-3.0.html>.
 */
package com.views;

import java.awt.Color;
import com.clase.bd.Conexion;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UpProveedor extends javax.swing.JPanel {

    public UpProveedor() {
        initComponents();
        initStyles();
        propertyTextArea();
    }

    private void initStyles() {
        // Tipografía para los títulos de los campos.
        tituloRegistrar.putClientProperty("FlatLaf.styleClass", "h1");
        tituloRegistrar.setForeground(new java.awt.Color(90, 58, 201));

        tituloNombre.putClientProperty("FlatLaf.styleClass", "h3");
        tituloNombre.setForeground(Color.DARK_GRAY);

        tituloApellido.putClientProperty("FlatLaf.styleClass", "h3");
        tituloApellido.setForeground(Color.DARK_GRAY);

        tituloDireccion.putClientProperty("FlatLaf.styleClass", "h3");
        tituloDireccion.setForeground(Color.DARK_GRAY);

        tituloTelefono.putClientProperty("FlatLaf.styleClass", "h3");
        tituloTelefono.setForeground(Color.DARK_GRAY);

        // Texto dentro de los campos, indicando la información que se debe introducir.
        campoNombre.putClientProperty("JTextField.placeholderText", "Ingrese el nombre.");
        campoApellido.putClientProperty("JTextField.placeholderText", "Ingrese el apellido.");
        campoTelefono.putClientProperty("JTextField.placeholderText", "Ingrese el teléfono.");

        botonRegistrar.putClientProperty("JButton.buttonType", "roundRect");

    }

    // Realiza el salto de línea automático y se ajusta el texto al TextArea.
    private void propertyTextArea() {
        textAreaDireccion.setLineWrap(true);
        textAreaDireccion.setWrapStyleWord(true);

        String placeholder = "Ingrese la dirección del proveedor.";

        textAreaDireccion.setText(placeholder);
        textAreaDireccion.setForeground(Color.GRAY);

        textAreaDireccion.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textAreaDireccion.getText().equals(placeholder)) {
                    textAreaDireccion.setText("");
                    textAreaDireccion.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textAreaDireccion.getText().isEmpty()) {
                    textAreaDireccion.setText(placeholder);
                    textAreaDireccion.setForeground(Color.GRAY);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloRegistrar = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        tituloApellido = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        tituloDireccion = new javax.swing.JLabel();
        scrollPaneDescripcion = new javax.swing.JScrollPane();
        textAreaDireccion = new javax.swing.JTextArea();
        separadorMitad = new javax.swing.JSeparator();
        tituloTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(0, 0, 0));

        tituloRegistrar.setText("Registrar Proveedor");

        tituloNombre.setText("Nombre");

        tituloApellido.setText("Apellido");

        tituloDireccion.setText("Dirección");

        textAreaDireccion.setColumns(20);
        textAreaDireccion.setRows(5);
        scrollPaneDescripcion.setViewportView(textAreaDireccion);

        separadorMitad.setForeground(new java.awt.Color(204, 204, 204));
        separadorMitad.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tituloTelefono.setText("Teléfono");

        botonRegistrar.setBackground(new java.awt.Color(90, 58, 201));
        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoApellido)
                            .addComponent(campoNombre)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(124, 124, 124)))
                        .addGap(116, 116, 116)
                        .addComponent(separadorMitad, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(tituloDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(184, 184, 184))
                            .addComponent(scrollPaneDescripcion)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(tituloTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(188, 188, 188))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(campoTelefono)
                                .addGap(66, 66, 66)))
                        .addGap(90, 90, 90))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(tituloRegistrar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(292, 292, 292))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloRegistrar)
                .addGap(24, 32, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(tituloDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(tituloNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(separadorMitad))
                .addGap(147, 147, 147)
                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed

        // Recoge los datos introducidos en los campos (JTextField).
        String nombre = campoNombre.getText().trim();
        String apellido = campoApellido.getText().trim();
        String direccion = textAreaDireccion.getText().trim();
        String telefono = campoTelefono.getText().trim();

        // Límites de caracteres.
        int maxCaracteresNombre = 30;
        int maxCaracteresApellido = 30;
        int maxCaracteresTelefono = 11;

        // Validación de formato de número de teléfono
        Pattern patternTelefono = Pattern.compile("^\\d{11}$");
        Matcher matcherTelefono = patternTelefono.matcher(telefono);

        if (!matcherTelefono.matches()) {
            JOptionPane.showMessageDialog(null, "El formato del número de teléfono no es válido.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de campos vacíos.
        if (nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validación de longitud de campos
        if (nombre.length() > maxCaracteresNombre || apellido.length() > maxCaracteresApellido
                || telefono.length() > maxCaracteresTelefono) {
            JOptionPane.showMessageDialog(null, "Se ha excedido el límite de caracteres en uno o más campos.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar la longitud de la dirección
        if (direccion.length() > 100) { // Ajusta el tamaño máximo permitido según tu estructura de tabla
            JOptionPane.showMessageDialog(null, "La dirección es demasiado larga. Por favor, ingresa una dirección más corta.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso de registro
        }

        // Validación de existencia de Teléfono.
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT telefono FROM proveedor WHERE telefono = ?");

            pst.setString(1, telefono);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El número de teléfono se encuentra registrado.", "Advertencia",
                        JOptionPane.WARNING_MESSAGE);

                cn.close();

            } else {
                cn.close();

                // Insertación de datos en la BD y método para limpiar los campos.
                try {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "INSERT INTO proveedor (nombre, apellido, direccion, telefono) VALUES (?, ?, ?, ?)");

                    pst2.setString(1, nombre);
                    pst2.setString(2, apellido);
                    pst2.setString(3, direccion);
                    pst2.setString(4, telefono);

                    pst2.executeUpdate();
                    cn2.close();

                    // Método para vaciar los campos.
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "Se ha registrado el proveedor con éxito.",
                            "Información", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException e) {
                    System.err.println("Error en registrar proveedor" + e);
                    JOptionPane.showMessageDialog(null, "¡Error al registrar proveedor! Póngase en "
                            + "contacto con el Administrador.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.err.println("Error en validar el teléfono." + e);
            JOptionPane.showMessageDialog(null, "¡Error al comparar el teléfono! Póngase en "
                    + "contacto con el Administrador.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JScrollPane scrollPaneDescripcion;
    private javax.swing.JSeparator separadorMitad;
    private javax.swing.JTextArea textAreaDireccion;
    private javax.swing.JLabel tituloApellido;
    private javax.swing.JLabel tituloDireccion;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloRegistrar;
    private javax.swing.JLabel tituloTelefono;
    // End of variables declaration//GEN-END:variables

    // Vacia los campos una vez registrado el usuario.
    public void limpiarCampos() {
        campoNombre.setText("");
        campoApellido.setText("");
        textAreaDireccion.setText("");
        campoTelefono.setText("");
    }
}