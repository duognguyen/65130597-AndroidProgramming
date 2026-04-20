package thigk2.nguyenthaiduong.kiemtragk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DanhNhanAdapter extends RecyclerView.Adapter<DanhNhanAdapter.DanhNhanViewHolder> {
    Context context;
    ArrayList<DanhNhan> listDanhNhan;

    @NonNull
    @Override
    public DanhNhanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_danhnhan, parent, false);
        return new DanhNhanViewHolder(view);
    }


    public DanhNhanAdapter(Context context, ArrayList<DanhNhan> listDanhNhan) {
        this.context = context;
        this.listDanhNhan = listDanhNhan;
    }

    @Override
    public void onBindViewHolder(@NonNull DanhNhanViewHolder holder, int position) {
        DanhNhan dn = listDanhNhan.get(position);

        holder.tvTitle.setText(dn.getTen());
        holder.tvContent.setText(dn.getQuequan());

        int resId = context.getResources().getIdentifier(
                dn.getAnhDD(), "drawable", context.getPackageName());

        holder.imgAnh.setImageResource(resId);
    }


    @Override
    public int getItemCount() {
        return listDanhNhan.size();
    }

    public  class DanhNhanViewHolder extends RecyclerView.ViewHolder{
        ImageView imgAnh;
        TextView tvTitle, tvContent;
        public DanhNhanViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imageView2);
            tvTitle = itemView.findViewById(R.id.textViewTitle);
            tvContent = itemView.findViewById(R.id.textViewContent);
        }
    }

}
