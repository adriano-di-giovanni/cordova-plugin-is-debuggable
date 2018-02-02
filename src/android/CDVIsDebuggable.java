package com.adrianodigiovanni.isdebuggable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class CDVIsDebuggable extends CordovaPlugin {
    public static final String ACTION_GET = "get";

    private int mResult = -1;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(ACTION_GET)) {
            Context context = cordova.getActivity();
            get(context, callbackContext);
            return true;
        }
        return false;
    }

    private void get(Context context, final CallbackContext callbackContext) {
        if (mResult != -1) {
            callbackContext.success(mResult);
            return;
        }

        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            int flags = packageInfo.applicationInfo.flags;
            boolean isDebuggable = (flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
            mResult = isDebuggable ? 1 : 0;
            callbackContext.success(mResult);
        } catch (PackageManager.NameNotFoundException e) {
            callbackContext.error(e.getMessage());
        }
    }
}
