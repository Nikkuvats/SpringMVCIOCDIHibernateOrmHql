package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpCrudController extends MultiActionController{

	public ModelAndView VatsempsaveCRUD(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
	
		ModelAndView mav = new ModelAndView("empsave");
		return mav;
	}
	
	public ModelAndView VatsempupdateCRUD(HttpServletRequest request, HttpServletResponse response) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		ModelAndView mav = new ModelAndView("empupdate");
		return mav;
	}
}
