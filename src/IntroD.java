
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class IntroD extends javax.swing.JFrame {

    /**
     * Creates new form IntroD
     */
    public IntroD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new custom.PanelRound();
        Login = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passs = new javax.swing.JTextField();
        userr = new javax.swing.JTextField();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        Login.setText("Login");
        Login.setBorderPainted(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Register.setText("Register");
        Register.setBorderPainted(false);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Voice In My Head", 0, 48)); // NOI18N
        jLabel2.setText("DUMMY");

        jLabel1.setText("Ingrese Usuario y contraseña ");

        passs.setText("Digite Contraseña");
        passs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsActionPerformed(evt);
            }
        });

        userr.setText("Digite Usuario");
        userr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userrActionPerformed(evt);
            }
        });

        error.setText("Contraseña o Usuario incorrecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Login)
                                .addGap(18, 18, 18)
                                .addComponent(Register)
                                .addGap(18, 18, 18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(error)
                                .addGap(44, 44, 44)))))
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(error)
                        .addGap(22, 22, 22)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login)
                    .addComponent(Register))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        Login.getAccessibleContext().setAccessibleName("Login");

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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