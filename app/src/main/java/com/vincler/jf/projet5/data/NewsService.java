package com.vincler.jf.projet5.data;

import com.vincler.jf.projet5.models.ArticlesListResponse;
import com.vincler.jf.projet5.models.ArticlesSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {
    @GET("topstories/v2/home.json?api-key=jGQidx72NOVdW62AOG2f61ITRG2Gmsbx")
    Call<ArticlesListResponse> listTopstories();

    @GET("mostpopular/v2/emailed/7.json?api-key=jGQidx72NOVdW62AOG2f61ITRG2Gmsbx")
    Call<ArticlesListResponse> listMostPopular();

    @GET("search/v2/articlesearch.json?q=business&api-key=jGQidx72NOVdW62AOG2f61ITRG2Gmsbx")
    Call<ArticlesSearchResponse> listBusiness();
}





