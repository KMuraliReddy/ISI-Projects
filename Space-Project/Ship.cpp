#include "Ship.h"

#include <iostream>
using namespace std;

void Ship::eraseShip() const
{	
	coord.gotoXY(coord.getPositionX(),coord.getPositionY()); //put cursor at position
	cout << " ";
}

void Ship::drawShip() const
{
	coord.gotoXY(coord.getPositionX(),coord.getPositionY());
	//cout << char(18);
	cout << "^";

}

Ship::Ship()
{
	coord.setPositionX(20);
	coord.setPositionY(20);
	drawShip();
}

void Ship::changePosition(char key)
{
	int a;
	eraseShip();
	switch(key)
	{
	case 'l':	 a = coord.getPositionX();
				if(a>0 && a<80)
					coord.setPositionX(coord.getPositionX()-1);	
				break;
		case 'r':	coord.setPositionX(coord.getPositionX() + 1); break;
		case 's':   int x = coord.getPositionX();
					int y = coord.getPositionY();
					BulletManager::bulletManager->createBullet(0, x, y-1, true);
					break;

	}
	drawShip();
}









