package ntu.duongnguyen.projectmidtermexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNhac extends RecyclerView.Adapter<AdapterNhac.SongViewHolder> {

    Context context;
    ArrayList<Song> list;

    public AdapterNhac(Context context, ArrayList<Song> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.nhac, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song song = list.get(position);
        holder.tvTenNhac.setText(song.getTen());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder{
        TextView tvTenNhac;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenNhac = itemView.findViewById(R.id.textViewTenNhac);
        }
    }
}
