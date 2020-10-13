package controller;

import java.io.File;
import java.io.IOException;

//import javax.mail.Part;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.SanPhamDAO;
import model.SanPham;

/**
 * Servlet implementation class AdminThemSanPham
 */
@WebServlet("/AdminThemSanPham")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 50, // 50MB
		maxRequestSize = 1024 * 1024 * 50) // 50MB

public class AdminThemSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminThemSanPham() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String masanpham = request.getParameter("masanpham");
		String tensanpham = request.getParameter("tensanpham");
		int gia = Integer.parseInt(request.getParameter("giasanpham"));
		String manhacungcap = request.getParameter("manhacungcap");
		// image
		Part part = request.getPart("hinhanh");
		String hinhanh = extractFileName(part);
		hinhanh = new File(hinhanh).getName();
		System.out.println(hinhanh);
		part.write(this.getFolderUpload().getAbsolutePath() + File.separator + hinhanh);

		String mota = request.getParameter("mota");
		int soluong = Integer.parseInt(request.getParameter("soluong"));
		SanPhamDAO spdao = new SanPhamDAO();
		SanPham sp = new SanPham(masanpham, tensanpham, gia, manhacungcap, hinhanh, mota, soluong);

		if (spdao.themSanPham(sp) == true) {

			RequestDispatcher rd2 = request.getRequestDispatcher("AdminXuLyXemDanhSachSanPham");
			rd2.forward(request, response);
		} else {
			request.setAttribute("masanpham", masanpham);
			request.setAttribute("tensanpham", tensanpham);
			request.setAttribute("giasanpham", gia);
			request.setAttribute("manhacungcap", manhacungcap);
			request.setAttribute("hinhanh", hinhanh);
			request.setAttribute("mota", mota);
			request.setAttribute("soluong", soluong);
			request.getRequestDispatcher("adminformaddsp.jsp").forward(request, response);

		}

	}

	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";

	}

	public File getFolderUpload() {
		File folderUpload = new File("C:\\Users\\phanv\\Desktop\\gtnm\\Chan\\WebContent\\images");
		if (!folderUpload.exists()) {
			folderUpload.mkdirs();
		}
		return folderUpload;
	}
}
