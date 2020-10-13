package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cndb.ConnectDatabase;
import model.SanPham;
import model.TaiKhoan;

public class SanPhamDAO implements IASanPhamDAO {

	ArrayList<SanPham> dsgiohang = new ArrayList<>();
	ArrayList<SanPham> dssanpham = new ArrayList<>();

//	public SanPhamDAO() {
//		dssanpham = showsanpham();
//	}

	

	public SanPhamDAO() {
		
		SanPham sanpham = null;
		String sql = "select * from sanpham";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				sanpham = new SanPham();
				String masanpham = rs.getString("maSanPham");
				String tensanpham = rs.getString("tenSanPham");

				int giaban = rs.getInt("giaBan");

				String manhacungcap = rs.getString("maNhaCungCap");
				String hinhanh = rs.getString("hinhAnh");
				String mota = rs.getString("moTa");
				int soluong = rs.getInt("soLuong");

				sanpham.setMasanpham(masanpham);
				sanpham.setTensanpham(tensanpham);
				sanpham.setGiaban(giaban);
				sanpham.setManhacungcap(manhacungcap);
				sanpham.setHinhanh(hinhanh);
				sanpham.setMota(mota);
				sanpham.setSoluong(soluong);
				dsgiohang.add(sanpham);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}


	@Override
	public ArrayList<SanPham> showsanpham() {
		SanPham sanpham = null;
		String sql = "select * from sanpham";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				sanpham = new SanPham();
				String masanpham = rs.getString("maSanPham");
				String tensanpham = rs.getString("tenSanPham");

				int giaban = rs.getInt("giaBan");

				String manhacungcap = rs.getString("maNhaCungCap");
				String hinhanh = rs.getString("hinhAnh");
				String mota = rs.getString("moTa");
				int soluong = rs.getInt("soLuong");

				sanpham.setMasanpham(masanpham);
				sanpham.setTensanpham(tensanpham);
				sanpham.setGiaban(giaban);
				sanpham.setManhacungcap(manhacungcap);
				sanpham.setHinhanh(hinhanh);
				sanpham.setMota(mota);
				sanpham.setSoluong(soluong);
				dssanpham.add(sanpham);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dssanpham;
	}

