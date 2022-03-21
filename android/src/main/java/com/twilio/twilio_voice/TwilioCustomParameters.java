package com.twilio.twilio_voice;

import android.content.Context;

import java.util.Map;

public class TwilioCustomParameters {
    Map<String, String> customParameters;
    Context context;

    public TwilioCustomParameters(Context context, Map<String, String> customParameters) {
        this.context = context;
        this.customParameters = customParameters;
    }

    String getFromName(){
        String fromName = null;
        if (customParameters != null) {
            fromName = customParameters.get(Constants.SHOUT_FROM_NAME_CUSTOM_PARAMETER_KEY);
        }
        if (fromName == null) {
            fromName = context.getString(R.string.unknown_caller);
        }
        return fromName;
    }
}
