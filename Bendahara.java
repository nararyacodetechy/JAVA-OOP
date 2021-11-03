public class Bendahara extends Perangkat {

    Bendahara(Integer noAnggota, String namaAnggota) {
        super(noAnggota, namaAnggota);
        // TODO Auto-generated constructor stub
    }

    Bendahara(String namaAnggota, Integer noAnggota, String periode) {
        super(namaAnggota, noAnggota, periode);
        // TODO Auto-generated constructor stub
    }

    void membuatAnggaran() {
        System.out.println("Membuat Anggaran");
    }

    void menghapusAnggaran() {
        System.out.println("Menghapus Anggaran");
    }
}
