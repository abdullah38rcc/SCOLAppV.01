package com.sqlite.two;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;


public class Registration extends Activity implements OnClickListener


{
 // Variable Declaration should be in onCreate()
 ImageButton sign_up,twitterlink;
 
 private EditText mFname;
 private EditText mLname;
 private EditText mUsername;
 private EditText mPassword;
 private EditText mEmail;
 
 
 protected DBHelper DB = new DBHelper(Registration.this); 
 
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  
  
  super.onCreate(savedInstanceState);
  setContentView(R.layout.register);
  
  //Assignment of UI fields to the variables
  sign_up = (ImageButton)findViewById(R.id.sign_up);
  sign_up.setOnClickListener(this);
  
  twitterlink = (ImageButton)findViewById(R.id.twitterlink);
  twitterlink.setOnClickListener(this);
  
  mFname = (EditText)findViewById(R.id.efname);
  mLname = (EditText)findViewById(R.id.elname);
 
  mUsername = (EditText)findViewById(R.id.reuname);
  mPassword = (EditText)findViewById(R.id.repass);
  mEmail = (EditText)findViewById(R.id.eemail);
 

  
  
 }


 
 public void onClick(View v) 
 {
  
  switch(v.getId()){
  
  case R.id.twitterlink:
   Intent i = new Intent(getBaseContext(), LoginActivity.class);
   startActivity(i);
   //finish();
   break;
   
  case R.id.sign_up:
   
   
   String fname = mFname.getText().toString();
   String lname = mLname.getText().toString();
   
   String uname = mUsername.getText().toString();
   String pass = mPassword.getText().toString();
   String email = mEmail.getText().toString();
   
   
   boolean invalid = false;
      
   if(fname.equals(""))
   {
    invalid = true;
    Toast.makeText(getApplicationContext(), "Enter your Firstname", Toast.LENGTH_SHORT).show();
   }
   else
   
   if(lname.equals(""))
   {
    invalid = true;
    Toast.makeText(getApplicationContext(), "Please enter your Lastname", Toast.LENGTH_SHORT).show();
   }
   else
         
    if(uname.equals(""))
    {
     invalid = true;
     Toast.makeText(getApplicationContext(), "Please enter your Username", Toast.LENGTH_SHORT).show();
    }
    else
    
    
      if(pass.equals(""))
     {
      invalid = true;
      Toast.makeText(getApplicationContext(), "Please enter your Password", Toast.LENGTH_SHORT).show();
     
   }
     else 
      if(email.equals(""))
   {
    invalid = true;
    Toast.makeText(getApplicationContext(), "Please enter your Email ID", Toast.LENGTH_SHORT).show();
   }
     else
      if(invalid == false)
      {
       addEntry(fname, lname, uname, pass, email);
       Intent i_register = new Intent(Registration.this, profile.class);
       startActivity(i_register);
       //finish();
      }
      
      break;
      }
    }
 


 
 
 public void onDestroy()
 {
  super.onDestroy();
  DB.close();
 }
 


 private void addEntry(String fname, String lname, String uname, String pass, String email) 
 {
  
  SQLiteDatabase db = DB.getWritableDatabase();
  
  ContentValues values = new ContentValues();
  values.put("firstname", fname);
  values.put("lastname", lname);
  values.put("username", uname);
  values.put("password", pass);
  values.put("email", email);
  
  try
  {
   db.insert(DBHelper.DATABASE_TABLE_NAME, null, values);
   
   Toast.makeText(getApplicationContext(), "your details submitted Successfully...", Toast.LENGTH_SHORT).show();
  }
  catch(Exception e)
  {
   e.printStackTrace();
  }
 }







 public void onNothingSelected(AdapterView<?> arg0) {
  // TODO Auto-generated method stub
  
 }
 
}
