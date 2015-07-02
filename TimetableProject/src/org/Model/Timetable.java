package org.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Timetable")
public class Timetable {
  @Id
  @Column(name="id")
  private int id;
  @Column(name="Station")
  private String station;
  @Column(name="FinalStation")
  private String finalStation;
  @Column(name="DaysOfDeparture")
  private String daysOfDep;
  @Column(name="DepartureTime")
  private String departureTime;
  @Column(name="ArrivalTime")
  private String arrivalTime;
	 
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getFinalStation() {
		return finalStation;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFinalStation(String finalStation) {
		this.finalStation = finalStation;
	}
	public String getDaysOfDep() {
		return daysOfDep;
	}
	public void setDaysOfDep(String daysOfDep) {
		this.daysOfDep = daysOfDep;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getId() {
		return id;
	}
	 
}
