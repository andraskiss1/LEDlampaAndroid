package com.example.andraskiss.ledlampaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gomb1 = (Button) findViewById(R.id.LEDbebutton);
        Button gomb2 = (Button) findViewById(R.id.LEDkibutton);
    }


    public void gomb1Clicked(View v) {
        String url = "http://192.168.1.20/ajaxertekek&KAP1=1";
    // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

    // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    public void gomb2Clicked(View v) {
        String url = "http://192.168.1.20/ajaxertekek&KAP1=0";
    // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

    // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

}