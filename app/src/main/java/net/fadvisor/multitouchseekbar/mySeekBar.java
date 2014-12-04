/**
 * Created by Fahad Alduraibi on 12/4/14.
 * fadvisor.net
 */

package net.fadvisor.multitouchseekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class mySeekBar extends SeekBar {

    public mySeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean onTouchEvent(final MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.v("tag", "UP");

        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.v("tag", Integer.toString(getProgress()));
            MainActivity.UpdateText(this, Integer.toString(getProgress()));

        } else if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.v("tag", "DOWN ");
        }
        return super.onTouchEvent(event);
    }
}
