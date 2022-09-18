
package group4_act1_cc103;

import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.BorderFactory;

// @author Anne Polina
 
public class frmOrderGr4 extends javax.swing.JFrame {
    
    public double dblOrderGr4 = 0, dblPattyGr4 = 0, dblColesGr4  = 0, dblCheeseGr4 = 0, dblDrinksGr4 = 0;
    private double dblTotalGr4;

    //Creates new form frmOrderGr4
    
    public frmOrderGr4() {
        initComponents();
        
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black , 6));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpOrdersGr4 = new javax.swing.JPanel();
        optHamGr4 = new javax.swing.JRadioButton();
        optCheeseGr4 = new javax.swing.JRadioButton();
        optBigGr4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        txtMNameGr4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFNameGr4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLNameGr4 = new javax.swing.JTextField();
        txtIDGr4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkPattyGr4 = new javax.swing.JCheckBox();
        chkColesGr4 = new javax.swing.JCheckBox();
        chkCheeseGr4 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        cmbDrinksGr4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalGr4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnComputeGr4 = new javax.swing.JButton();
        btnReceiptGr4 = new javax.swing.JButton();
        btnClearGr4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORDERING SYSTEM");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        btnGrpOrdersGr4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORDERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        btnGrpOrdersGr4.setFocusTraversalPolicyProvider(true);
        btnGrpOrdersGr4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        optHamGr4.setText("Hamburger 50.00");

        optCheeseGr4.setText("Cheese Burger 75.00");
        optCheeseGr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCheeseGr4ActionPerformed(evt);
            }
        });

        optBigGr4.setText("Big Mac Burger 100.00");
        optBigGr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optBigGr4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnGrpOrdersGr4Layout = new javax.swing.GroupLayout(btnGrpOrdersGr4);
        btnGrpOrdersGr4.setLayout(btnGrpOrdersGr4Layout);
        btnGrpOrdersGr4Layout.setHorizontalGroup(
            btnGrpOrdersGr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGrpOrdersGr4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optHamGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(optCheeseGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(optBigGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        btnGrpOrdersGr4Layout.setVerticalGroup(
            btnGrpOrdersGr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGrpOrdersGr4Layout.createSequentialGroup()
                .addGroup(btnGrpOrdersGr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optHamGr4)
                    .addComponent(optBigGr4)
                    .addComponent(optCheeseGr4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtMNameGr4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Middle Name:");

        txtFNameGr4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("First Name:");

        txtLNameGr4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtIDGr4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDGr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDGr4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer ID:");

        jLabel3.setText("Last Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDGr4)
                    .addComponent(txtLNameGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFNameGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMNameGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLNameGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNameGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMNameGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXTRAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        chkPattyGr4.setText("Extra Patty 25.00");

        chkColesGr4.setText("Extra Coleslaw 35.00");

        chkCheeseGr4.setText("Extra Cheese 50.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(chkPattyGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkColesGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(chkCheeseGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPattyGr4)
                    .addComponent(chkColesGr4)
                    .addComponent(chkCheeseGr4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DRINKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(363, 54));

        cmbDrinksGr4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ONE", "SOFTDRINKS 30.00", "COFFEE 40.00", "ORANGE JUICE 50.00" }));

        jLabel1.setText("Select Drinks: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDrinksGr4, 0, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDrinksGr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AMOUNT TO PAY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(363, 54));

        jLabel6.setText("Total Amount: ");

        txtTotalGr4.setEditable(false);
        txtTotalGr4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalGr4, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalGr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DRINKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(363, 54));

        btnComputeGr4.setText("COMPUTE");
        btnComputeGr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeGr4ActionPerformed(evt);
            }
        });

        btnReceiptGr4.setText("VIEW RECEIPT");
        btnReceiptGr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptGr4ActionPerformed(evt);
            }
        });

        btnClearGr4.setText("CLEAR");
        btnClearGr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearGr4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnComputeGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReceiptGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearGr4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComputeGr4)
                    .addComponent(btnReceiptGr4)
                    .addComponent(btnClearGr4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrpOrdersGr4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGrpOrdersGr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDGr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDGr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDGr4ActionPerformed

    private void optCheeseGr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCheeseGr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optCheeseGr4ActionPerformed

    private void optBigGr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optBigGr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optBigGr4ActionPerformed

    private void btnComputeGr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeGr4ActionPerformed
        // TODO add your handling code here:
        //Get selected order from the radio buttons
        if(optHamGr4.isSelected()){
            dblOrderGr4 = 50;
        }
        else if(optCheeseGr4.isSelected()){
            dblOrderGr4 = 75;
        }
        else if(optBigGr4.isSelected()){
            dblOrderGr4 = 100;
        }
        
        //Get Patty checkbox if checked
        if(chkPattyGr4.isSelected()){
            dblPattyGr4 = 25;
        }
        else{
            dblPattyGr4 = 0;
        }
        
        //Get Coleslaw checkbox if checked
        if(chkColesGr4.isSelected()){
            dblColesGr4 = 35;
        }
        else{
            dblColesGr4 = 0;
        }
        
        //Get Cheese checkbox if checked
        if(chkCheeseGr4.isSelected()){
            dblCheeseGr4 = 50;
        }
        else{
            dblCheeseGr4 = 0;
        }
        
        //Get selected Drinks from Combo box
        if(cmbDrinksGr4.getSelectedItem()=="SOFTDRINKS 30.00"){
            dblDrinksGr4 = 30;
        }
        else if(cmbDrinksGr4.getSelectedItem()=="COFFEE 40.00"){
            dblDrinksGr4 = 40;
        }
        else if(cmbDrinksGr4.getSelectedItem()=="ORANGE JUICE 50.00"){
            dblDrinksGr4 = 50;
        }
        else{
            dblDrinksGr4 = 0;
        }
              
        //Create the instance for the total class
        totalsGr4 tot1Gr4 = new totalsGr4(dblOrderGr4, dblPattyGr4, dblColesGr4, dblCheeseGr4, dblDrinksGr4);
        
        //Call the compute method
        dblTotalGr4 = tot1Gr4.computeGr4();
        
        //Display and convert the output to string type
        txtTotalGr4.setText(String.valueOf(dblTotalGr4));
          
                
    }//GEN-LAST:event_btnComputeGr4ActionPerformed

    private void btnReceiptGr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptGr4ActionPerformed
        // TODO add your handling code here:
        if(txtIDGr4.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter Customer ID!");
            txtIDGr4.requestFocus();
        }
        else if(txtLNameGr4.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter Last Name!");
            txtLNameGr4.requestFocus();
        }
        else if(txtFNameGr4.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter First Name!");
            txtFNameGr4.requestFocus();
        }
        else if(txtMNameGr4.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Please Enter Middle Name!");
            txtMNameGr4.requestFocus();
        }
        else{
            String strReceiptGr4 = "CUSTOMER ID: " + txtIDGr4.getText() +
                    "\nCUSTOMER NAME: " +txtLNameGr4.getText() + ", " + txtFNameGr4.getText() + " " + txtMNameGr4.getText() +
                    "\nAMOUNT TO PAY: " + String.valueOf(dblTotalGr4);
            JOptionPane.showMessageDialog(null, strReceiptGr4);
        }
    }//GEN-LAST:event_btnReceiptGr4ActionPerformed

    private void btnClearGr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearGr4ActionPerformed
        // TODO add your handling code here:
        txtIDGr4.setText("");
        txtLNameGr4.setText("");
        txtFNameGr4.setText("");
        txtMNameGr4.setText("");
        txtTotalGr4.setText("");
        optHamGr4.setSelected(false);
        optCheeseGr4.setSelected(false);
        optBigGr4.setSelected(false);
        chkCheeseGr4.setSelected(false);
        chkColesGr4.setSelected(false);
        chkPattyGr4.setSelected(false);
        cmbDrinksGr4.setSelectedItem("SELECT ONE");
        dblDrinksGr4 = 0;
        dblPattyGr4 = 0;
        dblColesGr4 = 0;
        dblCheeseGr4 = 0;
        dblTotalGr4 = 0;
    }//GEN-LAST:event_btnClearGr4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmOrderGr4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOrderGr4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOrderGr4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOrderGr4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOrderGr4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearGr4;
    private javax.swing.JButton btnComputeGr4;
    private javax.swing.JPanel btnGrpOrdersGr4;
    private javax.swing.JButton btnReceiptGr4;
    private javax.swing.JCheckBox chkCheeseGr4;
    private javax.swing.JCheckBox chkColesGr4;
    private javax.swing.JCheckBox chkPattyGr4;
    private javax.swing.JComboBox<String> cmbDrinksGr4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton optBigGr4;
    private javax.swing.JRadioButton optCheeseGr4;
    private javax.swing.JRadioButton optHamGr4;
    private javax.swing.JTextField txtFNameGr4;
    private javax.swing.JTextField txtIDGr4;
    private javax.swing.JTextField txtLNameGr4;
    private javax.swing.JTextField txtMNameGr4;
    private javax.swing.JTextField txtTotalGr4;
    // End of variables declaration//GEN-END:variables
}
