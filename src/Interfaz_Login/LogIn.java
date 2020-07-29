
package Interfaz_Login;
import java.sql.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import Gimnasio.ConexionLocal;
import Gimnasio.ValidacionLetra;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class LogIn extends javax.swing.JFrame {

    public static String user= "";
    public static String id_Usuario="";
    String pass="";
    ValidacionLetra validarLetra =new ValidacionLetra();
    public LogIn() {
        
        initComponents();
        setSize(325,550);
        setResizable(false);
        setTitle("Login");
        
        this.setLocationRelativeTo(null);
        //Incrustación de imágenes escalables
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl_fondo, "E:\\7to ciclo\\Java\\JavaApplication2\\Proyecto_Gimnasio\\src\\Imagenes\\fondo.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl_logo, "E:\\7to ciclo\\Java\\JavaApplication2\\Proyecto_Gimnasio\\src\\Imagenes\\logo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usuario, "E:\\7to ciclo\\Java\\JavaApplication2\\Proyecto_Gimnasio\\src\\Imagenes\\icon_usuario.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lbl_password, "E:\\7to ciclo\\Java\\JavaApplication2\\Proyecto_Gimnasio\\src\\Imagenes\\icon_password.png");
        
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

        lbl_logo = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, 180));
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 50, 40));
        getContentPane().add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 50, 40));

        txt_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        txt_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 180, 40));

        btn_ingresar.setBackground(new java.awt.Color(255, 102, 0));
        btn_ingresar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        btn_ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_ingresarKeyTyped(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 240, 50));

        txt_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 180, 40));
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        btn_ingresar.setBackground(Color.red);
        user = txt_Usuario.getText().trim();
        pass = txt_Password.getText().trim();
        if(!user.equals("")|| !pass.equals("")){    //validación de espacios vacíos
            try {
                Connection cn= ConexionLocal.Conexion();    //Validación de login y/o password por medio de SQL
                PreparedStatement pst = cn.prepareStatement("Select usu_cargo, usu_estado , id_usuario from tbl_usuario "
                        + "where usu_Login = '"+ user + "' and usu_Password = '"+ pass + "'");
                
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    String id_cargo =rs.getString("usu_cargo");
                    String usu_estado = rs.getString("usu_estado");
                    String id_usuario1 = rs.getString("id_usuario");
                    id_Usuario= id_usuario1;
                    
                    if(id_cargo.equalsIgnoreCase("Administrador") && usu_estado.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                    
                    }else if(id_cargo.equalsIgnoreCase("Recepcionista") && usu_estado.equalsIgnoreCase("Activo")){
                        dispose();
                        new Recepcionista().setVisible(true);
                    }
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña incorrectos");
                    txt_Usuario.setText("");
                    txt_Password.setText("");
                }
                
                
            } catch (SQLException e) {
                System.err.print("Error en el boton acceder"+ e);
                JOptionPane.showMessageDialog(null,"Error al acceder a sesión\n Contacte al Proveedor.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Rellene todos los campos");
        }
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void txt_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyTyped
        validarLetra.soloLetras(evt);
        
        char tecEnter= evt.getKeyChar();
        
        if(tecEnter==KeyEvent.VK_ENTER){
            btn_ingresar.doClick();
        
        }
        
    }//GEN-LAST:event_txt_UsuarioKeyTyped

    private void txt_PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyTyped
        
        
        char tecEnter= evt.getKeyChar();
                
        if(tecEnter==KeyEvent.VK_ENTER){
            btn_ingresar.doClick();
        
        }
    }//GEN-LAST:event_txt_PasswordKeyTyped

    private void btn_ingresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ingresarKeyTyped
        char tecEnter= evt.getKeyChar();
        
        
        if(tecEnter==KeyEvent.VK_ENTER){
            btn_ingresar.doClick();
        
        }
        
        
    }//GEN-LAST:event_btn_ingresarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
