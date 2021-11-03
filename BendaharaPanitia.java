public class BendaharaPanitia extends Panitia {

    BendaharaPanitia(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    BendaharaPanitia(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void mengajukanAnggaran() {
        System.out.println("mengajukan Anggaran");
    }

    void membuatLaporan() {
        System.out.println("Membuat Laporan");
    }

    void menghapusLaporan() {
        System.out.println("menghapus Laporan");
    }
}
