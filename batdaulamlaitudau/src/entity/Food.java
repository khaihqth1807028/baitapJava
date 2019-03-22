package entity;

public class Food extends caunoi {

    private String rollNumber;

    // hàm đặc biệt
    // tên trùng với tên class.
    // Không có kiểu dữ liệu trả về.
    // Dùng để khởi tạo đối tượng cụ thể của một class.
    public Food() {

    }

    public Food(String rollNumber, String name, String ID, String mota ,String ngaytao, int gia) {
        this.rollNumber = rollNumber;
        this.setName(name);
        this.setID(ID);
        this.setMota(mota);
        this.setNgaytao(ngaytao);
        this.setGia(gia);
    }


    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
