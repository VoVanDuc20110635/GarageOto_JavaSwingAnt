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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import src.Model.HinhAnh;
/**
 *
 * @author WINDOWS 10
 */
public class HinhAnhService {
    public HinhAnh hienThiHinhAnhTheoMaNhanVien (String maNhanVien) throws SQLException{ //
        String query = String.format("select * from hinh_anh where ma_nhan_vien ='%s'",
                             maNhanVien);
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB(query);
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        HinhAnh hinhAnh = new HinhAnh();
        while(resultTable.next()){
            
            for (i= 1; i <= q; i++){
                hinhAnh.setMaHinhAnh(resultTable.getString("ma_hinh_anh"));
                hinhAnh.setNoiDung(resultTable.getString("noi_dung"));
                hinhAnh.setTenHinh(resultTable.getString("ten_hinh"));
                hinhAnh.setMaHangHoa(resultTable.getString("ma_hang_hoa"));
                hinhAnh.setMaNhanVien(resultTable.getString("ma_nhan_vien"));
            }
        }
        return hinhAnh;
    }
    
    public HinhAnh hienThiHinhAnhTheoMaHangHoa (String maHangHoa) throws SQLException{ //
        String query = String.format("select * from hinh_anh where ma_hang_hoa ='%s'",
                             maHangHoa);
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB(query);
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        HinhAnh hinhAnh = new HinhAnh();
        while(resultTable.next()){
            
            for (i= 1; i <= q; i++){
                hinhAnh.setMaHinhAnh(resultTable.getString("ma_hinh_anh"));
                hinhAnh.setNoiDung(resultTable.getString("noi_dung"));
                hinhAnh.setTenHinh(resultTable.getString("ten_hinh"));
                hinhAnh.setMaHangHoa(resultTable.getString("ma_hang_hoa"));
                hinhAnh.setMaNhanVien(resultTable.getString("ma_nhan_vien"));
            }
        }
        return hinhAnh;
    }
}
