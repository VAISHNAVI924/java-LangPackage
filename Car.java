package com;

public class Car {
int id;
int cost;
Car(int id,int cost){
	this.cost=cost;
	this.id=id;
	}
public String toString() {
	return "id of car is"+id+"cost of car is "+cost;
}

}
