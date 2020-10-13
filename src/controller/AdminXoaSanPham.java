package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SanPhamDAO;

@WebServlet("/AdminXoaSanPham")
public class AdminXoaSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminXoaSanPham() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maSanPham = request.getParameter("maSanPham");
		HttpSession session = request.getSession();
		SanPhamDAO sanPhamDao = new SanPhamDAO();
		
		sanPhamDao.xoaSanPham(maSanPham);
		
		RequestDispatcher rd2 = request.getRequestDispatcher("AdminXuLyXemDanhSachSanPham");
		rd2.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
