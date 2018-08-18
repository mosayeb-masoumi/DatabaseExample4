package com.example.tornado.databaseexample4;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Tornado on 6/19/2018.
 */

public class Message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
