#include <iostream>
#include "Round.h"
#include "UIKit.h"
#include "BulletManager.h"
using namespace std;

//static BulletManager bulletManager;

int main() {
	Round round(1);
	UIKit::frame(0, 0, 80, 22, 5);
	round.startRound();
	cout << endl;
	system("pause");
	return 0;
}

