package letsflic.batzeesappstudio.com.letsflic;

import android.content.Context;
import android.util.Log;

import io.flic.lib.FlicBroadcastReceiver;
import io.flic.lib.FlicButton;

public class BroadCastReceiverFlic extends FlicBroadcastReceiver {

    @Override
    protected void onRequestAppCredentials(Context context) {
        initializeFlic();
    }

    @Override
    public void onButtonUpOrDown(Context context, FlicButton button, boolean wasQueued, int timeDiff, boolean isUp, boolean isDown) {
        super.onButtonUpOrDown(context, button, wasQueued, timeDiff, isUp, isDown);
        if (isUp) {
            Log.d("IS UP", "True");
        } else {
            Log.d("IS DOWN", "True");
        }
    }

    @Override
    public void onButtonClickOrHold(Context context, FlicButton button, boolean wasQueued, int timeDiff, boolean isClick, boolean isHold) {
        super.onButtonClickOrHold(context, button, wasQueued, timeDiff, isClick, isHold);

        if(isHold){
           Log.d("IS Hold", "True");
        }
        else if (isClick){
            Log.d("IS CLICKED", "True");
        }
        else {

        }
    }

    @Override
    public void onButtonRemoved(Context context, FlicButton button) {
        // Button was removed
    }

    private void initializeFlic(){
        Config.setFlicCredentials();
    }

}
