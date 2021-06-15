package UAS;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class menu extends javax.swing.JFrame {

    double hasil;
    double saldo;
    int masukan;
    public menu() {
    	setUndecorated(true);
        initComponents();
    }

    public menu(int saldo) {
    	this.saldo = saldo;
    }
    
    private void initComponents() {

    	frame1 = new javax.swing.JLabel();
    	frame2 = new javax.swing.JLabel();
        frame3 = new javax.swing.JLabel();
        ceksaldo = new javax.swing.JButton();
        setortunai = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        tariktunai = new javax.swing.JButton();
        panduan = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        frame3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        frame3.setText("Silahkan Pilih Menu Dibawah ini :");
        
        copyright.setFont(new java.awt.Font("", 0, 12)); 
        copyright.setForeground(java.awt.Color.WHITE);
        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("@Copyright by Maulana Setia Aji");

        ceksaldo.setText("Cek Saldo");
        ceksaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ceksaldoActionPerformed(evt);
            }
        });

        setortunai.setText("Setor Tunai");
        setortunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	setortunaiActionPerformed(evt);
            }
        });

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        tariktunai.setText("Tarik Tunai");
        tariktunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tariktunaiActionPerformed(evt);
            }
        });
        
        panduan.setText("Panduan");
        panduan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	panduanActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }

        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(ceksaldo, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        							.addComponent(tariktunai, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(87)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(frame1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
        								.addComponent(frame2, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addComponent(setortunai, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(logout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(panduan, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(transfer, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(130)
        					.addComponent(frame3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(133)
        					.addComponent(copyright, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(frame1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(frame2)
        			.addGap(32)
        			.addComponent(frame3)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(ceksaldo, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        				.addComponent(tariktunai, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(setortunai, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panduan, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
        			.addGap(10)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(transfer, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        				.addComponent(logout, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        			.addGap(27)
        			.addComponent(copyright)
        			.addGap(19))
        );
        getContentPane().setBackground(new Color(0, 0, 139));
        getContentPane().setLayout(layout);
        pack();
    	}

    private void ceksaldoActionPerformed(java.awt.event.ActionEvent evt) {
    	ArrayList<String> arraycs = new ArrayList<String>();
    	arraycs.add("Saldo Anda Saat Ini adalah :"+ saldo);
        JOptionPane.showMessageDialog(rootPane,arraycs);
        hasil = saldo;
        saldo=hasil;
    }

    private void setortunaiActionPerformed(java.awt.event.ActionEvent evt) {
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan nominal : "));
        ArrayList<String> arrayst = new ArrayList<String>();
        arrayst.add("Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
        JOptionPane.showMessageDialog(rootPane,arrayst);
        hasil = saldo + masukan;
        saldo=hasil;
    }

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {
    	String nama=JOptionPane.showInputDialog("Masukan Nama Penerima");
		 masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan nominal : "));
	        if (saldo <= masukan) {
	        JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda tidak mencukupi");
	        JOptionPane.showMessageDialog(rootPane,"Silahkan login kembali!");
	        System.exit(0);
	        } else if (saldo >= masukan) {

	        }
	        hasil = saldo - masukan;
	        saldo=hasil;
	        ArrayList<String> arraytf = new ArrayList<String>();
	       	arraytf.add("Saldo Anda Saat Ini adalah :"+ saldo);
	       	arraytf.add("\n"+"Berhasil transfer kepada "+nama+" sebesar :"+ masukan);
	        JOptionPane.showMessageDialog(rootPane,arraytf);
     }

    private void tariktunaiActionPerformed(java.awt.event.ActionEvent evt) {
    	masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan nominal : "));
    	if (saldo <= masukan) {
    	JOptionPane.showMessageDialog(rootPane,"Maaf Saldo anda tidak mencukupi");
    	JOptionPane.showMessageDialog(rootPane,"Silahkan login kembali!");
    	System.exit(0);
    	} else if (saldo >= masukan) {

    	}
    	hasil = saldo - masukan;
    	saldo=hasil;
    	ArrayList<String> arraytt = new ArrayList<String>();
    	arraytt.add("Saldo Anda Saat Ini adalah :"+ saldo);
        JOptionPane.showMessageDialog(rootPane,arraytt);

    }
    
    private void panduanActionPerformed(java.awt.event.ActionEvent evt) {
       	ArrayList<String> panduan = new ArrayList<String>();
    	panduan.add(" 1. "+"Nasabah diharapkan mengisi saldo terlebih dahulu dikarenakan saldo masih 0"+"\n");
    	panduan.add("2. "+"Setelah mengisi saldo anda dapat melakukan transaksi"+"\n");
    	panduan.add("3. "+"Saat mengisi nominal saldo tidak mencantumkan tanda titik '.' "+"\n");
    	panduan.add("4. "+"Diharapkan tidak menarik seluruh saldo dikarenakan saldo beku sebesar Rp.1 (satu rupiah) ");
    	JOptionPane.showMessageDialog(rootPane,panduan);
     }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
    	JOptionPane.showMessageDialog(rootPane,"Have a nice day :)");
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel frame1;
    private javax.swing.JLabel frame2;
    private javax.swing.JLabel frame3;
    private javax.swing.JButton ceksaldo;
    private javax.swing.JButton setortunai;
    private javax.swing.JButton transfer;
    private javax.swing.JButton tariktunai;
    private javax.swing.JButton panduan;
    private javax.swing.JButton logout;
    private javax.swing.JLabel copyright;

}