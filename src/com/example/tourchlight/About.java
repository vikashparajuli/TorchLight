package com.example.tourchlight;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		String about = "Name: Vikash Parajuli\nContact: +977-9843514804\nvikashparajuli@live.com\nKathmandu, Nepal";
		
		TextView tv = (TextView)findViewById(R.id.tvAbout);
		tv.setText(about);
	}

}
