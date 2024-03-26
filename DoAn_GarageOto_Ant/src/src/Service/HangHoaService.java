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
import src.Model.HangHoa;
/**
 *
 * @author WINDOWS 10
 */
public class HangHoaService {
    public List<HangHoa> hienThiTatCaHangHoa() throws SQLException{ //
        String query = String.format("select * from hang_hoa");
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB(query);
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        List<HangHoa> danhSachHangHoa = new ArrayList<>();
        while(resultTable.next()){
            HangHoa hangHoa = new HangHoa();
            for (i= 1; i <= q; i++){
                hangHoa.setMaHangHoa(resultTable.getString("ma_hang_hoa"));
                hangHoa.setGiaBan(resultTable.getDouble("gia_ban"));
                hangHoa.setGiaVon(resultTable.getDouble("gia_von"));
                hangHoa.setKhachDat(resultTable.getShort("khach_dat"));
                hangHoa.setTenHangHoa(resultTable.getString("ten_hang_hoa"));
                hangHoa.setTonKho(resultTable.getShort("ton_kho"));
                hangHoa.setMaNhomHang(resultTable.getString("ma_nhom_hang"));
                hangHoa.setLoaiHang(resultTable.getString("loai_hang"));
            }
            danhSachHangHoa.add(hangHoa);
        }
        return danhSachHangHoa;
    }
    
    public HangHoa hienThiHangHoaTheoMaHangHoa(String maHangHoa) throws SQLException{ //
        String query = String.format("select * from hang_hoa where ma_hang_hoa = '%s'", maHangHoa);
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB(query);
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        HangHoa hangHoa = new HangHoa();
        while(resultTable.next()){
            for (i= 1; i <= q; i++){
                hangHoa.setMaHangHoa(resultTable.getString("ma_hang_hoa"));
                hangHoa.setGiaBan(resultTable.getDouble("gia_ban"));
                hangHoa.setGiaVon(resultTable.getDouble("gia_von"));
                hangHoa.setKhachDat(resultTable.getShort("khach_dat"));
                hangHoa.setTenHangHoa(resultTable.getString("ten_hang_hoa"));
                hangHoa.setTonKho(resultTable.getShort("ton_kho"));
                hangHoa.setMaNhomHang(resultTable.getString("ma_nhom_hang"));
                hangHoa.setLoaiHang(resultTable.getString("loai_hang"));
            }
        }
        return hangHoa;
    }
    
    public List<HangHoa> LocHangHoaTheoInput(List<String> inputs) throws SQLException{ //
        String query = String.format("select * from hang_hoa where ");
        int j = 1;
        for (String input : inputs){
            if (j ==1 ){
                query += String.format(" ten_hang_hoa LIKE '%%%s%%'", input);
            } else{
                query += String.format(" OR ten_hang_hoa LIKE '%%%s%%'", input);
            }
            j++;
        }
        System.out.println(query);
        ResultSet resultTable = ConnectorDB.executeQueryConnectorDB(query);
        ResultSetMetaData resultSetMetaData = resultTable.getMetaData();
        int q = resultSetMetaData.getColumnCount();
        int i;
        List<HangHoa> danhSachHangHoa = new ArrayList<>();
        while(resultTable.next()){
            HangHoa hangHoa = new HangHoa();
            for (i= 1; i <= q; i++){
                hangHoa.setMaHangHoa(resultTable.getString("ma_hang_hoa"));
                hangHoa.setGiaBan(resultTable.getDouble("gia_ban"));
                hangHoa.setGiaVon(resultTable.getDouble("gia_von"));
                hangHoa.setKhachDat(resultTable.getShort("khach_dat"));
                hangHoa.setTenHangHoa(resultTable.getString("ten_hang_hoa"));
                hangHoa.setTonKho(resultTable.getShort("ton_kho"));
                hangHoa.setMaNhomHang(resultTable.getString("ma_nhom_hang"));
                hangHoa.setLoaiHang(resultTable.getString("loai_hang"));
            }
            danhSachHangHoa.add(hangHoa);
        }
        return danhSachHangHoa;
    }
}
