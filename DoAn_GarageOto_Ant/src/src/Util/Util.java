/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author WINDOWS 10
 */
public class Util {

    public Util() {
    }
    // database là localdatetime có s
    // lúc lấy lên từ db thì ngay lúc đó là String có s
    // đổi string thì localdatetime có s cho object
    // muốn đưa lên view thì đổi localdatetime có s thành string không s
    // chuyen tu database len 
    
    // chuyên từ db string localdatetime có s lên swing localdatetime co s
    public LocalDateTime localDateParseMethod(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");
        LocalDateTime ngayLam = LocalDateTime.parse(dateString, formatter);
        return ngayLam.withNano(0);
    }
    public LocalDateTime localDateParseMethodWithoutNanosecond(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ngayLam = LocalDateTime.parse(dateString, formatter);
        return ngayLam.withNano(0);
    }
    
    // format localdatime từ có s sang không có s
//    public LocalDateTime formatLocalDateTimeWithoutNanoseconds(LocalDateTime localDateTime){
//        return localDateTime.withNano(0);
//    }
    
    // localDateTime có s thành String không s
    public String localDateParseMethod(LocalDateTime ngayLam){
        String formattedNgayLam = ngayLam.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return formattedNgayLam;
    }
}
