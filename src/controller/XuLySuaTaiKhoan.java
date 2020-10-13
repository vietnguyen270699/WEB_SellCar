package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SanPhamDAO;
import dao.TaiKhoanDAO;
import model.SanPham;
import model.TaiKhoan;

@WebServlet("/XuLySuaTaiKhoan")
public class XuLySuaTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XuLySuaTaiKhoan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		RequestDispatcher rd = request.getRequestDispatcher("admintableuser.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String tentaikhoan = request.getParameter("tentaikhoan");
		String matkhau = request.getParameter("matkhau");
		String tenkhachhang = request.getParameter("tenkhachhang");
		String gioitinh = request.getParameter("gioitinh");
		String sodienthoai = request.getParameter("sodienthoai");
		String diachi = request.getParameter("diachi");
		String role = request.getParameter("role");

		TaiKhoanDAO taikhoanDao = new TaiKhoanDAO();
		TaiKhoan tk = new TaiKhoan(tentaikhoan, matkhau, tenkhachhang, gioitinh, sodienthoai, diachi, role);

		if (taikhoanDao.editTaiKhoan(tk, tentaikhoan) == true) {

			RequestDispatcher rd2 = request.getRequestDispatcher("XuLyXemTaiKhoan");
			rd2.forward(request, response);
		} else {
			request.setAttribute("tentaikhoan", tentaikhoan);
			request.setAttribute("matkhau", matkhau);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("gioitinh", gioitinh);
			request.setAttribute("sodienthoai", sodienthoai);
			request.getRequestDispatcher("adminformedituser.jsp").forward(request, response);

		}
	}

}
