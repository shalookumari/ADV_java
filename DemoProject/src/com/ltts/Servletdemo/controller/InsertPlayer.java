package com.ltts.Servletdemo.controller;
import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Servlet.dao.Playerdao;
import com.ltts.Servlet.model.Player;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/InsertPlayer")
public class InsertPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPlayer() {
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
		int player_id=Integer.parseInt(request.getParameter("player_id"));
		String name=request.getParameter("name");
		//Date date=Date.valueOf(request.getParameter(date));
		String dob=request.getParameter("dob");
		
		Date date = Date.valueOf(dob);
		int age=Integer.parseInt(request.getParameter("age"));
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		String skills=request.getParameter("skills");
		
		int match=Integer.parseInt(request.getParameter("match"));
		int run=Integer.parseInt(request.getParameter("run"));
		int wicket=Integer.parseInt(request.getParameter("wickets"));
		int team_id=Integer.parseInt(request.getParameter("team_id"));
		Player p=new Player(player_id,name,date,age,email,country,skills,match,run,wicket,team_id);
		System.out.println("Inside Servlet: "+p);
		Playerdao pd=new Playerdao();
		boolean b=false;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
