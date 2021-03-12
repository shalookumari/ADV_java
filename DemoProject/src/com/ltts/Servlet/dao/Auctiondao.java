package com.ltts.Servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Servletdemo.config.*;
import com.ltts.Servlet.model.*;

public class Auctiondao {
	public Auction getAuctionById(int id) throws Exception {
		Auction p=new Auction();
		List<Auction> li=getAllAuctions();
		for(Auction p1:li) {
			if(p1.getAuctionId() == id) {
				p.setAuctionId(id);
				p.setPlayerID(p1.getPlayerID());
				p.setTeamId(p1.getTeamId());
				p.setAyear(p1.getAyear());
				p.setPrice(p1.getPrice());
			}
		}
		return p;
	}
	
	public boolean insertAuction(Auction a, Player p, Team t) throws Exception {
		Connection mc=MyConnection.getConnection();
		Statement s = mc.createStatement();
		PreparedStatement ps=mc.prepareStatement("insert into auction values (?,?,?,?,?)");
		//ResultSet rs = s.executeQuery("select * from aution");
		System.out.println("Auction Id is inserted");
		//ps.executeUpdate();
		ps.setInt(1,a.getAuctionId());
		ps.setString(2,p.getName());
		ps.setInt(3,t.getTeamId());
		ps.setString(4,a.getAyear());
		ps.setDouble(5,a.getPrice());		
		//ResultSet rs =s.executeQuery(null);
		//return s.execute(null);
		return ps.execute();
	}
	
	public boolean updateAuction(Auction a) throws Exception {
		Connection mc=MyConnection.getConnection();
		Statement s = mc.createStatement();		
		PreparedStatement ps=mc.prepareStatement("update auction  set price = (?)  where autionId = (?); ");		
		//ResultSet rs = s.executeQuery("select * from aution");
		ps.setDouble(1,a.getPrice());
		ps.setInt(2,a.getAuctionId());		
		boolean rs = ps.execute();
	    return rs;
	}
	
	public boolean deleteAuction(Auction p) throws Exception {
		Connection mc=MyConnection.getConnection();
		Statement s = mc.createStatement();		
		PreparedStatement ps=mc.prepareStatement("delete from aution where autionId = (?); ");		
		//ResultSet rs = s.executeQuery("select * from aution");		
		ps.setInt(1,p.getAuctionId());		
		boolean rs = ps.execute();	    
		return rs;
	}
	
	public List<Auction> getAllAuctions() throws Exception{
	List<Auction> li=new ArrayList<Auction>();
	Connection mc=MyConnection.getConnection();
	Statement ps = mc.createStatement();
	ResultSet rs = ps.executeQuery("select * from aution;");
	while(rs.next()){
		li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
	}	
	return li;
	}
}