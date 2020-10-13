package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SanPhamDAO;
import dao.TaiKhoanDAO;
import model.SanPham;
import model.TaiKhoan;

@WebServlet("/SuLyDangNhap")
public class SuLyDangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SuLyDangNhap() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String tentaikhoan = request.getParameter("tentaikhoan");
		String matkhau = request.getParameter("matkhau");
		String mesusername = "";
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		TaiKhoan taikhoan = new TaiKhoanDAO().layThongTin(tentaikhoan);
		ArrayList<TaiKhoan> listtk = new TaiKhoanDAO().showtaikhoan();
		System.out.println(taikhoan);

		if (tkDao.checkAccount(tentaikhoan, matkhau)== true && tkDao.checkAccountAdmin(tentaikhoan, matkhau)== false) {

			HttpSession session = request.getSession();
			session.setAttribute("user", taikhoan);
			request.setAttribute("abc", tentaikhoan);

			RequestDispatcher rd2 = request.getRequestDispatcher("index.jsp");
			rd2.forward(request, response);
		} else if (tkDao.checkAccount(tentaikhoan, matkhau)==true && tkDao.checkAccountAdmin(tentaikhoan, matkhau)== true) {
			HttpSession session = request.getSession();
			session.setAttribute("tk", taikhoan);
			request.setAttribute("listTK",listtk);
			RequestDispatcher rd2 = request.getRequestDispatcher("admintableuser.jsp");
			rd2.forward(request, response);
		} else {
			mesusername += "Sai tài khoản hoặc mật khẩu";
			request.setAttribute("mesusername", mesusername);
			RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
			rd2.forward(request, response);

		}
	}

}
