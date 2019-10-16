
#define VERSION_H 15012015

#ifndef __GRAPHICALUTILITYCLASS_UIKIT_H
#define __GRAPHICALUTILITYCLASS_UIKIT_H

#include <windows.h>
#include <iostream>
using namespace std;



class UIKit {
private:
	static HANDLE handle;
	static bool isPaletteReset;

	static void resetPalette();

public:
	

	//displays in color
	static void color(unsigned short theColor);

	//positions the cursor
	static void gotoXY(int x, int y);

	//gets the cursor's position
	static char getCharXY(int x, int y);

	//configures the window dimensions
	static void setWindowDimensions(int x1, int y1, int x2, int y2);

	//draws a frame
	static void frame(int cd,int ld,int cf,int lf, unsigned short _color);

	static int whereX();
	static int whereY();
	static void visibleCursor(bool visible);
};
#endif
