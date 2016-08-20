package com.referrers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.SyncStateContract;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by Manoj on 8/20/2016.
 */
public class InstallReceiver extends BroadcastReceiver {

    private String referringMember;

    @Override
    public void onReceive(Context context, Intent intent) {
        String rawReferrer = intent.getStringExtra("referrer");
        System.out.println("rawReferrer "+rawReferrer);

    }


}
