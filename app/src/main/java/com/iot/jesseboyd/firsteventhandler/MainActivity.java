package com.iot.jesseboyd.firsteventhandler;

import android.app.Activity;
import android.os.Bundle;
// these add a view and widgets
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // finds the button with the view id of 'button' and assigns
        Button button = (Button) findViewById(R.id.button);

        final int viewId = R.id.textView;

        button.setOnClickListener(
                new Button.OnClickListener() {
                    //this is the callback method
                    public void onClick(View v) {

                        TextView textViewMsg = (TextView) findViewById(viewId);
                        if (textViewMsg.getText().equals("TextView")) {
                            textViewMsg.setText("text changed by button");
                        } else {
                            textViewMsg.setText("TextView");
                        }
                    }
                });

        button.setOnLongClickListener(new Button.OnLongClickListener() {
                                          public boolean onLongClick(View v) {
                                              TextView textViewMsg = (TextView) findViewById(viewId);
                                              textViewMsg.setText("");
                                              return true;
                                              // if false it does the onlick action but immediately
                                              // returns to previous state
                                          }

                                      }
        );


    }


}
