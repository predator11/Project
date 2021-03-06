package org.DAO;

import java.sql.SQLException;
import java.util.List;

import org.Model.HibernateUtil;
import org.Model.Timetable;
import org.hibernate.Session;

public class TimetableDAO implements DAO{
	
	@Override
	public void add(Timetable tb) throws SQLException
	{
		Session session = null;
		try
		{ 
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(tb);
		session.flush();
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally
		 {
			 if (session != null && session.isOpen())
			  {
				  session.close();
			  }
		 }
	}

	@Override
	public void delete(Timetable tb) throws SQLException 
	{
		Session session = null;
		try
		{ 
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(tb);
		session.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		 {
			 if (session != null && session.isOpen())
			  {
				  session.close();
			  }
		 }
	}

	@Override
	public Timetable getTable(int id) throws SQLException
	{
		Session session = null;
		Timetable result = null;
		try
		{  
		session = HibernateUtil.getSessionFactory().openSession();
		result = (Timetable) session.get(Timetable.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally
		 {
			 if (session != null && session.isOpen())
			  {
				  session.close();
			  }
		 }
		return result;
	}

	@Override
	public List<Timetable> getTables() throws SQLException
	{
		Session session = null;
		List<Timetable> result = null;
		try
		{ 
		session = HibernateUtil.getSessionFactory().openSession();
		result = session.createCriteria(Timetable.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally
		 {
			 if (session != null && session.isOpen())
			  {
				  session.close();
			  }
		 }
		
		return result;
	}

	@Override
	public void update(Timetable tb) throws SQLException
	{
		Session session = null;
		try
		{ 
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(tb);
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally
		 {
			 if (session != null && session.isOpen())
			 {
				  session.close();
			 }
		 }
	}

}
