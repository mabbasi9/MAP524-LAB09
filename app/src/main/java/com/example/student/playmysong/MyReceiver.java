package com.example.student.playmysong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by student on 3/24/15.
 */
public class MyReceiver extends BroadcastReceiver {
    Context c=null;

    @Override
    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context, "MyReceiver Started",
                Toast.LENGTH_SHORT).show();
        Log.v("Info Message", "in Broadcast receiver");
        Intent myIntent=new Intent(context,MyService.class);
        context.startService(myIntent);


    }



}




