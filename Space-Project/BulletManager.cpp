#include "BulletManager.h"
#include "Bullet.h"
#include "Round.h"

BulletManager* BulletManager::bulletManager = nullptr;


void BulletManager::CreateBulletManager()
{
	bulletManager = new BulletManager();//static func setting a static variable
}

void BulletManager::DestroyBulletManager()
{
	delete bulletManager;
}

BulletManager::BulletManager()
{
	for (int i = 0; i < maxBullets; i++)
		bulletArr[i] = nullptr;
}

void BulletManager::updateBullets()
{
	int bx, by, sx, sy;
	for (int i = 0; i < maxBullets; i++)
	{
		if (bulletArr[i] != nullptr)
		{
			

			sx = Round::ship->coord.getPositionX();
			sy = Round::ship->coord.getPositionY();
			bx = bulletArr[i]->coord.getPositionX();
			by = bulletArr[i]->coord.getPositionY();
			if (sx == bx && sy == by)
			{
				cout << "\n\nGame Over";
				cout<< "\nThe Bullet has hit the ship.";
				Sleep(6000);
				exit(0);
			}
			bulletArr[i]->updateBullet();//updateLaser
			break;
		}
	}
}

void BulletManager::destroyBullet(Bullet * toDestroy)
{
	//Do the excat same thing that ETManager does, go there and do the same here
	//The goal is to delete the memory from the array and free it from memory
	//and set the array index back to nullptr
	//should call the laser "KillLaser()"
	for(int i = 0; i < 50; i++)
		if (toDestroy == bulletArr[i])
		{
			toDestroy->killLaser();
			delete toDestroy;
			bulletArr[i] = nullptr;
		}

}

void BulletManager::createBullet(int bulletType,int x, int y, bool _upwards)
{
	Bullet* newBullet = nullptr;
	switch (bulletType)
	{
	case 0:
		newBullet = new Bullet();
		break;
	case 1:
		newBullet = new Bullet();
		break;

	default:
		cout << "Error unhandled switch case : " << bulletType;
		break;

	}
	for (int i = 0; i < 50; i++)
	{
		if (bulletArr[i] == nullptr)
		{
			newBullet->startLaser(x, y, _upwards);
			bulletArr[i] = newBullet;
			break;
		}
	}
	
}
