package duongnguyen.weddingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import duongnguyen.weddingapp.R;
import duongnguyen.weddingapp.models.SanhTiec;

public class SanhTiecAdapter extends RecyclerView.Adapter<SanhTiecAdapter.SanhTiecViewHolder> {
    Context context;
    ArrayList<SanhTiec> listSanh;

    public SanhTiecAdapter(Context context, ArrayList<SanhTiec> listSanh) {
        this.context = context;
        this.listSanh = listSanh;
    }

    @NonNull
    @Override
    public SanhTiecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sanhtiec, parent, false);
        return new SanhTiecAdapter.SanhTiecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanhTiecViewHolder holder, int position) {
        SanhTiec sanhTiec = listSanh.get(position);
        holder.tvTenSanh.setText(sanhTiec.getTenSanh());
        holder.tvSucChua.setText(String.valueOf(sanhTiec.getSucChua()));
        holder.tvGiaThue.setText(String.valueOf(sanhTiec.getGiaThue()));
    }

    @Override
    public int getItemCount() {
        return listSanh.size();
    }

    public  class SanhTiecViewHolder extends  RecyclerView.ViewHolder{
        TextView tvTenSanh, tvSucChua, tvGiaThue;

        public SanhTiecViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenSanh = itemView.findViewById(R.id.tvTenSanh);
            tvSucChua = itemView.findViewById(R.id.tvSucChua);
            tvGiaThue = itemView.findViewById(R.id.tvGiaThue);
        }
    }
}
