public class BarangBag implements Comparable<BarangBag> {
    String namaBarang;
    String kodeBarang;
    String jenisBarang;
    int stokBarang;

    public BarangBag(String namaBarang, String kodeBarang, String jenisBarang, int stokBarang)  {
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
        return String.format("Barang Bag\nKode: %s\nNama:%s\nJenis:%s\nStok:%d\n", this.kodeBarang, this.namaBarang, this.jenisBarang, this.stokBarang);
    }

    @Override
    public int compareTo(BarangBag o) {
        return this.getKodeBarang().compareTo(o.getKodeBarang());
    }

}
