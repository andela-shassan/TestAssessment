package www.nobestdev.com.testassessment.request;



import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import www.nobestdev.com.testassessment.model.SongsResponse;

public interface ApiClient {

    @GET("artists/{id}/songs")
    Call<SongsResponse> getSongs(@Header("Authorization") String token, @Path("id") int id);

    class Factory {
        static String BASE_URL = "http://api.genius.com/";
        static ApiClient apiClient;

        public static ApiClient getApiClient() {
            if (apiClient == null) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                apiClient = retrofit.create(ApiClient.class);
                return apiClient;
            } else {
                return apiClient;
            }
        }
    }
}
