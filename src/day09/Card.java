package day09;

public class Card {
     /* 숫자 : 1~10, J(11), Q(12), K(13)
      * 모양 : ♥ , ◆ , ♠ , ♣
      * 한 장의 카드 모양을 출력하는 기능 => print()
      * ex) ♥3  ♥12 => ♥Q, #5 => ♥5(모양 잘못 입력돼도 하트로), $15 => ♥1(범위 넘어간 숫자는 1로 나오게)
      * 
      * -멤버변수 : 숫자(num), 모양(shape) => private => getter/setter
      * -메서드 : print()
      * -생성자 : 기본생성자만 생성 =>  ♥1
      */
	private int num;
    private String shape;

    public Card() {
        this.num = 1;
        this.shape = "♥";
    }
    
    public Card(int num, String shape) {
       setNum(num);
       setShape(shape);
    }
    
    
    public void print() {
        String ch;
        switch (num) {
            case 1:  ch = "A"; break;  // 숫자 1을 "A"로 변경
            case 11: ch = "J"; break;
            case 12: ch = "Q"; break;
            case 13: ch= "K"; break;
            default: ch = String.valueOf(num);
        }
        System.out.print(shape + ch +" ");
    }
    
   
    public void setNum(int num) {
        
        if (num < 1 || num > 13) {
            this.num = 1;
        } else {
            this.num = num;
        }
    }

    public void setShape(String shape) {
		//모양 : ♥, ◆, ♠, ♣ 아니면 ♥
		switch(shape) {
		case "♥" : case "◆" : case "♠": case "♣":
			this.shape = shape; break;
			default:
				this.shape="♥";	
		}
	}

//    public void setShape(String shape) {
//   
//    	if (shape.equals("♥") || shape.equals("◆")|| shape.equals("♠") || shape.equals("♣") ) {
//    		this.shape=shape;
//    	}else {
//    	    this.shape="♥";
//    	}
//    }
    	
    	
    	
    
	public int getNum() {
		return num;
	}

//	public void setNum(int num) {
//		this.num = num;
//	}

	public String getShape() {
		return shape;
	}

//	public void setShape(String shape) {
//		this.shape = shape;
//	}

}
