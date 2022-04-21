package ksrm.client;

public class Control {
	
	private View view;
	private Model model;
	
	public Control() {
		view = new View();
		model = new Model();
	}
	
	public View get_view() {
		return view;
	}
	
	public Model get_model() {
		return model;
	}
	
}
