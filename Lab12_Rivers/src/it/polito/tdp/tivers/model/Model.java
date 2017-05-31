package it.polito.tdp.tivers.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import it.polito.tdp.rivers.db.CountryDao;


public class Model {
	
	CountryDao dao;
	Map<Integer,River> rivers;
	Map<Integer,Flow> flows;
	
	public Model(){
		 dao= new CountryDao() ;
		 flows=new TreeMap<Integer,Flow>();
	}

	public Map<Integer, River> getRivers() {
			if(rivers==null){	
				rivers=dao.listRivers();
			}
		return rivers;
	}

	public void carica() {
	
		for(Flow f:dao.getFlow()){
		flows.put(f.getId(),f);
		this.rivers.get(f.getRiver().getId()).addFlow(f);
		
	}
		
	
	}

	public void getData(River value) {
		int i=0;              
		Double m=(double) 0;
		LocalDate d = LocalDate.of(2005, Month.MAY, 14); 
		LocalDate c = LocalDate.of(1900, Month.MAY, 14); 
		for(Flow f:value.getFlows()){
			if(f.getDay().isBefore(d))
				d=f.getDay();
			if(f.getDay().isAfter(c))
				c=f.getDay();
		i++;
	m+=f.getFlow();
		}
		

		value.setPrima(d);
		value.setDopo(c);
		value.setNumero(i);
		value.setFlowMedio(m/i);
	}


}
