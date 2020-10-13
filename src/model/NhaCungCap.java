package model;

public class NhaCungCap {
private String maNhaCungCap;
private String tenNhaCungCap;
private String diaChiNhaCungCap;
public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChiNhaCungCap) {
	super();
	this.maNhaCungCap = maNhaCungCap;
	this.tenNhaCungCap = tenNhaCungCap;
	this.diaChiNhaCungCap = diaChiNhaCungCap;
}
public String getMaNhaCungCap() {
	return maNhaCungCap;
}
public void setMaNhaCungCap(String maNhaCungCap) {
	this.maNhaCungCap = maNhaCungCap;
}
public String getTenNhaCungCap() {
	return tenNhaCungCap;
}
public void setTenNhaCungCap(String tenNhaCungCap) {
	this.tenNhaCungCap = tenNhaCungCap;
}
public String getDiaChiNhaCungCap() {
	return diaChiNhaCungCap;
}
public void setDiaChiNhaCungCap(String diaChiNhaCungCap) {
	this.diaChiNhaCungCap = diaChiNhaCungCap;
}
@Override
public String toString() {
	return "NhaCungCap [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", diaChiNhaCungCap="
			+ diaChiNhaCungCap + "]";
}
}
