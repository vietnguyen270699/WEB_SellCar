package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GioHangDAO;
import dao.SanPhamDAO;
import model.TaiKhoan;

/**
 * Servlet implementation class XuLyMuaSanPham
 */
@WebServlet("/XuLyMuaSanPham")
public class XuLyMuaSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLyMuaSanPham() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String masanpham = request.getParameter("maSanPham");

		HttpSession ss = request.getSession();
		TaiKhoan tk = (TaiKhoan) ss.getAttribute("user");
		GioHangDAO giohang = new GioHangDAO();
		if (tk != null) {
			giohang.themVaoGioHang(masanpham);
			request.setAttribute("tonggia", giohang);
			RequestDispatcher rd2 = request.getRequestDispatcher("checkout.jsp");
			rd2.forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
