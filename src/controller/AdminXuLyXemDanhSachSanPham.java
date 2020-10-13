package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SanPhamDAO;
import model.SanPham;

/**
 * Servlet implementation class AdminXuLyXemDanhSachSanPham
 */
@WebServlet("/AdminXuLyXemDanhSachSanPham")
public class AdminXuLyXemDanhSachSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminXuLyXemDanhSachSanPham() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<SanPham> list = new SanPhamDAO().showsanpham();
		request.setAttribute("listSP", list);
		
		RequestDispatcher rd2 = request.getRequestDispatcher("admintablecar.jsp");
		rd2.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
