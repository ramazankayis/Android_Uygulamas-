package com.uygulama13;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
 
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.splash);
	        
	        Thread AcilisEkrani = new Thread(){
	        	public void run(){
	        	
	        		
	        			try {
							sleep(7000);
							startActivity(new Intent("com.uygulama13.EK2"));
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        		
	        		finally{
	        			finish();
	        		}
	        		
	        	}
	        };
	        AcilisEkrani.start();
	 }
	 
}