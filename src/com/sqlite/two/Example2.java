package com.sqlite.two;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Example2 extends Activity
{
	ImageButton register,login,twitterconnect;
	
	
	Intent go1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        register=(ImageButton)findViewById(R.id.register);
        login=(ImageButton)findViewById(R.id.login);
        twitterconnect=(ImageButton)findViewById(R.id.twitterconnect);
       
       
       
       
        
        
        
       
        register.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go1=new Intent(Example2.this,Registration.class);
				startActivity(go1);
			}
		});
        login.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				go1=new Intent(Example2.this,LoginActivity.class);
				startActivity(go1);
			}
		});
        
        twitterconnect.setOnClickListener(new OnClickListener() 
        {			
			public void onClick(View v) 
			{
				go1=new Intent(Example2.this,Registration.class);
				startActivity(go1);
				}
			
		});
        
        
    }
    
}
	
   
