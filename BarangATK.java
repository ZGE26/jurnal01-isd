public class BarangATK implements Comparable<BarangATK> {
    String namaBarang;
    String kodeBarang;
    String jenisBarang;
    int stokBarang;

    public BarangATK(String namaBarang, String kodeBarang, String jenisBarang, int stokBarang)  {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.stokBarang = stokBarang;
    }

    public void editStockBarang(int nilai) {
        this.stokBarang = nilai;
    }

    public void editNamaBarang(String nilai) {
        this.namaBarang = nilai;
    }

    public void editJenisBarang(String nilai) {
        this.jenisBarang = nilai;
    }

    public void editKodeBarang(String nilai) {
        this.kodeBarang = nilai;
    }

    public String getKodeBarang() {
        return this.kodeBarang;
    }

    @Override
    public String toString() {
        return String.format("Barang ATK\nKode: %s\nNama:%s\nJenis:%s\nStok:%d\n", this.kodeBarang, this.namaBarang, this.jenisBarang, this.stokBarang);
    }

    @Override
    public int compareTo(BarangATK o) {
        return this.getKodeBarang().compareTo(o.getKodeBarang());
    }
}
