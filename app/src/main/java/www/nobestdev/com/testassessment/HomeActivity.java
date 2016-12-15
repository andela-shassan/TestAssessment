package www.nobestdev.com.testassessment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import www.nobestdev.com.testassessment.model.Song;
import www.nobestdev.com.testassessment.model.SongsResponse;
import www.nobestdev.com.testassessment.request.ApiClient;

public class HomeActivity extends AppCompatActivity {

    private String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSongs();
    }

    public void getSongs() {
        Call<SongsResponse> call = ApiClient.Factory.getApiClient().getSongs(getString(R.string.GENIUS_CLIENT_TOKEN), 2);
        call.enqueue(new Callback<SongsResponse>() {
            @Override
            public void onResponse(Call<SongsResponse> call, Response<SongsResponse> response) {
                int code = response.code();
                if (code == 200) {
                    List<Song> songs = response.body().getResponse().getSongs();
                    Log.d(TAG, "THE SIZE IF RETURNED SONGS = "+ songs.size());
                }
            }

            @Override
            public void onFailure(Call<SongsResponse> call, Throwable t) {
                if (t != null) {
                    Log.d(TAG, t.getMessage());
                }
            }
        });
    }
}
