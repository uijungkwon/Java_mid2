package nested.test.ex1;
//point Inner 클래스 사용하기!
public class Library{ //모든 책을 관리하는 도서관//해당 객체에서 사용
    //어느 부분에 중첩 클래스 사용해야하는지 파악하기!!!!!
    private int count;
    private Book[] books;//도서 정보

    Library(int size){
        books =new Book[size];//도서 객체들 생성
        count = 0;
    }

    public void addBook(String title, String author){
        if(count < books.length){
            books[count] = new Book(title, author);
            count ++;
        }
        else System.out.println("도서관 저장 공간이 부족합니다.");
    }
    public void showBooks(){
        for(int i =0; i< count; i++){
            System.out.println("도서 제목: "+ books[i].title+", 저자:"+ books[i].author);
        }
    }


    private static class Book{//제목, 저자 정보를 포함한 책 객체
        private String title;
        private String author;
       Book(String title, String author){//생성자
            this.title = title;
            this.author = author;
        }

    }

}