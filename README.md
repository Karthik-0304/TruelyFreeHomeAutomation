# TruelyFreeHomeAutomation – QA Automation Framework

## 📌 Project Overview
**TruelyFreeHomeAutomation** is a Selenium-based automation testing framework developed to automate the end-to-end user flow of the TruelyFree Home Automation web application.

The objective of this project is to demonstrate the ability to:
- Automate real-world user workflows
- Build a scalable and maintainable automation framework
- Implement validations and assertions
- Generate execution reports
- Follow industry-standard automation practices

This framework validates application functionality by automating UI interactions and verifying expected outcomes.

---

# 🚀 Technologies Used

| Technology | Purpose |
|-------------|-------------|
| Java | Core programming language used for writing automation scripts |
| Selenium WebDriver | Automates browser interactions |
| TestNG | Test framework for test execution, annotations, and assertions |
| Maven | Dependency management and build automation |
| Extent Reports | Generates detailed HTML test execution reports |
| Git & GitHub | Version control and project hosting |
| ChromeDriver | WebDriver implementation for running tests on Chrome |

---

# 🏗️ Framework Design

The project follows a modular framework design that separates test logic, utilities, and configuration to improve maintainability and scalability.

```
TruelyFreeHomeAutomation
│
├── src/test/java
│   ├── tests
│   │      Test classes containing automation scenarios
│   │
│   ├── pages
│   │      Page Object Model classes representing web pages
│   │
│   ├── utils
│   │      Utility classes
│   │      - WaitUtil.java
│   │      - ScreenshotUtil.java
│   │      - TestListener.java
│
├── reports
│      extent-report.html
│
├── screenshots
│      Stores failure screenshots
│
├── testng.xml
│
└── pom.xml
```

---

# 🧠 Approach to the Solution

The automation solution was implemented using the **Page Object Model (POM)** design pattern to ensure a clean and scalable test structure.

### 1️⃣ Framework Setup
- Created a Maven-based Java project
- Added required dependencies such as Selenium WebDriver, TestNG, and Extent Reports

### 2️⃣ Page Object Model Implementation
Each webpage is represented as a separate class that contains:
- Web elements
- Page-specific actions

This improves:
- Code reusability
- Maintainability
- Readability

### 3️⃣ Test Implementation
Test cases were implemented using TestNG and include:
- Assertions to validate expected outcomes
- Test annotations for execution control

### 4️⃣ Utility Classes
Reusable utilities were implemented to simplify common operations.

**WaitUtil**
- Handles explicit waits for elements

**ScreenshotUtil**
- Captures screenshots when a test fails

**TestListener**
- Listens to TestNG events
- Generates Extent Reports
- Captures failure screenshots

### 5️⃣ Reporting
Extent Reports were integrated to provide a detailed HTML report containing:
- Test case status (Pass/Fail)
- Execution logs
- Failure screenshots
- Execution time

---

# ▶️ How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/Karthik-0304/TruelyFreeHomeAutomation.git
```

### Step 2: Open the Project

Import the project into any IDE such as:
- IntelliJ IDEA
- Eclipse
- Visual Studio Code

### Step 3: Install Dependencies

Run the following Maven command:

```bash
mvn clean install
```

### Step 4: Execute the Test Suite

Run the TestNG suite file:

```
testng.xml
```

or execute using Maven:

```bash
mvn test
```

---

# 📊 Test Reports

After execution, the automation report will be generated in:

```
/reports/extent-report.html
```

Open this file in a browser to view:
- Test execution summary
- Pass/Fail results
- Execution logs
- Screenshots for failed tests

---

# 📸 Failure Screenshots

If a test case fails, a screenshot is automatically captured and stored in:

```
/screenshots/
```

These screenshots help identify the cause of failures quickly.

---

# ✅ Key Features

- End-to-end UI automation
- Page Object Model framework
- Extent HTML reporting
- Screenshot capture on test failure
- Modular and reusable utilities
- Maven-based project structure

