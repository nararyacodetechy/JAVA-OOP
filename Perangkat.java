public class Perangkat extends Anggota {
    // konstraktor
    Perangkat(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    Perangkat(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    String periode;
    Integer tanggalMenjabat;
    Integer tanggalSelesai;

    void membuatLaporan() {
        System.out.println("Membuat Laporan");
    }

    void menghapusLaporan() {
        System.out.println("Menghapus Laporan");
    }
}
