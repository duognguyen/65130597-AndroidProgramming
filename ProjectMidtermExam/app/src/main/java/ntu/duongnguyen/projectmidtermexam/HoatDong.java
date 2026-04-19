package ntu.duongnguyen.projectmidtermexam;

public class HoatDong {
    private String anhDD, tenHoatDong, thoiGian;

    public HoatDong(String anhDD, String tenHoatDong, String thoiGian) {
        this.anhDD = anhDD;
        this.tenHoatDong = tenHoatDong;
        this.thoiGian = thoiGian;
    }

    public String getAnhDD() {
        return anhDD;
    }

    public String getTenHoatDong() {
        return tenHoatDong;
    }

    public String getThoiGian() {
        return thoiGian;
    }
}
