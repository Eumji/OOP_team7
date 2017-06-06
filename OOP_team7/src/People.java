
public class People {

	
	private String Name;
	private String ID;
	private String password;
	private String nickname;
	private int month;
	private int day;
	public People(String Name, String ID, String password, String nickname, int month, int day){
        this.Name=Name;
        this.ID = ID;
        this.password = password;
        this.nickname = nickname;
        this.month = month;
        this.day = day;
	}
	
	public void setName(String firstName){this.Name=firstName;}
	public String getName(){return Name;}
	
	public void setID(String ID){this.ID=ID;}
	public String getID(){return ID;}
	
	public void setpassword(String password){this.password=password;}
	public String getpassword(){return password;}
	
	public void setnickname(String nickname){this.nickname = nickname;}
	public String getnickname(){return nickname;}
	
	public void setmonth(int month){this.month=month;}
	public int getmonth(){return month;}
	
	public void setday(int day){this.day = day;}
	public int getday(){return day;}
	
}
