package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SanPhamDAO;
import model.SanPham;

@WebServlet("/XuLyLocGia")
public class XuLyLocGia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XuLyLocGia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loai = request.getParameter("loai");
		HttpSession session = request.getSession();
		SanPhamDAO sanPhamDao = new SanPhamDAO();
		try {
			ArrayList<SanPham> listsploc = new ArrayList<>();
			listsploc = sanPhamDao.locSanPhamTheoGia(loai);
			session.setAttribute("listds", listsploc);
			response.sendRedirect("product.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
