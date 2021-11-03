public class KetuaPanitia extends Panitia {

    KetuaPanitia(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    KetuaPanitia(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    String namaKegiatan;

    void melihatKetua() {
        System.out.println(
                "Nama : " + this.namaAnggota + "Nomer Anggota : " + this.noAnggota + "Periode : " + this.periode);
    }

    void menyetujuiAnggaran() {
        System.out.println("Menyeujui Anggaran");
    }

    void menyetujuiPekerjaan() {
        System.out.println("Menyetujui Pekerjaan");
    }

    void menyetujuiJadwal() {
        System.out.println("Menyetujui Jadwal");
    }
}
