package com.example.tic_tac_toe;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;


public class Empty extends Cell {

	public Empty(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Canvas g, Resources res, int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		Bitmap im = BitmapFactory.decodeResource(res,R.drawable.empty);
				g.drawBitmap(im, null, new Rect(x*w, y*h, (x*w)+w, (y*h)+h),new Paint());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Empty) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
	return " ";
	}
}
