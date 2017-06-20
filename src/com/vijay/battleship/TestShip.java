package com.vijay.battleship;

import java.util.Arrays;
import java.util.List;

public class TestShip {

	public static void main(String a[]){
		Coordinates c1=new Coordinates(1, 1);
		Coordinates c2=new Coordinates(1, 2);
		Coordinates c3=new Coordinates(1, 3);
		Coordinates c4=new Coordinates(1, 4);
		Coordinates attackCoordinate1=new Coordinates(1, 2);
		Coordinates attackCoordinate2=new Coordinates(1, 1);
		Coordinates attackCoordinate3=new Coordinates(1, 6);
		Coordinates attackCoordinate4=new Coordinates(1, 3);
		Coordinates attackCoordinate5=new Coordinates(1, 4);
		List<Coordinates> shipCordinates=Arrays.asList(c1,c2,c3,c4);
		Ship shipBeingAttacked=new Ship(shipCordinates);
		HitStatus hitStatus1=shipBeingAttacked.attack(attackCoordinate1);
		System.out.println("Hit Result for attack coordinates "+ attackCoordinate1+ " IS "+hitStatus1.toString());
		HitStatus hitStatus2=shipBeingAttacked.attack(attackCoordinate2);
		System.out.println("Hit Result for attack coordinates "+ attackCoordinate2+ " IS "+hitStatus2.toString());
		HitStatus hitStatus3=shipBeingAttacked.attack(attackCoordinate3);
		System.out.println("Hit Result for attack coordinates "+ attackCoordinate3+ " IS "+hitStatus3.toString());
		HitStatus hitStatus4=shipBeingAttacked.attack(attackCoordinate4);
		System.out.println("Hit Result for attack coordinates "+ attackCoordinate4+ " IS "+hitStatus4.toString());
		HitStatus hitStatus5=shipBeingAttacked.attack(attackCoordinate5);
		System.out.println("Hit Result for attack coordinates "+ attackCoordinate5+ " IS "+hitStatus5.toString());


	}

}
