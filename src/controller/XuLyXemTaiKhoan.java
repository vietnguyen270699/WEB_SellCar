package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TaiKhoanDAO;
import model.TaiKhoan;

@WebServlet("/XuLyXemTaiKhoan")
public class XuLyXemTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLyXemTaiKhoan() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<TaiKhoan> listtk = new TaiKhoanDAO().showtaikhoan();
		request.setAttribute("listTK", listtk);

		RequestDispatcher rd2 = request.getRequestDispatcher("admintableuser.jsp");
		rd2.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
