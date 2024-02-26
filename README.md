# This project is an automated test suite for Amazon.in using Cucumber, Selenium, Java, Page Object Model, and Maven framework.

# Pre-requisites
* Java 8 or higher installed.
* Maven installed.
* Chrome Browser installed.

# Setup
1. Clone this repository.
2. Navigate to the project directory.
3. Run mvn clean install to install dependencies.
4. Running the Tests
5. Navigate to the project directory.
Run mvn test to execute the test suite.

# Test Steps
1. Navigate to Amazon.in homepage.
2. Click on Fashion and Click on Men’s.
3. Filter by Average customer review of 4 stars and Up.
4. Filter by price 1000-5000.
5. Select Puma and Allen Solly in Brands.
6. Count the number of results in the first page and log it to console.
7. Click second product and add it to Cart.
8. Validate Number on the Cart is increased by 1.

# Guidelines
* Verification and Assertions are added on each action to confirm if it’s successful.
* Best practices and coding standards are followed throughout the project.
* Screenshots are captured on Failure.
* Screenshot is captured at the end of step 6.

# Folder Structure
src/main/java: Contains the Java code for the Page Object Model.
src/test/java: Contains the test cases written in Cucumber.
src/test/resources: Contains the feature files and cucumber runner class.

# Contributor
**Santhosh Krishnakumar**
