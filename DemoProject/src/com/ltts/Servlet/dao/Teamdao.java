package com.ltts.Servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	public Team getTeamById(int id) throws Exception {
		Team t=new Team(id, null, null, null);
		List<Team> li = getAllTeams();
		for(Team p1:li) {
			if(p1.getTeamId() == id) {
				p1.setTeamId(id);
				p1.setOwnerName(p1.getOwnerName());
				p1.setCoach(p1.getCoach());
			}
		}
		return t;
	}
	
	public Team getTeamByname(String name) throws Exception {
		Team t=new Team(0, name, name, name);
		List<Team> li1= getAllTeams();
		for(Team p1:li1) {
			if(p1.getTeamName() == name) {
				p1.setTeamName(name);		
			}
		}
		return t;
	}
	
	public boolean updateTeams(Team t) throws Exception {
		Connection mc=MyConnection.getConnection();
		Statement s = mc.createStatement();
		PreparedStatement ps=mc.prepareStatement("update team set  ownerName = (?), coach = (?) where captainId = (?) ; ");
		//ResultSet rs = s.executeQuery("select * from Team");
		ps.setString(1,t.getOwnerName());
		ps.setString(2,(String) t.getCoach());
		ps.setInt(3, t.getCaptainId());
		boolean rs = ps.execute();
		return rs;
	}
	
	public boolean deleteTeam(Team t) throws Exception {
		Connection mc=MyConnection.getConnection();
		Statement s = mc.createStatement();
		PreparedStatement ps=mc.prepareStatement("delete from team where teamName = (?); ");
		//ResultSet rs = s.executeQuery("select * from Team");	
		ps.setString(1,t.getTeamName());
		boolean rs = ps.execute();
		return rs;
	}
	
	public List<Team> getAllTeams() throws Exception {
		List<Team> li=new ArrayList<Team>();
		Connection mc=MyConnection.getConnection();
		Statement ps = mc.createStatement();
		ResultSet rs = ps.executeQuery("select * from team;");
		while(rs.next()){
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		}
		return li;
	}
	
}

	