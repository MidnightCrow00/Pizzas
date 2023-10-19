
package pizzarendelos;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class PizzaRendelo extends javax.swing.JFrame {

    
    public PizzaRendelo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlAlap = new javax.swing.JPanel();
        rbnParadicsom = new javax.swing.JRadioButton();
        rbnTejfolos = new javax.swing.JRadioButton();
        pnlMeret = new javax.swing.JPanel();
        rbn28 = new javax.swing.JRadioButton();
        rbn32 = new javax.swing.JRadioButton();
        rbn45 = new javax.swing.JRadioButton();
        pnlFeltet = new javax.swing.JPanel();
        rbnSzalami = new javax.swing.JRadioButton();
        rbnSonka = new javax.swing.JRadioButton();
        rbnKukorica = new javax.swing.JRadioButton();
        rbnCsirke = new javax.swing.JRadioButton();
        rbnGomba = new javax.swing.JRadioButton();
        rbnAnanasz = new javax.swing.JRadioButton();
        lblElerhetoseg = new javax.swing.JLabel();
        lblNev = new javax.swing.JLabel();
        txtNev = new javax.swing.JTextField();
        txtElerhetoseg = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnMegsem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(300, 370));
        setResizable(false);

        pnlAlap.setBorder(javax.swing.BorderFactory.createTitledBorder("Válassz alapot!"));

        buttonGroup2.add(rbnParadicsom);
        rbnParadicsom.setText("Paradicsomos");
        rbnParadicsom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnParadicsomActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbnTejfolos);
        rbnTejfolos.setText("Tejfölös");
        rbnTejfolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnTejfolosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlapLayout = new javax.swing.GroupLayout(pnlAlap);
        pnlAlap.setLayout(pnlAlapLayout);
        pnlAlapLayout.setHorizontalGroup(
            pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnParadicsom)
                    .addComponent(rbnTejfolos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAlapLayout.setVerticalGroup(
            pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlapLayout.createSequentialGroup()
                .addComponent(rbnParadicsom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnTejfolos))
        );

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder("Válassz méretet!"));

        buttonGroup1.add(rbn28);
        rbn28.setText("28cm");
        rbn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn28ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbn32);
        rbn32.setText("32cm");
        rbn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn32ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbn45);
        rbn45.setText("45cm");
        rbn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbn45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbn32)
                    .addComponent(rbn28)
                    .addComponent(rbn45))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addComponent(rbn28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbn32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbn45))
        );

        pnlFeltet.setBorder(javax.swing.BorderFactory.createTitledBorder("Válassz feltétet!"));

        rbnSzalami.setText("Szalámi");
        rbnSzalami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnSzalamiActionPerformed(evt);
            }
        });

        rbnSonka.setText("Sonka");
        rbnSonka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnSonkaActionPerformed(evt);
            }
        });

        rbnKukorica.setText("Kukorica");
        rbnKukorica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnKukoricaActionPerformed(evt);
            }
        });

        rbnCsirke.setText("Csirke");
        rbnCsirke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnCsirkeActionPerformed(evt);
            }
        });

        rbnGomba.setText("Gomba");
        rbnGomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnGombaActionPerformed(evt);
            }
        });

        rbnAnanasz.setText("Ananász");
        rbnAnanasz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnAnanaszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFeltetLayout = new javax.swing.GroupLayout(pnlFeltet);
        pnlFeltet.setLayout(pnlFeltetLayout);
        pnlFeltetLayout.setHorizontalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnSzalami)
                    .addComponent(rbnSonka)
                    .addComponent(rbnKukorica)
                    .addComponent(rbnGomba)
                    .addComponent(rbnCsirke)
                    .addComponent(rbnAnanasz))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlFeltetLayout.setVerticalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(rbnSzalami)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnSonka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnKukorica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnGomba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnCsirke)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnAnanasz))
        );

        lblElerhetoseg.setText("Adja meg az elérhetőségét:");

        lblNev.setText("Adja meg a nevét:");

        txtElerhetoseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElerhetosegActionPerformed(evt);
            }
        });

        btnOk.setText("Rendelés");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnMegsem.setText("Mégsem");
        btnMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegsemActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kép:"));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AlbertOrsolyaTímea(S\\Desktop\\Pizzas\\OIP.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblElerhetoseg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtElerhetoseg))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNev)))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlAlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlMeret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlFeltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMegsem)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNev)
                    .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElerhetoseg)
                    .addComponent(txtElerhetoseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFeltet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMegsem)
                            .addComponent(btnOk)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtElerhetosegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElerhetosegActionPerformed
        
    }//GEN-LAST:event_txtElerhetosegActionPerformed

    private void rbn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn45ActionPerformed
        System.out.println("45-ös méret = " + 1600 + "Ft");
    }//GEN-LAST:event_rbn45ActionPerformed

    private void rbn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn32ActionPerformed
      System.out.println("32-es méret = " + 1400 + "Ft");
    }//GEN-LAST:event_rbn32ActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Rendelés leadva.", "Cím", 2);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegsemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnMegsemActionPerformed

    private void rbn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbn28ActionPerformed
    System.out.println("28-as méret= " + 1200 + "Ft");        
    }//GEN-LAST:event_rbn28ActionPerformed

    private void rbnParadicsomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnParadicsomActionPerformed
       System.out.println("Paradicsomos = " + 0 + "Ft");
    }//GEN-LAST:event_rbnParadicsomActionPerformed

    private void rbnTejfolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnTejfolosActionPerformed
       System.out.println("Tejfölös = " + 10 + "Ft");
    }//GEN-LAST:event_rbnTejfolosActionPerformed

    private void rbnSzalamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnSzalamiActionPerformed
       System.out.println("Szalámi = " + 10 + "Ft");
    }//GEN-LAST:event_rbnSzalamiActionPerformed

    private void rbnSonkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnSonkaActionPerformed
       System.out.println("Sonka = " + 10 + "Ft");        
    }//GEN-LAST:event_rbnSonkaActionPerformed

    private void rbnKukoricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnKukoricaActionPerformed
       System.out.println("Kukorica = " + 10 + "Ft");
    }//GEN-LAST:event_rbnKukoricaActionPerformed

    private void rbnGombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnGombaActionPerformed
        System.out.println("Gomba = " + 10 + "Ft");
    }//GEN-LAST:event_rbnGombaActionPerformed

    private void rbnCsirkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnCsirkeActionPerformed
        System.out.println("Csirke = " + 10 + "Ft");
    }//GEN-LAST:event_rbnCsirkeActionPerformed

    private void rbnAnanaszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnAnanaszActionPerformed
        System.out.println("Ananász = " + 10 + "Ft");
    }//GEN-LAST:event_rbnAnanaszActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaRendelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegsem;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblElerhetoseg;
    private javax.swing.JLabel lblNev;
    private javax.swing.JPanel pnlAlap;
    private javax.swing.JPanel pnlFeltet;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JRadioButton rbn28;
    private javax.swing.JRadioButton rbn32;
    private javax.swing.JRadioButton rbn45;
    private javax.swing.JRadioButton rbnAnanasz;
    private javax.swing.JRadioButton rbnCsirke;
    private javax.swing.JRadioButton rbnGomba;
    private javax.swing.JRadioButton rbnKukorica;
    private javax.swing.JRadioButton rbnParadicsom;
    private javax.swing.JRadioButton rbnSonka;
    private javax.swing.JRadioButton rbnSzalami;
    private javax.swing.JRadioButton rbnTejfolos;
    private javax.swing.JTextField txtElerhetoseg;
    private javax.swing.JTextField txtNev;
    // End of variables declaration//GEN-END:variables
}
