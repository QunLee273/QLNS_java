/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlns;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namta
 */
public class chamcong extends javax.swing.JFrame {

    
    ConnectDB cn = new ConnectDB();
    DefaultTableModel model;
    
    public chamcong() {
        initComponents();
        setupTable();
        model = (DefaultTableModel) dschamcong.getModel(); // Initialize the model here
        loadData();
    }
    
    private void displayDataFromTable(int row) {
        // Lấy dữ liệu từ bảng theo hàng được chọn
        String machamcong = dschamcong.getValueAt(row, 0).toString();
        String maNV = dschamcong.getValueAt(row, 1).toString();
        String ngay = dschamcong.getValueAt(row, 4).toString();
        String vao = dschamcong.getValueAt(row, 5).toString();
        String ra = dschamcong.getValueAt(row, 6).toString();

        // Hiển thị dữ liệu lên các ô nhập liệu
        txt_mcc.setText(machamcong);
        txt_mnv.setText(maNV);
        txt_ngay.setText(ngay);
        txt_vao.setText(vao);
        txt_ra.setText(ra);
}    
    
    private void setupTable() {
        // Khởi tạo DefaultTableModel với các cột rỗng và không cho phép chỉnh sửa
        model = new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chấm công","Mã nhân viên","Họ tên","Tên phòng ban","Ngày","Giờ vào","Giờ ra"
            }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };

        // Gán model cho JTable dsluong
        dschamcong.setModel(model);
    }
    
    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) dschamcong.getModel();
        // Xóa dữ liệu hiện có trong bản
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
                SELECT cc.MaChamCong,nv.MaNV, nv.HoTen, pb.TenPB, cc.Ngay, cc.GioVao, cc.GioRa
                                FROM chamcong cc
                                JOIN nhanvien nv ON cc.MaNV = nv.MaNV
                                JOIN phongban pb ON nv.MaPB = pb.MaPB;
            """;
            rs = stmt.executeQuery(query);
            
            // Xóa dữ liệu cũ trong bảng
            model.setRowCount(0);

            // Lặp qua kết quả truy vấn và thêm vào mô hình bảng
            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getString("MaChamCong");
                row[1] = rs.getString("MaNV");
                row[2] = rs.getString("HoTen");
                row[3] = rs.getString("TenPB");
                row[4] = rs.getDate("Ngay");
                row[5] = rs.getTime("GioVao");
                row[6] = rs.getTime("GioRa");
                model.addRow(row);
            }
        }  catch (SQLException e) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_mnv = new javax.swing.JTextField();
        txt_ngay = new javax.swing.JTextField();
        txt_vao = new javax.swing.JTextField();
        txt_ra = new javax.swing.JTextField();
        btn_luu = new javax.swing.JButton();
        btn_capnhat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_mcc = new javax.swing.JTextField();
        btn_xoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dschamcong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã nhân viên");

        jLabel3.setText("Ngày");

        jLabel4.setText("Giờ vào");

        jLabel5.setText("Giờ ra");

        txt_mnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mnvActionPerformed(evt);
            }
        });

        txt_ngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ngayActionPerformed(evt);
            }
        });

        txt_vao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vaoActionPerformed(evt);
            }
        });

        txt_ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_raActionPerformed(evt);
            }
        });

        btn_luu.setText("lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_capnhat.setText("cập nhật");
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã chấm công");

        txt_mcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mccActionPerformed(evt);
            }
        });

        btn_xoa.setText("xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_vao, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_mnv, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mcc, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_capnhat)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoa)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mcc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mnv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_vao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_capnhat)
                    .addComponent(btn_luu)
                    .addComponent(btn_xoa))
                .addGap(57, 57, 57)
                .addComponent(btnThoat)
                .addGap(76, 76, 76))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dschamcong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chấm công", "Mã nhân viên", "Họ tên", "Tên phòng ban", "Ngày", "Giờ vào", "Giờ ra"
            }
        ));
        dschamcong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dschamcongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dschamcong);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Chấm công ");

        btn_timkiem.setText("Search");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_timkiem)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mnvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mnvActionPerformed

    private void txt_ngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ngayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ngayActionPerformed

    private void txt_vaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vaoActionPerformed

    private void txt_raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_raActionPerformed

    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
        // TODO add your handling code here:
        String machamcong = txt_mcc.getText();
        String manv = txt_mnv.getText();
        String ngay = txt_ngay.getText();
        String vao = txt_vao.getText();
        String ra = txt_ra.getText();
        // Kiểm tra các trường dữ liệu
            if (machamcong.isEmpty() || manv.isEmpty() || ngay.isEmpty() || vao.isEmpty() || ra.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Dừng xử lý nếu có trường trống
            }

        String updateQuery = "UPDATE chamcong SET MaNV=?, Ngay=?, GioVao=?, GioRa=? WHERE MaChamCong=?";

        try {
            java.sql.Connection conn = cn.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, manv);
            pstmt.setString(2, ngay);
            pstmt.setString(3, vao);
            pstmt.setString(4, ra);
            pstmt.setString(5, machamcong);

            int updated = pstmt.executeUpdate();

            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                loadData(); // Tải lại dữ liệu sau khi cập nhật
                clearInputFields();
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu để cập nhật!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_capnhatActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed

        String machamcong = txt_mcc.getText();
        String maNV = txt_mnv.getText();
        String ngay = txt_ngay.getText();
        String vao = txt_vao.getText();
        String ra = txt_ra.getText();

        // Kiểm tra các trường dữ liệu
           if (machamcong.isEmpty() || maNV.isEmpty() || ngay.isEmpty() || vao.isEmpty() || ra.isEmpty()) {
               JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
               return; // Dừng xử lý nếu có trường trống
           }


        // Chuỗi câu truy vấn SQL
        String insertQuery = "INSERT INTO `chamcong`(`MaChamCong`, `MaNV`, `Ngay`, `GioVao`, `GioRa`) VALUES (?, ?, ?, ?, ?)";

        try {
            java.sql.Connection conn = cn.getConnection(); // Thiết lập kết nối

            if (!machamcong.isEmpty()) {  // Kiểm tra xem maLuong có rỗng hay không
                // Thêm bản ghi mới
                try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                   pstmt.setString(1, machamcong); 
                   pstmt.setString(2, maNV);
                   pstmt.setString(3, ngay);
                   pstmt.setString(4, vao);
                   pstmt.setString(5, ra);
                    pstmt.executeUpdate();
                    System.out.println("Câu truy vấn thêm thực thi thành công!");
                }
            } 

            // Tải lại dữ liệu sau khi cập nhật/thêm
            loadData();
            clearInputFields();
            JOptionPane.showMessageDialog(this, "Lưu thành công!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu vào cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void txt_mccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mccActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        String machamcong = txt_mcc.getText();
        // Kiểm tra các trường dữ liệu
        if (machamcong.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Hãy nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Dừng xử lý nếu có trường trống
        }
    
    String deleteQuery = "DELETE FROM chamcong WHERE MaChamCong=?";
    
    try {
        java.sql.Connection conn = cn.getConnection();
        
        PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
        pstmt.setString(1, machamcong);
        
        int deleted = pstmt.executeUpdate();
        
        if (deleted > 0) {
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            loadData(); // Tải lại dữ liệu sau khi xóa
            clearInputFields();
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi xóa dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void dschamcongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dschamcongMouseClicked
            // TODO add your handling code here:
        int row = dschamcong.getSelectedRow();
        if (row >= 0) {
            displayDataFromTable(row);
    }
    }//GEN-LAST:event_dschamcongMouseClicked

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        String keyword = txt_timkiem.getText().trim();
        // Kiểm tra các trường dữ liệu
        if (keyword.isEmpty()) {
            loadData();
            return; // Dừng xử lý nếu có trường trống
        }
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Xóa dữ liệu hiện có trong bảng
    model.setRowCount(0);

    // Thực hiện truy vấn lấy dữ liệu từ cơ sở dữ liệu
    java.sql.Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        // Kết nối tới cơ sở dữ liệu
        conn = cn.getConnection();

        // Thực hiện truy vấn SQL
        String query = """
            SELECT cc.MaChamCong, nv.MaNV, nv.HoTen, pb.TenPB, cc.Ngay, cc.GioVao, cc.GioRa
            FROM chamcong cc
            JOIN nhanvien nv ON cc.MaNV = nv.MaNV
            JOIN phongban pb ON nv.MaPB = pb.MaPB
            WHERE nv.HoTen LIKE ? OR nv.MaNV LIKE ? OR pb.TenPB LIKE ? OR cc.MaChamCong LIKE ?
        """;
        pstmt = conn.prepareStatement(query);
        String searchKeyword = "%" + keyword + "%";
        pstmt.setString(1, searchKeyword);
        pstmt.setString(2, searchKeyword);
        pstmt.setString(3, searchKeyword);
        pstmt.setString(4, searchKeyword);

        rs = pstmt.executeQuery();

        // Lặp qua kết quả truy vấn và thêm vào mô hình bảng
        while (rs.next()) {
            Object[] row = new Object[7];
            row[0] = rs.getString("MaChamCong");
            row[1] = rs.getString("MaNV");
            row[2] = rs.getString("HoTen");
            row[3] = rs.getString("TenPB");
            row[4] = rs.getDate("Ngay");
            row[5] = rs.getTime("GioVao");
            row[6] = rs.getTime("GioRa");
            model.addRow(row);
        }

        if (model.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Kết quả tìm kiếm cho '" + keyword + "':", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadData(); // Load lại dữ liệu gốc nếu không tìm thấy kết quả
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm dữ liệu từ cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        txt_timkiem.setText(""); 
    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Chắc chắn muốn thoát không!", "Thông báo!!!", JOptionPane.YES_NO_OPTION);
        if (tb != JOptionPane.YES_OPTION){
            return;
        }
        chamcong.this.setVisible(false);
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
            java.util.logging.Logger.getLogger(chamcong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chamcong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chamcong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chamcong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chamcong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JTable dschamcong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_mcc;
    private javax.swing.JTextField txt_mnv;
    private javax.swing.JTextField txt_ngay;
    private javax.swing.JTextField txt_ra;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txt_vao;
    // End of variables declaration//GEN-END:variables
}
