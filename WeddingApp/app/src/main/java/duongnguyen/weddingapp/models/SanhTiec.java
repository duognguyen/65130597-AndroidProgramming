package duongnguyen.weddingapp.models;

public class SanhTiec {
    private String tenSanh;
    private int sucChua;
    private long giaThue;

    public SanhTiec() {
    }

    public SanhTiec(String tenSanh, int sucChua, long giaThue) {
        this.tenSanh = tenSanh;
        this.sucChua = sucChua;
        this.giaThue = giaThue;
    }

    public String getTenSanh() {
        return tenSanh;
    }

    public void setTenSanh(String tenSanh) {
        this.tenSanh = tenSanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public long getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(long giaThue) {
        this.giaThue = giaThue;
    }
}
