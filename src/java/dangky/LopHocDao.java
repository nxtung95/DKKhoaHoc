/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangky;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class LopHocDao extends BaseDao {
    public List<LopHoc> findAll() {
        List<LopHoc> lopHocList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        try {
                connection = getConnection();
                StringBuilder sql = new StringBuilder("SELECT * FROM LOPHOC ");
                ps = connection.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String maLop = rs.getString("MaLop");
                    String tenLop = rs.getString("TenLop");
                    Date ngayBatDau = rs.getDate("NgayBD");
                    Date ngayKetThuc = rs.getDate("NgayKT");
                    int slToiThieu = rs.getInt("SLToiThieu");
                    int slToiDa = rs.getInt("SLToiDa");
                    String maKH = rs.getString("MaKH");
                    lopHocList.add(new LopHoc(maLop.trim(), tenLop, ngayBatDau, ngayKetThuc, slToiThieu, slToiDa, maKH));
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection, ps, null);
        }
        return lopHocList;
    }
    
    public List<LopHoc> search(String tenLop, String maKH) {
        List<LopHoc> lopHocList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        try {
                connection = getConnection();
                StringBuilder sql = new StringBuilder("SELECT * FROM LOPHOC WHERE 1 = 1 ");
                if (tenLop != null && tenLop != "") {
                    sql.append("AND TenLop LIKE ? ");
                }
                if (maKH != null && maKH != "") {
                    sql.append("AND MaKH = ? ");
                }
                ps = connection.prepareStatement(sql.toString());
                int index = 1;
                if (tenLop != null && tenLop != "") {
                    ps.setString(index++, "%" + tenLop + "%");
                }
                if (maKH != null && maKH != "") {
                    ps.setString(index++, maKH);
                }
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String maLop = rs.getString("MaLop");
                    String tenLop1 = rs.getString("TenLop");
                    Date ngayBatDau = rs.getDate("NgayBD");
                    Date ngayKetThuc = rs.getDate("NgayKT");
                    int slToiThieu = rs.getInt("SLToiThieu");
                    int slToiDa = rs.getInt("SLToiDa");
                    String tmaKH = rs.getString("MaKH");
                    lopHocList.add(new LopHoc(maLop.trim(), tenLop1, ngayBatDau, ngayKetThuc, slToiThieu, slToiDa, tmaKH.trim()));
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection, ps, null);
        }
        return lopHocList;
    }
    
}
