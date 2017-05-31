package it.polito.tdp.tivers.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simulazione {
	double q;
	River r;
double c;
double fOutMin;
double fOut;
double fIn;
int num;
double cMed;
List<Flow> list;


public Simulazione(String s, River r) {
	super();
	this.q = Double.parseDouble(s)*r.getFlowMedio();
	this.r = r;
	this.c=q/2;
	this.fOutMin=r.getFlowMedio()*0.8;
	System.out.println(r.getFlowMedio()+"  @@@  "+Double.parseDouble(s)+"   "+q+"  "+c);
	list=r.getFlows();
	
}
public void  run(){
	num=0;
	cMed=0;
	q=q*86400;
	c=c*86400;
	Collections.sort(list);
	for(Flow f : list)
	{
		System.out.println(c+" "+q+" "+this.fOutMin+" "+num+" "+f.getFlow()*3600*24+" "+r.getFlowMedio());
		double per=Math.random();
		if(per<=0.05){
			c=c+f.getFlow()*86400;
		if (c>q)
			c=q;
		
			c=c-fOutMin*864000;
			
			
		}else{
			c=c+f.getFlow()*86400;
			if (c>q)
				c=q;
			
				c=c-fOutMin*86400;
				
		
			
		}
		if(c<0){
			num++;
		c=0;
		}
		cMed+=c;
	}
		
}
public int getNum() {
	return num;
}
public double getcMed() {
	return cMed/list.size();
}

}