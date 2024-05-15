import java.util.Scanner;
public class TestProgram {
    public static void main(String[] args) {
       
        ReferenceArchive referenceArchive = new ReferenceArchive();

    
        LendingService lendingService = new LendingService(referenceArchive);

      
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Menu:");
        System.out.println("1. Lend a Book");
        System.out.println("2. Lend a Journal");
        System.out.println("3. Print Programmer's Name");
        System.out.println("4. End Program");

        int options;


            System.out.println("Welcome to NEU Library: Please choose the following Modality: ");
            options = scanner.nextInt(); 

            switch (options) {
                case 1:
                    
                    lendingService.lendAudioBook("bookTitle");
                    break;
                case 2:
                    
                    lendingService.lendEJournal("journalTitle");
                    break;
                case 3:
                    System.out.println("3BSCS2- Software Engineering II");
                    System.out.println("Programmer - Harbey M. Edroso");
                    break;
                case 4:
                    System.out.println("Program Terminated!");
                    System.out.println("Programmer - Harbey M. Edroso");
                    break;
                default:
                    System.out.println("Invalid selection! Please try once more.");
            }
        }
    }
