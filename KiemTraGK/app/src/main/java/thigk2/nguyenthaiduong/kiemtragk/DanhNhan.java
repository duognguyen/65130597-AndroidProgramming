package thigk2.nguyenthaiduong.kiemtragk;

public class DanhNhan {
    private String anhDD, ten, quequan;

    public DanhNhan(String anhDD, String ten, String quequan) {
        this.anhDD = anhDD;
        this.ten = ten;
        this.quequan = quequan;
    }

    public String getAnhDD() {
        return anhDD;
    }

    public String getTen() {
        return ten;
    }

    public String getQuequan() {
        return quequan;
    }
}
