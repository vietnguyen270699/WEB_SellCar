package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TaiKhoanDAO;

@WebServlet("/ConfirmAccount")
public class ConfirmAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConfirmAccount() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		String role = request.getParameter("role");

		TaiKhoanDAO tkd = new TaiKhoanDAO();
		tkd.checkAccountConfirm(userName, role);

		ServletOutputStream out = response.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Confirm account</title></head>");

		out.println("<body>");
		out.println("<h3>Confirm account completed!!</h3>");
		out.println("<p>Comfirmed = " + userName + "</p>");
		out.println("</body>");
		out.println("<html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
