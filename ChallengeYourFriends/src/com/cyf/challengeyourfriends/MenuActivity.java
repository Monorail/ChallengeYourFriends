package com.cyf.challengeyourfriends;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends Activity implements OnItemClickListener {
	private ListView mLvMenu;
	private ArrayList<String> mStringMenuElems;
	private ArrayAdapter mMenuAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		mStringMenuElems = new ArrayList<String>();
//		mStringMenuElems.add("View challenges");
//		mStringMenuElems.add("Challenge friend");
//		mStringMenuElems.add("Complete challenge");
//		mStringMenuElems.add("Logout");
		mStringMenuElems.add("@Monorail0");
		mStringMenuElems.add("@JimmieChrist");
		mStringMenuElems.add("@theKovaleski");
		mStringMenuElems.add("@heyitsluis");
		mStringMenuElems.add("@JoseCanseco");
		mStringMenuElems.add("@therealkanyewest");
		ListView mLvMenu = (ListView)findViewById(R.id.mainmenu_listview);
		mMenuAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mStringMenuElems);
		mLvMenu.setAdapter(mMenuAdapter);
		mLvMenu.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		Log.w("TEST","test");
		switch(position){
		case 0://view challenges
//			Intent intent = new Intent(this, LoginActivity.class);
//		    startActivity(intent);
			break;
		case 1://challenge friends
			break;
		case 2://complete challenge
			break;
		case 3://logout
			break;
		default: 
			break;
		}
		
		Context context = getApplicationContext();
		CharSequence text = "" + position;
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		
	}
}































