#include "Bullet.h"



#include <iostream>
using namespace std;

void Bullet::startLaser(int x,int y, bool _travelsUpwards)
{
	travelsUpwards = (_travelsUpwards)?-1:1;
	coord.setPositionX(x);
	coord.setPositionY(y);
	drawLaser();
	isAlive = true;
}

void Bullet::eraseLaser() const
{	
	coord.gotoXY(coord.getPositionX(),coord.getPositionY());
	cout << " ";
}

void Bullet::drawLaser() const
{	
	coord.gotoXY(coord.getPositionX(),coord.getPositionY());
	cout << laser; 
}

void Bullet::updateBullet()
{
	if (isOnAlien())
	{
		
		//Check if there is an alien
		//use ETManager::etManager->getET(x,y)  and check if its null
		//if it is not null, then we need to tell the ETManager that it has died & pass the reference we got in step above
		//then destroy this laser by calling the BulletManager and pass "this" reference
		BulletManager::bulletManager->destroyBullet(this);

	}
	else
	{
		//Move the laser foward
		moveLaser();
	}
	//else
}

void Bullet::moveLaser()
{	
	eraseLaser();
	//#f- feature .. Have to check if within bounds
	if (coord.getPositionY()>1 && coord.getPositionY() < 20)  //If still in bounds
	{
		coord.setPositionY(coord.getPositionY()+travelsUpwards);
		drawLaser();
	}
	else  //outta bounds
	{
		isAlive = false;
		BulletManager::bulletManager->destroyBullet(this); //:: static
		//2 pointer to a bullet manager
		//access to bullet manager
		//alien,bullets -- singleton pattern
		
	}
}

void Bullet::killLaser()
{
	eraseLaser();
	isAlive = false;
}

bool Bullet::isOnAlien()
{
//#f
	int x = coord.getPositionX();
	int y = coord.getPositionY();
	Extraterrestrial* e = ETManager::etManager->getET(x, y);
	if (e != nullptr)
	{
		ETManager::etManager->destroy(e);
		return true;
	}
	return false;
}


