# Arithmetic Operations GUI

## Overview
A Java GUI application that allows users to perform **basic arithmetic operations** on numbers.

## Features
- Supports operations like:
- - Sum two numbers
- - Invert a number
- - Find the largest and smallest numbers
- - Count even numbers in an array

- Uses Swing (MainJFrame.java) for the graphical user interface
- Displays calculated results in the GUI

## Project Structure
📂 Arithmetic_Operations_GUI
├── 📂 src
│   ├── 📂 pkg00825_luisalonsocendra_tarea1
│   │   ├── Main.java         # Entry point
│   │   ├── MainJFrame.java   # GUI with arithmetic operations
├── 📂 build                   # Compiled Java classes (ignored in Git)
├── 📂 dist                    # Packaged JAR file (ignored in Git)
├── build.xml                  # Apache Ant build file
├── manifest.mf                 # Manifest file for JAR packaging
├── .gitignore                  # Ignore compiled files, NetBeans configs
├── README.md                   # Project documentation

## Installation & Running

Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Ant (for building the project)
- NetBeans (optional for development)

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/Arithmetic_Operations_GUI.git
   cd Arithmetic_Operations_GUI
   ```
2. Compile and run using NetBeans **or** command line:
   ```sh
   javac -d bin src/pkg00825_luisalonsocendra_tarea1/*.java
   java -cp bin pkg00825_luisalonsocendra_tarea1.Main
   ```

## License
This project is licensed under the MIT License.
