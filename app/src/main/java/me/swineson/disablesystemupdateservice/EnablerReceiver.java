package me.swineson.disablesystemupdateservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class EnablerReceiver extends BroadcastReceiver {

    public EnablerReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        PropUtil.disableSystemUpdateService();
        Log.d("DisableSUpdateService", "Running " + intent.getAction());
    }
}
