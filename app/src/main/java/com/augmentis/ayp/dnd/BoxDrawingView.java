package com.augmentis.ayp.dnd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Tanaphon on 8/30/2016.
 */
public class BoxDrawingView extends View implements View.OnTouchListener{
    public BoxDrawingView(Context context) {
        super(context, null);
    }

    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
