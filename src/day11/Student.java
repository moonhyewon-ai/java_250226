package day11;

	    
	    public class Student {
		    private String studentId;   // 학번
		    private String name;        // 이름
		    private String age;            // 나이
		    private String phone;       // 전화번호
		    private String address;     // 주소
		    private Subject[] subject = new Subject[5]; //내가 수강신청한 목록
		    private int cnt;   // 현재 등록된 과목 수
		    
		    
		    
		    
		    //생성자
		    public Student() {}
		    
		    public Student(String studentId, String name, String age, String phone, String address) {
		        this.studentId = studentId;
		        this.name = name;
		        this.age = age;
		        this.phone = phone;
		        this.address = address;
		        this.cnt = 0; // 초기 등록된 과목 없음
	    }
	    
		    //내가 필요한 메서드 추가하기
		    //과목의 객체가 들어오면(입력) 내 수강배열(subject)에 추가
		    public void insertSubject(Subject s) {
		    	if( cnt == subject.length) {
		    		//배열 복사하여 배열 늘려주기
		    		Subject[] tmp = new Subject[subject.length+5];
		    		//배열복사
		    		System.arraycopy(subject,0,tmp,0,subject.length);
		    		//기존 객채명에 배열 바꾸기
		    		
		    	}
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    	// 내가 필요한 메서드 추가하기.
		    @Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}

		    
				public String getStudentId() {
					return studentId;
				}


				public void setStudentId(String studentId) {
					this.studentId = studentId;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				
				public String getAge() {
					return age;
				}

				public void setAge(String age) {
					this.age = age;
				}

				public String getPhone() {
					return phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getAddress() {
					return address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public Subject[] getSubject() {
					return subject;
				}

				public void setSubject(Subject[] subject) {
					this.subject = subject;
				}

				public int getCnt() {
					return cnt;
				}

				public void setCnt(int cnt) {
					this.cnt = cnt;
				}

	    }