package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SanPhamDAO;
import model.SanPham;

@WebServlet("/XuLySuaSanPham")
public class XuLySuaSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLySuaSanPham() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("admintablecar.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String masanpham = request.getParameter("masanpham");
		String tensanpham = request.getParameter("tensanpham");
		// String gia = request.getParameter("giasanpham");
		int gia = Integer.parseInt(request.getParameter("giasanpham"));
		String manhacungcap = request.getParameter("manhacungcap");
		String hinhanh = request.getParameter("hinhanh");

		SanPhamDAO spdao = new SanPhamDAO();
		SanPham sp = new SanPham(masanpham, tensanpham, gia, manhacungcap, hinhanh, "1", 1);

		if (spdao.editSanPham(sp, masanpham) == true) {

			RequestDispatcher rd2 = request.getRequestDispatcher("AdminXuLyXemDanhSachSanPham");
			rd2.forward(request, response);
		} else {
			request.setAttribute("masanpham", masanpham);
			request.setAttribute("tensanpham", tensanpham);
			request.setAttribute("giasanpham", gia);
			request.setAttribute("manhacungcap", manhacungcap);
			request.setAttribute("hinhanh", hinhanh);
			request.getRequestDispatcher("adminform.jsp").forward(request, response);

		}

	}
}
