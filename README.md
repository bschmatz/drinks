# Exercise 7 "drinks"

### About
This project uses the implemented methods and classes to work with different liquids (alcoholic and non-alcoholic).
Those liquids can be mixed and put into data structures like queues to organize them.
*More detailed description on the classes are below:*

-----------------
**Cocktail**:


The `Cocktail` class represents a specific type of drink that is composed of multiple liquids.
It extends the `Drink` class and provides methods to calculate the volume, alcohol percentage,
and determine whether the cocktail is alcoholic.
-------------
**DoubleQueue**:

The `DoubleQueue` class implements the `DoubleQueueInterface` and represents a queue
that can store `Double` objects. It provides methods to add elements to the queue, retrieve the
first element, remove the first element, and clear the queue.
-----------------
**Liquid**:

The `Liquid` class represents a liquid used in drinks. It contains information such as the name of the liquid,
its volume in liters, and its alcohol percentage.
------------------

**SimpleDrink**:

The `SimpleDrink` class represents a simple drink that consists of a single liquid. It extends the `Drink` class
and provides methods to get the volume, alcohol percentage, and determine whether the drink is alcoholic.
------------

**StringQueue**:

The `StringQueue` class implements the `IQueue` interface and represents a queue data structure that stores
strings. It provides methods to add elements to the queue, retrieve the first element, retrieve and remove the
first element, and check if the queue is empty.
-----------

## Group
- Benedikt Schmatz - **BS**
- Andreas Armanious - **AA**
- Daniel Zarnhofer - **DZ**

## Branches Overview

1) maven
    - [x] create initial file structure (**BS**)
    - [x] create initial gitignore (**BS**)
2) readme
    - [x] create README file (**DZ**)
    - [x] create task list (**DZ**)
    - [x] add project description (**DZ**)
3) maven_detail
    - [x] create pom.xml (**BS**)
    - [x] fill out developer details (**BS, AA, DZ**)
4) bug_hunt
    - [x] correct bugs in StringQueue class (**AA**)
    - [x] add test cases to StringQueue class (**AA**)
    - [x] update IQueue interface code structure ond format (**AA**)
5) drink
    - [x] create Cocktail class (**AA**)
    - [x] implement constructor (**AA**)
    - [x] implement getVolume() (**DZ**)
    - [x] implement getAlcoholPercent() (**BS**)
    - [x] implement isAlcoholic() (**BS**)
6) queue
    - [x] create DrinkQueueInterface interface (**BS**)
    - [x] create DrinkQueue class (**DZ**)
    - 6.1) queueDZ
       - [x] create constructor (**DZ**)
       - [x] implement add() (**DZ**)
    - 6.2) queueAA
      - [x] implement peek() (**AA**)
    - 6.3) queueBS
      - [x] implement remove() (**BS**)
7) javadoc
    - [x] document Liquid (**BS**)
    - [x] document StringQueue (**AA**)
    - [x] document DrinkQueue (**DZ**)
    - [x] document Cocktail (**BS**)
8) tests
    - [x] implement tests for Liquid (**BS**)
    - [x] implement tests for DrinkQueue (**DZ**)
    - [x] implement tests for Cocktail (**AA**)
    - [x] implement tests for SimpleDrink(**AA**)
    - [x] implement tests for DoubleQueue(**BS**)
9) double_queue
    - [x] create DoubleQueueInterface interface (**BS**)
    - [x] create DoubleQueue class (**DZ**)
    - 9.1) double_queueDZ
       - [x] create constructor (**DZ**)
       - [x] implement add() (**DZ**)
   - 9.2) double_queueAA
       - [x] implement peek() (**AA**)
   - 9.3) double_queueBS
       - [x] implement remove() (**BS**)
10) maven_site
    - [x] complete javadoc (**BS, AA, DZ**)
    - [x] complete tests (**BS, AA, DZ**)
    - [x] create site.xml (**AA**)
    - [x] create member1.md (**BS**)
    - [x] create member2.md (**AA**)
    - [x] create member3.md (**DZ**)
