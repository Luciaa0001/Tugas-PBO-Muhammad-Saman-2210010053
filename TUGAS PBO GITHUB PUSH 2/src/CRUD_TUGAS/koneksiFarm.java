/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_TUGAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author acer
 */
public class koneksiFarm {
    private String database = "2210010053_muhammad_saman";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/" + database;
    public static Connection koneksidb;

    public koneksiFarm() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (koneksidb == null || koneksidb.isClosed()) {
                koneksidb = DriverManager.getConnection(lokasi, username, password);
                System.out.println("Database Terkoneksi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL LOKASI START -------
    
    public void simpanLokasi(String tempProvinsi, String tempKabupaten, String tempKecamatan, String tempDesa) {
        try {
            String sql = "INSERT INTO lokasi (provinsi, kabupaten, kecamatan, desa) VALUES (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempProvinsi);
            perintah.setString(2, tempKabupaten);
            perintah.setString(3, tempKecamatan);
            perintah.setString(4, tempDesa);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahLokasi(String tempProvinsi, String tempKabupaten, String tempKecamatan, String tempDesa) {
        try {
            String sql = "UPDATE lokasi SET provinsi = ?, kabupaten = ?, kecamatan = ? WHERE desa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempProvinsi);
            perintah.setString(2, tempKabupaten);
            perintah.setString(3, tempKecamatan);
            perintah.setString(4, tempDesa);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusLokasi(String tempDesa) {
        try {
            String sql = "DELETE FROM lokasi WHERE desa = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempDesa);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL LOKASI END -------
    
    
    
    //TABEL KOMODITAS START -------
    
    public void simpanKomoditas(String tempNama, String tempLokasi, String tempSubsektor, double tempLuastanam, double tempLuaspanen, double tempProduktivitas) {
        try {
            String sql = "INSERT INTO komoditas (nama, lokasi, subsektor, luas_tanam, luas_panen, produktivitas) VALUES (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.setString(2, tempLokasi);
            perintah.setString(3, tempSubsektor);
            perintah.setDouble(4, tempLuastanam);
            perintah.setDouble(5, tempLuaspanen);
            perintah.setDouble(6, tempProduktivitas);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKomoditas(String tempNama, double tempLuastanam, double tempLuaspanen, double tempProduktivitas, String tempLokasi, String tempSubsektor) {
        try {
            String sql = "UPDATE komoditas set nama = ?,luas_tanam = ?, luas_panen = ?, produktivitas = ? where lokasi = ? AND subsektor = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.setDouble(2, tempLuastanam);
            perintah.setDouble(3, tempLuaspanen);
            perintah.setDouble(4, tempProduktivitas);
            perintah.setString(5, tempLokasi);
            perintah.setString(6, tempSubsektor);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKomoditas(String tempNama, String tempLokasi, String tempSubsektor){
        try {
            String sql = "DELETE from komoditas WHERE nama = ? AND lokasi = ? AND subsektor = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.setString(2, tempLokasi);
            perintah.setString(3, tempSubsektor);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL KOMODITAS END -------
    
    
    
    //TABEL PETANI START -------
    
    public void simpanPetani(String tempNama, String tempAlamat, String tempPoktan, String tempKomoditas, String tempPelatihan){
        try {
            String sql = "INSERT INTO petani (nama, alamat, poktan, komoditas, pelatihan) VALUES (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.setString(2, tempAlamat);
            perintah.setString(3, tempPoktan);
            perintah.setString(4, tempKomoditas);
            perintah.setString(5, tempPelatihan);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPetani (String tempAlamat, String tempPoktan, String tempKomoditas, String tempPelatihan, String tempNama){
        try {
            String sql = "UPDATE petani SET alamat = ?, poktan = ?, komoditas = ?, pelatihan = ? WHERE nama = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempAlamat);
            perintah.setString(2, tempPoktan);
            perintah.setString(3, tempKomoditas);
            perintah.setString(4, tempPelatihan);
            perintah.setString(5, tempNama);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPetani (String tempNama){
        
        try {
            String sql = "DELETE FROM petani WHERE nama = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempNama);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //TABEL PETANI END -------
    
    
    
    //TABEL PENYULUH START -------
    
    public void simpanPenyuluh (String tempNama, String tempAlamat, String tempStatus, String tempWilayah, String tempSubsektor, Date tempTanggalMulai){
        try {
        String sql = "INSERT INTO penyuluh (nama, alamat, status, wilayah, subsektor, tgl_mulai) values (?,?,?,?,?,?)";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempNama);
        perintah.setString(2, tempAlamat);
        perintah.setString(3, tempStatus);
        perintah.setString(4, tempWilayah);
        perintah.setString(5, tempSubsektor);
        perintah.setDate(6, tempTanggalMulai);
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPenyuluh (String tempAlamat, String tempStatus, String tempWilayah, String tempSubsektor, Date tempTanggalMulai, String tempNama){
        try {
        String sql = "UPDATE penyuluh SET alamat = ?, status = ?, wilayah = ?, subsektor = ?, tgl_mulai = ? WHERE nama = ?";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempAlamat);
        perintah.setString(2, tempStatus);
        perintah.setString(3, tempWilayah);
        perintah.setString(4, tempSubsektor);
        perintah.setDate(5, tempTanggalMulai);
        perintah.setString(6, tempNama);
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPenyuluh (String tempNama){
        try {
        String sql = "DELETE FROM penyuluh WHERE nama = ?";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempNama);
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL PENYULUH END -------
}
