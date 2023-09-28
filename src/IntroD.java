
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JComponent;


public class IntroD extends javax.swing.JFrame {

    /**
     * Creates new form IntroD
     */
    public IntroD() {
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(false);
        asignarfuenteBUNGEE(labelusuario, 12f);
        asignarfuenteBUNGEE(Login, 12f);
        asignarfuenteBUNGEE(Register, 12f);
    }
    //Funcion para asignar una fuenta a un label: fuente BUNGEE
    public static void asignarfuenteBUNGEE(JComponent component, float fontSize) {
        Font customFont = null;
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, IntroD.class.getResourceAsStream("/Fuentes/BungeeLayers-Regular.otf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        if (customFont != null) {
            component.setFont(customFont.deriveFont(fontSize));
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new custom.PanelRound();
        error = new javax.swing.JLabel();
        userr = new javax.swing.JTextField();
        passs = new javax.swing.JTextField();
        labelusuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));

        error.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        error.setText("Contraseña o Usuario incorrecto");

        userr.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        userr.setForeground(new java.awt.Color(51, 51, 51));
        userr.setText("Digite usuario...");
        userr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        userr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userrMouseClicked(evt);
            }
        });
        userr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userrActionPerformed(evt);
            }
        });

        passs.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        passs.setForeground(new java.awt.Color(51, 51, 51));
        passs.setText("Digite contraseña...");
        passs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        passs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passsMouseClicked(evt);
            }
        });
        passs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsActionPerformed(evt);
            }
        });

        labelusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelusuario.setText("INICIO DE SESIÓN");

        jLabel2.setFont(new java.awt.Font("Voice In My Head", 0, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dummy sin fondo.png"))); // NOI18N

        Register.setBackground(new java.awt.Color(204, 204, 255));
        Register.setText("Register");
        Register.setBorderPainted(false);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(204, 204, 255));
        Login.setText("Login");
        Login.setBorderPainted(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cerrrar35.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(Login)
                                        .addGap(18, 18, 18)
                                        .addComponent(Register))
                                    .addComponent(error)))))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passs)
                                .addComponent(userr)))))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(Register))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        
        String user2; 
        String pass2;
        
        user2=userr.getText();
        pass2=passs.getText();
        
        login (user2,pass2);
        
        if (hay == true){
        
        this.dispose();
        IntroFrame a=new IntroFrame();
        a.setVisible(true);
    }
        if (hay == false){
        error.setVisible(true);
        }
        
    
        
       
    }//GEN-LAST:event_LoginActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String user1; 
        String pass1;
        user1=userr.getText();
        pass1=passs.getText();
        
        register(user1,pass1);
        
        
    }//GEN-LAST:event_RegisterActionPerformed

    private void passsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passsActionPerformed
         // elimina lo del text area 
        passs.setText(null);
    }//GEN-LAST:event_passsActionPerformed

    private void userrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userrActionPerformed
        // elimina lo del text area 
        userr.setText(null);    }//GEN-LAST:event_userrActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        error.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void userrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userrMouseClicked
       userr.setText(null);
    }//GEN-LAST:event_userrMouseClicked

    private void passsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passsMouseClicked
        passs.setText(null);
    }//GEN-LAST:event_passsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IntroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Register;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelusuario;
    private custom.PanelRound panelRound1;
    private javax.swing.JTextField passs;
    private javax.swing.JTextField userr;
    // End of variables declaration//GEN-END:variables



 // login 
 boolean hay;
public boolean login(String user, String pass) {
     hay = false;


    try {
        BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
        String line;
        String passs;
        while ((line = br.readLine()) != null) {
            String temp[] = line.split("\t");
            passs = temp[1];
            passs = descifrado_password(passs);
            System.out.println(passs);
            if ( temp[0].trim().equals(user) && passs.equalsIgnoreCase(pass)) {
                hay = true;

                break; // Romper el bucle si se encuentra una coincidencia
            }
        }
        
        br.close();
    } catch (IOException ex) {
        ex.printStackTrace();
        hay = false;
    }

    return hay;
}
private final String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n", "ñ","o","p","q","r","s","t","u","v","w","x","y","z","_","0","1","2","3","4","5","6","7","8","9",".","-","@","$","%","&","/","(",")","=","?","¿","¡","!","[","]","{","}","<",">",";",":","'","\"","*","+","~","^","`","|","°","¬"};
    private final String[] cifrado = {
            "ñ", "k", "5", "m", "c", "y", "w", "o", "9", "q", "x", "s", "r", "v", "a", "2", "7", "1", "l", "i", "h", "!", "8", "b", "t", "z", "&", "0", "?", "d", "u", "p", "4", ".", "g", "n", "3", "$", "f", "(", "j", "}", "{", "*", "¬", "-", "|", "`", "~", ")", ":", "[", "]", "=", "'", "@", "¿", "¡", ";", "+", "^", "°", "/", "e", "\""
    };

public String cifrado_password(String pass){
    String digito;
StringBuilder newpass = new StringBuilder();
    for (int i = 0; i < pass.length(); i++) {
        digito =pass.substring(i, i+1);
        for (int j = 0; j < alfabeto.length; j++) {
            if (digito.equals(alfabeto[j])) {
                newpass.append(cifrado[j]);
            }
        }

    }
    return newpass.toString();
}
public String descifrado_password(String pass){
    String digito;
    StringBuilder newpass = new StringBuilder();
    for (int i = 0; i < pass.length(); i++) {
        digito =pass.substring(i, i+1);
        for (int j = 0; j < cifrado.length; j++) {
            if (digito.equals(cifrado[j])) {
                newpass.append(alfabeto[j]);
            }
        }

    }
    return newpass.toString();
}

public boolean no_repit(String user) {
    boolean hay = false;

    try {
        BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String temp[] = line.split("\t");

            if (temp.length == 3 && temp[0].trim().equals(user)) {
                hay = true;
                break; // Romper el bucle si se encuentra una coincidencia
            }
        }

        br.close();
    } catch (IOException ex) {
        ex.printStackTrace();
        hay = false;
    }

    return hay;
}
    public boolean register(String user, String pass) {
        boolean registrado = false;
            pass = cifrado_password(pass);
            try {
                FileWriter archivo = new FileWriter("usuarios.txt",true);
                PrintWriter registrar_usuario = new PrintWriter(archivo);
                registrar_usuario.println(user +"\t"+ pass);
                registrar_usuario.close();
                registrado = true;
                //logica
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return registrado;

    }
}