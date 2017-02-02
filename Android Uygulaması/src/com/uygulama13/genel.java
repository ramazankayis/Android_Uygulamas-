package com.uygulama13;

 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 

public class genel  extends Activity {
	Button  button1,button2,button3;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.genel);
	        button1=(Button)findViewById(R.id.button1);
	        button1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i= new Intent(genel.this,padisahlar.class );
					startActivity(i);
				}
			});
	        button2=(Button)findViewById(R.id.button2);
	        button2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i= new Intent(genel.this,donemler.class );
					startActivity(i);
				}
			});
	        
	        button3=(Button)findViewById(R.id.button3);
	        button3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i= new Intent(genel.this,savaslar.class );
					startActivity(i);
				}
			});
	        
	    
	    }}


