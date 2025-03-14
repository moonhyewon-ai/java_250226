package day10;

public class Product {

	//멤버변수
		private String name;
	    private int price;
	    
	 // 생성자 (상품명과 가격을 받음)
	    public Product(String name, int price) {
	        this.name=name;
	        this.price=price;
	    }
	    
	 // 상품 정보 출력 메서드
	  public void printInfo() {
	      System.out.println("상품명: " + name + ", 가격: " + price + "원");
	  }
	  

	//상품 추가 메서드
	public void insertProduct(String name,int price) {
		this.name=name;
		this.price=price;
	}
	

	//기본 출력 메서드(toString)
	//부모의 메서드를 자식이 사용하는 것(자식입장 : 내 형식에 맞게 수정하기)
//	@Override
//	public String toString() {
//		return "[" + name + ":" + price + "]";
//	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	}