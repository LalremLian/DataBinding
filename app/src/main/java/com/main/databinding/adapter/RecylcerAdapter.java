package com.main.databinding.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.main.databinding.BR;
import com.main.databinding.R;
import com.main.databinding.databinding.ItemRowBinding;
import com.main.databinding.model.CustomClickListener;
import com.main.databinding.model.ModelClass;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class RecylcerAdapter extends RecyclerView.Adapter<RecylcerAdapter.ViewHolder> implements CustomClickListener{

    List<ModelClass> modelClassList;
    Context context;

    public RecylcerAdapter(List<ModelClass> modelClassList, Context context) {
        this.modelClassList = modelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecylcerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRowBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.item_row, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelClass modelClass = modelClassList.get(position);

        //holder.itemRowBinding.setModelClass(modelClass);
        Log.e("Tag",modelClassList.toString());
        holder.bind(modelClass);

        //holder.binding.tvAndroidName.setText(modelClass.getName());
        //holder.binding.tvAndroidVersion.setText(modelClass.getAge());
        //holder.binding.setItemClickListener(this);
        holder.itemRowBinding.setItemClickListener(this);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    @Override
    public void cardClicked(ModelClass f) {
        Toast.makeText(context, "hello" + f.getName(), Toast.LENGTH_SHORT).show();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemRowBinding itemRowBinding;
        public ViewHolder(ItemRowBinding itemRowBinding) {
            super(itemRowBinding.getRoot());
            this.itemRowBinding = itemRowBinding;
        }

        public void bind(Object obj) {
            itemRowBinding.setVariable(BR.modelClass, obj);
            itemRowBinding.executePendingBindings();
        }
    }

/*    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemRowBinding binding;
        public ViewHolder(@NonNull ItemRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }*/
}
