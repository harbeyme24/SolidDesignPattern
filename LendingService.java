public class LendingService {
    private ReferenceArchive referenceArchive;

   
    public LendingService(ReferenceArchive referenceArchive) {
        this.referenceArchive = referenceArchive;
    }

    public void lendAudioBook(String title){
        Referencer book = referenceArchive.lendBook("JAVA Advanced");
        book.utilize(); 
       
        if (book != null) {
            book.utilize();
            System.out.println("The audio-book titled: JAVA Advanced has been borrowed.");
            System.out.println("Please note, you have 30 days to return this book. Thank you!");

        } else {
            System.out.println("Book is not found!");
        }
    }
    public void lendEJournal(String title){
        Referencer journal = referenceArchive.lendJournal("Journalism Programming 2024");
       if (journal != null) {
        journal.utilize();
        System.out.println("The e-journal titled: Journalism Programming 2024 has been checked out.");
        System.out.println("Please remember, you have 30 days to return this item. Thank you!");
        } else {
           System.out.println("Journal is not found!");
       }
    }
}
