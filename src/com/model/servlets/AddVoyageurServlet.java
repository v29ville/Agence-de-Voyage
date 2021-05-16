package com.model.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.model.domaine.Voyageur;
import com.model.services.AuthentificationManager;
import com.model.services.ServiceVoyageur;


public class AddVoyageurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVoyageurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//test Spring		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
				
				String[] allBeanNames = context.getBeanDefinitionNames();
		        for(String beanName : allBeanNames) {
		            System.out.println(beanName + "******************");
		        }
				
				
				Voyageur v=(Voyageur)context.getBean("voyageur1");
				ServiceVoyageur sv =(ServiceVoyageur)context.getBean("serviceVoyageur");
				sv.addVoyageur(v);
				
				
		
		
		
		
		/**
		String civilite = request.getParameter("civilite");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String pieceIdentite = request.getParameter("pieceIdentite");
		String rue = request.getParameter("rue");
		String ville = request.getParameter("ville");
		String cp = request.getParameter("cp");
		String pays = request.getParameter("pays");
		AuthentificationManager sc = new AuthentificationManager();
		sc.authentification(null); **/
		//sc.addContact(id, fname, lname, email);
		System.out.println(v);
	}
}
