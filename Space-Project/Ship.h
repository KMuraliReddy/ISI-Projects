#ifndef SHIP_H
#define SHIP_H

#include "Coord.h"
#include "BulletManager.h"

class Ship
{
protected:
	void eraseShip() const;
	void drawShip() const;
	
public: 
	bool isDead = false;

public:
	Coord coord;
	Ship();		
	void changePosition(char);
};

#endif