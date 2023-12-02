package com.example.gymbro2;

import android.provider.BaseColumns;

public final class UserContract {
    private UserContract() {} // To prevent accidental instantiation

    public static class UserEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";
        public static final String COLUMN_NAME_LAST_NAME = "last_name";
        // Add other columns as needed
    }
}
