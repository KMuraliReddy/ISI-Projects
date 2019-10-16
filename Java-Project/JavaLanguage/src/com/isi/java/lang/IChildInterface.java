package com.isi.java.lang;

public interface IChildInterface extends IParentInterface
{
	//// For interface methods, "public abstract" is implicit.
	//// So don't actually write "public abstract":
	//public abstract void start();
	
	//// Instead, just start with the return type:
	void start();
	void stop();
	boolean isFinished();
}
