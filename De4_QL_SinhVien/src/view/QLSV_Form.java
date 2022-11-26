package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import service.QLSV;

public class QLSV_Form extends javax.swing.JFrame implements Runnable {

    private QLSV qlsv = new QLSV();
    private String filename = "a1.txt";

    public QLSV_Form() {
        initComponents();
        setLocationRelativeTo(null);

        Thread t = new Thread(this);
        t.start();
        loadTable();
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        List<SinhVien> ds = qlsv.getList();

        model.setRowCount(0);
        for (SinhVien d : ds) {
            Object[] row = {
                d.getName(),
                d.getBoMon(),
                d.getDiem(),
                d.getStatus()
            };
            model.addRow(row);
        }
    }

    private SinhVien getFormData() {
        String name = txtTen.getText();
        String boMon = cbbMon.getSelectedItem().toString();
        String diem = txtDiem.getText();

        if (name.trim().length() == 0 || boMon.trim().length() == 0 || diem.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        try {
            if (Double.parseDouble(diem) <= 0 || Double.parseDouble(diem) > 10) {
                JOptionPane.showMessageDialog(this, "Điểm phải thuộc khoảng từ 0 đến 10");
                return null;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số");
            return null;
        }

        SinhVien sv = new SinhVien(name, boMon, Double.parseDouble(diem));
        return sv;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQLSV = new javax.swing.JLabel();
        lbClock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        txtTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        cbbMon = new javax.swing.JComboBox<>();
        btnTai = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbQLSV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbQLSV.setText("QUẢN LÝ SINH VIÊN");

        lbClock.setText("00:00");

        jLabel2.setText("Tên SV");

        jLabel3.setText("Bộ môn");

        jLabel4.setText("Điểm");

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên SV", "Bộ môn", "Điểm", "Kết quả"
            }
        ));
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        cbbMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "UD", "TKĐH", "TMĐT" }));

        btnTai.setText("Tải dữ liệu");
        btnTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi dữ liệu");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnTimkiem.setText("Tìm nhân viên");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnThem.setText("Xoá");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lbQLSV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbClock, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen)
                            .addComponent(txtDiem)
                            .addComponent(cbbMon, 0, 196, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGhi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbQLSV))
                    .addComponent(lbClock))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTai))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(28, 28, 28)
                .addComponent(btnThem)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiActionPerformed
        // TODO add your handling code here:
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<SinhVien> sv = (List<SinhVien>) ois.readObject();

            ois.close();
            qlsv.setList(sv);
            loadTable();
            JOptionPane.showMessageDialog(this, "Đọc thành công");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
        }

    }//GEN-LAST:event_btnTaiActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        SinhVien sv = getFormData();
        qlsv.insert(sv);
        loadTable();

        File file = new File(filename);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            List<SinhVien> s = qlsv.getList();
            oos.writeObject(s);
            oos.close();

            JOptionPane.showMessageDialog(this, "Ghi thành công");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        int row = tblTable.getSelectedRow();
        if (row == -1) {
            return;
        }
        String name = tblTable.getValueAt(row, 0).toString();
        String boMon = tblTable.getValueAt(row, 1).toString();
        String diem = tblTable.getValueAt(row, 2).toString();

        txtTen.setText(name);
        txtDiem.setText(diem);
        cbbMon.setSelectedItem(boMon);
        //  tblTable.setRowSelectionInterval(row,row);


    }//GEN-LAST:event_tblTableMouseClicked

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        // TODO add your handling code here:
        String tenSV = txtTen.getText().trim();

        List<SinhVien> sv = qlsv.getList();
//         if (txtMaNV.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Mã NV k được để trống");
//            return;
//        } else if (maNV.trim().length() != 7) {
//            JOptionPane.showMessageDialog(this, "Mã NV phải đúng 7 kí tự");
//            return;
//        } else {
        if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên SV k được để trống");
            return;
        } else {
            for (int i = 0; i < sv.size(); i++) {
                SinhVien s = sv.get(i);
                if (s.getName().equalsIgnoreCase(tenSV)) {
                    txtTen.setText(s.getName());
                    txtDiem.setText(s.getDiem() + "");
                    cbbMon.setSelectedItem(s.getBoMon());

                    JOptionPane.showMessageDialog(this, "Đã tìm thấy sinh viên");
                    loadTable();
                    tblTable.setRowSelectionInterval(i, i);
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Không tìm thấy");
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int row = tblTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn một dòng trên table");
        }
        SinhVien sv = getFormData();
        qlsv.delete(row);
        loadTable();

        JOptionPane.showMessageDialog(this, "Xoá thành công");
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(QLSV_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnTai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JComboBox<String> cbbMon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbClock;
    private javax.swing.JLabel lbQLSV;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            String chu = lbQLSV.getText() + "";chu = chu.substring(1, chu.length()) + chu.charAt(0);//lbQLSV.setText(chu);sau catch
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(QLSV_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
            lbQLSV.setText(chu);
        }
    }
}
//public void run() {
//        String chu = this.lblchu.getText() + " ";
//        while (true) {
//            Calendar c = Calendar.getInstance();
//            int h = c.get(Calendar.HOUR_OF_DAY);
//            int m = c.get(Calendar.MINUTE);
//            int s = c.get(Calendar.SECOND);
//            String time = h + ":" + m + ":" + s;
//            chu = chu.substring(1, chu.length()) + chu.charAt(0);
//            this.lblTime.setText(time);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//            this.lblchu.setText(chu);
//        }
//    }