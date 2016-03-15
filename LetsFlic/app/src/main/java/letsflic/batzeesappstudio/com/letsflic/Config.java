package letsflic.batzeesappstudio.com.letsflic;

import io.flic.lib.FlicManager;

/**
 * Created by adh on 2/15/2016.
 */
public class Config {
    static void setFlicCredentials() {
        FlicManager.setAppCredentials("[appId]", "[appSecret]", "[appName]");
    }
}
