#ifndef BULLET_H
#define BULLET_H

#include "Coord.h"
#include "BulletManager.h"
#include "ETManager.h"

class Bullet
{
public:
	//constants
	const char laser = '^';

	bool isAlive;
	int travelsUpwards;
	Coord coord;

	void startLaser(int,int,bool);
	void eraseLaser() const;
	void drawLaser() const;
	void updateBullet();
	virtual void moveLaser();
	virtual void killLaser();
	bool isOnAlien();
};

#endif