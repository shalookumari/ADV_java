package com.ltts.Servlet.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from web_player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getInt(11)));

		}
		return li;

	}
	public Player getPlayerByName(String name) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getName() == name) {
				p.setName(name);
				p.setName(p1.getName());
				p.setCountry(p1.getCountry());
			}
			System.out.println(p1);
		}

		return p;
	}
	public boolean deletePlayer(Player p) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updatePlayer(Player p) {
		// TODO Auto-generated method stub
		return false;
	}


}