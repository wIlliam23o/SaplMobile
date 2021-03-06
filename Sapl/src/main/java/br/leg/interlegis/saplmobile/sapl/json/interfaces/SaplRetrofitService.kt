package br.leg.interlegis.saplmobile.sapl.json.interfaces

import br.leg.interlegis.saplmobile.sapl.json.SaplApiRestResponse
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Query


interface SaplRetrofitService {

    @GET
    fun downloadFile(@Url fileUrl: String): Call<ResponseBody>

    @GET
    fun api(
            @Url url: String,
            @Query("format") format: String,
            @Query("page") page: Int,
            @Query("tipo_update") tipo_update: String,
            @Query("fk_name") fk_name: String?,
            @Query("fk_pk") fk_pk: Int?,
            @Query("data_min") data_min: String?,
            @Query("data_max") data_max: String?) : Call<SaplApiRestResponse>
    @GET
    fun uid(
            @Url url: String,
            @Query("format") format: String) : Call<JsonObject>
}