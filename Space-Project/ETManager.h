#pragma once
#include <iostream>
//#include "Extraterrestrial.h"
using namespace std;

class Extraterrestrial;

class ETManager
{
//Vars
private:
	int ticks; //Current number of tick
	int nextSpawnTick;  //the number of tick when the next one spawns
	const int ticksPerSpawn = 32; //number of ticks between spawns

	const int MAX_ET = 22;
	Extraterrestrial* etArr[20];
	ETManager();
//Functions
public:
	static ETManager* etManager;
	static void CreateEtManager();
	static void DestroyEtManager();

	void update(); //Update all ETs
	void spawnET();
	void destroy(Extraterrestrial*);
	Extraterrestrial* getET(int x, int y);	 //returns if an ET exists at location
	
};