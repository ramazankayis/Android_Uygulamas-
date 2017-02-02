package com.uygulama13;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class fsm_video extends Activity {
	  VideoView vv;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.fsm_video);
	     vv=(VideoView)findViewById(R.id.videoView1);
	       
	        Uri yol=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
	     
			vv.setVideoURI(yol);
			vv.start();
	        
	       
	        
	    
	    }}
