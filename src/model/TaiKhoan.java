package model;

public class TaiKhoan {
	private String tenTaiKhoan;
	private String matKhau;
	private String tenKhachHang;
	private String gioiTinh;
	private String soDienThoai;
	private String diaChi;
	private String role;

	@Override
	public String toString() {
		return "TaiKhoan [tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", tenKhachHang=" + tenKhachHang
				+ ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", role=" + role
				+ "]";
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public TaiKhoan(String tenTaiKhoan, String matKhau, String tenKhachHang, String gioiTinh, String soDienThoai,
			String diaChi, String role) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.role = role;
	}
	public TaiKhoan() {
		super();
	}
}
