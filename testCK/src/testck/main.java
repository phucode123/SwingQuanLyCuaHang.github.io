/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testck;

/**
 *
 * @author ACER
 */
public class main extends javax.swing.JFrame {

    String screen;
    String a;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        btn_group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        number_1 = new javax.swing.JButton();
        number_3 = new javax.swing.JButton();
        number_4 = new javax.swing.JButton();
        number_2 = new javax.swing.JButton();
        number_6 = new javax.swing.JButton();
        number_9 = new javax.swing.JButton();
        number_5 = new javax.swing.JButton();
        number_8 = new javax.swing.JButton();
        number_7 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        number_0 = new javax.swing.JButton();
        check = new javax.swing.JButton();
        screen_text = new javax.swing.JTextField();
        phep_nhan = new javax.swing.JToggleButton();
        phep_cong = new javax.swing.JToggleButton();
        phep_tru = new javax.swing.JToggleButton();
        phep_chia = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        signIn = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        da_co_button = new javax.swing.JRadioButton();
        chua_co_button = new javax.swing.JRadioButton();

        jButton10.setText("1");

        jToggleButton4.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên hàng", "Giá", "Mã hàng", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setAlignmentX(1.0F);
        jPanel2.setAlignmentY(1.0F);

        number_1.setText("1");
        number_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_1ActionPerformed(evt);
            }
        });

        number_3.setText("3");
        number_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_3ActionPerformed(evt);
            }
        });

        number_4.setText("4");
        number_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_4ActionPerformed(evt);
            }
        });

        number_2.setText("2");
        number_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_2ActionPerformed(evt);
            }
        });

        number_6.setText("6");
        number_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_6ActionPerformed(evt);
            }
        });

        number_9.setText("9");
        number_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_9ActionPerformed(evt);
            }
        });

        number_5.setText("5");
        number_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_5ActionPerformed(evt);
            }
        });

        number_8.setText("8");
        number_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_8ActionPerformed(evt);
            }
        });

        number_7.setText("7");
        number_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_7ActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 51, 51));
        close.setText("X");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        number_0.setText("0");
        number_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_0ActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(51, 255, 0));
        check.setText("V");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        screen_text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        screen_text.setAlignmentX(1.0F);
        screen_text.setAlignmentY(1.0F);

        phep_nhan.setText("x");
        phep_nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phep_nhanActionPerformed(evt);
            }
        });

        phep_cong.setText("+");
        phep_cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phep_congActionPerformed(evt);
            }
        });

        phep_tru.setText("-");
        phep_tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phep_truActionPerformed(evt);
            }
        });

        phep_chia.setText("/");
        phep_chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phep_chiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen_text)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(number_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(number_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(number_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phep_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_cong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_tru, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_chia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen_text, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_cong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_tru, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phep_chia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(51, 255, 102));
        jButton1.setText("Thanh toán");

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bạn có thẻ thành viên chưa?");

        signIn.setText("Truy cập");
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
        });
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Đăng kí");

        btn_group.add(da_co_button);
        da_co_button.setText("Đã có");
        da_co_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                da_co_buttonActionPerformed(evt);
            }
        });

        btn_group.add(chua_co_button);
        chua_co_button.setText("Chưa có");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(da_co_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chua_co_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(da_co_button)
                        .addGap(9, 9, 9)
                        .addComponent(chua_co_button)
                        .addGap(18, 18, 18)
                        .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_6ActionPerformed
        // TODO add your handling code here:

        a = screen_text.getText();
        screen_text.setText(a + "6");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_6ActionPerformed


    private void number_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_1ActionPerformed
        // TODO add your handling code here:

        a = screen_text.getText();
        screen_text.setText(a + "1");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_1ActionPerformed

    private void number_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_2ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "2");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_2ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        if(a.length()>0){
            a =a.substring(0, a.length() - 1);
        screen_text.setText(a);
        }
        
        
    }//GEN-LAST:event_closeActionPerformed

    private void number_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_3ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "3");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_3ActionPerformed

    private void number_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_4ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "4");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_4ActionPerformed

    private void number_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_5ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "5");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_5ActionPerformed

    private void number_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_7ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "7");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_7ActionPerformed

    private void number_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_8ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "8");

        screen = screen_text.getText();
    }//GEN-LAST:event_number_8ActionPerformed

    private void number_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_9ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "9");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_9ActionPerformed

    private void number_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_0ActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "0");
        screen = screen_text.getText();
    }//GEN-LAST:event_number_0ActionPerformed

    private void phep_nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phep_nhanActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "*");
        screen = screen_text.getText();
    }//GEN-LAST:event_phep_nhanActionPerformed

    private void phep_congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phep_congActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "+");
        screen = screen_text.getText();
    }//GEN-LAST:event_phep_congActionPerformed

    private void phep_truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phep_truActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "-");
        screen = screen_text.getText();
    }//GEN-LAST:event_phep_truActionPerformed

    private void phep_chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phep_chiaActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        screen_text.setText(a + "/");
        screen = screen_text.getText();
    }//GEN-LAST:event_phep_chiaActionPerformed

    void calculate() {
        if (a.contains("+")) {
            int index = a.indexOf("+");
            String left = a.substring(0, index);
            String right = a.substring(index + 1, a.length());

            int leftInt = Integer.parseInt(left);
            int rightInt = Integer.parseInt(right);
            System.out.println("left " + left);
            System.out.println("right: " + right);

            int sum = leftInt + rightInt;

            System.out.println("sum: " + sum);
            screen_text.setText(Integer.toString(sum));

        }
        if (a.contains("-")) {
            int index = a.indexOf("-");
            String left = a.substring(0, index);
            String right = a.substring(index + 1, a.length());

            int leftInt = Integer.parseInt(left);
            int rightInt = Integer.parseInt(right);
            System.out.println("left " + left);
            System.out.println("right: " + right);

            int sum = leftInt - rightInt;

            System.out.println("sum: " + sum);
            screen_text.setText(Integer.toString(sum));

        }
        if (a.contains("*")) {
            int index = a.indexOf("*");
            String left = a.substring(0, index);
            String right = a.substring(index + 1, a.length());

            int leftInt = Integer.parseInt(left);
            int rightInt = Integer.parseInt(right);
            System.out.println("left " + left);
            System.out.println("right: " + right);

            int sum = leftInt * rightInt;

            System.out.println("sum: " + sum);
            screen_text.setText(Integer.toString(sum));

        }
        if (a.contains("/")) {
            int index = a.indexOf("/");
            String left = a.substring(0, index);
            String right = a.substring(index + 1, a.length());

            float leftInt = Float.parseFloat(left);
            float rightInt = Float.parseFloat(right);
            System.out.println("left " + left);
            System.out.println("right: " + right);

            float sum = leftInt / rightInt;

            System.out.println("sum: " + sum);
            screen_text.setText(Float.toString(sum));

        }
    }

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        a = screen_text.getText();
        calculate();


    }//GEN-LAST:event_checkActionPerformed

    private void da_co_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_da_co_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_da_co_buttonActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
        
        if(da_co_button.isSelected()){
            try {
            UserSales b = new UserSales();
            b.setVisible(true);
        } catch (Exception e) {
           System.out.println("lỗi: "+ e);
        }
        }
        else{
            System.out.println("Khong co tai khoan thi sao ma truy cap duoc ??");
        }
        

    }//GEN-LAST:event_signInActionPerformed

    
    public static void main(String[] args) {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_signInMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btn_group;
    private javax.swing.JButton check;
    private javax.swing.JRadioButton chua_co_button;
    private javax.swing.JButton close;
    private javax.swing.JRadioButton da_co_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JButton number_0;
    private javax.swing.JButton number_1;
    private javax.swing.JButton number_2;
    private javax.swing.JButton number_3;
    private javax.swing.JButton number_4;
    private javax.swing.JButton number_5;
    private javax.swing.JButton number_6;
    private javax.swing.JButton number_7;
    private javax.swing.JButton number_8;
    private javax.swing.JButton number_9;
    private javax.swing.JToggleButton phep_chia;
    private javax.swing.JToggleButton phep_cong;
    private javax.swing.JToggleButton phep_nhan;
    private javax.swing.JToggleButton phep_tru;
    private javax.swing.JTextField screen_text;
    private javax.swing.JToggleButton signIn;
    // End of variables declaration//GEN-END:variables
}
