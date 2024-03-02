package entity;

public class Student {

	private int id;
	private String fName;
	private String mName;
	private String lName;
	private String dob;
	private String PhNo;
	private String email;
	private String nationality;
	private String state;
	private String dist;
	private String city;
	private String pAdd;
	private String adClassYear;
	private String  prevClassMarks;
	private String prevClassYOP;
	
	public Student()
	{
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", dob=" + dob
				+ ", PhNo=" + PhNo + ", email=" + email + ", nationality=" + nationality + ", state=" + state
				+ ", dist=" + dist + ", city=" + city + ", pAdd=" + pAdd + ", adClassYear=" + adClassYear
				+ ", prevClassMarks=" + prevClassMarks + ", prevClassYOP=" + prevClassYOP + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhNo() {
		return PhNo;
	}

	public void setPhNo(String phNo) {
		PhNo = phNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getpAdd() {
		return pAdd;
	}

	public void setpAdd(String pAdd) {
		this.pAdd = pAdd;
	}

	public String getAdClassYear() {
		return adClassYear;
	}

	public void setAdClassYear(String adClassYear) {
		this.adClassYear = adClassYear;
	}

	public String getPrevClassMarks() {
		return prevClassMarks;
	}

	public void setPrevClassMarks(String prevClassMarks) {
		this.prevClassMarks = prevClassMarks;
	}

	public String getPrevClassYOP() {
		return prevClassYOP;
	}

	public void setPrevClassYOP(String prevClassYOP) {
		this.prevClassYOP = prevClassYOP;
	}

	public Student(String fName, String mName, String lName, String dob, String phNo, String email, String nationality,
			String state, String dist, String city, String pAdd, String adClassYear, String prevClassMarks,
			String prevClassYOP) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.dob = dob;
		PhNo = phNo;
		this.email = email;
		this.nationality = nationality;
		this.state = state;
		this.dist = dist;
		this.city = city;
		this.pAdd = pAdd;
		this.adClassYear = adClassYear;
		this.prevClassMarks = prevClassMarks;
		this.prevClassYOP = prevClassYOP;
	}
	
	
	
}
