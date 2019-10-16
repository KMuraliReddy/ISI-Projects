#ifndef ROUND_H
#define ROUND_H

#include <string>
#include "Ship.h"
#include <conio.h>
#include <ctype.h>
#include <Windows.h>

using namespace std;



class Round {
	int score;
	int difficulty;
	//Ship ship;

public:
	static Ship* ship;
	static int shipscore;
	Round(int difficulty);
	~Round();
	void startRound();
};
#endif // !1