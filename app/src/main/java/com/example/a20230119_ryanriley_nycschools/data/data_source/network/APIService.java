package com.example.a20230119_ryanriley_nycschools.data.data_source.network;

import com.example.a20230119_ryanriley_nycschools.domain.model.SATResult;
import com.example.a20230119_ryanriley_nycschools.domain.model.School;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("s3k6-pzi2.json")
    Call<List<School>> getSchools(
            @Query("$limit") int limit,
            @Query("$offset") int offset
    );

    @GET("f9bf-2cp4.json")
    Call<List<SATResult>> getSatResult(
            @Query("dbn") String dbn
    );
}
