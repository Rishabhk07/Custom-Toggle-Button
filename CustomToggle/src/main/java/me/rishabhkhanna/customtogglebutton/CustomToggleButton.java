package me.rishabhkhanna.customtogglebutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ToggleButton;

/**
 * Created by rishabhkhanna on 23/09/17.
 */

public class CustomToggleButton extends ToggleButton {

    public static final String TAG = "CustomToggleButton";

    public CustomToggleButton(Context context) {
        super(context);
        initialize(context);
    }

    public CustomToggleButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public CustomToggleButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomToggleButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize(context);
    }

    public void initialize(Context context) {

        LayoutInflater.from(context).inflate(R.layout.layout, null, false);
    }

    public void initialize(Context context, AttributeSet attrs) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            this.setBackground(getResources().getDrawable(R.drawable.toggle_background, null));
        } else {
            this.setBackground(getResources().getDrawable(R.drawable.toggle_background));
        }

        StateListDrawable stateListDrawable = (StateListDrawable) this.getBackground();
        DrawableContainer.DrawableContainerState dcs = (DrawableContainer.DrawableContainerState) stateListDrawable.getConstantState();
        Drawable[] drawableItems = dcs.getChildren();
        GradientDrawable unChecked = (GradientDrawable) drawableItems[0];
        GradientDrawable checked = (GradientDrawable) drawableItems[1];
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomToggleButton);

//        getting all the attributes values set from the typed array i.e from user
        int toggleOnColor = typedArray.getColor(R.styleable.CustomToggleButton_checkedColor, Color.parseColor("#FF4081"));
        int toggleOnBorderColor = typedArray.getColor(R.styleable.CustomToggleButton_checkedBorderColor, toggleOnColor);
        int toggleOffColor = typedArray.getColor(R.styleable.CustomToggleButton_uncheckedColor, Color.parseColor("#00000000"));
        int toggleOffBorderColor = typedArray.getColor(R.styleable.CustomToggleButton_uncheckedBorderColor, toggleOffColor);
        float borderWidth = typedArray.getDimension(R.styleable.CustomToggleButton_borderWidth, 4.0f);
        float radius = typedArray.getDimension(R.styleable.CustomToggleButton_radius, 15.0f);
        int checkedTextColor = typedArray.getColor(R.styleable.CustomToggleButton_checkedTextColor, getResources().getColor(R.color.CheckedTextColor));
        int uncheckedTextColor = typedArray.getColor(R.styleable.CustomToggleButton_uncheckedTextColor, getResources().getColor(R.color.uncheckedTextColor));
        Log.d(TAG, "initialize: " + borderWidth);
        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked},
                        new int[]{-android.R.attr.state_checked}
                },
                new int[]{
                        checkedTextColor,
                        uncheckedTextColor
                }
        );

        this.setTextColor(colorStateList);


        checked.setStroke(Math.round(borderWidth), toggleOnBorderColor);
        checked.setColor(toggleOnColor);
        checked.setCornerRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, radius, getResources().getDisplayMetrics()));

        unChecked.setStroke(Math.round(borderWidth), toggleOffBorderColor);
        unChecked.setColor(toggleOffColor);
        unChecked.setCornerRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, radius, getResources().getDisplayMetrics()));


    }
}
