package ntu.duongnguyen.projectmidtermexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.HoatDongViewHolder> {
    Context context;
    ArrayList<HoatDong> listHoatDong;

    public HoatDongAdapter(Context context, ArrayList<HoatDong> listHoatDong) {
        this.context = context;
        this.listHoatDong = listHoatDong;
    }

    @NonNull
    @Override
    public HoatDongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_hoatdong, parent, false);
        return new HoatDongAdapter.HoatDongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoatDongViewHolder holder, int position) {
        HoatDong hoatDong = listHoatDong.get(position);
        int resId = context.getResources().getIdentifier(
                hoatDong.getAnhDD(), "drawable", context.getPackageName());

        holder.imgAnh.setImageResource(resId);
        holder.tvTitle.setText(hoatDong.getTenHoatDong());
        holder.tvContent.setText(hoatDong.getThoiGian());
    }

    @Override
    public int getItemCount() {
        return listHoatDong.size();
    }

    public  class HoatDongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgAnh;
        TextView tvTitle, tvContent;
        public HoatDongViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imageView2);
            tvTitle = itemView.findViewById(R.id.textViewTitle);
            tvContent = itemView.findViewById(R.id.textViewContent);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getAdapterPosition();

            if (viTriDuocClick == RecyclerView.NO_POSITION) return;

            HoatDong phanTuDuocChon = listHoatDong.get(viTriDuocClick);

            String ten = phanTuDuocChon.getTenHoatDong();
            String thoiGian = phanTuDuocChon.getThoiGian();

            String hienThongbao = "Bạn vừa click vào: " + ten + " - " + thoiGian;

            Toast.makeText(v.getContext(), hienThongbao, Toast.LENGTH_SHORT).show();
        }
    }
}
