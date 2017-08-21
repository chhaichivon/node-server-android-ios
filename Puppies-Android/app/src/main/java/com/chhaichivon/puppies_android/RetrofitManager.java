package com.chhaichivon.puppies_android;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/22/17
 * TIME     : 12:36 AM
 */

public class RetrofitManager {
	private static Retrofit retrofit = null;

	public Retrofit getInstance(){
		HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
		interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
		retrofit = new Retrofit.Builder()
				.baseUrl(Common.API_END_POINT)
				.addConverterFactory(GsonConverterFactory.create())
				.client(client)
				.build();
		return retrofit;
	}
}
