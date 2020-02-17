

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bo.NetflixService;
import dto.HomeDTO;

/**
 * Servlet implementation class NetflixServlet
 */
@WebServlet("/NetflixServlet")
public class NetflixServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private NetflixService bo;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NetflixServlet() {
        super();
        bo  = new NetflixService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HomeDTO dto = new HomeDTO();
		dto.setListeSeries(bo.findAll());
		
		response.setContentType("application/json");
	    response.getWriter().append(new Gson().toJson(dto));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
