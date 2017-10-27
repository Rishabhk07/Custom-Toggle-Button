package me.rishabhkhanna.lib;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.widget.ToggleButton;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
/**
 * Created by rishabhkhanna on 27/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTests {
    public MainActivity mainActivity;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void startActivity(){
        mainActivity = mainActivityActivityTestRule.getActivity();
    }

    @Test
    public void customToggleWorks(){
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String offText = ((ToggleButton)mainActivity.findViewById(R.id.toggle_button)).getTextOff().toString();
                Log.d("TAG", "run: " + offText);
                assertEquals(offText,"toggle button");
            }
        });
    }
}
