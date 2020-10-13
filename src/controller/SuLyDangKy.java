package controller;

import java.io.IOException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.TaiKhoanDAO;
import model.Mail;
import model.TaiKhoan;

/**
 * Servlet implementation class SuLyDangKy
 */
@WebServlet("/SuLyDangKy")
public class SuLyDangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public SuLyDangKy() {
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
		//tao role random
		 Random rd = new Random();
		 int rdnumber = rd.nextInt(99999); 
		 int s = rdnumber;
		 String rdRole = String.valueOf(s);
		
		String tentaikhoan = request.getParameter("tentaikhoan");
		String matkhau = request.getParameter("matkhau");
		String tenkhachhang = request.getParameter("tenkhachhang");
		String sex[] = request.getParameterValues("gioitinh");
		String gioitinh = "";
		for (int i = 0; i < sex.length; i++) {
			if (sex[0] != null)
				gioitinh = sex[0];
			else
				gioitinh = sex[1];
		}
		String sodienthoai = request.getParameter("sodienthoai");
		String diachi = request.getParameter("diachi");
		String role = rdRole;
		String mesusername = "";
		boolean check = true;
		System.out.println("alo");
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		if (tkDao.checkAccountExits(tentaikhoan) == true) {
			mesusername += "Tài khoản đã tồn tại";
			check = false;
		}
		request.setAttribute("mesusername", mesusername);
		if (check) {
		
			TaiKhoan tk = new TaiKhoan(tentaikhoan, matkhau, tenkhachhang,gioitinh, sodienthoai, diachi, role);
			if (tkDao.createAccount(tk) == true) {
				//send confirm mail
				Mail sm = new Mail();
				try {
					sm.sendMail(tentaikhoan, tentaikhoan, role);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
				
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} else {

			request.setAttribute("tentaikhoan", tentaikhoan);
			request.setAttribute("matkhau", matkhau);
			request.setAttribute("tenkhachhang", tenkhachhang);
			request.setAttribute("gioitinh", gioitinh);
			request.setAttribute("sodienthoai", sodienthoai);
			request.setAttribute("diachi", diachi);
			request.getRequestDispatcher("account.jsp").forward(request, response);
		}
	
	}

}
