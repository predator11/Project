package org.DAO;

import java.sql.SQLException;
import java.util.List;

import org.Model.Timetable;

public interface DAO {
  public void add(Timetable tb)throws SQLException;
  public void delete(Timetable tb)throws SQLException;
  public Timetable getTable(int id)throws SQLException;
  public List<Timetable> getTables() throws SQLException;
  public void update(Timetable tb) throws SQLException;
}
