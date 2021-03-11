package com.ltts.Servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.Servletdemo.config.MyConnection;
import com.ltts.Servlet.model.Player;
import com.ltts.Servlet.model.Team;

public class Teamdao {
	
	public boolean insertTeam(Team t) throws Exception {

	Connection mc=MyConnection.getConnection(); // TRanfers control to another 
	PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?)");
	ps.setInt(1, t.getTeamId());
	ps.setString(2, t.getTeamName());
	ps.setString(3, t.getOwnerName());
	ps.setString(4, t.getCoachName());
	
	return ps.execute();
	//return false;

	
}

}	