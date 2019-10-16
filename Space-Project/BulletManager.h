#ifndef BULLETMANAGER_H
#define BULLETMANAGER_H
#include <iostream>
using namespace std;

class Bullet; //foward declaration


class BulletManager
{
public:
	static BulletManager* bulletManager;
	static void CreateBulletManager();
	static void DestroyBulletManager();

	BulletManager();
	const int maxBullets = 20;
	int test = 0;


	Bullet *bulletArr[20];
	void updateBullets();
	//void destroyLaser(Bullet*);
	void destroyBullet(Bullet*);
	void createBullet(int ,int,int,bool);

private:
};
#endif