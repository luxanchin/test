package admin.example.com.tracnghiemlichsu.ui.Thi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import admin.example.com.tracnghiemlichsu.R;

public class ThiFragment extends Fragment {

    private ThiViewModel thiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        thiViewModel =
                new ViewModelProvider(this).get(ThiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_thi, container, false);
        final TextView textView = root.findViewById(R.id.text_thi);
        thiViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}