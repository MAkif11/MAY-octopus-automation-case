# MAY Octopus Automation Case

This project is a Selenium + JUnit 5 based UI test automation framework built with Maven.

## 🔧 Tech Stack

- Java 11
- Maven
- Selenium 4
- JUnit 5
- ChromeDriver

---

## 📁 Project Structure

src  
├── main  
│   └── java/com/may/octopus  
│        ├── config  
│        ├── driver  
│        ├── pages  
│        │     ├── common  
│        │     ├── saucedemo  
│        │     ├── demoblaze  
│        │     └── playground  
│  
└── test  
└── java/com/may/octopus  
├── base  
└── tests  
├── saucedemo  
├── demoblaze  
└── playground

---

## 🌐 Tested Websites

### SauceDemo
- Valid login
- Invalid login
- Inventory page validation

### DemoBlaze
- Add product to cart
- Cart validation
- Place order modal validation

### UI Testing Playground
- Dynamic element handling
- Synchronization scenarios
- Input interaction validation

---

## ⚙️ Configuration

Configuration file:

src/main/resources/config.properties

---

## ▶️ How to Run

Run all tests:

mvn test

Run specific test class:

mvn "-Dtest=com.may.octopus.tests.demoblaze.Tests" test

Run specific test method:

mvn "-Dtest=com.may.octopus.tests.demoblaze.Tests#shouldAddProductToCart" test

---

## 🧠 Framework Design

- Centralized DriverFactory
- Thread-safe DriverManager
- BaseTest for lifecycle management
- BasePage with explicit wait abstraction
- Page Object Model implementation
- Reusable and maintainable structure
- No test dependency on execution order

---

## 👤 Author

Mehmet Akif Yıldırım  
Software QA Engineer