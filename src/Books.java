public class Books {
    public static void main(String[] args) {
        Book book = new Book("Автор","Название книги",500);
        Book book1 = new Book("Автор","Название книги",300);
        Library library = new Library();
        library.put(book,4);
        library.get(book,3);
        library.put(book1,10);
        library.get(book1,13);






    }
    public static class Book {
        public int coci;
        public String title;
        public String author;
        public int pagesNum;

        public Book(String title, String author, int pageNum) {
            this.author = author;
            this.title = title;
            this.pagesNum = pageNum;

        }
    }public static class Library{
            int b = 0;
            public void put(Book book, int quantity){
                if (b<=30& quantity<=30){
                    b = b + quantity;
                    book.coci = book.coci+quantity;
                    System.out.println("Этой книги " + book.coci + " штук ");


                }else {
                    System.out.println("Места в библтотеке нет ");
                }
            }
            public int get(Book book, int quantity){
                if (b>0& quantity<=book.coci){
                    b = b - quantity;
                    book.coci = book.coci -quantity;
                    System.out.println("Этой книги осталось " + book.coci +" штук");
                }else {
                    System.out.println("Такого колличества нет ");
                }return quantity;
            }
        }



    }

