package it.polito.tdp.tivers.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class River {
	int id;
	String name;
	List<Flow> flows;
	LocalDate prima;
	LocalDate dopo;
	int numero;
	double flowMedio;
	public River(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		flows=new ArrayList<Flow>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		River other = (River) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "River [name=" + name + "]";
	}
	public void addFlow(Flow f) {
		flows.add(f);
		
	}
	public List<Flow> getFlows() {
		return flows;
	}
	public void setPrima(LocalDate d) {
		this.prima=d;
		
	}
	public void setDopo(LocalDate c) {
		this.dopo=c;
		
	}
	public LocalDate getPrima() {
		return prima;
	}
	public LocalDate getDopo() {
		return dopo;
	}
	public void setNumero(int i) {
		this.numero=i;
		
	}
	public void setFlowMedio(double d) {
		this.flowMedio=d;
		
	}
	public int getNumero() {
		return numero;
	}
	public double getFlowMedio() {
		return flowMedio;
	}
	

}
