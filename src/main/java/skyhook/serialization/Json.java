package skyhook.serialization;

import com.google.gson.Gson;

/**
 * @author egga
 */
public class Json {

    private static final Gson gson = new Gson();

    public static String serialize(Object object) {
        return gson.toJson(object);
    }

    public static <T> T deserialize(String json, Class<T> type) {
        return gson.fromJson(json, type);
    }
}
