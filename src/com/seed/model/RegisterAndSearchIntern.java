package com.seed.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.seed.bean.Intern;
import com.seed.util.Connectivity;

public class RegisterAndSearchIntern {
	Connection con=Connectivity.connect();
	
	ArrayList<Intern> batchList;
	ArrayList<Intern> trackList;
	ArrayList<Intern> batchAndTrackList;
	
	public ArrayList<Intern> searchByBatch(String batch){
		System.out.println(con);
		System.out.println(batch);
		try {
			PreparedStatement stmt=con.prepareStatement("select * from intern where batch=?");
			stmt.setString(1, batch);
			ResultSet rs=stmt.executeQuery();
			batchList=new ArrayList<Intern>();
			while (rs.next()) {
				Intern intern=new Intern();
				intern.setName(rs.getString("name"));				
				intern.setContactNo(rs.getString("contactNo"));
				intern.setEmailId(rs.getString("emailId"));
				intern.setAsn(rs.getInt("asn"));
				intern.setGender(rs.getString("gender"));
				intern.setBatch(rs.getString("batch"));
				intern.setTrack(rs.getString("track"));
				System.out.println(intern.toString());
				batchList.add(intern);
				
			}
			System.out.println(batchList.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return batchList;		
	}
	public ArrayList<Intern> searchByTrack(String track){
		System.out.println(con);
		System.out.println(track);
		try {
			PreparedStatement stmt=con.prepareStatement("select * from intern where track=?");
			stmt.setString(1, track);
			ResultSet rs=stmt.executeQuery();
			trackList=new ArrayList<Intern>();
			while (rs.next()) {
				Intern intern=new Intern();
				intern.setName(rs.getString("name"));				
				intern.setContactNo(rs.getString("contactNo"));
				intern.setEmailId(rs.getString("emailId"));
				intern.setAsn(rs.getInt("asn"));
				intern.setGender(rs.getString("gender"));
				intern.setBatch(rs.getString("batch"));
				intern.setTrack(rs.getString("track"));
				System.out.println(intern.toString());
				trackList.add(intern);
				
			}
			System.out.println(trackList.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trackList;		
	}
	public ArrayList<Intern> searchByTrackAndBatch(String batch,String track){
		System.out.println(con);
		System.out.println(batch);
		System.out.println(track);
		try {
			PreparedStatement stmt=con.prepareStatement("select * from intern where track='"+track+"'and batch='"+batch+"'");
			
			ResultSet rs=stmt.executeQuery();
			batchAndTrackList=new ArrayList<Intern>();
			while (rs.next()) {
				Intern intern=new Intern();
				intern.setName(rs.getString("name"));				
				intern.setContactNo(rs.getString("contactNo"));
				intern.setEmailId(rs.getString("emailId"));
				intern.setAsn(rs.getInt("asn"));
				intern.setGender(rs.getString("gender"));
				intern.setBatch(rs.getString("batch"));
				intern.setTrack(rs.getString("track"));
				System.out.println(intern.toString());
				batchAndTrackList.add(intern);
				
			}
			System.out.println(batchAndTrackList.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return batchAndTrackList;		
	}
    
}
