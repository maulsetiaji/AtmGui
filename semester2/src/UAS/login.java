package UAS;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
    	setUndecorated(true);
        initComponents();
    }

    private void initComponents() {
    	
        frame1 = new javax.swing.JLabel();
        frame2 = new javax.swing.JLabel();
        frame3 = new javax.swing.JLabel();
        frame4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        GUIusername = new javax.swing.JLabel();
        GUIpassword = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GUIusername.setText("Username");
        GUIusername.setForeground(java.awt.Color.WHITE);

        GUIpassword.setText("Password");
        GUIpassword.setForeground(java.awt.Color.WHITE);

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        frame1.setFont(new Font("", Font.BOLD, 18));
        frame1.setForeground(java.awt.Color.WHITE);
        frame1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame1.setText("ATM");

        frame2.setFont(new Font("", Font.BOLD, 18));
        frame2.setForeground(java.awt.Color.WHITE);
        frame2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame2.setText("Universitas Tanjungpura");
        
        frame3.setFont(new java.awt.Font("", 0, 12));
        frame3.setForeground(java.awt.Color.WHITE);
        frame3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame3.setText("Silahkan Login Disini");
        
        frame4.setFont(new Font("", Font.ITALIC, 12));
        frame4.setForeground(java.awt.Color.WHITE);
        frame4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame4.setText("--Developed for UAS Analog 2021--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setBackground(new Color(0, 0, 139));
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(	
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            		.addContainerGap(89, Short.MAX_VALUE)
            		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            				.addComponent(frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
            				.addComponent(frame4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
            				.addGroup(layout.createSequentialGroup()
            						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            								.addComponent(GUIpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            								.addComponent(GUIusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            								.addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
            								.addComponent(username))))
            		.addGap(102, 102, 102))
            	.addGroup(layout.createSequentialGroup()
            			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            					.addGroup(layout.createSequentialGroup()
            							.addGap(103, 103, 103)
            							.addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
            							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            							.addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            					.addGroup(layout.createSequentialGroup()
            							.addGap(90, 90, 90)
            							.addComponent(frame1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
            					.addGroup(layout.createSequentialGroup()
            							.addGap(90, 90, 90)
            							.addComponent(frame2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
            			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		);
        
        layout.setVerticalGroup(
        		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        				.addContainerGap()
        				.addComponent(frame1)
        				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        				.addComponent(frame2)
        				.addGap(50, 50, 50)
        				.addComponent(frame3)
        				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        						.addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        						.addComponent(GUIusername))
        				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        						.addComponent(GUIpassword)
        						.addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        				.addGap(18, 18, 18)
        				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        						.addComponent(Login)
        						.addComponent(Cancel))
        				.addGap(50, 50, 50)
        						.addComponent(frame4)
        				.addContainerGap(20, Short.MAX_VALUE))
        		);

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GUIusername, GUIpassword, password, username});

        pack();
    	}

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        if (username.getText().equals("admin")) {
        if (password.getText().equals("admin")) {
 
        new menu().show();
        this.dispose(); }
        else {

        JOptionPane.showMessageDialog(rootPane, "Password Salah, Silahkan Coba Lagi!");
        password.setText("");
        password.requestFocus(); }}
        else {
        JOptionPane.showMessageDialog(rootPane, "Username Salah, Silahkan Coba Lagi!");
        username.setText("");
        password.setText("");
        username.requestFocus();
}
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel frame1;
    private javax.swing.JLabel frame2;
    private javax.swing.JLabel frame3;
    private javax.swing.JLabel frame4;
    private javax.swing.JButton Login;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel GUIusername;
    private javax.swing.JLabel GUIpassword;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;

}
