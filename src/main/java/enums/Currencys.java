package enums;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Currencys {
    EUR("€"),
    USD("$"),
    GBP("£");

    private String name;

    public static Map<String, Currencys> getEnumMap() {
        return ENUM_MAP;
    }

    static final Map<String, Currencys> ENUM_MAP;

    Currencys(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    static {
        Map<String, Currencys> map = new ConcurrentHashMap<String, Currencys>();
        for (Currencys instance : Currencys.values()) {
            map.put(instance.getName(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Currencys get (String name) {
        return ENUM_MAP.get(name);
    }
}
