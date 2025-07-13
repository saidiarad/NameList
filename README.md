# NameList (Kotlin)
A user-friendly console program designed to help you keep track of names. It allows you to easily add new names, view all saved names in a list, and automatically saves your list so your data is available every time you restart the application. Duplicate names are not allowed.

<br>

<p align="center">
  <a href="#overview">Overview</a> •
  <a href="#key-features">Key Features</a> •
  <a href="#how-to-run">How To Run</a> •
  <a href="#my-journey">My Journey</a> •
  <a href="#future-enhancements">Future Enhancements</a>
</p>

<br>

## Overview

<br>

This application allows you to maintain a dynamic list of names. What makes it special is its ability to remember your names even after the program closes, and it ensures that every name in your list is unique. It's a foundational project that demonstrates core programming concepts in Kotlin.

<br>

## Key Features

<br>

* **Add Unique Names**
  - Easily input new names into your list. The application intelligently checks for duplicates (case-insensitive) to ensure your list remains clean and organized.
* **View All Names**
  - Display all currently saved names in a clear, numbered format directly in the console.
* **Persistent Storage**
  - All your names are automatically saved to a local file (savedNames.txt) when you exit the program. This means your data is always there, ready for you the next time you launch the application.
* **Console-Based Interface**
  - Interact with the program through simple text commands in your terminal.
* **Cross platform**
  - Windows, macOS and Linux ready.

<br>


## How To Run

<br>

To get started, first clone the repository to your local machine:

```bash
$ git clone https://github.com/saidiarad/NameList
```

<br>

1. **Open in IntelliJ IDEA:**
   * Open IntelliJ IDEA.
   * Select ```File``` > ```Open...``` and navigate to the cloned project folder (e.g., ```NameList```).

<br>

2. **Run** ```Main.kt```:
   * Locate ```src/Main.kt``` in the Project explorer.
   * Click the green "Run" arrow next to the ```main``` function declaration.
   * The application will start in IntelliJ's console window.

<br>

> **To run this Kotlin console application, you'll also need:**
> - Java Development Kit (JDK) (version 11 or higher recommended)
> - IntelliJ IDEA Ultimate (or Community Edition)

<br>

## My Journey

<br>

This simple program is really special to me because it's the first time I've built something using code in a console window. I learned a lot by making it from scratch, like taking what you type, keeping lists of information, and even saving that information to a file so it's not lost when the program closes. 

I'm super excited about learning Kotlin. I love how it's modern, helps me avoid mistakes and can be used for many things like Android apps, websites, and more. 

This project is just the **start** of my **coding journey**. I can't wait to learn more about Kotlin and make even bigger, cooler programs!

<br>

## Future Enhancements

<br>

**I have several ideas for improving this application:**
* **Remove Names:** Add an option to delete specific names from the list.
* **Search Names:** Implement a feature to search for names within the list.
* **Sorting:** Allow users to sort the names alphabetically.
* **Error Handling:** Make file operations even more robust with detailed error messages.
