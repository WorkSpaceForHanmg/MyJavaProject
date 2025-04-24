package workshop.animal.entity;

public interface Pet {
	String getName();		//interface 경우 public이 자동으로 붙음
	void setName(String name);
	public abstract void play();
	
}
