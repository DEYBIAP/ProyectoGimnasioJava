
package Interfaz_Login;

import Gimnasio.ConexionLocal;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.util.Date;

public class RegistrarPaga extends javax.swing.JFrame {

    String usuario,cliente,nombreCliente,apellidopaternoCliente,apellidoMaternoCliente;
    int ID_Usuario;
 
    public RegistrarPaga() {
        initComponents();
        usuario = LogIn.user;
        ID_Usuario=Integer.parseInt(LogIn.id_Usuario);
        nombreCliente= RegistrarCliente.nombreClienteNuevo;
        apellidopaternoCliente= RegistrarCliente.apellidopaternoClienteNuevo;
        apellidoMaternoCliente= RegistrarCliente.apellidomaternoClienteNuevo;
        cliente=""+nombreCliente+" "+apellidopaternoCliente+" "+apellidoMaternoCliente;
        txt_NombredelCliente.setText(cliente);
        txt_MontoPago.setText("50");
        setTitle("Registro de Nuevo Pago");
        setSize(630,350);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl_FondoRegistrarPaga, "E:\\7to ciclo\\Java\\JavaApplication2\\Proyecto_Gimnasio\\src\\Imagenes\\fondo.jpg");
        this.repaint();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        lbl_TituloRegistroPago = new javax.swing.JLabel();
        lbl_NombreNuevoCliente = new javax.swing.JLabel();
        txt_NombredelCliente = new javax.swing.JTextField();
        lbl_MembresiaRegistrarPaga = new javax.swing.JLabel();
        cmb_Membresia = new javax.swing.JComboBox<>();
        lbl_MontoRegistrarPaga = new javax.swing.JLabel();
        txt_MontoPago = new javax.swing.JTextField();
        lbl_FechaInicial = new javax.swing.JLabel();
        cal_FechaInicio = new rojeru_san.componentes.RSDateChooser();
        lbl_FechaFinal = new javax.swing.JLabel();
        cal_FechaFin = new rojeru_san.componentes.RSDateChooser();
        btn_AceptarNuevoPago = new javax.swing.JButton();
        btn_CancelarNuevoPago = new javax.swing.JButton();
        lbl_FondoRegistrarPaga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_TituloRegistroPago.setFont(new java.awt.Font("Leelawadee UI", 3, 24)); // NOI18N
        lbl_TituloRegistroPago.setForeground(new java.awt.Color(255, 102, 0));
        lbl_TituloRegistroPago.setText("Registro de Pago");
        getContentPane().add(lbl_TituloRegistroPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 200, -1));

        lbl_NombreNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_NombreNuevoCliente.setForeground(new java.awt.Color(255, 102, 0));
        lbl_NombreNuevoCliente.setText("Cliente:");
        getContentPane().add(lbl_NombreNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        txt_NombredelCliente.setEditable(false);
        txt_NombredelCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_NombredelCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NombredelCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_NombredelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombredelClienteActionPerformed(evt);
            }
        });
        txt_NombredelCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombredelClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_NombredelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 400, 30));

        lbl_MembresiaRegistrarPaga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_MembresiaRegistrarPaga.setForeground(new java.awt.Color(255, 102, 0));
        lbl_MembresiaRegistrarPaga.setText("Membresia:");
        getContentPane().add(lbl_MembresiaRegistrarPaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        cmb_Membresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 mes", "2 meses", "3 meses", "6 meses", "9 meses", "12 meses" }));
        cmb_Membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_MembresiaActionPerformed(evt);
            }
        });
        cmb_Membresia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmb_MembresiaKeyTyped(evt);
            }
        });
        getContentPane().add(cmb_Membresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, 30));

        lbl_MontoRegistrarPaga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_MontoRegistrarPaga.setForeground(new java.awt.Color(255, 102, 0));
        lbl_MontoRegistrarPaga.setText("Monto:");
        getContentPane().add(lbl_MontoRegistrarPaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 120, 30));

        txt_MontoPago.setEditable(false);
        txt_MontoPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_MontoPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MontoPago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_MontoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MontoPagoActionPerformed(evt);
            }
        });
        txt_MontoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MontoPagoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_MontoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 130, 30));

        lbl_FechaInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_FechaInicial.setForeground(new java.awt.Color(255, 102, 0));
        lbl_FechaInicial.setText("F. Inicial:");
        getContentPane().add(lbl_FechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 30));
        getContentPane().add(cal_FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, 30));

        lbl_FechaFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_FechaFinal.setForeground(new java.awt.Color(255, 102, 0));
        lbl_FechaFinal.setText("F. Final:");
        getContentPane().add(lbl_FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, 30));
        getContentPane().add(cal_FechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 190, 30));

        btn_AceptarNuevoPago.setText("Aceptar");
        btn_AceptarNuevoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarNuevoPagoActionPerformed(evt);
            }
        });
        btn_AceptarNuevoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_AceptarNuevoPagoKeyTyped(evt);
            }
        });
        getContentPane().add(btn_AceptarNuevoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 160, 40));

        btn_CancelarNuevoPago.setText("Cancelar");
        btn_CancelarNuevoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarNuevoPagoActionPerformed(evt);
            }
        });
        btn_CancelarNuevoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_CancelarNuevoPagoKeyTyped(evt);
            }
        });
        getContentPane().add(btn_CancelarNuevoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 160, 40));
        getContentPane().add(lbl_FondoRegistrarPaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombredelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombredelClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombredelClienteActionPerformed

    private void txt_NombredelClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombredelClienteKeyTyped
        char tecEnter= evt.getKeyChar();

        if(tecEnter==KeyEvent.VK_ENTER){
            btn_AceptarNuevoPago.doClick();

        }
    }//GEN-LAST:event_txt_NombredelClienteKeyTyped

    private void cmb_MembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_MembresiaActionPerformed
        int id_membresia;
        
        
        id_membresia= cmb_Membresia.getSelectedIndex()+1;
        switch (id_membresia) {
            case 1:
                txt_MontoPago.setText("50");
                break;
            case 2:
                txt_MontoPago.setText("80");
                break;
            case 3:
                txt_MontoPago.setText("100");
                break;
            case 4:
                txt_MontoPago.setText("180"); 
                break;
            case 5:
                txt_MontoPago.setText("240");
                break;
            default:
                txt_MontoPago.setText("300");
                break;
        }
        
    }//GEN-LAST:event_cmb_MembresiaActionPerformed

    private void cmb_MembresiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_MembresiaKeyTyped
        char tecEnter= evt.getKeyChar();

        if(tecEnter==KeyEvent.VK_ENTER){
            btn_AceptarNuevoPago.doClick();

        }
    }//GEN-LAST:event_cmb_MembresiaKeyTyped

    private void txt_MontoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MontoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MontoPagoActionPerformed

    private void txt_MontoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MontoPagoKeyTyped
        char tecEnter= evt.getKeyChar();

        if(tecEnter==KeyEvent.VK_ENTER){
            btn_AceptarNuevoPago.doClick();

        }
    }//GEN-LAST:event_txt_MontoPagoKeyTyped

    private void btn_AceptarNuevoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarNuevoPagoActionPerformed
        int id_membresia,error=0,id_clienteInsertar=0;
        String fechaFinal = "",fechaInicial="",nombre,apellidoPaterno,apellidoMaterno;
        int id_usuario;
        Date pa_Fecha;
        
        id_membresia= cmb_Membresia.getSelectedIndex()+1;
        
        
        nombre = nombreCliente;
        apellidoPaterno=apellidopaternoCliente;
        apellidoMaterno=apellidoMaternoCliente;
        id_usuario= ID_Usuario;
        if (cal_FechaInicio.getDatoFecha()== null ) {
            JOptionPane.showMessageDialog(this, "Selecciona una fecha ", "Error", JOptionPane.ERROR);
            
            
            
        } else {
            
            String formatoFecha = "yyyy-MM-dd";
            Date fecha1 = cal_FechaInicio.getDatoFecha();
            SimpleDateFormat formateador1 = new SimpleDateFormat(formatoFecha);
            fechaInicial = formateador1.format(fecha1);
        
        }
        
        if (cal_FechaFin.getDatoFecha()== null ) {
            JOptionPane.showMessageDialog(this, "Selecciona una fecha ", "Error", JOptionPane.ERROR);
            
            
            
        } else {
            
            String formatoFecha = "yyyy-MM-dd";
            Date fecha2 = cal_FechaFin.getDatoFecha();
            SimpleDateFormat formateador2 = new SimpleDateFormat(formatoFecha);
            fechaFinal = formateador2.format(fecha2);
        
        }
        System.out.println("Fecha inicial:" + fechaInicial);
        System.out.println("Fecha final:" + fechaFinal);
        if(fechaFinal==null){
            error++;
        }
        
        if(fechaInicial==null){
            error++;
        }

        try {
            Connection cn = ConexionLocal.Conexion();

            PreparedStatement pst = cn.prepareStatement("SELECT id_Cliente FROM tbl_Cliente "
                    + "WHERE cli_Nombre = '"+nombreCliente+"' and cli_ApellidoPaterno = '"+ apellidopaternoCliente 
                    + "' and cli_ApellidoMaterno = '"+ apellidoMaternoCliente + "' ");

            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int id_clienteprueba = rs.getInt("id_Cliente");
                System.out.println("ID: "+id_clienteprueba);
                id_clienteInsertar= id_clienteprueba;
                
            }
            else
                System.out.println("No se pudo Sacar el ID");
            /*System.out.println("ID: "+Array.getInt(rs, "id_Cliente"));//Prueba*/
            /*int id_Cliente=  rs.getInt("id_Cliente");//Error
            JOptionPane.showMessageDialog(null,"ID del cliente: "+id_Cliente);//Error
            System.out.println("ID: "+id_Cliente);//Prueba*/
            cn.close();
                if (!fechaInicial.equals("") && !fechaFinal.equals("")) {
                    try {
                        try (Connection cn2 = ConexionLocal.Conexion()) {
                            PreparedStatement pst2 = cn2.prepareStatement
                            ("INSERT INTO tbl_paga  VALUES (?,?,?,?,?,?,?)");

                            pst2.setInt(1, 0);//id_Paga
                            pst2.setInt(2, id_clienteInsertar);//id_Cliente
                            pst2.setInt(3, id_membresia);//id_Membresía
                            pst2.setDate(4, null);//TIMESTAMP-fecha
                            pst2.setString(5, fechaInicial);//FechaInicial
                            pst2.setString(6, fechaFinal);//FechaFinal
                            pst2.setInt(7, id_usuario);//Id_Usuario

                            pst2.executeUpdate();
                            
                        }
                        
                        JOptionPane.showMessageDialog(null,"Registro de Paga Exitoso");
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("No se pudo Registrar al Pago"+ e);
                        JOptionPane.showMessageDialog(null,"Error al Registrar Pago");
                        

                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Rellene todos los campos obligatorios");

                }

            
        } catch (SQLException e) {
            System.err.println("No se puedo validar el Pago");
            JOptionPane.showMessageDialog(null,"Error en la Base de Datos"+ e);
        }

        
        
    }//GEN-LAST:event_btn_AceptarNuevoPagoActionPerformed

    private void btn_AceptarNuevoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_AceptarNuevoPagoKeyTyped
        char tecEnter= evt.getKeyChar();

        if(tecEnter==KeyEvent.VK_ENTER){
            btn_AceptarNuevoPago.doClick();

        }
    }//GEN-LAST:event_btn_AceptarNuevoPagoKeyTyped

    private void btn_CancelarNuevoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarNuevoPagoActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelarNuevoPagoActionPerformed

    private void btn_CancelarNuevoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_CancelarNuevoPagoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarNuevoPagoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AceptarNuevoPago;
    private javax.swing.JButton btn_CancelarNuevoPago;
    private rojeru_san.componentes.RSDateChooser cal_FechaFin;
    private rojeru_san.componentes.RSDateChooser cal_FechaInicio;
    private javax.swing.JComboBox<String> cmb_Membresia;
    private javax.swing.JLabel lbl_FechaFinal;
    private javax.swing.JLabel lbl_FechaInicial;
    private javax.swing.JLabel lbl_FondoRegistrarPaga;
    private javax.swing.JLabel lbl_MembresiaRegistrarPaga;
    private javax.swing.JLabel lbl_MontoRegistrarPaga;
    private javax.swing.JLabel lbl_NombreNuevoCliente;
    private javax.swing.JLabel lbl_TituloRegistroPago;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private javax.swing.JTextField txt_MontoPago;
    private javax.swing.JTextField txt_NombredelCliente;
    // End of variables declaration//GEN-END:variables
    public void CamposVacios(){
        txt_NombredelCliente.setText("");
        txt_MontoPago.setText("");
        cmb_Membresia.setSelectedIndex(0);
    
    }

}
