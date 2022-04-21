package ksrm.client;

public class Item {
	
	private String Name;
	private String ButtonName;
	private Integer ButtonNr;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getButtonName() {
		return ButtonName;
	}
	public void setButtonName(String buttonName) {
		ButtonName = buttonName;
	}
	public Integer getButtonNr() {
		return ButtonNr;
	}
	public void setButtonNr(Integer buttonNr) {
		ButtonNr = buttonNr;
	}

	@Override
	public String toString() {
		return "Item [Name=" + Name + ", ButtonName=" + ButtonName + ", ButtonNr=" + ButtonNr + "]";
	}
}
