/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;
import android.widget.Toast;
import android.content.Context;

public class LockscreenMessage extends CordovaPlugin {
  private static final String TAG = "LockscreenMessage";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    Context context=this.cordova.getActivity().getApplicationContext();
    Toast.makeText(context,"Hello wmc",Toast.LENGTH_SHORT).show();
    Log.d(TAG, "Initializing LockscreenMessage");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("echo")) {
      String phrase = args.getString(0);
      // Echo back the first argument
      Log.d(TAG, phrase);
    } else if(action.equals("getDate")) {
      // An example of returning data back to the web layer
      String p = "nahh";
      final PluginResult result = new PluginResult(PluginResult.Status.OK, p);
      callbackContext.sendPluginResult(result);
    }
    return true;
  }

}
