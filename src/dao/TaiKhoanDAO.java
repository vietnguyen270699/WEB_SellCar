package dao;

import cndb.ConnectDatabase;
import model.SanPham;
import model.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaiKhoanDAO implements IAccountDAO {
	ArrayList<TaiKhoan> dstaikhoan = new ArrayList<>();

	@Override
	public boolean createAccount(Object obj) {
		TaiKhoan acc = (TaiKhoan) obj;
		// insert into user (username,email,password,role) values (?,?,?,?)";
		String sql = "insert into taikhoan (tentaikhoan,matkhau,tenkhachhang,gioitinh,sodienthoai,diachi,role) values (?,?,?,?,?,?,?)";

		try {
			Connection conn = ConnectDatabase.createConnection();
			PreparedStatement ptmt = conn.prepareStatement(sql);
			String tentaikhoan = acc.getTenTaiKhoan();
			String matkhau = acc.getMatKhau();
			String tenkhachhang = acc.getTenKhachHang();
			String gioitinh = acc.getGioiTinh();
			String sodienthoai = acc.getSoDienThoai();
			String diachi = acc.getDiaChi();
			String role = acc.getRole();

			ptmt.setString(1, tentaikhoan);
			ptmt.setString(2, matkhau);
			ptmt.setString(3, tenkhachhang);
			ptmt.setString(4, gioitinh);
			ptmt.setString(5, sodienthoai);
			ptmt.setString(6, diachi);
			ptmt.setString(7, role);

			ptmt.executeUpdate();
			System.out.println("Success");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Failure");
		return false;
	}

	// danh sách tài khoản
	public ArrayList<TaiKhoan> showtaikhoan() {
		TaiKhoan taikhoan = null;
		String sql = "select * from taikhoan";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				taikhoan = new TaiKhoan();
				String tentaikhoan = rs.getString("tenTaiKhoan");
				String matkhau = rs.getString("matKhau");

				String tenkhachhang = rs.getString("tenKhachHang");
				String gioitinh = rs.getString("gioiTinh");
				String sodienthoai = rs.getString("soDienThoai");
				String diachi = rs.getString("diaChi");
				String role = rs.getString("role");

				taikhoan.setTenTaiKhoan(tentaikhoan);
				;
				taikhoan.setMatKhau(matkhau);
				taikhoan.setTenKhachHang(tenkhachhang);
				taikhoan.setGioiTinh(gioitinh);
				taikhoan.setSoDienThoai(sodienthoai);
				taikhoan.setDiaChi(diachi);
				taikhoan.setRole(role);

				dstaikhoan.add(taikhoan);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dstaikhoan;
	}

	// lấy thông tin khách hàng đã đăng nhập
	public TaiKhoan layThongTin(String tentaikhoan1) {
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu("select * from taikhoan where tentaikhoan='" + tentaikhoan1 + "'");
			while (rs.next()) {
				String tentaikhoan = rs.getString(1);
				String matkhau = rs.getString(2);
				String tenkhachhang = rs.getString(3);
				String gioitinh = rs.getString(4);
				String sodienthoai = rs.getString(5);
				String diachi = rs.getString(6);
				String role = rs.getString(7);
				return new TaiKhoan(tentaikhoan, matkhau, tenkhachhang, gioitinh, sodienthoai, diachi, role);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public boolean checkAccount(String username, String password) {
		String sql = "select * from taikhoan where tentaikhoan='" + username + "'";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				if (rs.getString("tentaikhoan").equals(username) && rs.getString("matkhau").equals(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean checkAccountAdmin(String username, String password) {
		String sql = "select * from taikhoan where tentaikhoan='" + username + "'";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				if (rs.getString("tentaikhoan").equals(username) && rs.getString("matkhau").equals(password)
						&& rs.getString("role").equalsIgnoreCase("admin")) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	// confirm account
	public boolean checkAccountConfirm(String userName, String roleNumber) {
		String sql = "select * from taikhoan where tentaikhoan='" + userName + "'";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				if (rs.getString("tentaikhoan").equals(userName) && rs.getString("role").equalsIgnoreCase(roleNumber)) {
					try {
						new ConnectDatabase()
								.thucThiSQL("update taikhoan set role=N'user' where tenTaiKhoan='" + userName + "'");
						return true;
					} catch (Exception e) {
						e.printStackTrace();
					}

					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean checkAccountExits(String username) {
		String sql = "select * from taikhoan where tentaikhoan='" + username + "'";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				if (rs.getString("tentaikhoan").equals(username)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	// Sửa thông tin taikhoan
	public boolean editTaiKhoan(TaiKhoan tk, String tentaikhoan) {
		try {
			new ConnectDatabase().thucThiSQL("update taikhoan set tenTaiKhoan='" + tk.getTenTaiKhoan() + "',matKhau=N'"
					+ tk.getMatKhau() + "', tenKhachHang=N'" + tk.getTenKhachHang() + "',gioiTinh=N'" + tk.getGioiTinh()
					+ "',soDienThoai=N'" + tk.getSoDienThoai() + "',diaChi=N'" + tk.getDiaChi() + "',role=N'"
					+ tk.getRole() + "' where tenTaiKhoan='" + tentaikhoan + "'");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean xoaTaiKhoan(String tentaikhoan) {
		try {
			new ConnectDatabase().thucThiSQL("delete from taikhoan where tenTaiKhoan='" + tentaikhoan + "'");

			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	

	public static void main(String[] args) {
		TaiKhoan tk = new TaiKhoan("vietpro11", "viet123", "vietnguyenpro", "Nam", "0963058534", "Bến Tre", "user");
		// System.out.println(new TaiKhoanDAO().createAccount(tk));
		// System.out.println(new TaiKhoanDAO().checkAccount("viet111", "viet123"));
//	System.out.println(new TaiKhoanDAO().checkAccountExits("vietpro111"));
	}

}
