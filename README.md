# SolidDesignPattern
# Problem Statement
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Create a repository in your GitHub account. Put your solution there. In the readMe file must include the problem statement, UML Class Diagram of Proposed solution.

Make sure you have a TestProgram that will validate the proposed refactored codes.

# UML Diagram

# Run JAVA
1. Lend a Book
<img width="1728" alt="Screenshot 2024-05-15 at 12 52 28 PM" src="https://github.com/harbeyme24/SolidDesignPattern/assets/143273418/571f7590-dd45-4608-99d2-505ab0e99f8e">
2. Lend a Journal
<img width="1728" alt="Screenshot 2024-05-15 at 12 53 04 PM" src="https://github.com/harbeyme24/SolidDesignPattern/assets/143273418/bd1944dc-af70-4a0b-91f9-b365589c86fc">
3. Print Programmer's Name
<img width="1728" alt="Screenshot 2024-05-15 at 12 53 22 PM" src="https://github.com/harbeyme24/SolidDesignPattern/assets/143273418/6c3083e8-e9d9-4344-9979-d6b40a95c386">
4. Terminate Program
<img width="1728" alt="Screenshot 2024-05-15 at 12 53 45 PM" src="https://github.com/harbeyme24/SolidDesignPattern/assets/143273418/4295a565-56c8-4a80-b66b-a61f1d124515">
