package model;

public class SanPham {
private String masanpham;
private String tensanpham;
private int giaban;
private String manhacungcap;
private String hinhanh;
private String mota;
private int soluong;
public SanPham(String masanpham, String tensanpham, int giaban, String manhacungcap, String hinhanh, String mota,
		int soluong) {
	super();
	this.masanpham = masanpham;
	this.tensanpham = tensanpham;
	this.giaban = giaban;
	this.manhacungcap = manhacungcap;
	this.hinhanh = hinhanh;
	this.mota = mota;
	this.soluong = soluong;
}
public SanPham() {
	super();}
@Override
public String toString() {
	return "SanPham [masanpham=" + masanpham + ", tensanpham=" + tensanpham + ", giaban=" + giaban + ", manhacungcap="
			+ manhacungcap + ", hinhanh=" + hinhanh + ", mota=" + mota + ", soluong=" + soluong + "]";
}
public String getMasanpham() {
	return masanpham;
}
public void setMasanpham(String masanpham) {
	this.masanpham = masanpham;
}
public String getTensanpham() {
	return tensanpham;
}
public void setTensanpham(String tensanpham) {
	this.tensanpham = tensanpham;
}
public int getGiaban() {
	return giaban;
}
public void setGiaban(int giaban) {
	this.giaban = giaban;
}
public String getManhacungcap() {
	return manhacungcap;
}
public void setManhacungcap(String manhacungcap) {
	this.manhacungcap = manhacungcap;
}
public String getHinhanh() {
	return hinhanh;
}
public void setHinhanh(String hinhanh) {
	this.hinhanh = hinhanh;
}
public String getMota() {
	return mota;
}
public void setMota(String mota) {
	this.mota = mota;
}
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}


}
