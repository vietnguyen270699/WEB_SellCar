package controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TaiKhoanDAO;
import model.Mail;
import model.TaiKhoan;

@WebServlet("/QuenMatKhau")
public class QuenMatKhau extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QuenMatKhau() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tentaikhoan = request.getParameter("tentaikhoan");
		String mesusername = "";
		boolean check = true;
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		TaiKhoan tk = tkDao.layThongTin(tentaikhoan);
		Mail mail = new Mail();

		if (tkDao.checkAccountExits(tentaikhoan) == false) {
			mesusername += "Tài khoản không tồn tại";
			check = false;
			request.setAttribute("mesusername", mesusername);
			RequestDispatcher rd2 = request.getRequestDispatcher("forgotpass.jsp");
			rd2.forward(request, response);
		}
	if(check) {
			try {
				mail.sendMailPass(tentaikhoan, tk.getMatKhau());
				mesusername += "Đã gửi mật khẩu vào mail";
				request.setAttribute("mesusername", mesusername);
				RequestDispatcher rd2 = request.getRequestDispatcher("forgotpass.jsp");
				rd2.forward(request, response);
			} catch (MessagingException e) {
				e.printStackTrace();
			}
	}
	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
