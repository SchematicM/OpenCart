package enums;

//https://demo.opencart.com/index.php?route=common/home
//http://localhost/opencart/upload/index.php

public enum URLs {
    BASE_URL("http://localhost/opencart/upload/index.php"),
    ADMIN_URL("http://localhost/opencart/upload/admin/");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
