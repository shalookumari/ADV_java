package com.ltts.Servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.Servletdemo.config.MyConnection;
import com.ltts.Servlet.model.Auction;
import com.ltts.Servlet.model.Player;
import com.ltts.Servlet.model.Team;

public class Auctiondao {
	
	public boolean insertAuction(Auction a) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?)");
		ps.setInt(1, a.getAuctionId());
		ps.setString(2, a.getPlayerName());
		ps.setInt(3, a.getPrice());
		
		
		return ps.execute();
		//return false;

		
	}
	

}

