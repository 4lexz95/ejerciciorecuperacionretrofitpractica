package com.example.ejerciciorecuperacionretrofitpractica.modelos;

import java.util.List;

public class Coin{
	private List<DataItem> data;
	private long timestamp;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setTimestamp(long timestamp){
		this.timestamp = timestamp;
	}

	public long getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"Coin{" + 
			"data = '" + data + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}