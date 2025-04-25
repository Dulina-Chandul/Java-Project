# 🏦 Core Banking CLI

A command-line banking application designed to simulate core banking functionalities using Java.

This project provides a practical environment for developers interested in contributing to a basic banking simulation, focusing on backend logic and command-line interaction.

---

## 📜 Project Description

Core Banking CLI is a Java application offering basic banking operations via a command-line interface. Users can interact with the system to manage accounts and perform transactions. The application aims to simulate essential banking workflows.

---

## ✨ Features

- Create new bank accounts.
- Deposit funds into accounts.
- Withdraw funds from accounts.
- Transfer funds between existing accounts.
- View account details and transaction history.

---

## 🛠️ Tech Stack

- Java
- Maven (Note: Build instructions currently use direct `javac`)
- JUnit 5 (for automated testing)

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) installed.

### Compile and Run

1.  Navigate to the project's root directory in your terminal.
2.  Compile the source code:
    ```bash
    javac -d out src/main/java/cse/school/codejam/*.java
    ```
3.  Run the application:
    ```bash
    java -cp out cse.school.codejam.Main
    ```

---

## 📁 Project Structure Overview

The project follows a standard Java structure, with key classes including:

| File                   | Description                                          |
|------------------------|------------------------------------------------------|
| AccountRepository.java | Manages storage and retrieval of account data.      |
| BankAccount.java       | Represents individual bank accounts and their logic. |
| BankService.java       | Implements core banking business logic.             |
| InputUtil.java         | Handles command-line interface (CLI) input.          |
| Main.java              | Main application entry point and CLI loop control.   |
| Transaction.java       | Represents a single banking transaction.             |
| TransactionLogger.java | Logs and displays transaction information.           |

*(Note: The project may currently contain bugs or areas needing refinement. Specific issues are best tracked via the repository's GitHub Issues tab.)*

---

## 🚩 How to Contribute

We welcome contributions to improve the Core Banking CLI! If you'd like to help:
1.  Identify bugs, inconsistencies, or areas for improvement within the codebase (check existing GitHub Issues or explore the application).
2.  Implement fixes or enhancements for these issues.
3.  Submit your solutions via Pull Requests (PRs) to the main repository, following standard contribution guidelines (e.g., clear commit messages, focused changes).

---

## 🧪 Testing & Validation

- An automated testing pipeline (using JUnit 5) is set up to run against submitted Pull Requests.
- These tests help ensure that contributions maintain or improve the core functionality and don't introduce regressions.
- Passing the automated checks is a key step for merging contributions.

---

## 🙏 Thank You!

We appreciate your interest in contributing to the Core Banking CLI project.
