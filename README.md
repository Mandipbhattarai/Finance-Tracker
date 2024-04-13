# PIMPRI CHINCHWAD EDUCATION TRUST’s
## PIMPRI CHINCHWAD COLLEGE OF ENGINEERING
NBA Accredited | NAAC Accredited with ‘A’ Grade | An Autonomous Institute | AICTE Approved | ISO 9001:2015 Certified | Permanently Affiliated to SPPU, Pune

## PROJECT REPORT
on
**“Finance Tracker”**
Developed by:
- Mr. Mandip Bhattarai (122B1B028)
- Mr. Atharv Bhore (122B1B032)
- Mr. Nishant Bhakar (122B1B025)

Under the Guidance of:
Prof. Mr. Rahul Patil
Department of Computer Engineering (2023-2024)

## Abstract
The "Finance Tracker" project is designed to assist users in managing their personal finances efficiently. Developed using Java Swing for the frontend and Oracle SQL for the backend, the application offers a user-friendly interface for tracking various financial transactions and expenses.

The system comprises two main components: user management and transaction tracking. The user management module allows users to register an account with a unique username, password, and email address, providing a secure environment for accessing their financial data. Once registered, users can log in to the system to view and manage their financial transactions.

The transaction tracking module enables users to record and categorize their transactions, including income, expenses, and balance. Each transaction is associated with relevant details such as name, type, category, amount, and date. Users can easily see all transactions based on criteria such as date range, transaction type, or category, facilitating comprehensive financial analysis and budgeting.

Furthermore, the application ensures data integrity and security through the implementation of foreign key constraints in the backend database, maintaining referential integrity between user accounts and their associated transactions.

In summary, the "Finance Tracker" project provides a robust solution for individuals seeking to monitor and optimize their financial activities, leveraging Java Swing and Oracle SQL to deliver a seamless user experience with robust backend functionality.

## Introduction
In today's fast-moving world, effective financial management is important for individuals to achieve their financial goals and secure their financial future. Whether it's tracking expenses, monitoring income, or planning budgets, having access to intuitive tools can make all the difference. Recognizing this need, the "Finance Tracker" project aims to provide a solution for individuals to streamline their financial management processes.

Built with Java Swing and Oracle SQL, this project isn't just about numbers. It's about making managing money easy and even a little fun. You'll get a neat and simple screen to look at, thanks to Java Swing, and your data will be safe and sound in the background, thanks to Oracle SQL.

But more than that, "Finance Tracker" is about putting you in control. It's about giving you the tools to understand your finances better and make smarter decisions. So, whether you're saving up for something special or just trying to stay on top of your bills, "Finance Tracker" has got your back.

In summary, the "Finance Tracker" project helps individuals with the tools to achieve financial success. By combining innovative technology with user-centric design principles, the application aims to revolutionize the way individuals manage their personal finances, making financial management more accessible, intuitive, and effective than ever before.

## Software Requirement Specification
**Introduction**
Overview: The "Finance Tracker" project aims to assist users in managing their personal finances effectively. The application will utilize Java Swing for the frontend and Oracle SQL for the backend, providing a user-friendly interface for tracking financial transactions and expenses.

**Purpose:** The purpose of this Software Requirements Specification (SRS) document is to define the requirements of the "Finance Tracker" project, outlining its objectives, functionalities, and constraints.

**Scope:** The scope of the "Finance Tracker" project includes the development of a user management module for account registration and login, a transaction tracking module for recording and categorizing financial transactions. The project does not support advanced financial analysis or investment management functionalities.

**Functional Requirements:**
- **User Registration:**
  - Users can sign up for the application by providing basic information like username, password.
  - The system ensures unique usernames and secure password storage.
  - Upon successful registration, user details are stored securely for future logins.

- **Expense Entry:**
  - Users can input their expenses, including details like name, amount, date, and category.
  - Common expense categories are predefined for easy categorization.

- **Income Tracking:**
  - Users can log their sources of income, with details such as source name, amount, date, and category.
  - Income transactions are accurately recorded and categorized for analysis.

- **Budget Management:**
  - Users can set budgetary goals by defining categories and allocating funds.

- **Category Customization:**
  - Users can customize expense and income categories to suit their needs.
  - Options include adding, editing, or deleting categories.
  - Customizations allow users to tailor categories to their financial activities.

- **Reports:**
  - Users can generate visual summaries and analyses of their financial data. Reports include expense summaries, income summaries, and budget vs. actual comparisons.

- **Security Features:**
  - User authentication mechanisms prevent unauthorized access.
  - Sensitive data like user credentials and financial transactions are encrypted for storage and transmission.
  - Access control mechanisms restrict user privileges based on roles and permissions.

**Non-Functional Requirements:**
1. **Performance:**
   - Design the system to ensure a good response time for an optimal user experience and to accommodate a scalable number of users and transactions.
2. **Security:**
   - Utilize secure authentication protocols and conduct regular security checks to ensure data.
3. **Usability:**
   - Create an interface that is easy to use and understand, making sure it is accessible for users of all technical abilities.
4. **Reliability:**
   - Implement regular data backups and recovery processes to prevent data loss.

**System Requirements:**
1. **Hardware Requirements:**
   - PC with Intel Core i7 with 16 GB RAMs.
2. **Software Requirements:**
   - Microsoft Windows® 10 as Operating System.
   - Java NetBeans 8.2 as Front-end Development environment.
   - MySQL 5.7 as Back-end Server with Database for Testing.
   - MS-Word for documentation

