/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlns;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class thongtinNV extends javax.swing.JFrame {

    ConnectDB cn = new ConnectDB();
    
    public thongtinNV() {
        initComponents();
        
        showTen();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doiMK = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_mkmoi = new javax.swing.JTextField();
        txt_mkcu = new javax.swing.JTextField();
        txt_xnMK = new javax.swing.JTextField();
        btn_doimk = new javax.swing.JButton();
        btn_quaylai = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTin = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        lb_htTen = new javax.swing.JLabel();
        cb_menu = new javax.swing.JComboBox<>();

        doiMK.setMinimumSize(new java.awt.Dimension(500, 400));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Đổi mật khẩu");

        jLabel3.setText("Mật khẩu cũ:");

        jLabel4.setText("Mật khẩu mới:");

        jLabel5.setText("Xác nhận MK:");

        btn_doimk.setText("Đổi");
        btn_doimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doimkActionPerformed(evt);
            }
        });

        btn_quaylai.setText("Quay lại");
        btn_quaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quaylaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doiMKLayout = new javax.swing.GroupLayout(doiMK.getContentPane());
        doiMK.getContentPane().setLayout(doiMKLayout);
        doiMKLayout.setHorizontalGroup(
            doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doiMKLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(doiMKLayout.createSequentialGroup()
                        .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(42, 42, 42)
                        .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_mkcu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mkmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(doiMKLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46)
                        .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(doiMKLayout.createSequentialGroup()
                                .addComponent(btn_doimk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_quaylai))
                            .addComponent(txt_xnMK)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        doiMKLayout.setVerticalGroup(
            doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doiMKLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_mkcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_mkmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_xnMK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(doiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_doimk)
                    .addComponent(btn_quaylai))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Thông tin nhân viên");

        tbThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbThongTin);

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setText("Đăng xuất");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lb_htTen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_htTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_htTen.setText(" ");
        lb_htTen.setAutoscrolls(true);
        lb_htTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_htTen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_htTen.setPreferredSize(new java.awt.Dimension(100, 30));

        cb_menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "Thông tin cá nhân", "Lương", "Phòng ban", "Hợp đồng", "Nghỉ phép", "Chấm công", "Đổi mật khẩu" }));
        cb_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_htTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lb_htTen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(cb_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String manv = "nv01";
    
    private void showTen(){
        
        // Thực hiện truy vấn lấy dữ liệu từ cơ sở dữ liệu
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // Thiết lập kết nối
            conn = cn.getConnection();
            stmt = conn.createStatement();

            // Thay đổi câu truy vấn
            String query = "SELECT * FROM NHANVIEN WHERE MaNV = '" + manv + "'";
            rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                String ten = rs.getString("HoTen");
                
                lb_htTen.setText(ten);
            }

            // Đóng ResultSet, câu lệnh và kết nối
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tableThongTin(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT * FROM NHANVIEN WHERE MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa các ô
                }
            };
            model.addColumn("MaNV");
            model.addColumn("Họ tên");
            model.addColumn("Ngày sinh");
            model.addColumn("Giới tính");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Email");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                String maNV = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String soDienThoai = rs.getString("SoDienThoai");
                String email = rs.getString("Email");

                Object[] rowData = {maNV, hoTen, ngaySinh, gioiTinh, diaChi, soDienThoai, email};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tableLuong(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT * FROM Luong WHERE MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa các ô
                }
            };
            model.addColumn("Lương CB");
            model.addColumn("Phụ cấp");
            model.addColumn("Thưởng");
            model.addColumn("Khấu trừ");
            model.addColumn("Tổng nhận");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                float luongcb = rs.getFloat("LuongCoBan");
                float phucap = rs.getFloat("PhuCap");
                float thuong = rs.getFloat("Thuong");
                float khautru = rs.getFloat("KhauTru");
                
                float nhan = luongcb + phucap + thuong - khautru;

                Object[] rowData = {luongcb, phucap, thuong, khautru, nhan};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tablePB(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT nhanvien.MaNV, phongban.* FROM nhanvien "
                            + "JOIN phongban ON nhanvien.MaPB = phongban.MaPB WHERE nhanvien.MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa các ô
                }
            };
            model.addColumn("Mã PB");
            model.addColumn("Tên PB");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                String mapb = rs.getString("MaPB");
                String tenpb = rs.getString("TenPB");

                Object[] rowData = {mapb, tenpb};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tableHD(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT * FROM hopdong WHERE MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa các ô
                }
            };
            model.addColumn("Mã HĐ");
            model.addColumn("Ngày bắt đầu");
            model.addColumn("Ngày kết thúc");
            model.addColumn("Lương HĐ");
            model.addColumn("Quyền lợi");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                String mahd = rs.getString("MaHopDong");
                Date bd = rs.getDate("NgayBatDau");
                Date kt = rs.getDate("NgayKetThuc");
                String luong = rs.getString("Luong");
                String quyen = rs.getString("CheDoDaiNgo");

                Object[] rowData = {mahd, bd, kt, luong, quyen};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tableNghi(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT * FROM nghiphep WHERE MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa các ô
                }
            };
            model.addColumn("Mã NP");
            model.addColumn("Ngày bắt đầu");
            model.addColumn("Ngày kết thúc");
            model.addColumn("Loại nghỉ phép");
            model.addColumn("Lý do");
            model.addColumn("Trạng thái");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                String manp = rs.getString("MaNghiPhep");
                Date bd = rs.getDate("NgayBatDau");
                Date kt = rs.getDate("NgayKetThuc");
                String loai = rs.getString("LoaiNghiPhep");
                String lydo = rs.getString("LyDo");
                String trangthai = rs.getString("TrangThai");

                Object[] rowData = {manp, bd, kt, loai, lydo, trangthai};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void tableCong(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT * FROM chamcong WHERE MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            // Tạo một DefaultTableModel để lưu dữ liệu từ ResultSet
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa các ô
                }
            };
            model.addColumn("Mã công");
            model.addColumn("Ngày công");
            model.addColumn("Giờ vào");
            model.addColumn("Giờ ra");
            model.addColumn("Giờ làm việc");

            // Đọc dữ liệu từ ResultSet và thêm vào DefaultTableModel
            while (rs.next()) {
                String macong = rs.getString("MaChamCong");
                Date ngaycong = rs.getDate("Ngay");
                Time vao = rs.getTime("GioVao");
                Time ra = rs.getTime("GioRa");
                
                // Tính toán giờ làm việc
                double gioLam = (ra.getTime() - vao.getTime()) / (1000.0 * 60 * 60) - 1;

                Object[] rowData = {macong, ngaycong, vao, ra, gioLam};
                model.addRow(rowData);
            }

            // Hiển thị dữ liệu từ DefaultTableModel vào JTable
            tbThongTin.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int tb = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát không!", "Thông báo!!!", JOptionPane.YES_NO_OPTION);
        if (tb != JOptionPane.YES_OPTION){
            return;
        }
        thongtinNV.this.setVisible(false);
        new dnForm().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cb_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_menuActionPerformed
        String chon = cb_menu.getSelectedItem().toString();
        
        if (chon == "Chọn") {
             // Xóa hết các cột trong JTable hiện tại
            while (tbThongTin.getColumnCount() > 0) {
                tbThongTin.getColumnModel().removeColumn(tbThongTin.getColumnModel().getColumn(0));
            }
        }
        else if (chon == "Thông tin cá nhân") {
            tableThongTin();
        }
        else if (chon == "Lương") {
            tableLuong();
        }
        else if (chon == "Phòng ban") {
            tablePB();
        }
        else if (chon == "Hợp đồng") {
            tableHD();
        }
        else if (chon == "Nghỉ phép") {
            tableNghi();
        }
        else if (chon == "Chấm công") {
            tableCong();
        }
        else {
            thongtinNV.this.setVisible(false);
            doiMK.setVisible(true);
            cb_menu.setSelectedItem("Chọn");
            // Xóa hết các cột trong JTable hiện tại
            while (tbThongTin.getColumnCount() > 0) {
                tbThongTin.getColumnModel().removeColumn(tbThongTin.getColumnModel().getColumn(0));
            }
        }
    }//GEN-LAST:event_cb_menuActionPerformed

    private void btn_quaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quaylaiActionPerformed
        thongtinNV.this.setVisible(true);
        doiMK.setVisible(false);
    }//GEN-LAST:event_btn_quaylaiActionPerformed

    private boolean KiemTraMk() {
        // Lấy dữ liệu từ các thành phần trên form
        String mk = new String(txt_mkmoi.getText());
        String xnmk = new String(txt_xnMK.getText());

        // Kiểm tra độ dài
        if (mk.length() < 5) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải có độ dài tối thiểu là 5 ký tự!", "Thông báo!!!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra độ phức tạp
        if (!mk.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{5,}$")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải chứa ít nhất một ký tự chữ hoa, một ký tự chữ thường, một chữ số và một ký tự đặc biệt!", "Thông báo!!!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Kiểm tra xem hai mật khẩu có khớp hay không
        if (!mk.equals(xnmk)){
            JOptionPane.showMessageDialog(this, "Mật khẩu không khớp!", "Thông báo!!!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // Mật khẩu hợp lệ
        return true;
    }
    
    private void btn_doimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doimkActionPerformed
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            conn = cn.getConnection();

            // Tạo một câu lệnh truy vấn SQL với điều kiện
            String query = "SELECT * FROM taikhoan WHERE MaNV = '" + manv + "'";

            // Tạo một câu lệnh truy vấn SQL
            stmt = conn.createStatement();

            // Thực hiện truy vấn trong bảng NHANVIEN và lưu kết quả vào ResultSet
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                String mk = rs.getString("MatKhau");

                if (txt_mkcu.getText().equals(mk)) {
                    String mkmoi = txt_mkmoi.getText();
                    String xnmk = txt_xnMK.getText();

                    if (KiemTraMk()) {
                        // Tạo câu truy vấn cập nhật dữ liệu
                        String UpdQuery = "UPDATE taikhoan SET MatKhau = '" + mkmoi + "' WHERE MaNV = '" + manv + "'";

                        // Thực hiện câu truy vấn cập nhật dữ liệu
                        stmt.execute(UpdQuery);

                        // Hiển thị thông báo thành công
                        JOptionPane.showMessageDialog(this, "Đổi thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                        // Sau khi cập nhật thành công, xóa dữ liệu trong các ô nhập liệu
                        txt_mkcu.setText("");
                        txt_mkmoi.setText("");
                        txt_xnMK.setText("");
                        // Thực hiện hiển thị hoặc ẩn frame theo đúng logic của bạn
                        thongtinNV.this.setVisible(true);
                        doiMK.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mật khẩu cũ không đúng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng ResultSet, Statement và Connection để giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_doimkActionPerformed

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
            java.util.logging.Logger.getLogger(thongtinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thongtinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thongtinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thongtinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thongtinNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btn_doimk;
    private javax.swing.JButton btn_quaylai;
    private javax.swing.JComboBox<String> cb_menu;
    private javax.swing.JFrame doiMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_htTen;
    private javax.swing.JTable tbThongTin;
    private javax.swing.JTextField txt_mkcu;
    private javax.swing.JTextField txt_mkmoi;
    private javax.swing.JTextField txt_xnMK;
    // End of variables declaration//GEN-END:variables
}
