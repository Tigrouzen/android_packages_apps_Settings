package com.android.settings.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.settings.R;

public class Startup extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent bootintent) {
        ColorTuningPreference.restore(context);
        VolumeBoostPreference.restore(context);
        DockAudio.restore(context);
        VibrationPreference.restore(context);
    }

}
