package sdu.edu.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class ShowInfo extends Activity {
	
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.show_info);
	        
	        TextView info = (TextView) findViewById(R.id.info);
	        
	        Intent intent = getIntent();
	        
	        info.setText(intent.getStringExtra("Information"));
	        
	        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
	        
	        info.startAnimation(anim);
	        
	 }	

}