	@Override
	public ArrayList<SanPham> sanphamnoibat() {
		ArrayList<SanPham> listsp = new ArrayList<SanPham>();
		SanPham sanpham = null;
		String sql = "select * from sanpham";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				sanpham = new SanPham();
				String masanpham = rs.getString("maSanPham");
				String tensanpham = rs.getString("tenSanPham");

				int giaban = rs.getInt("giaBan");

				String manhacungcap = rs.getString("maNhaCungCap");
				String hinhanh = rs.getString("hinhAnh");
				String mota = rs.getString("moTa");
				int soluong = rs.getInt("soLuong");

				sanpham.setMasanpham(masanpham);

				sanpham.setTensanpham(tensanpham);
				sanpham.setGiaban(giaban);
				sanpham.setManhacungcap(manhacungcap);
				sanpham.setHinhanh(hinhanh);
				sanpham.setMota(mota);
				sanpham.setSoluong(soluong);

				if (mota.equalsIgnoreCase("1")) {
					listsp.add(sanpham);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listsp;
	}

	@Override
	public ArrayList<SanPham> sanphamnxuhuong() {
		ArrayList<SanPham> listsp = new ArrayList<SanPham>();
		SanPham sanpham = null;
		String sql = "select * from sanpham";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				sanpham = new SanPham();
				String masanpham = rs.getString("maSanPham");
				String tensanpham = rs.getString("tenSanPham");

				int giaban = rs.getInt("giaBan");

				String manhacungcap = rs.getString("maNhaCungCap");
				String hinhanh = rs.getString("hinhAnh");
				String mota = rs.getString("moTa");
				int soluong = rs.getInt("soLuong");

				sanpham.setMasanpham(masanpham);

				sanpham.setTensanpham(tensanpham);
				sanpham.setGiaban(giaban);
				sanpham.setManhacungcap(manhacungcap);
				sanpham.setHinhanh(hinhanh);
				sanpham.setMota(mota);
				sanpham.setSoluong(soluong);

				if (mota.equalsIgnoreCase("2")) {
					listsp.add(sanpham);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listsp;
	}
	
	public static SanPham layThongTinSanPham(String id) throws SQLException {
		Connection connection;
		SanPham sp = null;
		try {
			connection = ConnectDatabase.createConnection();
			String sql = "SELECT * FROM sanpham s where s.maSanPham=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				String masanpham = rs.getString(1);
				String tensanpham = rs.getString(2);

				int giaban = rs.getInt(3);

				String manhacungcap = rs.getString(4);
				String hinhanh = rs.getString(5);
				String mota = rs.getString(6);
				int soluong = rs.getInt(7);

				sp = new SanPham(masanpham, tensanpham, giaban, manhacungcap, hinhanh, mota, soluong);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sp;
	}
	// lọc sản phẩm theo nhà cung cấp 
	public static ArrayList<SanPham> locSanPham (String maNCC){
		ArrayList<SanPham> listsp = new ArrayList<SanPham>();
		SanPham sanpham = null;
		String sql = "select * from sanpham";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				sanpham = new SanPham();
				String masanpham = rs.getString("maSanPham");
				String tensanpham = rs.getString("tenSanPham");

				int giaban = rs.getInt("giaBan");

				String manhacungcap = rs.getString("maNhaCungCap");
				String hinhanh = rs.getString("hinhAnh");
				String mota = rs.getString("moTa");
				int soluong = rs.getInt("soLuong");

				sanpham.setMasanpham(masanpham);

				sanpham.setTensanpham(tensanpham);
				sanpham.setGiaban(giaban);
				sanpham.setManhacungcap(manhacungcap);
				sanpham.setHinhanh(hinhanh);
				sanpham.setMota(mota);
				sanpham.setSoluong(soluong);
				if (manhacungcap.equalsIgnoreCase(maNCC)) {
					listsp.add(sanpham);
				}
				

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listsp;
	}
	
	// loc theo gia
	public static ArrayList<SanPham> locSanPhamTheoGia (String loai){
		ArrayList<SanPham> listsp1 = new ArrayList<SanPham>();
		ArrayList<SanPham> listsp2 = new ArrayList<SanPham>();
		ArrayList<SanPham> listsp3 = new ArrayList<SanPham>();
		ArrayList<SanPham> listsp = new ArrayList<SanPham>();
		SanPham sanpham = null;
		String sql = "select * from sanpham";
		ConnectDatabase conn = new ConnectDatabase();
		try {
			ResultSet rs = conn.chonDuLieu(sql);
			while (rs.next()) {
				sanpham = new SanPham();
				String masanpham = rs.getString("maSanPham");
				String tensanpham = rs.getString("tenSanPham");

				int giaban = rs.getInt("giaBan");

				String manhacungcap = rs.getString("maNhaCungCap");
				String hinhanh = rs.getString("hinhAnh");
				String mota = rs.getString("moTa");
				int soluong = rs.getInt("soLuong");

				sanpham.setMasanpham(masanpham);

				sanpham.setTensanpham(tensanpham);
				sanpham.setGiaban(giaban);
				sanpham.setManhacungcap(manhacungcap);
				sanpham.setHinhanh(hinhanh);
				sanpham.setMota(mota);
				listsp.add(sanpham);
				sanpham.setSoluong(soluong);
				if (giaban <= 70000) {
					listsp1.add(sanpham);
				}
				if (giaban > 70000 && giaban<=90000) {
					listsp2.add(sanpham);
				}
				if (giaban > 90000) {
					listsp3.add(sanpham);
				}
				

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(loai.equalsIgnoreCase("thap")) {
			return listsp1;
		}
		if(loai.equalsIgnoreCase("trungbinh")) {
			return listsp2;
		}
		if(loai.equalsIgnoreCase("cao")) {
			return listsp3;
		}
		return listsp;
	}
	//thêm sản phẩm
	public boolean themSanPham(Object obj) {
		SanPham sp = (SanPham) obj;
		try {

			new ConnectDatabase().thucThiSQL("insert into sanpham values('" + sp.getMasanpham() + "',N'" + sp.getTensanpham()
					+ "',N'" + sp.getGiaban() + "',N'" + sp.getManhacungcap() + "',N'" + sp.getHinhanh() + "',N'"
					+ sp.getMota() + "',N'" + sp.getSoluong()  + "')");
			return true;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}
	
	
// Sửa thông tin sản phẩm
	public boolean editSanPham(SanPham sp , String masanpham) {
		// insert into user (username,email,password,role) values (?,?,?,?)";
		try {
			new ConnectDatabase().thucThiSQL("update sanpham set maSanPham='" + sp.getMasanpham() + "',tenSanPham=N'"
					+ sp.getTensanpham() + "', giaBan=N'" + sp.getGiaban() + "',maNhaCungCap=N'" + sp.getManhacungcap()+
					"',hinhAnh=N'" + sp.getHinhanh() +"',moTa=N'" + sp.getMota()+"',soLuong=N'" + sp.getSoluong()
					+ "' where maSanPham='" + masanpham + "'");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	
	}
	
	public boolean xoaSanPham(String masanpham) {
		try {
			new ConnectDatabase().thucThiSQL("delete from sanpham where maSanPham='" + masanpham + "'");

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
//	// thêm san phẩm vào giỏ hàng
//	public ArrayList<SanPham> themSanPhamVaoGio(String maSanPham) {
//		//ArrayList<SanPham> ls = new ArrayList<>();
//		for (int i = 0; i < dssanpham.size(); i++) {
//			if (dssanpham.get(i).getMasanpham().equalsIgnoreCase(maSanPham)) {
//				dsgiohang.add(dssanpham.get(i));
//
//			}
//		}
//		return dsgiohang;
//	}
//
//	// xóa sản phẩm khỏi giỏ hàng
//	public boolean xoaSanPhamKhoiGio(String maSanPham) {
//		for (int i = 0; i < dsgiohang.size(); i++) {
//			if (dsgiohang.get(i).getMasanpham().equalsIgnoreCase(maSanPham)) {
//				dsgiohang.remove(i);
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public ArrayList<SanPham> getDsgiohang() {
//		return dsgiohang;
//	}
//
//	public void setDsgiohang(ArrayList<SanPham> dsgiohang) {
//		this.dsgiohang = dsgiohang;
//	}
//
//	public ArrayList<SanPham> getDssanpham() {
//		return dssanpham;
//	}
//
//	public void setDssanpham(ArrayList<SanPham> dssanpham) {
//		this.dssanpham = dssanpham;
//	}
	
	



	public ArrayList<SanPham> getDsgiohang() {
		return dsgiohang;
	}


	public void setDsgiohang(ArrayList<SanPham> dsgiohang) {
		this.dsgiohang = dsgiohang;
	}
	public static void main(String[] args) {
//		System.out.println( new SanPhamDAO().getDsgiohang());
//		System.out.println(new SanPhamDAO().showsanpham());
		SanPham sp = new SanPham("AUDI002", "AUDI A2", 999999, "NCCAUDI", "audia2.jpg", "1", 1);
		System.out.println(new SanPhamDAO().editSanPham(sp,"AUDI002"));
	}

}
