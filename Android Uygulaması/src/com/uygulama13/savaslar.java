package com.uygulama13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class savaslar extends Activity {
	 
	 Button  button1,button2,btn;
	 TextView tv;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.savaslar);
	        button1=(Button)findViewById(R.id.button1);
	        button1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i= new Intent(savaslar.this,savas1.class );
					startActivity(i);
				}
			});
       
   
   }}


