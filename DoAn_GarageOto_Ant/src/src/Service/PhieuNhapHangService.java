/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.Service;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import src.ConnectDB.ConnectorDB;
import src.Model.PhieuNhapHang;
import src.Util.Util;
/**
 *
 * @author WINDOWS 10
 */
public class PhieuNhapHangService {
    private Util util = new Util();
    public List<PhieuNhapHang> hienThiTatCaPhieuNhapHang () throws SQLException{ //
        String query = String.format("select * from phieu_nhap_hang");
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB(query);
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        List<PhieuNhapHang> danhSachPhieuNhapHang = new ArrayList<>();
        while(resultTable.next()){
            PhieuNhapHang phieuNhapHang = new PhieuNhapHang();
            for (i= 1; i <= q; i++){
                phieuNhapHang.setPhieuNhapHang(resultTable.getString("phieu_nhap_hang"));
                phieuNhapHang.setNo(resultTable.getDouble("no"));
                phieuNhapHang.setThoiGian( util.localDateParseMethod(resultTable.getString("thoi_gian")));
                phieuNhapHang.setTong(resultTable.getDouble("tong"));
                phieuNhapHang.setTrangThai(resultTable.getString("trang_thai"));
                phieuNhapHang.setMaNhaCungCap(resultTable.getString("ma_nha_cung_cap"));
            }
            danhSachPhieuNhapHang.add(phieuNhapHang);
        }
        return danhSachPhieuNhapHang;
    }
}
