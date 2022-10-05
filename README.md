# hotelsDXFrontend
**Hotels DX font-end automation**

**About the project:**
This project is part of my journey as QA automation student, the problem to solve is the follow:

Carolina is the head of sales at the DX Hotels travel agency:
https://js.devexpress.com/Demos/DXHotels/#home and as part of the tasks that
she has to do, is to verify the rates charged to customers; by way of
that she does a search for the hotels with the cheapest rate in the
different destinations offered and validates that the total price is correct. The problem
is that Carolina handles many clients nationwide so she requires
from an automation analyst to help you validate this information before
to take the plans to PDN.

**_Notes:_**

1. [ ] **All project work is on the Develop branch**
2. [ ] **The project was created and executed into a windows system.**

**Features:**

| Feature                       | Scenario                                 |
|-------------------------------|------------------------------------------|
| findBestPrice.feature.feature | *Find the cheaper price through the page |


Base URL: https://js.devexpress.com/Demos/DXHotels/#home

**Previous requirements and Set up:**
To make sure that everything goes ok, to execute the project you need to have:

* Java, JDK version 1.8.0.33
* Maven, version 3.8.6 (As environment variable)
* JUnit5
* Selenium framework
* Serenity BDD
* Cucumber framework
* IDE

**Design pattern:**
The design pattern used is Screen play, applying good practices with BDD methodology.

**Execution:**
There are two ways to execute the project:

Individually:
Each feature has its own runner class, so you are able to execute every feature individually.

| Feature                         | Runner          |
|---------------------------------|-----------------|
| findBestPrice.feature.feature   | BestPriceRunner |

Parallel:
You just input this command into the console:

**mvn clean verify serenity:aggregate**

**Reports:**
We have reports to check once you run the tests, to view reports you need to go to the target directory that is
generated every time when an individual test or parallel test is executed.

Path to get reports in target directory:
index.html

**Author:**
Edwin Cuadro
QA Junior. 

