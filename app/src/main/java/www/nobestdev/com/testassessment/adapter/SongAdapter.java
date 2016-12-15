package www.nobestdev.com.testassessment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import www.nobestdev.com.testassessment.R;
import www.nobestdev.com.testassessment.model.Song;

/**
 * Created by Hassan On 15/12/2016.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private ArrayList<Song> songs = new ArrayList<>();

    public SongAdapter(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.song_row_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Song song = songs.get(position);
        holder.artistName.setText(song.getPrimaryArtist().getName());
        holder.songName.setText(song.getTitle());

    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView songName, artistName;

        ViewHolder(View itemView) {
            super(itemView);
            songName = (TextView) itemView.findViewById(R.id.tv_song_name);
            artistName = (TextView) itemView.findViewById(R.id.tv_artist_name);
        }
    }
}
