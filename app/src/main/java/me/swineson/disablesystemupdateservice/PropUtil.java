package me.swineson.disablesystemupdateservice;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * by James Swineson on 7/15/15.
 * Originated from ghostflying on 3/18/15.
 */
public final class PropUtil {
    private static final String COMMAND_PREFIX = "pm ";
    private static final String[] PROPERTIES = {
            "enable 'com.google.android.gms/.update.SystemUpdateService'",
            //"disable 'com.google.android.gms/.update.SystemUpdateService$OtaPolicyReceiver'",
            //"disable 'com.google.android.gms/.update.SystemUpdateService$SecretCodeReceiver'",
            "disable 'com.google.android.gsf/.update.SystemUpdateService'"
    };

    public static void disableSystemUpdateService() {
        try{
            Process p = Runtime.getRuntime().exec("su");
            DataOutputStream os = new DataOutputStream(p.getOutputStream());
            for (String property : PROPERTIES) {
                os.writeBytes(COMMAND_PREFIX + property + "\n");
            }
            os.writeBytes("exit\n");
            os.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
