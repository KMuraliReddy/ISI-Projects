#include "ETManager.h"
#include "Extraterrestrial.h"

ETManager* ETManager::etManager = nullptr;

void ETManager::CreateEtManager()
{
	etManager = new ETManager();
}

void ETManager::DestroyEtManager()
{
	delete etManager;
}

ETManager::ETManager()
{
//	etManager = this;
	ticks = 0;
	nextSpawnTick = ticksPerSpawn;  //ticks + ticksPerSpawn, but ticks is 0 atm
	for (int i = 0; i < MAX_ET; i++)
		etArr[i] = nullptr;
}


void ETManager::update()
{
	ticks++;
	//We should check if enough ticks has passed to summon a new ET
	//In here, we should loop through each ET we have and update them (move, destroy, etc)
	for (int i = 0; i < MAX_ET; i++)
	{
		if (etArr[i] != nullptr)
			etArr[i]->update();
	}
	if (nextSpawnTick <= ticks)
	{
		spawnET();
	}
}



void ETManager::spawnET()
{
	//Create a new ET
	 //Add it to the array
	nextSpawnTick = ticks + ticksPerSpawn;   //Next spawn is current time + time between spawns
	for (int i = 0; i < MAX_ET; i++)
	{
		if (etArr[i] == nullptr)//Free spot to create a new alien
		{
			etArr[i] = new Extraterrestrial(0, 1);  //Here you need to decide which kind is created. ATM its the basic Extratestrial, but maybe some random function
			break;
													//or something could determine which kind to create
		}
	}
}

void ETManager::destroy(Extraterrestrial* toDestroy)
{
	for (int i = 0; i < MAX_ET; i++)
	{
		if (etArr[i] == toDestroy) //if they are both pointing to the same object
		{
			etArr[i]->die();
			etArr[i] = nullptr;
			delete etArr[i];
			break;
		}
	}
}

Extraterrestrial* ETManager::getET(int x, int y)
{
	for (int i = 0; i < MAX_ET; i++)
	{
		if(etArr[i] != nullptr)
			if (etArr[i]->coord.getPositionX() == x && etArr[i]->coord.getPositionY() == y)
			{
				return etArr[i];
			}
	}
	return nullptr; //no alien found
}


