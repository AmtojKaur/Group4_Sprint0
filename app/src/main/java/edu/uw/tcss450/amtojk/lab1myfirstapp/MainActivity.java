package edu.uw.tcss450.amtojk.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /**
     * You must implement this callback, which fires
     * when the system first creates the activity. On
     * activity creation, the activity enters the
     * Created state. In the onCreate() method,
     * perform basic application startup logic that
     * happens only once for the entire life of the activity.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE", "onCreate");
    }

    /**
     * When the activity enters the Started state,
     * the system invokes onStart(). This call makes
     * the activity visible to the user as the app
     * prepares for the activity to enter the foreground
     * and become interactive. For example, this method
     * is where the code that maintains the UI is initialized.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "onStart");
    }

    /**
     * When the activity enters the Resumed state, it
     * comes to the foreground, and the system invokes
     * the onResume() callback. This is the state in which
     * the app interacts with the user. The app stays in
     * this state until something happens to take focus away
     * from the app, such as the device receiving a phone call,
     * the user navigating to another activity, or the device
     * screen turning off.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.v("LIFECYCLE", "onResume");
    }

    /**
     * The system calls this method as the first indication that
     * the user is leaving your activity, though it does not
     * always mean the activity is being destroyed. It indicates
     * that the activity is no longer in the foreground, but it
     * is still visible if the user is in multi-window mode.
     * There are several reasons why an activity might enter
     * this state:
     *
     * An event that interrupts app execution, as described in the
     * section about the onResume() callback, pauses the current
     * activity. This is the most common case.
     *
     * In multi-window mode, only one app has focus at any time,
     * and the system pauses all the other apps.
     *
     * The opening of a new, semi-transparent activity, such as
     * a dialog, pauses the activity it covers. As long as the
     * activity is partially visible but not in focus, it remains
     * paused.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LIFECYCLE", "onPause");
    }

    /**
     * When your activity is no longer visible to the user, it
     * enters the Stopped state, and the system invokes the
     * onStop() callback. This can occur when a newly launched
     * activity covers the entire screen. The system also calls
     * onStop() when the activity finishes running and is about to
     * be terminated
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LIFECYCLE", "onStop");
    }

    /**
     *
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "onRestart");
    }

    /**
     * onDestroy() is called before the activity is destroyed. The
     * system invokes this callback for one of two reasons:
     *
     * The activity is finishing, due to the user completely
     * dismissing the activity or due to finish() being called on
     * the activity.
     *
     * The system is temporarily destroying the activity due to a
     * configuration change, such as device rotation or entering
     * multi-window mode.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LIFECYCLE", "onDestroy");
    }
}
