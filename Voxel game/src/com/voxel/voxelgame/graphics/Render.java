package com.voxel.voxelgame.graphics;

public class Render {
public final int width;
public final int height;
public final int[] pixels;

public Render(int width, int height) {
	this.width = width;
	this.height = height;
	pixels = new int[width = height];
    }
public void draw(Render render,int xOffset, int yOffset) {
	for (int Y=0; Y < render.height; Y++) {
		int yPix = Y + yOffset; 
		for (int X = 0; X < render.width; X++) {
			int xPix = X + xOffset;
			pixels[xPix+yPix*width] = render.pixels[X+Y*render.width];
    }
  }
 }
}