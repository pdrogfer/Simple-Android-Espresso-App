package com.pgf.simpleandroidespressoapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by pedro on 29/04/16. This is the most simple Espresso test possible, it just
 * checks that the button in MainActivity updates the textview.
 *
 * Adapted from http://www.vogella.com/tutorials/AndroidTestingEspresso/article.html
 */

@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void buttonUpdatesTextView() {
        onView(withId(R.id.btn_show_text)).perform(click());
        onView(withId(R.id.tv_text)).check(matches(withText("An old silent pond...\n" +
                "A frog jumps into the pond,\n" +
                "splash! Silence again.\n")));
    }
}
