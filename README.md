# Bounded Knapsack Problem

This project is a Spring Boot application that demonstrates the implementation of the Bounded Knapsack Problem using Maven as the build tool.

## Getting Started

## How to run the Application
**Prerequisites:**
- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher
- An IDE such as IntelliJ IDEA or Eclipse (optional)

**Steps to run the application:**
- TestingApplication.kt contains a main method to run the application. It will execute the bounded knapsack algorithm with sample data.

## Project Structure 
1. **src/main/kotlin**: Contains the Java source code for the application.
2. **src/main/kotlin/Backpack.kt**: Contains the implementation of the UnBounded Knapsack Problem algorithm.
2. **src/main/resources**: Contains application configuration files.
3. **pom.xml**: Maven configuration file that manages project dependencies and build settings.
4. **README.md**: Project documentation.


### Sample Input and Output Explanation

1. **Bag Capacity: 27**
    - Items packed: 4 Bags of Apples, 2 Bread, 1 Peanut Butter, 1 Trail Mix.

2. **Bag Capacity: 38**
    - Items packed: 6 Bags of Apples, 1 Bread, 2 Peanut Butter, 1 Trail Mix.

3. **Bag Capacity: 15**
    - Items packed: 1 Bag of Apples, 2 Bread, 1 Peanut Butter, 2 Trail Mix.

4. **Bag Capacity: 100**
    - Items packed: 18 Bags of Apples, 2 Bread, 1 Peanut Butter, 2 Trail Mix.

5. **Bag Capacity: 1000**
    - Items packed: 198 Bags of Apples, 2 Bread, 1 Peanut Butter, 2 Trail Mix.

6. **Bag Capacity: 11**
    - Items packed: 1 Bag of Apples, 1 Bread, 1 Peanut Butter, 1 Trail Mix.

7. **Bag Capacity: 12**
    - Items packed: 1 Bag of Apples, 2 Bread, 1 Peanut Butter, 1 Trail Mix.

8. **Bag Capacity: 14**
    - Items packed: 1 Bag of Apples, 1 Bread, 1 Peanut Butter, 2 Trail Mix.

9. **Bag Capacity: 10,000**
    - Items packed: 1998 Bags of Apples, 2 Bread, 1 Peanut Butter, 2 Trail Mix.

10. **Bag Capacity: 5**
    - **Error**: Capacity too small to fit one of each item.