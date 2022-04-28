package ksrm.client;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
	
	private String Name;
	private Button[] Buttons;
	
	
	
	public Item() {
		Buttons = new Button[10];
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Button[] getButtons() {
		return Buttons;
	}
	public void setButtons(Button[] buttons) {
		Buttons = buttons;
	}
	
	public void addButton(Button button) {
	}
	@Override
	public String toString() {
		return "Item [Name=" + Name + ", Buttons=" + Arrays.toString(Buttons) + "]";
	}


}
