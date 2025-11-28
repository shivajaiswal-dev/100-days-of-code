package java123.Exceptionalhandling;

/*
class BookUnavailableException extends Exception{

    public BookUnavailableException(String message  ) {
        super(message);

    }
}
class InvalidmemberException extends Exception{
    public InvalidmemberException(String message){
        super(message);
    }
}
class Library1{
    int availablebooks=3;
public void borrowBook(int booksRequestedCount,String member){

       if(booksRequestedCount > availablebooks)
           throw new BookUnavailableException("Not enough books available" );
           if(booksRequestedCount < 0){
               throw new BookUnavailableException("Request atleast one book eooks ");}


if(member==null || member.isEmpty()){
    throw new InvalidmemberException("Member Invalid");
}

}}
public class LibraryExample {
    static void main(String args[]) {
  Library1 library = new Library1();
 try{ library.borrowBook(2,"");
     library.borrowBook(70,"Rohn");
     library.borrowBook(1,"");

 }catch(BookUnavailableException e) {
   //  e.printStackTrace();
  }
 catch(Exception e){
     e.printStackTrace();
        System.out.println("exception"+e.getMessage());
}}}
*/