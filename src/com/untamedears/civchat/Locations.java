package com.untamedears.civchat;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Locations {
	private int x;
	private int y;
	private int z;
	private List<String> playerlisteners= new ArrayList<String>();
	
	public void setPlayerLocation(int X,int Y,int Z){
		X=x;
		Y=y;
		Z=z;
	}
	public void SetPlayerlistners(List<String> player){
		for (String name: player){
			playerlisteners.add(name);
		}
		
	}
	public int getPlayerXLocation(){
		return x;
	}
	public int getPlayerYLocation(){
		return y;
	}
	public int getPlayerZLocation(){
		return z;
	}
	public List<String> getPlayerListeners(){
		return playerlisteners;
	}
}