package org.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.DAO.TimetableDAO;
import org.Model.Timetable;

public class CRUD extends HttpServlet{
	
private static final long serialVersionUID = -2610923283010362432L;
	
	private TimetableDAO tb = new TimetableDAO();
	private int deleteID = 0;
	private boolean key = false;
    
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
       String action = request.getParameter("action");
       if(action.equals("delete"))
       {
    	   Integer id = Integer.parseInt(request.getParameter("id"));
    	   deleteID = id;
    	   key = true;
    	   try 
    	   {
		   tb.delete(tb.getTable(id));
		   } catch (SQLException e){ e.printStackTrace(); }
    	   request.getRequestDispatcher("AppView.jsp").forward(request, response);
       }
       else if(action.equals("edit"))
       {
    	   try
    	   {
		    request.setAttribute("p", tb.getTable(Integer.parseInt(request.getParameter("id"))));
		   } catch (NumberFormatException | SQLException e) {e.printStackTrace();}
    	   request.getRequestDispatcher("edit.jsp").forward(request, response);
       }
       
	}
    
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	 
	 String action = request.getParameter("action");
	 
	 if(action.equals("add")){
	  try { 
		Timetable table = new Timetable();
		
		Integer id = tb.getTables().size(); 
		id = id + 1;
		if (key==true){
		 id = deleteID;
		 key= false; }
		
		table.setId(id);
		table.setStation(request.getParameter("St"));
		table.setFinalStation(request.getParameter("fSt"));
		table.setDepartureTime(request.getParameter("departurelHour") + ":" + request.getParameter("departureMinute"));
		table.setArrivalTime(request.getParameter("arrivalHour") + ":" + request.getParameter("arrivalMinute"));
	    table.setDaysOfDep(request.getParameter("walkDays"));
	    tb.add(table);
	  } catch (SQLException e) { e.printStackTrace(); }
	 request.getRequestDispatcher("AppView.jsp").forward(request, response);
	 
	 }else if(action.equals("processEdit")){
		 
	  try {
		  
	   String word = request.getParameter("id");
	   Integer id = Integer.parseInt(word);
	   Timetable table = tb.getTable(id);
	   
	   table.setStation(request.getParameter("St"));
	   table.setFinalStation(request.getParameter("fSt"));
	   table.setDaysOfDep(request.getParameter("walkDays"));
	   table.setDepartureTime(request.getParameter("departurelHour") + ":" + request.getParameter("departureMinute"));
	   table.setArrivalTime(request.getParameter("arrivalHour") + ":" + request.getParameter("arrivalMinute"));
	   tb.update(table);
	   
	  } catch (NumberFormatException | SQLException e) {e.printStackTrace();}
	  request.getRequestDispatcher("AppView.jsp").forward(request, response);
	  }
	 
	}
	

}
