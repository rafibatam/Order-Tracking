package id.challenge.dreamspace.activitydayplans.AdapterGambar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.challenge.dreamspace.activitydayplans.Model.ImageMainSightsPojo;
import id.challenge.dreamspace.activitydayplans.R;

public class AdapterImageMainSights extends RecyclerView.Adapter<AdapterImageMainSights.ViewHolder> {
    private Context context;
    private ArrayList<ImageMainSightsPojo> gambarPOJOList;

    public AdapterImageMainSights(Context context, ArrayList<ImageMainSightsPojo> gambarPOJOList) {
        this.context = context;
        this.gambarPOJOList = gambarPOJOList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.previewImage.setImageResource(gambarPOJOList.get(position).getImageParis());
    }

    @Override
    public int getItemCount() {
        return gambarPOJOList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView previewImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            previewImage = itemView.findViewById(R.id.imagePreview);
        }
    }
}
