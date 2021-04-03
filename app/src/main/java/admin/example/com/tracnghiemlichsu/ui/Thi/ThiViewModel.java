package admin.example.com.tracnghiemlichsu.ui.Thi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hiển thị các câu hỏi ...");
    }

    public LiveData<String> getText() {
        return mText;
    }
}