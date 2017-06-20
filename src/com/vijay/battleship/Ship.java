package com.vijay.battleship;

import java.util.List;
import java.util.ListIterator;

public class Ship {
	private final List<Coordinates> shipCordinates;

	private int hitCounter;
	public Ship(List<Coordinates> listOfCordinates){
		this.shipCordinates=listOfCordinates; 
		this.hitCounter=listOfCordinates.size();
	}

	public List<Coordinates> getCordinates(){
		return this.shipCordinates;
	}

	public HitStatus attack(Coordinates attachCoordiates){

		if (hitCounter==0){
			return HitStatus.SUNK;
		}
		HitStatus finalHitStatus=HitStatus.MISS;
		ListIterator<Coordinates> coordinatesIterator=shipCordinates.listIterator();
		Coordinates currentCoordinates=null;
		while(coordinatesIterator.hasNext()){
			currentCoordinates=coordinatesIterator.next();
			if (!currentCoordinates.isHit() && currentCoordinates.equals(attachCoordiates)){
				currentCoordinates.setHit(true);
				hitCounter--;
				finalHitStatus=(hitCounter==0)?HitStatus.SUNK:HitStatus.HIT;
			}
		}
		return finalHitStatus;
	}
}
