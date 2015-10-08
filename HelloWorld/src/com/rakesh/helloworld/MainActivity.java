package com.rakesh.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	EditText editusername1,editpassword1;
	Button buttonlogin;
	String actualUser="user";
	String actualPass="1234";
	String editUser;
	String editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editusername1=(EditText)findViewById(R.id.editusername);
        editpassword1=(EditText)findViewById(R.id.editpassword);
        buttonlogin=(Button)findViewById(R.id.buttonlogin);
        
        buttonlogin.setOnClickListener(this);
        }
     

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		editUser=editusername1.getText().toString();
		editPass=editpassword1.getText().toString();
		if((actualUser.equalsIgnoreCase(editUser))&&(actualPass.equalsIgnoreCase(editPass)))
		{
			Toast.makeText(this, "login Sucssesfully", Toast.LENGTH_SHORT).show();
		}
		else{
			Toast.makeText(this, "login failed0", Toast.LENGTH_SHORT).show();		
		}
		
		
	}
    
}
