package com.uygulama13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kurulus extends Activity {
	 Button  button1,button2,btn;
	 TextView tv;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.kurulus);
	     
	        btn=(Button)findViewById(R.id.button11);
	        tv=(TextView)findViewById(R.id.textView1);
	        
	        btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					tv.setText("Mo�ol �mparatorlu�u d�neminde"
							+ " ka�an S�leyman �ah komutas�ndaki"
							+ " Kay�lar ilk olarak 1227 y�l�nda Anadolu'ya geldiler[18]"
							+ ". Anadolu Sel�uklu Devleti"
							+ " h�k�mdar� Alaeddin Keykubad,"
							+ " Kay�lar� Karacada� ve b�lgesine yerle�tirdi."
							+ " Kay�lar bu s�rada 50.000 ki�iydiler[19]."
						);
				}
			});
	        
	       button1=(Button)findViewById(R.id.button1);
	       button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(kurulus.this,fsm_video.class );
				startActivity(i);
			}
		});
	        
	    
	    }}
