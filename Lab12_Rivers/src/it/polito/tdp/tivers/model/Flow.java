package it.polito.tdp.tivers.model;

import java.time.LocalDate;

public class Flow implements Comparable<Flow> {
int id;
LocalDate day;
double flow;
River river;
public Flow(int id, LocalDate day, double flow, River river) {
	super();
	this.id = id;
	this.day = day;
	this.flow = flow;
	this.river = river;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getDay() {
	return day;
}
public void setDay(LocalDate day) {
	this.day = day;
}
public double getFlow() {
	return flow;
}
public void setFlow(double flow) {
	this.flow = flow;
}
public River getRiver() {
	return river;
}
public void setRiver(River river) {
	this.river = river;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Flow other = (Flow) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
public int compareTo(Flow other) {
	if(this.day.isAfter(other.getDay()))
	return 1;
	if(this.day.isEqual(other.getDay()))
	return 0;
	return -1;
}

}
