package entity;

public class caunoi {
private String ID;
    private String name;
    private int gia;
    private String ngaytao;
    private String mota;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "caunoi{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", gia=" + gia +
                ", ngaytao='" + ngaytao + '\'' +
                ", mota='" + mota + '\'' +
                '}';
    }
}
