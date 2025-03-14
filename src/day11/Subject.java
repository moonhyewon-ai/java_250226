package day11;

public class Subject {
	private String code; // 과목 코드
	private String name; // 과목명
	private Integer credit; // 학점 (null 가능)
	private Integer hours; // 시수 (null 가능)
	private String professor; // 교수명 (null 가능)
	private String schedule; // 시간표 (null 가능)
	private String classroom; // 강의장 (null 가능)

	// 생성자: 과목 코드와 과목명만 설정 (나머지는 null)
	public Subject(String code, String name) {
		this.code = code;
		this.name = name;
		this.credit = null;
		this.hours = null;
		this.professor = null;
		this.schedule = null;
		this.classroom = null;

	}
	
	

	public Subject(String code, String name, Integer credit, Integer hours, String professor, String schedule,
			String classroom) {

		this.code = code;
		this.name = name;
		this.credit = credit;
		this.hours = hours;
		this.professor = professor;
		this.schedule = schedule;
		this.classroom = classroom;
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "수강과목 [과목코드:" + code + ", 과목명:" + name + "]";
	}



	public Object getSubNum() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
