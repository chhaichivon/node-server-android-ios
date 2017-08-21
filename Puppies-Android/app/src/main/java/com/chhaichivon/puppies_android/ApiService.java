package com.chhaichivon.puppies_android;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * AUTHOR   : chhaichivon
 * EMAIL    : chhaichivon1995@gmail.com
 * DATE     : 8/22/17
 * TIME     : 12:25 AM
 */

public interface ApiService {

	/*@GET("users/{user}/repos")
	Call<List<Repo>> listRepos(@Path("user") String user);


	@GET("group/{id}/users")
	Call<List<User>> groupList(@Path("id") int groupId);

	@GET("group/{id}/users")
	Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);


	@POST("users/new")
	Call<User> createUser(@Body User user);


	@FormUrlEncoded
	@POST("user/edit")
	Call<User> updateUser(@Field("first_name") String first, @Field("last_name") String last);


	@Multipart
	@PUT("user/photo")
	Call<User> updateUser(@Part("photo") RequestBody photo, @Part("description") RequestBody description);


	@Headers("Cache-Control: max-age=640000")
	@GET("widget/list")
	Call<List<Widget>> widgetList();


	@Headers({
			"Accept: application/vnd.github.v3.full+json",
			"User-Agent: Retrofit-Sample-App"
	})
	@GET("users/{username}")
	Call<User> getUser(@Path("username") String username);


	@GET("user")
	Call<User> getUser(@Header("Authorization") String authorization)*/


	@GET("puppies")
	Call<Puppies> getPuppies();
}
