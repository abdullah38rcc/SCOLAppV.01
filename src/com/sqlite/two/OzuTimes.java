package com.sqlite.two;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton; 

public class OzuTimes extends Activity


{ 
	
	ImageButton home_button,quiz_button,championship_button,ozutimes_button ;
	Intent go2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ozutimes);
		
		home_button=(ImageButton)findViewById(R.id.home_button);
        quiz_button=(ImageButton)findViewById(R.id.quiz_button);
        championship_button=(ImageButton)findViewById(R.id.championship_button);
        ozutimes_button=(ImageButton)findViewById(R.id.ozutimes_button);
        
        home_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go2=new Intent(OzuTimes.this,profile.class);
				startActivity(go2);
			}
		});
        quiz_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go2=new Intent(OzuTimes.this,Quiz.class);
				startActivity(go2);
			}
		});
        
        championship_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				go2=new Intent(OzuTimes.this,Championship.class);
				startActivity(go2);
				}
			
		});
        ozutimes_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go2=new Intent(OzuTimes.this,OzuTimes.class);
				startActivity(go2);
			}
		});
        
        
    }
    

		
}
