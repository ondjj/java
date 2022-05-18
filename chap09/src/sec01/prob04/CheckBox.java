package sec01.prob04;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener (OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	


	static interface OnSelectListener {
		void onSelect();
	}

}
