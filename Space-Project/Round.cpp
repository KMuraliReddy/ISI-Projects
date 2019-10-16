#include "Round.h"
#include "BulletManager.h"
#include "ETManager.h"
#include "Bullet.h"
#include <windows.h>

Ship* Round::ship = new Ship();

Round::Round(int difficulty) {
	Round::difficulty = difficulty >= 1 && difficulty <= 3 ? difficulty : 1;
	BulletManager::CreateBulletManager();
	ETManager::CreateEtManager();
}

Round::~Round()
{
	BulletManager::DestroyBulletManager();
	ETManager::DestroyEtManager();
}

void Round::startRound() {
	//Bullet b;
	//b.startLaser(5, 19, true);
	//BulletManager::BulletManager->createBullet(0, 5, 19, true);
	//BulletManager::bulletManager->createBullet(0, 5, 19, true);

	while (!ship->isDead)
	{
		BulletManager::bulletManager->updateBullets();
		ETManager::etManager->update();
		///b.updateBullet();
		if (_kbhit())
		{
			char moveDir = _getch();
			//cin >> moveDir;
			///char moveDir = _getch();
			ship->changePosition(moveDir);
		}
		Sleep(200);
	}


	//THIS REPLACES THE MAIN FUNCTION
	//Should loop
	//Should call bulletManager and ETManager::CreateManager
	//should update them
	//should update player
	//Should have a pause	
}

//Notes _getch() can let you read input