package com.chhaichivon.puppies_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import okhttp3.MediaType;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

	ApiService  apiService;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		apiService = new RetrofitManager().getInstance().create(ApiService.class);


		Call call = apiService.getPuppies();
		call.enqueue(new Callback() {
			@Override
			public void onResponse(Call call, Response response) {
				Log.d("Hello ","World");
				Puppies  puppies = (Puppies) response.body();
				Log.d("Puppies Name " , puppies.getName());
			}

			@Override
			public void onFailure(Call call, Throwable t) {
				call.cancel();
			}
		});
	}
}
