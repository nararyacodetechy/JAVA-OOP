public class Ketua extends Perangkat {

    Ketua(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    Ketua(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void melihatPengurus() {
        System.out.println(
                "Nama : " + this.namaAnggota + "Nomer Anggota : " + this.noAnggota + "periode : " + this.periode);
    }

    void menyetujuiAnggaran() {
        System.out.println("Menyetujui Anggaran");
    }

    void menyetujuiPekerjaan() {
        System.out.println("Menyetujui Pekerjaan");
    }

    void menyetujuiJadwal() {
        System.out.println("Menyetujui Jadwal");
    }

    void menyetujuiKegiatan() {
        System.out.println("Menyetujui Kegiatan");
    }

}
