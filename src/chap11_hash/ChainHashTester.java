package chap11_hash;

import java.util.Scanner;

public class ChainHashTester {
	static Scanner sc = new Scanner(System.in);
	
	static class Data {
		static final int NO = 1;
		static final int NAME = 2;
		
		private Integer no;
		private String name;
		
		Integer keyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide+" 할 데이터를 입력하세요.");
			if((sw|NO) == NO) {
				System.out.print("번호 : ");
				no = Integer.parseInt(sc.nextLine());
			}
			
			if((sw|NAME)==NAME) {
				System.out.print("이름 : ");
				name = sc.nextLine();
			}
		}
	}// end class Data
	
	enum Menu {
		ADD("추가")
		,REMOVE("삭제")
		,SEARCH("검색")
		,DUMP("출력")
		,TERMINATE("종료");
		
		private final String message;
		
		static Menu MenuAt(int idx) {
			for(Menu m : Menu.values()) {
				if(m.ordinal() == idx) return m;
			}
			return null;
		}
		
		Menu(String string) {
			message = string;
		}
		
		String getMessage() {
			return message;
		}
	}// end enum Menu
	
	static Menu SelectMenu() {
		int key;
		do {
			for(Menu m : Menu.values()) {
				System.out.printf("(%d) %s",m.ordinal(),m.getMessage());
			}
			System.out.print(" : ");
			key = Integer.parseInt(sc.nextLine());
		} while(key<Menu.ADD.ordinal()||key>Menu.TERMINATE.ordinal());
		
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu;
		Data data;
		Data temp = new Data();
		
		ChainHash<Integer, Data> hash = new ChainHash<>(13);
		
		do {
			switch(menu = SelectMenu()) {
			case ADD :
				data = new Data();
				data.scanData("추가", Data.NO|Data.NAME);
				hash.add(data.keyCode(), data);
				break;
			case REMOVE :
				temp.scanData("삭제", Data.NO);
				hash.remove(temp.keyCode());
				break;
			case SEARCH :
				temp.scanData("검색", Data.NO);
				Data t = hash.search(temp.keyCode());
				if(t!=null) {
					System.out.println("해당 키값의 데이터는 "+t.toString());
				} else {
					System.out.println("해당 키값의 데이터가 없습니다.");
				}
				break;
			case DUMP :
				hash.dump();
				break;
			}
		} while(menu!=Menu.TERMINATE);
	}

}
