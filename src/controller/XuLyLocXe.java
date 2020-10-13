package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SanPhamDAO;
import model.SanPham;

@WebServlet("/XuLyLocXe")
public class XuLyLocXe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XuLyLocXe() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		String manhacungcap = request.getParameter("maNhaCungCap");
		HttpSession session = request.getSession();
		SanPhamDAO sanPhamDao = new SanPhamDAO();
		try {
			ArrayList<SanPham> listsploc = new ArrayList<>();
			listsploc = sanPhamDao.locSanPham(manhacungcap);
			session.setAttribute("listds", listsploc);
			response.sendRedirect("product.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
