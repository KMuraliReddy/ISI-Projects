#include "Extraterrestrial.h"
#include <stdlib.h>
#include<iostream>
#include "Round.h"
using namespace std;


Extraterrestrial::Extraterrestrial(int type,int value)
{
	extraterrestrialType=type;
	extraterrestrialValue=value;
	timeTillFire = cooldown;
	coord.setPositionX(rand() % 40 + 1);
	coord.setPositionY(rand() % 20 + 1);
	isAlive = true;
	//Just spawned, so should draw it
}

void Extraterrestrial::move()
{
	//Round::ship->coord.getPositionX
	eraseExtraterrestrial();
	//move
	drawExtraterrestrial();
	//In here should be the basic move logic (You need to add it)
	//Undraw where it was, and move it to where it needs to go
	//If there is an alien there, we should not be able to move there.
	//If there is a laser there, it should kill us.
}

void Extraterrestrial::fire()
{
	int x = coord.getPositionX();
	int y = coord.getPositionY();
	BulletManager::bulletManager->createBullet(0, x, y + 1, false);
	timeTillFire = cooldown;

}

void Extraterrestrial::update()
{
	//Any logic in here needed, timers, etc
	timeTillFire--;
	if (timeTillFire < 0)
		fire();
	move();
	
}
//


void Extraterrestrial::eraseExtraterrestrial() const
{
	coord.gotoXY(coord.getPositionX(),coord.getPositionY());
	cout << " ";	
}

void Extraterrestrial::drawExtraterrestrial() const
{
	coord.gotoXY(coord.getPositionX(),coord.getPositionY());
	cout << "E";// char(extraterrestrialType);
}



void Extraterrestrial::checkDeath()
{
	//if(???)   the tile we are going on has a laser (Check the board, or check bullet manager) 
	//Round::etManager->destroy(this);
	
}

int Extraterrestrial::addPoints() const
{
	return extraterrestrialValue;
}


void Extraterrestrial::die() //This is called by the manager
{
	//erase extraterrestial because it has died
}

