package controller.user2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user2/list.do")
public class ListController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2651683800821644616L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//전체 사용자 조회
		
		//데이터 공유
		
		//view forward
				RequestDispatcher dispatcher= req.getRequestDispatcher("/WEB-INF/user2/list.jsp");
				dispatcher.forward(req,resp);
		
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
}
