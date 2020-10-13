package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SanPhamDAO;
import model.SanPham;

/**
 * Servlet implementation class XuLyXemSuaSanPham
 */
@WebServlet("/XuLyXemSuaSanPham")
public class XuLyXemSuaSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLyXemSuaSanPham() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maSach = request.getParameter("maSanPham");
		HttpSession session = request.getSession();
		SanPhamDAO sanPhamDao = new SanPhamDAO();
		try {
			SanPham sanPham = (SanPham) sanPhamDao.layThongTinSanPham(maSach);
			session.setAttribute("xemsp", sanPham);
			response.sendRedirect("adminform.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
