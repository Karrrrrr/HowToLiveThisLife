package com.example.program3;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IApi {

    @GET("api/article")
    Call<ArticleBD> GetArticle(@Query("id") int id);
}
