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
 * Servlet implementation class XemDanhSachSanPham
 */
@WebServlet("/XemDanhSachSanPham")
public class XemDanhSachSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public XemDanhSachSanPham() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//	String mancc = request.getParameter("radio");
		ArrayList<SanPham> list = new SanPhamDAO().showsanpham();
		request.setAttribute("listds", list);
		
		RequestDispatcher rd2 = request.getRequestDispatcher("product.jsp");
		rd2.forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
