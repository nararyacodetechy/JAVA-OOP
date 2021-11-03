public class Panitia extends Anggota {

    Panitia(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    Panitia(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    String namaKegiatan;

    void melihatLaporan() {
        System.out.println("Melihat Laporan");
    }

    void melihatJadwal() {
        System.out.println("Melihat Laporan");
    }

    void melihatAnggaran() {
        System.out.println("Melihat Laporan");
    }
}
