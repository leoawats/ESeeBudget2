package leo.awatin.com.e_seebudget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

public class Balance extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.balance, container, false);
    }
}
