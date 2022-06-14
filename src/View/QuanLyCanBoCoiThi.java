/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.CanBo;
import Table.TableCanBo;
import Utils.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class QuanLyCanBoCoiThi extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyCanBoCoiThi
     */
    ArrayList<CanBo> dsCanBo = new ArrayList<CanBo>();
    
    int dongchon = -1;
    
    CanBo canbo = new CanBo();
    public QuanLyCanBoCoiThi() {
        initComponents();
        LoadTableFromFile();
        LoadTableCanBoCoiThi();
    }
    
    void LoadTableFromFile(){
        File f = new File("danhSachCanBo.txt");
        ArrayList<String> list = f.ReadFromFile();
        for(String s : list){
            String[] txt = s.split(",");
            canbo = new CanBo(txt[0],txt[1]);
            dsCanBo.add(canbo);
        }
    }
    
    private void WriteTableToFile(){
        try {
                FileWriter fr = new FileWriter("danhSachCanBo.txt");
                for(CanBo cb : dsCanBo){
                    fr.write(cb.toString() + "\n");
                }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(QuanLyMonThi.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void LoadTableCanBoCoiThi(){
        jTableQuanLyCanBoCoiThi.setModel(new TableCanBo(dsCanBo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMaCanBo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTenCanBo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuanLyCanBoCoiThi = new javax.swing.JTable();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN LÝ CÁN BỘ COI THI");

        jLabel2.setText("Mã cán bộ:");

        jLabel3.setText("Tên cán bộ:");

        jTableQuanLyCanBoCoiThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã cán bộ", "Tên cán bộ"
            }
        ));
        jTableQuanLyCanBoCoiThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQuanLyCanBoCoiThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableQuanLyCanBoCoiThi);

        jButtonThem.setText("Thêm");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonSua.setText("Sửa");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTenCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonXoa)
                                            .addComponent(jButtonSua)
                                            .addComponent(jButtonThem))
                                        .addGap(82, 82, 82)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldMaCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldTenCanBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(jButtonThem)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonSua)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonXoa))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean ktraTrungMaCanBo(String a)
    {
        boolean ok = true;
        for(CanBo i:dsCanBo)
        {
            if(i.getMaCanBo().equalsIgnoreCase(a))
                ok = false;
        }
        return ok;
    }
    
    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        // TODO add your handling code here:
        try{
            if(jTextFieldMaCanBo.getText().equals("")|| jTextFieldMaCanBo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(rootPane," Bạn cần điền đầy đủ dữ kiện");
            }
            else{
                if(ktraTrungMaCanBo(jTextFieldMaCanBo.getText()))
                {
                    canbo = new CanBo(jTextFieldMaCanBo.getText(), jTextFieldTenCanBo.getText());
                    dsCanBo.add(canbo);
                    File f = new File("danhSachCanBo.txt");
                    f.WriteToFile(canbo.toString());
                    LoadTableCanBoCoiThi();
                   }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Mã cán bộ này đã tồn tại");
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        // TODO add your handling code here:
        dongchon = jTableQuanLyCanBoCoiThi.getSelectedRow();
        if(dongchon !=-1){
            try{
                if(jTextFieldMaCanBo.getText().equals("")|| jTextFieldMaCanBo.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(rootPane," Bạn cần điền đầy đủ dữ kiện");
                }
                else{
                    CanBo canboNew = new CanBo(jTextFieldMaCanBo.getText(), jTextFieldTenCanBo.getText());
                    dsCanBo.set(dongchon,canboNew);
                    WriteTableToFile();
                    LoadTableCanBoCoiThi();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
            
        }else{
            JOptionPane.showConfirmDialog(this,"Bạn chưa chọn dòng để sửa!","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        dongchon = jTableQuanLyCanBoCoiThi.getSelectedRow();
        if(dongchon !=-1){
            dsCanBo.remove(dongchon);
            WriteTableToFile();
            LoadTableCanBoCoiThi();
        }else{
            JOptionPane.showConfirmDialog(this,"Bạn chưa chọn dòng để xóa!","Thông báo", WIDTH);
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jTableQuanLyCanBoCoiThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuanLyCanBoCoiThiMouseClicked
        // TODO add your handling code here:
        dongchon = jTableQuanLyCanBoCoiThi.getSelectedRow();
        if(dongchon !=-1){
            canbo = dsCanBo.get(dongchon);
            jTextFieldMaCanBo.setText(canbo.getMaCanBo()+"");
            jTextFieldTenCanBo.setText(canbo.getTenCanBo()+"");
            
        }
    }//GEN-LAST:event_jTableQuanLyCanBoCoiThiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ret=JOptionPane.showConfirmDialog(null,
                "bạn chắc chắn muốn thoát?", "Thoát",
                JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION){
            new Home().setVisible(true);
            this.setVisible(false);
        }        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(QuanLyCanBoCoiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyCanBoCoiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyCanBoCoiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyCanBoCoiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyCanBoCoiThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQuanLyCanBoCoiThi;
    private javax.swing.JTextField jTextFieldMaCanBo;
    private javax.swing.JTextField jTextFieldTenCanBo;
    // End of variables declaration//GEN-END:variables
}
