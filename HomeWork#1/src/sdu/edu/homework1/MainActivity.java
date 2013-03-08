package sdu.edu.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	EditText name, surname;
	Button submit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		name = (EditText) findViewById(R.id.name);
		
		surname = (EditText) findViewById(R.id.surname);
		
		submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.submit){
			
			if (name.getText().length() == 0){
				Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show();
				return;
			}
			
			if (surname.getText().length() == 0){
				Toast.makeText(this, "Enter surname", Toast.LENGTH_SHORT).show();
				return;
			}
			
			Intent intent = new Intent(this, ShowInfo.class);
			intent.putExtra("Information", name.getText() + " " + surname.getText());
			startActivity(intent);
		}
	}

}
