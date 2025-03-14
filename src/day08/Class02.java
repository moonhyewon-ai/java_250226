package day08;

public class Class02 {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		myCar.printCar();
		myCar.setName("모닝");
		myCar.setColor("검정");
		myCar.setYear("2025");
		myCar.printCar();
		myCar.speedPrint();
		myCar.power();
		myCar.setSpeed(150);
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.setSpeed(20);
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.power();
		myCar.speedPrint();
		
	}

}
class Car{
	//멤버변수 : name(String), color(String), year(String), power(boolean) , speed(int) => private 선언
	private String name;
	private String color;
	private String  year;
	private boolean power;
	private int speed;
	
	//메서드 : public
	//현재 멤버변수의 상태 출력
	public void printCar() {
		System.out.println(name+"("+color+") :"+year);
	}
	
	public void speedPrint() {
		System.out.println(power ? "ON" : "OFF" + " / " + speed);
	}
	//시동 켜기 / 끄기 메서드 (버튼 하나로 둘 다 가능)
	//power 꺼져있으면 => 켜기
	//power 켜져있으면 => 끄기
	public void power() {

		if(speed == 0) {
			power = !power;
		}else {
			System.out.println("error!!");
		}
	}
			//속도 up()
	public void speedUp() {
		if(power) {
			if(speed>=200) {
				speed=200;
			}else {
				speed +=10; 
			}
			speedPrint();
		}
	}
	        
	
	//속도 down()
	public void speedDown() {
		if(power) {
			if(speed<0) {
				speed=0;
			}else {
				speed -=10; 
			}
			speedPrint();
		}
	}
			
	//getter/setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public boolean isPower() {
			return power;
		}

		public void setPower(boolean power) {
			this.power = power;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
	}
	



import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tv myTv = new Tv();
        myTv.setBrand("Samsung"); // 브랜드 설정

        // TV 전원 켜기
        myTv.power();

        while (true) {
            myTv.volPrint(); // 현재 상태 출력

            // 채널 변경
            System.out.println("채널을 바꾸려면 엔터를 누르세요.");
            scanner.nextLine();
            myTv.chUp(); // 채널 올리기

            // 볼륨 변경
            System.out.println("볼륨을 올리려면 엔터를 누르세요.");
            scanner.nextLine();
            myTv.volUp(); // 볼륨 올리기

            // 종료 여부 확인
            System.out.println("다시 실행하려면 엔터를 누르세요. 종료하려면 'q'를 입력하세요.");
            String input = scanner.nextLine();

            if (input.equals("q")) { // 'q'를 입력하면 종료
                System.out.println("프로그램 종료");
                break; // 반복문 종료
            }
        }
    }

    // Tv 클래스 정의
    static class Tv {
        private String brand;
        private boolean power;
        private int ch = 1; // 채널 기본값 설정
        private int vol = 5; // 볼륨 기본값 설정

        public void volPrint() {
            System.out.println("브랜드 : " + brand);
            System.out.println("전원 상태: " + (power ? "켜짐" : "꺼짐"));
            System.out.println("채널 : " + ch);
            System.out.println("볼륨 : " + vol);
        }

        public void power() {
            if (power) {
                power = false;
                System.out.println("전원 꺼짐");
            } else {
                power = true;
                System.out.println("전원 켜짐");
            }
        }

        public void chUp() {
            if (power) {
                if (ch >= 30) {
                    ch = 1; // 30을 넘으면 1로 순환
                } else {
                    ch++;
                }
                System.out.println("채널: " + ch);
            }
        }

        public void chDown() {
            if (power) {
                if (ch <= 1) {
                    ch = 30; // 1에서 내리면 30으로 순환
                } else {
                    ch--;
                }
                System.out.println("채널: " + ch);
            }
        }

        public void volUp() {
            if (power) {
                if (vol < 10) {
                    vol++;
                }
                System.out.println("볼륨: " + vol);
            }
        }

        public void volDown() {
            if (power) {
                if (vol > 0) {
                    vol--;
                }
                if (vol == 0) {
                    System.out.println("음소거");
                } else {
                    System.out.println("볼륨: " + vol);
                }
            }
        }

        // Getter 및 Setter
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public boolean isPower() {
            return power;
        }

        public void setPower(boolean power) {
            this.power = power;
        }

        public int getCh() {
            return ch;
        }

        public void setCh(int ch) {
            this.ch = ch;
        }

        public int getVol() {
            return vol;
        }

        public void setVol(int vol) {
            this.vol = vol;
        }
    }
}















