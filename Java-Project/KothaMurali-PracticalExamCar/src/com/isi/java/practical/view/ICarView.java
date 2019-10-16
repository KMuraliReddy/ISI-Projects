package com.isi.java.practical.view;

import com.isi.java.practical.model.CarState;
import com.isi.java.practical.model.GasLevelEvent;

public interface ICarView
{
	void updateGasLevel(GasLevelEvent event);
	void updateCarState(CarState carState);
}
