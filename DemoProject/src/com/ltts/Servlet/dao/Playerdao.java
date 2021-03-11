package com.ltts.Servlet.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.ltts.Servlet.model.Player;
import com.ltts.Servletdemo.config.MyConnection;

public class Playerdao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,p.getPlayer_id());
		ps.setString(2, p.getName());
		ps.setDate(3,(Date) p.getDateOfBirth());
		ps.setInt(4, p.getAge());
		ps.setString(5,p.getEmail());
		ps.setString(6, p.getCountry());
		ps.setString(7,p.getSkills());
		ps.setInt(8, p.getMatch());
		ps.setInt(9, p.getRuns());
		ps.setInt(10, p.getWickets());
		ps.setInt(11, p.getTeam_id());
		
		
		return ps.execute();
		//return false;

	}
}