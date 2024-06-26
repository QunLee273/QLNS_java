/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlns;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namta
 */
public class luongNV extends javax.swing.JFrame {

    /**
     * Creates new form luongNV
     */
    ConnectDB cn = new ConnectDB();
    DefaultTableModel model;
    public luongNV() {
        initComponents();
        setupTable();
        loadData();
        
    }
    private void clearInputFields() {
        txt_ml.setText("");
        txt_mnv.setText("");
        txt_lcb.setText("");
        txt_pc.setText("");
        txt_t.setText("");
        txt_khautru.setText("");
        jTextField9.setText(""); // Xóa cả tổng lương
    }

    private void setupTable() {
        // Khởi tạo DefaultTableModel với các cột rỗng và không cho phép chỉnh sửa
        model = new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lương", "Mã nhân viên", "Họ tên", "Tên phòng ban", "Lương cơ bản", "Phụ cấp", "Thưởng", "Khấu trừ", "Tổng"
            }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép chỉnh sửa bất kỳ ô nào trong bảng
            }
        };

        // Gán model cho JTable dsluong
        dsluong.setModel(model);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Retrieve input values from text fields
        String maLuong = txt_ml.getText();
        String maNV = txt_mnv.getText();
        double luongCoBan = Double.parseDouble(txt_lcb.getText());
        double phuCap = Double.parseDouble(txt_pc.getText());
        double thuong = Double.parseDouble(txt_t.getText());
        double khauTru = Double.parseDouble(txt_khautru.getText());
        double tong = luongCoBan + phuCap + thuong - khauTru;

        // SQL query strings
        String insertQuery = "INSERT INTO luong (MaLuong, MaNV, luongCoBan, PhuCap, Thuong, KhauTru) VALUES (?, ?, ?, ?, ?, ?)";
        String updateQuery = "UPDATE luong SET luongCoBan=?, PhuCap=?, Thuong=?, KhauTru=? WHERE MaLuong=?";

        try {
            java.sql.Connection conn = cn.getConnection(); // Establish connection

            if (maLuong.isEmpty()) {
                // Insert new record
                try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                    pstmt.setString(1, maLuong);
                    pstmt.setString(2, maNV);
                    pstmt.setDouble(3, luongCoBan);
                    pstmt.setDouble(4, phuCap);
                    pstmt.setDouble(5, thuong);
                    pstmt.setDouble(6, khauTru);
                    pstmt.executeUpdate();
                }
            } else {
                // Update existing record
                try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                    pstmt.setDouble(1, luongCoBan);
                    pstmt.setDouble(2, phuCap);
                    pstmt.setDouble(3, thuong);
                    pstmt.setDouble(4, khauTru);
                    pstmt.setString(5, maLuong);
                    pstmt.executeUpdate();
                }
            }

            // Reload data after update/insert
            loadData();
            JOptionPane.showMessageDialog(this, "Lưu thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu vào cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayDataFromTable(int row) {
        // Lấy dữ liệu từ bảng theo hàng được chọn
        String maLuong = dsluong.getValueAt(row, 0).toString();
        String maNV = dsluong.getValueAt(row, 1).toString();
        String hoTen = dsluong.getValueAt(row, 2).toString();
        String tenPB = dsluong.getValueAt(row, 3).toString();
        String luongCoBan = dsluong.getValueAt(row, 4).toString();
        String phuCap = dsluong.getValueAt(row, 5).toString();
        String thuong = dsluong.getValueAt(row, 6).toString();
        String khauTru = dsluong.getValueAt(row, 7).toString();
        
        
        double tongLuong = Double.parseDouble(luongCoBan) + Double.parseDouble(phuCap) + Double.parseDouble(thuong) - Double.parseDouble(khauTru);

        // Hiển thị dữ liệu lên các ô nhập liệu
        txt_ml.setText(maLuong);
        txt_mnv.setText(maNV);
        txt_lcb.setText(luongCoBan);
        txt_pc.setText(phuCap);
        txt_t.setText(thuong);
        txt_khautru.setText(khauTru);
        
        jTextField9.setText(String.valueOf(tongLuong));
}


    private void loadData() {
        
        // Xóa dữ liệu hiện có trong bảng
        DefaultTableModel model = (DefaultTableModel) dsluong.getModel();
        model.setRowCount(0);

        // Thực hiện truy vấn lấy dữ liệu từ cơ sở dữ liệu
        java.sql.Connection conn = null;
        java.sql.Statement stmt = null;
        ResultSet rs = null;


        try {
            // Kết nối tới cơ sở dữ liệu
            conn = cn.getConnection();

            // Thực hiện truy vấn SQL
            stmt = conn.createStatement();
            String query = """
                           SELECT luong.*, phongban.TenPB, nhanvien.HoTen
                           FROM luong
                           LEFT JOIN nhanvien ON luong.MaNV = nhanvien.MaNV
                           LEFT JOIN phongban ON nhanvien.MaPB = phongban.MaPB;
                           """;
            rs = stmt.executeQuery(query);

            // Xóa dữ liệu cũ trong bảng
            model.setRowCount(0);

            // Lặp qua kết quả truy vấn và thêm vào mô hình bảng
            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getString("MaLuong");
                row[1] = rs.getString("MaNV");
                row[2] = rs.getString("HoTen");
                row[3] = rs.getString("TenPB");
                row[4] = rs.getDouble("luongCoBan");
                row[5] = rs.getDouble("PhuCap");
                row[6] = rs.getDouble("Thuong");
                row[7] = rs.getDouble("KhauTru");
                row[8] =  rs.getDouble("luongCoBan") + rs.getDouble("PhuCap") + rs.getDouble("Thuong") - rs.getDouble("KhauTru");
                model.addRow(row);

            }
        } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_ml = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_lcb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_pc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_t = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_khautru = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btn_luu = new javax.swing.JButton();
        btn_capnhat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_mnv = new javax.swing.JTextField();
        btn_xoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dsluong = new javax.swing.JTable();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Lương Nhân Viên");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Mã lương");

        jLabel6.setText("Lương cơ bản");

        jLabel7.setText("Phụ cấp");

        txt_pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pcActionPerformed(evt);
            }
        });

        jLabel8.setText("Thưởng ");

        jLabel9.setText("Khấu trừ");

        jLabel10.setText("Tổng");

        jTextField9.setEnabled(false);

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_capnhat.setText("Cập nhật ");
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã nhân viên");

        txt_mnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mnvActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(txt_mnv, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
=======
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(187, 187, 187))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
>>>>>>> 62fc9ccd9bea344cc8ef4d454f315f06eedb426f
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pc))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9)
                                    .addComponent(txt_khautru)
                                    .addComponent(txt_t, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_luu)
                                .addGap(18, 18, 18)
                                .addComponent(btn_capnhat)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_lcb)
                                    .addComponent(txt_ml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_mnv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ml, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_lcb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_t, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txt_khautru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luu)
                    .addComponent(btn_capnhat)
                    .addComponent(btn_xoa))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        dsluong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lương", "Mã nhân viên", "Họ tên", "Tên phòng ban", "Lương cơ bản", "Phụ cấp", "Thưởng", "Khấu trừ", "Tổng"
            }
        ));
        dsluong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsluongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dsluong);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );

        txt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timkiemActionPerformed(evt);
            }
        });

        btn_timkiem.setText("Search");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnThoat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(205, 205, 205)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnThoat))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mnvActionPerformed

    private void txt_pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pcActionPerformed

    private void dsluongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsluongMouseClicked
        // TODO add your handling code here:
        dsluong.setDefaultEditor(Object.class, null);
        dsluong.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Lấy chỉ mục hàng được chọn
                int selectedRow = dsluong.getSelectedRow();
                
                // Hiển thị dữ liệu từ hàng được chọn vào các ô nhập liệu
                displayDataFromTable(selectedRow);
            }
        });
    }//GEN-LAST:event_dsluongMouseClicked

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // Lấy giá trị đầu vào từ các ô nhập liệu
        String maLuong = txt_ml.getText();
        String maNV = txt_mnv.getText();
        String luongCoBanStr = txt_lcb.getText();
        String phuCapStr = txt_pc.getText();
        String thuongStr = txt_t.getText();
        String khauTruStr = txt_khautru.getText();
        
     
        // Kiểm tra các trường dữ liệu
        if (maLuong.isEmpty() || maNV.isEmpty() || luongCoBanStr.isEmpty() || phuCapStr.isEmpty() || thuongStr.isEmpty() || khauTruStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng xử lý nếu có trường trống
        }

        // Kiểm tra định dạng số (chỉ cho phép số và dấu chấm)
        if (!luongCoBanStr.matches("\\d+\\.?\\d*") || !phuCapStr.matches("\\d+\\.?\\d*") || !thuongStr.matches("\\d+\\.?\\d*") || !khauTruStr.matches("\\d+\\.?\\d*")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng xử lý nếu định dạng số không hợp lệ
        }
        double luongCoBan = Double.parseDouble(txt_lcb.getText());
        double phuCap = Double.parseDouble(txt_pc.getText());
        double thuong = Double.parseDouble(txt_t.getText());
        double khauTru = Double.parseDouble(txt_khautru.getText());
        double tong = luongCoBan + phuCap + thuong - khauTru;

     // Chuỗi câu truy vấn SQL
     String insertQuery = "INSERT INTO luong (MaLuong, MaNV, luongCoBan, PhuCap, Thuong, KhauTru) VALUES (?, ?, ?, ?, ?, ?)";

     try {
         java.sql.Connection conn = cn.getConnection(); // Thiết lập kết nối

         if (!maLuong.isEmpty()) {  // Kiểm tra xem maLuong có rỗng hay không
             // Thêm bản ghi mới
             try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setString(1, maLuong);
                pstmt.setString(2, maNV);
                pstmt.setDouble(3, luongCoBan);
                pstmt.setDouble(4, phuCap);
                pstmt.setDouble(5, thuong);
                pstmt.setDouble(6, khauTru);
                 pstmt.executeUpdate();
                 System.out.println("Câu truy vấn thêm thực thi thành công!");
             }
         } 

         // Tải lại dữ liệu sau khi cập nhật/thêm
         loadData();
         JOptionPane.showMessageDialog(this, "Lưu thành công!");
         clearInputFields();

     } catch (SQLException e) {
         JOptionPane.showMessageDialog(this, "Lỗi khi lưu vào cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
        // Lấy giá trị đầu vào từ các ô nhập liệu
        String maLuong = txt_ml.getText();
        String maNV = txt_mnv.getText();
        String luongCoBanStr = txt_lcb.getText();
        String phuCapStr = txt_pc.getText();
        String thuongStr = txt_t.getText();
        String khauTruStr = txt_khautru.getText();
        
     
        // Kiểm tra các trường dữ liệu
        if (maLuong.isEmpty() || maNV.isEmpty() || luongCoBanStr.isEmpty() || phuCapStr.isEmpty() || thuongStr.isEmpty() || khauTruStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng xử lý nếu có trường trống
        }

        // Kiểm tra định dạng số (chỉ cho phép số và dấu chấm)
        if (!luongCoBanStr.matches("\\d+\\.?\\d*") || !phuCapStr.matches("\\d+\\.?\\d*") || !thuongStr.matches("\\d+\\.?\\d*") || !khauTruStr.matches("\\d+\\.?\\d*")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng xử lý nếu định dạng số không hợp lệ
        }
        double luongCoBan = Double.parseDouble(txt_lcb.getText());
        double phuCap = Double.parseDouble(txt_pc.getText());
        double thuong = Double.parseDouble(txt_t.getText());
        double khauTru = Double.parseDouble(txt_khautru.getText());
        double tong = luongCoBan + phuCap + thuong - khauTru;

    // Chuỗi câu truy vấn SQL
    
    String updateQuery = "UPDATE luong SET luongCoBan=?, PhuCap=?, Thuong=?, KhauTru=? WHERE MaLuong=?";

    try {
        java.sql.Connection conn = cn.getConnection(); // Thiết lập kết nối

        
            // Cập nhật bản ghi hiện tại
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setDouble(1, luongCoBan);
                pstmt.setDouble(2, phuCap);
                pstmt.setDouble(3, thuong);
                pstmt.setDouble(4, khauTru);
                pstmt.setString(5, maLuong);
                pstmt.executeUpdate();
                System.out.println("Câu truy vấn cập nhật thực thi thành công!");
            }
        

        // Tải lại dữ liệu sau khi cập nhật/thêm
        loadData();
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        clearInputFields();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi Cập nhật vào cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_capnhatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        // Lấy mã lương từ ô nhập liệu
        String maLuong = txt_ml.getText();
        // Kiểm tra các trường dữ liệu
        if (maLuong.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng xử lý nếu có trường trống
        }

        

        // Chuỗi câu truy vấn SQL
        String deleteQuery = "DELETE FROM luong WHERE MaLuong = ?";

        try {
            java.sql.Connection conn = cn.getConnection(); // Thiết lập kết nối
            try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
                pstmt.setString(1, maLuong);
                pstmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Đã xóa thông tin lương nhân viên!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            loadData(); // Load lại dữ liệu vào bảng sau khi xóa
            clearInputFields();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa thông tin lương nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void txt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timkiemActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
    String key = txt_timkiem.getText().trim();
    if (key.isEmpty()) {
        loadData();
        return;
    }

    DefaultTableModel model = (DefaultTableModel) dsluong.getModel();
    model.setRowCount(0);

    try (Connection conn = cn.getConnection(); 
         PreparedStatement pstmt = conn.prepareStatement("""
                SELECT luong.*, phongban.TenPB, nhanvien.HoTen
                FROM luong
                LEFT JOIN nhanvien ON luong.MaNV = nhanvien.MaNV
                LEFT JOIN phongban ON nhanvien.MaPB = phongban.MaPB
                WHERE nhanvien.HoTen LIKE ? OR luong.MaNV LIKE ? OR phongban.TenPB LIKE ?
                """)) {

        pstmt.setString(1, "%" + key + "%");
        pstmt.setString(2, "%" + key + "%");
        pstmt.setString(3, "%" + key + "%");
        try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getString("MaLuong");
                row[1] = rs.getString("MaNV");
                row[2] = rs.getString("HoTen");
                row[3] = rs.getString("TenPB");
                row[4] = rs.getDouble("luongCoBan");
                row[5] = rs.getDouble("PhuCap");
                row[6] = rs.getDouble("Thuong");
                row[7] = rs.getDouble("KhauTru");
                row[8] = rs.getDouble("luongCoBan") + rs.getDouble("PhuCap") + rs.getDouble("Thuong") - rs.getDouble("KhauTru");
                model.addRow(row);
            }
        }

        if (model.getRowCount() > 0) {
            JOptionPane.showMessageDialog(this, "Kết quả tìm kiếm cho '" + key + "':", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            loadData(); // Load lại dữ liệu gốc nếu không tìm thấy kết quả
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm dữ liệu từ cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }

    txt_timkiem.setText("");
    
    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Chắc chắn muốn thoát không!", "Thông báo!!!", JOptionPane.YES_NO_OPTION);
        if (tb != JOptionPane.YES_OPTION){
            return;
        }
        luongNV.this.setVisible(false);
        new MainF().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(luongNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(luongNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(luongNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(luongNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new luongNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JTable dsluong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txt_khautru;
    private javax.swing.JTextField txt_lcb;
    private javax.swing.JTextField txt_ml;
    private javax.swing.JTextField txt_mnv;
    private javax.swing.JTextField txt_pc;
    private javax.swing.JTextField txt_t;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
