package duongnguyen.vieccanlam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.Task;

import java.util.List;

public class TaskRVAdapter extends RecyclerView.Adapter<TaskRVAdapter.TaskItemViewHolder>{
    List<Tasks> dataSource;

    public TaskRVAdapter(List<Tasks> dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public TaskItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskItemViewHolder holder, int position) {
        Tasks task = dataSource.get(position);
        holder.tvViecCanLam.setText(task.getName());
        holder.tvThoiHan.setText(task.getDate());
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    public class TaskItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvViecCanLam;
        TextView tvThoiHan;
        public  int position;
        public TaskItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvViecCanLam = itemView.findViewById(R.id.textView_tenViec);
            tvThoiHan = itemView.findViewById(R.id.textView_thoiGian);
        }

        @Override
        public void onClick(View v) {
            int vtClicked = getBindingAdapterPosition();
            Tasks taskClicked = dataSource.get(vtClicked);
            Toast.makeText(v.getContext(), "Bạn vừa chọn công việc" + taskClicked.getName(), Toast.LENGTH_LONG).show();
        }
    }
}
