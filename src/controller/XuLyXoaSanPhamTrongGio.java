package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GioHangDAO;
import model.TaiKhoan;

@WebServlet("/XuLyXoaSanPhamTrongGio")
public class XuLyXoaSanPhamTrongGio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XuLyXoaSanPhamTrongGio() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String masanpham = request.getParameter("maSanPham");

		HttpSession ss = request.getSession();
		TaiKhoan tk = (TaiKhoan) ss.getAttribute("user");
		if (tk != null) {
			new GioHangDAO().xoaSanPhamTrongGioHang(masanpham);
			 response.sendRedirect("checkout.jsp");
		} else {
			 response.sendRedirect("checkout.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
