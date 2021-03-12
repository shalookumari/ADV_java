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
import com.ltts.Servlet.model.Auction;

/**
 * Servlet implementation class DeleteAuctionServlet
 */
@WebServlet("/DeleteAuction")
public class DeleteAuction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAuction() {
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
		int id = Integer.parseInt(request.getParameter("pno"));	
		Auction p=new Auction(id, 0, 0, null, 0);
		System.out.println("Inside Servlet: "+p);
		Auctiondao pd=new Auctiondao();
		boolean b=false;		
		RequestDispatcher rd=null;
		try {
			b=pd.deleteAuction(p); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("Success2.html");
			rd.forward(request, response);
			System.out.println("Aution deets deleted succesfully!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Player id Used: "+e);
			rd=request.getRequestDispatcher("addplayer.html");
			rd.include(request, response);
			e.printStackTrace();
			
		}
		
	}

}

