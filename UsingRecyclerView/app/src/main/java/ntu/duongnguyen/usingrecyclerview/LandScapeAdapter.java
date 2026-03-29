package ntu.duongnguyen.usingrecyclerview;

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
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater bomLayout = LayoutInflater.from(context);
        View viewHienTai = bomLayout.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewHolderCreated = new ItemLandHolder(viewHienTai);
        return viewHolderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lấy đối tượng hiển thị
        LandScape landScapeHienThi  = listData.get(position);
        String caption = landScapeHienThi.getLandCaption();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        holder.tvCaption.setText(caption);
         // Đặt ảnh
            String packname = holder.itemView.getContext().getPackageName();
            int imageId = holder.itemView.getResources().getIdentifier(tenAnh, "drawable", packname);
        holder.ivLandscape.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLandscape;

            public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getAdapterPosition();
            LandScape phanTuDuocChon = listData.get(viTriDuocClick);
            String ten = phanTuDuocChon.getLandCaption();
            String fileAnh = phanTuDuocChon.getLandImageFileName();

            String hienThongbao = "Ban vua click vao: " + ten;
            Toast.makeText(v.getContext(), hienThongbao, Toast.LENGTH_SHORT).show();

        }
    }
}
