package com.example.tienda200;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.tienda200.bean.Calculadora;


/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
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
		String operador1 = request.getParameter("operador1");
		String operador2 = request.getParameter("operador2");
		String operacion = request.getParameter("operacion");
	
		
		Double num1 = Double.valueOf(operador1);
		Double num2 = Double.valueOf(operador2);
		
		Calculadora calculadora= new Calculadora(num1,num2,operacion,0.0);
		boolean valido= calculadora.procesar();
		 
		RequestDispatcher dispatcher = null;
		
		if (valido) {
			request.setAttribute("resultado", calculadora.getResultado()); 
			dispatcher = request.getRequestDispatcher("resultado.jsp");
			
		}else {
			dispatcher = request.getRequestDispatcher("novalido.jsp");
		}
		
		dispatcher.forward(request, response);
		
	}

}
