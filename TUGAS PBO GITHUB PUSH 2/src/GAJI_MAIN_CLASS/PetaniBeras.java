/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GAJI_MAIN_CLASS;

import PERTANIAN_VAR.KomoditasBeras;
import PERTANIAN_VAR.Penyuluh;
import CRUD_TUGAS.koneksiFarm;
import java.sql.Date;

public class PetaniBeras {
    private String nama;
    private KomoditasBeras komoditasBeras;

    public PetaniBeras(String nama, KomoditasBeras komoditasBeras) {
        this.nama = nama;
        this.komoditasBeras = komoditasBeras;
    }

    public void menanam() {
        System.out.println(nama + " menanam beras dengan luas tanam " + komoditasBeras.getLuasTanam() + " hektar.");
    }

    public void panen() {
        System.out.println(nama + " panen beras dengan luas panen " + komoditasBeras.getLuasPanen() + " hektar.");
    }

    public void menghitungProduksi() {
        double produksi = komoditasBeras.getLuasPanen() * komoditasBeras.getProduktivitas();
        System.out.println("Produksi beras yang dihasilkan oleh " + nama + " adalah " + produksi + " ton.");
    }

    public static void main(String[] args) {
        koneksiFarm crud = new koneksiFarm();
        
        // Bapak boleh jalankan satu dari beberapa koding dibawah ini
        // SUDAH DI BATASI ANTAR TABEL
        // LAKUKAN UNCOMMENT pada bagian crud.
        // TOTAL ADA 4 TABEL
        
        //TABEL LOKASI =================================================================
        
        //simpan lokasi
        //crud.simpanLokasi("Jawa Tengah", "Banjarmasin", "Cileunyi", "Desa Cileunyi");
        
        //ubah lokasi berdasarkan desa
        //crud.ubahLokasi("Jawa Barat", "Bandung", "Tanjung", "Desa Cileunyi");
        
        //delete lokasi berdasarkan desa
        //crud.hapusLokasi("Desa Cileunyi");
        
        //END TABEL LOKASI =============================================================
        
        
        
        //TABEL KOMODITAS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        //simpan komoditas
        //crud.simpanKomoditas("Beras", "Desa Cileunyi", "Pertanian", 105, 80.2, 5);
        
        //ubah komoditas
        //crud.ubahKomoditas("Jagung", 1003.54, 382.2, 50, "Desa Cileunyi", "Pertanian");
        
        //hapus komoditas
        //crud.hapusKomoditas("Jagung", "Desa Cileunyi", "Pertanian");
        
        //END TABEL KOMODITAS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        
        //TABEL PETANI -----------------------------------------------------------------
        //simpan petani
        //crud.simpanPetani("Budi Santoso", "Jl. Raya No.1, Jakarta", "Poktan Sejahtera", "Padi", "Pelatihan Tanam Modern");
        
        //ubah petani
        //crud.ubahPetani("Jl. Kupang No.2 Bandung", "Poktan Surya", "Jagung", "Pelatihan Tanam Tradisional", "Budi Santoso");
        
        //hapus petani
        //crud.hapusPetani("Budi Santoso");
        //END TABEL PETANI -------------------------------------------------------------
        
        
        //START TABEL PENYULUH ##########################################################
        
        //simpan penyuluh
        //crud.simpanPenyuluh("Udin", "Jl. Merdeka No. 123, Bandung", "Aktif", "Jawa Barat", "Pertanian", Date.valueOf("2024-06-11"));
         
         //ubah penyuluh
         //crud.ubahPenyuluh("Jl. Merdeka No. 321, Jakarta", "Tidak Aktif", "Jawa Timur", "Perkebunan", Date.valueOf("2023-05-20"), "Udin");
         
         //hapus penyuluh
        //crud.hapusPenyuluh("Udin");
        
        //END TABEL PENYULUH
    }
}
