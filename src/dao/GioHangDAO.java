package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.SanPhamDAO;
import cndb.ConnectDatabase;
import model.SanPham;
import model.SanPhamTrongGioHang;

public class GioHangDAO {
	public static ArrayList<SanPhamTrongGioHang> gioHang = new ArrayList<>();
	public static ArrayList<SanPham> list = new ArrayList<>();

	public GioHangDAO() {
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
				list.add(sanpham);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	// xem san phẩm đã chọn
	public static SanPham xemSanPham(String maSanPham) {
		SanPham sp = null ;
		for(int i=0;i<list.size();i++) {
			if (list.get(i).getMasanpham().equals(maSanPham)) {
				sp = list.get(i);
			}
				
		}
		
		return sp;
	}

// kiểm tra san phâm có trên giỏ hàng chưa
	public static boolean kiemTraSanPhamCoTrongGioHangChua(String maHang) {
		for (int i = 0; i < gioHang.size(); i++) {
			if (gioHang.get(i).getSanPham().getMasanpham().equals(maHang)) {
				return true;
			}
		}
		return false;
	}
	// them vào giỏ hàng
	public static boolean themVaoGioHang(String maSanPham) {
		boolean kiemTra = kiemTraSanPhamCoTrongGioHangChua(maSanPham);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMasanpham().equals(maSanPham)&& kiemTra == false) {
				try {
					gioHang.add(new SanPhamTrongGioHang(new SanPhamDAO().layThongTinSanPham(maSanPham), 1));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return true;
			}
		}
		if (kiemTra == true) {
			int index = gioHang.size();
			for (int i = 0; i < index; i++) {
				if (gioHang.get(i).getSanPham().getMasanpham().equals(maSanPham)) {
					gioHang.get(i).setSoLuong(gioHang.get(i).getSoLuong() + 1);
					index = i;
				}
			}
		}
		return false;

	}
	
	// xóa trong giỏ hàng
		public static boolean xoaSanPhamTrongGioHang(String maSanPham) {
			for (int i = 0; i < gioHang.size(); i++) {
				if (gioHang.get(i).getSanPham().getMasanpham().equals(maSanPham)) {
					gioHang.remove(i);
					return true;
				}
			}
			return false;
		}
		
		

	// tinh tiền
		public static int SumDonHang() {
			int sum = 0;
			for (int i = 0; i < gioHang.size(); i++) {
				int gia = gioHang.get(i).getSanPham().getGiaban() * gioHang.get(i).getSoLuong();
				sum += gia;
			}
			return sum;

		}

	public static ArrayList<SanPhamTrongGioHang> getGioHang() {
		return gioHang;
	}

	public static void setGioHang(ArrayList<SanPhamTrongGioHang> gioHang) {
		GioHangDAO.gioHang = gioHang;
	}

	public static ArrayList<SanPham> getList() {
		return list;
	}

	public static void setList(ArrayList<SanPham> list) {
		GioHangDAO.list = list;
	}

	
}
