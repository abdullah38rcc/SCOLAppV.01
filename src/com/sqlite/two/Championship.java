package com.sqlite.two;


import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
public class Championship extends Activity


{ 
	
	ImageButton home_button,quiz_button,championship_button,ozutimes_button ;
	Intent go3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.championship);
		
		home_button=(ImageButton)findViewById(R.id.home_button);
        quiz_button=(ImageButton)findViewById(R.id.quiz_button);
        championship_button=(ImageButton)findViewById(R.id.championship_button);
        ozutimes_button=(ImageButton)findViewById(R.id.ozutimes_button);
        
        home_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go3=new Intent(Championship.this,profile.class);
				startActivity(go3);
			}
		});
        quiz_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go3=new Intent(Championship.this,Quiz.class);
				startActivity(go3);
			}
		});
        
        championship_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				go3=new Intent(Championship.this,Championship.class);
				startActivity(go3);
				}
			
		});
        ozutimes_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go3=new Intent(Championship.this,OzuTimes.class);
				startActivity(go3);
			}
		});
        
        
    }
    

		
}
