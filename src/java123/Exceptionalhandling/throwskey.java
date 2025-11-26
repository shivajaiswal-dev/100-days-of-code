package java123.Exceptionalhandling;


class Library{
    int availablebooks=3;
    public void borrowBook(int booksRequestedCount) throws Exception{
  if(booksRequestedCount>availablebooks){
  throw new Exception("Not enough books available");}
        if(booksRequestedCount < 0){
            throw new Exception("Request atleast one book eooks ");}
    }
    }
public class throwskey {
    static void main(String args[]) throws Exception {
        Library library = new Library();
       try{ library.borrowBook(-9);
    }catch(Exception e){ //e.printStackTrace();
       System.out.println("Exception handle  "+e.getMessage());}
    }
}
