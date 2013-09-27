package com.sqlite.two;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageButton;

public class Quiz extends Activity


{ 
	
	ImageButton home_button,quiz_button,championship_button,ozutimes_button ;
	Intent go3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz);
		
		home_button=(ImageButton)findViewById(R.id.home_button);
        quiz_button=(ImageButton)findViewById(R.id.quiz_button);
        championship_button=(ImageButton)findViewById(R.id.championship_button);
        ozutimes_button=(ImageButton)findViewById(R.id.ozutimes_button);
        
        home_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go3=new Intent(Quiz.this,profile.class);
				startActivity(go3);
			}
		});
        quiz_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go3=new Intent(Quiz.this,Quiz.class);
				startActivity(go3);
			}
		});
        
        championship_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				go3=new Intent(Quiz.this,Championship.class);
				startActivity(go3);
				}
			
		});
        ozutimes_button.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go3=new Intent(Quiz.this,OzuTimes.class);
				startActivity(go3);
			}
		});
        
        
    }
    

		
}
