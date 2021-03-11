package com.ltts.Servletdemo.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Servlet.dao.Auctiondao;
import com.ltts.Servlet.dao.Teamdao;
import com.ltts.Servlet.model.Auction;
import com.ltts.Servlet.model.Team;

/**
 * Servlet implementation class InsertAuctionServlet1
 */
@WebServlet("/InsertAuctionServlet")
public class InsertAuction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAuction() {
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
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		
		int ano=Integer.parseInt(request.getParameter("aid"));
		String pname=request.getParameter("pname");
		int price=Integer.parseInt(request.getParameter("price"));
		
		Auction a = new Auction(ano, pname, price);
		System.out.println("Inside Servlet: " +a);
		Auctiondao pd=new Auctiondao();
		boolean b=false;
		
		RequestDispatcher rd=null;
		try {
			b=pd.insertAuction(a); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Player id Used: "+e);
			rd=request.getRequestDispatcher("auction.html");
			rd.include(request, response);
			e.printStackTrace();
		}
	}

}

