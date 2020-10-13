package model;

public class DonHang {
private String maDonHang;
private String tenTaiKhoan;
private int tongGia;
private String ngayBan;
public DonHang(String maDonHang, String tenTaiKhoan, int tongGia, String ngayBan) {
	super();
	this.maDonHang = maDonHang;
	this.tenTaiKhoan = tenTaiKhoan;
	this.tongGia = tongGia;
	this.ngayBan = ngayBan;
}
public String getMaDonHang() {
	return maDonHang;
}
public void setMaDonHang(String maDonHang) {
	this.maDonHang = maDonHang;
}
public String getTenTaiKhoan() {
	return tenTaiKhoan;
}
public void setTenTaiKhoan(String tenTaiKhoan) {
	this.tenTaiKhoan = tenTaiKhoan;
}
public int getTongGia() {
	return tongGia;
}
public void setTongGia(int tongGia) {
	this.tongGia = tongGia;
}
public String getNgayBan() {
	return ngayBan;
}
public void setNgayBan(String ngayBan) {
	this.ngayBan = ngayBan;
}
@Override
public String toString() {
	return "DonHang [maDonHang=" + maDonHang + ", tenTaiKhoan=" + tenTaiKhoan + ", tongGia=" + tongGia + ", ngayBan="
			+ ngayBan + "]";
}

}
