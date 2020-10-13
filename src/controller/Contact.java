package controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Mail;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/contactservlet")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Contact() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String content = request.getParameter("content");

		Mail sm = new Mail();
		try {
			sm.sendMailContact(name, mobile, email, content);

			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
