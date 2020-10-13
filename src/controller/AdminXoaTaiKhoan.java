package controller;

import java.io.IOException;
import java.sql.SQLException;

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


@WebServlet("/AdminXoaTaiKhoan")
public class AdminXoaTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminXoaTaiKhoan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tentaikhoan = request.getParameter("tenTaiKhoan");
		HttpSession session = request.getSession();
		TaiKhoanDAO taikhoanDao = new TaiKhoanDAO();
		taikhoanDao.xoaTaiKhoan(tentaikhoan);
		RequestDispatcher rd2 = request.getRequestDispatcher("XuLyXemTaiKhoan");
		rd2.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
