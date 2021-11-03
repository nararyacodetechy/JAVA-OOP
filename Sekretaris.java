public class Sekretaris extends Perangkat {

    Sekretaris(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    Sekretaris(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void membuatPekerjaan() {
        System.out.println("Membuat Pekerjaan");
    }

    void menghapusPekerjaan() {
        System.out.println("Menghapus Pekerjaan");
    }

    void membuatJadwal() {
        System.out.println("Membuat Jadwal");
    }

    void menghapusJadwal() {
        System.out.println("Menghapus Jadwal");
    }

    void menambahAnggota() {
        System.out.println("Menambah Anggota");
    }

    void menghapusAnggota() {
        System.out.println("Menghapus Anggota");
    }

    void menambahKegiatan() {
        System.out.println("Menambah Kegiatan");
    }

    void menghapusKegiatan() {
        System.out.println("Menghapus Kegiatan");
    }
}
