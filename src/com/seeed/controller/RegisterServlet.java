package com.seeed.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seed.bean.Intern;
import com.seed.model.RegisterAndSearchIntern;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String batch=request.getParameter("batch");
		String track=request.getParameter("track");
		RegisterAndSearchIntern searchIntern=new RegisterAndSearchIntern();
		
		/*String name=request.getParameter("name");
		String contactNo=request.getParameter("contactNo");
		String batch=request.getParameter("batch");
		String track=request.getParameter("track");
		String email=request.getParameter("email");
		String asn=request.getParameter("asn");
		String gender=request.getParameter("gender");*/
		
		Intern intern=new Intern();
		if((!track.equals("---select---"))&&(!batch.equals("---select---"))){
			ArrayList<Intern> trackAndTrackInterns= searchIntern.searchByTrackAndBatch(batch, track);
			HttpSession session=request.getSession();
			session.setAttribute("trackAndTrackInterns", trackAndTrackInterns);
			System.out.println(trackAndTrackInterns.size());
			
		}
		if((batch!="---select---")&&(track.equals("---select---"))){
			ArrayList<Intern> batchInterns= searchIntern.searchByBatch(batch);
			HttpSession session=request.getSession();
			session.setAttribute("batchInterns", batchInterns);
			System.out.println(batchInterns.size());

			
		}
		if((track!="---select---")&&(batch.equals("---select---"))){
			ArrayList<Intern> trackInterns= searchIntern.searchByTrack(track);
			HttpSession session=request.getSession();
			session.setAttribute("trackInterns", trackInterns);
			System.out.println(trackInterns.size());
			
		}
		
		response.sendRedirect("Search.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
