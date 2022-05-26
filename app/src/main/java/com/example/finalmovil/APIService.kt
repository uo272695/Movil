package com.example.finalmovil

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    fun getSitios(@Url url:String):retrofit2.Response<SitiosResponse>

}