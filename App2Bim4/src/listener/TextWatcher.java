package listener;

import android.text.Editable;
import android.util.Log;

public class TextWatcher implements android.text.TextWatcher {

	@Override
	public void afterTextChanged(Editable editable) {
		Log.i("EditTExtListener", "afterTextChanged: " + editable);

	}

	@Override
	public void beforeTextChanged(CharSequence charSequence, int start,
			int count, int after) {
		Log.i("EditTExtListener", "beforeTextChanged: " + charSequence);
	}

	@Override
	public void onTextChanged(CharSequence charSequence, int start, int before,
			int count) {
		Log.i("EditTExtListener", "onTextChanged: " + charSequence);

	}

}
