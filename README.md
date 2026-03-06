## QA Automation Assessment – End-to-End User Flow

## 1. Project Overview

This project automates an **End-to-End user flow** for the TFM Web Application.

Application URL:
https://trulyfreehome.dev/

The automation validates the main workflow starting from **user signup → product selection → checkout → order placement → logout**.

---

# 2. Automation Tools Used

| Tool               | Purpose                       |
| ------------------ | ----------------------------- |
| Selenium WebDriver | Browser automation            |
| Java               | Programming language          |
| TestNG             | Test execution and assertions |
| ChromeDriver       | Run tests on Chrome           |
| Maven              | Dependency management         |

---

# 3. Framework Type

This project uses a **basic Selenium TestNG framework without Page Object Model (POM)**.

Automation steps are implemented directly inside the **test class**.

---

# 4. Project Folder Structure

```
QA-Automation-TFM
│
├── src
│   └── test
│       └── java
│           └── tests
│               └── EndToEndFlowTest.java
│
├── pom.xml
│
├── testng.xml
│
└── README.md
```

---

# 5. Test Scenario Covered

The automated script performs the following workflow:

### Module 1 – Signup

* Click **Yes. Sign me up for Free Today**
* Enter phone number
* Accept Terms & Conditions
* Click Continue
* Enter OTP
* Enter First Name, Last Name, Email
* Click Done

Expected Result:
User account is created and redirected to the **Home Page**.

---

### Module 2 – Navigate to Brand

* Open side menu
* Click **Brands**
* Select a brand

Expected Result:
User navigates to **Brand Product List Page**.

---

### Module 3 – Product Selection

* Select any product from the list

Expected Result:
**Product Details Page (PDP)** loads successfully.

---

### Module 4 – Add Product to Cart

* Click **Add to Cart**

Expected Result:
Cart icon count is updated.

---

### Module 5 – Cart Validation

* Click Cart icon
* Verify product details
* Click **Proceed to Checkout**

Expected Result:
User navigates to **Checkout page**.

---

### Module 6 – Add Shipping Address

Shipping Address Used:

Address: 24 Battery Pl
City: New York
State: New York
Zip Code: 10004
Country: United States of America

Expected Result:
Address is saved successfully.

---

### Module 7 – Payment

Test Card Details:

Card Number: 4242 4242 4242 4242
CVV: 111
Expiry: 05/2028

Steps:

* Add card
* Click **Confirm Order**
* Close popup if appears

Expected Result:
**Thank You Page** is displayed.

---

### Module 8 – Order Page Validation

* Navigate to **My Orders**
* Capture **Order ID**

Expected Result:
Order ID is generated and visible.

---

### Module 9 – Logout

* Navigate to Profile
* Click **Sign Out**

Expected Result:
User is logged out successfully.

---

# 6. Test Data Used

OTP: **1111**

Shipping Address:

Address: 24 Battery Pl
Zip Code: 10004
City: New York
State: New York
Country: United States of America

Payment Details:

Card Number: 4242 4242 4242 4242
CVV: 111
Expiry: 05/2028

---

# 7. How to Run the Project

Step 1
Clone the repository

```
git clone <repository-url>
```

Step 2
Open the project in **IntelliJ IDEA / Eclipse**

Step 3
Install dependencies using **Maven**

Step 4
Run the test using **TestNG**

Run:

```
testng.xml
```

or run the test class:

```
EndToEndFlowTest.java
```

---

# 8. Application Home Page

https://trulyfreehome.dev/

---

# 9. Author

Automation created as part of the **QA Automation Assessment Task**.
