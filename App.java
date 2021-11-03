public class App {
    public static void main(String[] args) throws Exception {
        // a. instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota anggota = new Anggota(12, "Ferry");

        anggota.melihatAnggota();

        // b. instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua pengurus = new Ketua("Bagus Nararya", 13, "2020");

        pengurus.melihatPengurus();

        // c. instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia data = new KetuaPanitia("Nanda Raditya", 13, "2020");

        data.melihatKetua();

    }
}
