public class Koordinator extends Panitia {

    Koordinator(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    Koordinator(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void membuatLaporan() {
        System.out.println("Membuat Laporan");
    }

    void menghapusLaporan() {
        System.out.println("menghapus Laporan");
    }

    void membuatPekerjaan() {
        System.out.println("Membuat Pekerjaan");
    }

    void membuatJadwal() {
        System.out.println("Membuat Jadwal");
    }

    void menghapusJadwal() {
        System.out.println("Menghapus Jadwal");
    }
}
