package duongnguyen.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnAdapter(Context context, ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewHienHanh = convertView;
        // Kiểm tra
        if(viewHienHanh == null){
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        }
        // Lấy dữ liệu
        MonAn monAnHienTai = dsMonAn.get(position);
        // Gắn lên các điều khiển
        // Tìm điềy khiển
        TextView tenMon = viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView donGia = viewHienHanh.findViewById(R.id.tvDonGia);
        TextView moTa = viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView anhMoTa = viewHienHanh.findViewById(R.id.idAnhDaiDien);

        tenMon.setText(monAnHienTai.getTenMonAn());
        donGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        moTa.setText(monAnHienTai.getMoTa());
        anhMoTa.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
