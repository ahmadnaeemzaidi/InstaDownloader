package com.techgeeks.instagram.downloader.huawei.api;

import com.google.gson.JsonObject;
import com.techgeeks.instagram.downloader.huawei.api.model.FullDetailModel;
import com.techgeeks.instagram.downloader.huawei.api.model.StoryModel;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

public interface APIServices {
    @GET
    Observable<JsonObject> getResult(@Url String str, @Header("Cookie") String str2, @Header("User-Agent") String str3);

    @GET
    Observable<FullDetailModel> getFullApi(@Url String str, @Header("Cookie") String str2, @Header("User-Agent") String str3);

    @GET
    Observable<StoryModel> getStories(@Url String str, @Header("Cookie") String str2, @Header("User-Agent") String str3);

}