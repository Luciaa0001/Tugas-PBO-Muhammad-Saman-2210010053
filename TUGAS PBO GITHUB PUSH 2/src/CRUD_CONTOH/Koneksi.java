/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_CONTOH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author acer
 */
public class Koneksi {
    private String databasename = "2210010053_muhammad_saman";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databasename;
    public static Connection koneksidb;
    
    public Koneksi(){
    
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidb = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahBelajar(String tempNpm, String tempNama, String tempTelpon){
        
        try {
            
            String sql = "update belajar set nama = ?, telpon = ? where npm = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.setString(2, tempTelpon);
            perintah.setString(3, tempNpm);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void simpanBelajar(String tempNpm, String tempNama, String tempTelpon){
        
        try {
            
            String sql = "insert into belajar (npm, nama, telpon) value (?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNpm);
            perintah.setString(2, tempNama);
            perintah.setString(3, tempTelpon);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void hapusBelajar(String tempNpm){
        
        try {
            
            String sql = "delete from belajar where npm = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNpm);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
