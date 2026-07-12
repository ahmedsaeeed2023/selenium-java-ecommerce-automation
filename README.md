# Selenium Web Automation – LambdaTest E-Commerce

## 📋 Overview
Automated UI testing framework built with **Selenium WebDriver** and **Java**, applying the **Page Object Model (POM)** design pattern to test key user workflows on the LambdaTest E-Commerce Playground.

**Site under test:** [LambdaTest E-Commerce Playground](https://ecommerce-playground.lambdatest.io/)

## 🎯 Objective
To automate repetitive and critical user flows (navigation bar, cart, component page interactions) for faster regression testing and to demonstrate practical test automation skills using industry-standard design patterns.

## 🛠️ Tech Stack
- **Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Design Pattern:** Page Object Model (POM)
- **Build Tool:** Maven
- **Test Runner:** TestNG

## ✅ Automated Areas
- Navigation Bar interactions
- Cart functionality
- Component page workflows

## 📁 Project Structure

\```
src/
├── main/java/org/example/
│   └── Main.java
└── test/java/
    ├── baseTest/
    │   └── Basetest              # Shared setup/teardown (WebDriver init, config)
    ├── pages/                    # Page Object classes
    │   ├── ComponentPage
    │   ├── HomePage
    │   ├── NavBarCartBage
    │   └── NavBarPage
    └── tests/                    # TestNG test classes
        ├── ComponentTests
        └── navBarTest
pom.xml
\```

## ▶️ How to Run
```bash
mvn clean test
```

## 🔑 Key Skills Demonstrated
- Selenium WebDriver architecture & element locators (ID, XPath, CSS)
- Page Object Model for maintainable automation code
- Base Test class design for shared setup/teardown across test classes
- Handling waits (implicit/explicit)
- Java OOP applied to test automation
- TestNG for test execution and reporting
- Maven for dependency & build management

---
**Author:** Ahmed Saeed Hemdan | [LinkedIn](https://www.linkedin.com/in/ahmed-saeed-hemdan/)
