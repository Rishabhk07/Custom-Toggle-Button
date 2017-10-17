package me.rishabhkhanna.customtogglebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.annotation.Dimension;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

/**
 * Created by rishabhkhanna on 23/09/17.
 */

public class CustomToggleButton extends ToggleButton{

    public static final String TAG = "CustomToggleButton";
    public CustomToggleButton(Context context) {
        super(context);
        initialize(context);
    }

    public CustomToggleButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context,attrs) ;
    }

    public CustomToggleButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context,attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize(context);
    }

    public void initialize(Context context){

        LayoutInflater.from(context).inflate(R.layout.layout,null,false);
    }

    public void initialize(Context context, AttributeSet attrs){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            this.setBackground(getResources().getDrawable(R.drawable.toggle_background,null));
        }else {
            this.setBackground(getResources().getDrawable(R.drawable.toggle_background));
        }
        StateListDrawable stateListDrawable = (StateListDrawable) this.getBackground();
        DrawableContainer.DrawableContainerState dcs = (DrawableContainer.DrawableContainerState) stateListDrawable.getConstantState();
        Drawable[] drawableItems = dcs.getChildren();
        GradientDrawable gradientDrawableUnChecked = (GradientDrawable) drawableItems[0];
        GradientDrawable gradientDrawablechecked = (GradientDrawable) drawableItems[1];
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.CustomToggleButton);
//        getting all the attributes values set from the user
        int toggleOnColor = typedArray.getColor(R.styleable.CustomToggleButton_toogleOnColor, Color.parseColor("#FF4081"));
        int toggleOffColor = typedArray.getColor(R.styleable.CustomToggleButton_toggleOffColor, Color.parseColor("#FF4081"));


        Float borderCheckedWidth = typedArray.getDimension(R.styleable.CustomToggleButton_borderWidth, 4.0f);
        gradientDrawableUnChecked.setStroke(Math.round(borderCheckedWidth),toggleOnColor);
        gradientDrawablechecked.setColor(toggleOffColor);
        gradientDrawablechecked.setStroke(Math.round(borderCheckedWidth),toggleOffColor);


    }
}
