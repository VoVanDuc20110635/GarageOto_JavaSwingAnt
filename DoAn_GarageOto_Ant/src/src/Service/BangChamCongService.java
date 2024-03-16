/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.Service;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import src.ConnectDB.ConnectorDB;
import src.Model.BangChamCong;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author WINDOWS 10
 */
public class BangChamCongService {
    public List<BangChamCong> hienThiBangChamCong () throws SQLException{ //
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB("select * from bang_cham_cong where ma_nhan_vien='NV002'");
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        List<BangChamCong> danhSachBangChamCong = new ArrayList<>();
        while(resultTable.next()){
            BangChamCong bangChamCong = new BangChamCong();
            for (i= 1; i <= q; i++){
                bangChamCong.setMaBangChamCong(resultTable.getString("ma_bang_cham_cong"));
                bangChamCong.setGioTangCa(resultTable.getShort("gio_tang_ca"));
                bangChamCong.setNgayLam(localDateParseMethod(resultTable.getString("ngay_lam")));
                bangChamCong.setTrangThai(resultTable.getString("trang_thai"));
                bangChamCong.setMaCaLam(resultTable.getString("ma_ca_lam"));
                bangChamCong.setMaNhanVien(resultTable.getString("ma_nhan_vien"));
            }
            danhSachBangChamCong.add(bangChamCong);
        }
        return danhSachBangChamCong;
    }
    
    public LocalDateTime localDateParseMethod(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
        LocalDateTime ngayLam = LocalDateTime.parse(dateString, formatter);
        return ngayLam;
    }
}