**Conceptual Design using ER features:**
Conceptual design using Entity-Relationship (ER) features involves creating a high-level representation of the data model for your system. Here's how you can design the ER diagram for your "Finance Tracker" project:
- **Entities:**
  - **User:**
    - Attributes: UserID (Primary Key), Username, Password, Email.
  - **Transaction:**
    - Attributes: TransactionID (Primary Key), TransactionName, Type, Category, Amount, CustomerID (Foreign Key), TransactionDate
- **Relationships:**
  - User - Transaction (One-to-Many):
    - Each user can have multiple transactions.
    - Each transaction belongs to one user.
    - Relationship Attribute: None (Implicit relationship based on the CustomerID Foreign Key in the Transaction table)

**Relational Model in appropriate Normalize Form:**
To provide a relational model in the appropriate normalized form for the "Finance Tracker" project, we'll first represent the entities and their attributes in tabular form. Then, we'll ensure that each table adheres to the rules of normalization.
- **Entities and Attributes:**
  - User:
    - UserID (Primary Key)
    - Username
    - Password
    - Email
  - Transaction:
    - TransactionID (Primary Key)
    - TransactionName
    - Type
    - Category
    - Amount
    - CustomerID (Foreign Key)
    - TransactionDate
- **Relational Model:**
  - User Table (1NF):

**Normalization:**
Both tables are currently in the First Normal Form (1NF) because they contain atomic values in each cell and have unique identifiers for each row.
Second Normal Form (2NF):
To achieve 2NF, we need to ensure that each non-key attribute is fully functionally dependent on the primary key.
In our current tables, both User and Transaction are already in 2NF as there are no partial dependencies. Each attribute depends on the entire primary key.
Third Normal Form (3NF):
To achieve 3NF, we need to eliminate transitive dependencies, where non-key attributes depend on other non-key attributes.
In the Transaction table, Category may be a transitive dependency on Type. To normalize, we would create a separate Category table and reference it from the Transaction table using a CategoryID foreign key.
Similarly, TransactionName may be a transitive dependency on Type. We can normalize by creating a separate table for types and reference it from the Transaction table.
Example:

Now, the relational model is in the appropriate normalized form, adhering to the rules of the Second and Third Normal Forms (2NF and 3NF).

**UML Diagrams**
- **Activity Diagram:**
- **Class Diagram:**
- **Sequence Diagram:**

**Graphical User Interface (GUI)**
- **Landing Page:**
- **Home Page:**
- **LogIn Page:**
- **SignUp Page:**
- **Transaction page:**

**Test Cases**
Some example test cases for the "Finance Tracker" application, covering various functionalities
- **User Registration:**
  - Test Case 1: Verify that a user can successfully register with valid username, password, and email.
  - Test Case 2: Verify that the system prevents registration with an existing username.
  - Test Case 3: Verify that the system prevents registration with an invalid email format.
  - Test Case 4: Verify that the system enforces password strength requirements during registration.
- **Expense Entry:**
  - Test Case 5: Verify that a user can successfully add a new expense with valid details.
  - Test Case 6: Verify that the system correctly calculates and displays the total amount spent after adding multiple expenses.
  - Test Case 7: Verify that the system prevents adding an expense with a negative amount.
  - Test Case 8: Verify that the system provides appropriate validation messages for missing or invalid input fields Income Tracking:
- **Income Tracking:**
  - Test Case 9: Verify that a user can successfully add a new income source with valid details.
  - Test Case 10: Verify that the system correctly calculates and displays the total income earned after adding multiple income sources.
  - Test Case 11: Verify that the system prevents adding an income source with a negative amount.
  - Test Case 12: Verify that the system provides appropriate validation messages for missing or invalid input fields.
- **Budget Management:**
  - Test Case 13: Verify that a user can set up a budget category and allocate funds to it.
  - Test Case 14: Verify that the system correctly tracks expenses against budget categories and updates the remaining balance accordingly.
  - Test Case 15: Verify that the system sends a notification when the user exceeds the budget threshold for a specific category.
- **Category Customization:**
  - Test Case 16: Verify that a user can add a new custom expense category.
  - Test Case 17: Verify that the system prevents adding a duplicate expense category.
  - Test Case 18: Verify that a user can delete an existing expense category.
- **Security Features:**
  - Test Case 19: Verify that user authentication works correctly with valid credentials.
  - Test Case 20: Verify that the system prevents access to restricted features without proper authentication.
  - Test Case 21: Verify that sensitive data, such as user passwords, are securely encrypted in the database.

**Conclusion**
In conclusion, the "Finance Tracker" project offers a user-friendly solution for effectively managing personal finances. With robust features, intuitive design, and strong security measures, the application empowers users to track expenses, manage budgets, and make informed financial decisions. Moving forward, ongoing testing and user feedback will ensure continuous improvement, further enhancing the application's utility and user satisfaction.

**References**
- [DataFlair Java Expense Tracker](https://data-flair.training/blogs/java-expense-tracker/)
- [Oracle LiveLabs](https://apexapps.oracle.com/pls/apex/r/dbpm/livelabs/run-workshop?p210_wid=3743&p210_wec=&session=14008421914970)
- [Java Expenses and Incomes Tracker App Source Code](https://1bestcsharp.blogspot.com/2023/08/java-expenses-and-incomes-tracker-app-source-code.html)

**License**
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
