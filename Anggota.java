public class Anggota {
    Integer noAnggota;
    String namaAnggota;
    String telepon;
    String alamat;
    String periode;

    Anggota(Integer noAnggota, String namaAnggota) {
        this.noAnggota = noAnggota;
        this.namaAnggota = namaAnggota;
    }

    Anggota(String namaAnggota, Integer noAnggota, String periode) {
        this.namaAnggota = namaAnggota;
        this.noAnggota = noAnggota;
        this.periode = periode;
    }

    // Method
    void melihatJadwal() {
        System.out.println("Melihat Jadwal");
    }

    void melihatPekerjaan() {
        System.out.println("Melihat Pekerjaan");
    }

    void melihatLaporan() {
        System.out.println("Melihat Laporan");
    }

    void melihatAnggaran() {
        System.out.println("Melihat Anggaran");
    }

    void melihatAnggota() {
        System.out.println("Nama Anggota : " + this.namaAnggota + " Nomer Anggota : " + this.noAnggota);
    }

    void melihatKegiatan() {
        System.out.println("Melihat Kegiatan");
    }
}