#   COMP250 - Final Project
The scope of the project is open-ended to your interpretation.  Any clarification and guidance can be provided, if necessary, to keep your brainstorming in range of what the instructor is looking for.  Programming should be a fun task for all!  Use this as a sandbox to explore a field of computer science that you are interested in and to what you can implement through your understanding of Java!
##  Purpose:
Accumulative understanding of topics covered in COMP250 during the Spring 2023 semester
##  Requirements:
Your final program assignment will need to:
-   Use at least One Class object with at least 5 attributes.  
    -   1 field will be for the Numerical Identification Number of the Class Object
    -   1 field will be for the Alphabetical Identification Name of the Class Object
-   A parent-child inheritence from the class object to another child object 
-	Class Objects adhere to OOP techniques; therefore, the following will be checked:
    -   All attribute/field has their respective getter/setter (accessor/mutator)
    -   Comparable Class is used from the Standard Java Library to sort a list of Class objects by their:
        -   Numerical Identification Number
        -   Alphabetical Identification Name
##  Objective:
The use of your own self-defined class object covers one’s understanding of Object Oriented programming.  
The use of the Comparable Class covers one’s understanding of using something already developed.  This addresses the engineer’s need to read and understand documentation written by another developer.  
##  Example Ideas:
The following is a list of examples and can be chosen if you are not able to come up with your own idea:
-   Database or Playlist for a Music Library
-   Database for a Restaurant’s Menu and Menu Prices
-   Database or Collection of Courses and, if necessary, Labs provided by a University
    -   Tangentially, Office and Lab spaces in use, which could provide if they would be available at a specific time slot
-   Database of Museum items from Paintings to Sculptures, etc.
-   Dictionary of Words consisting of the Word itself, letter count of Word, and the Definition(s) of the word
    -   Tangentially, Antonyms and Synonyms

##  The following is a written and provided example and cannot be used for your project submission.
###  Example Project:
The course textbook provides an example of how a Library may use Object Oriented Programming to achieve a number of tasks.  In doing so, a Library may need a program to inventory their resources.  Consider what elements you might find in a Library.  One of the easier objects to consider is a Book found on the Library shelves.  
A Book object may be defined as:  
| **class Book**   | **dataType**     |
|------------------|------------------|
| - BookID         | Integer          |
| - Title          | String           |
| - Author         | String or Object |
| - Genre          | String or Object |
| - Published Year | Integer          |
| - Page Count     | Integer          |

These are just a few fields and there are surely more to consider.  In this instance, the BookID field could be considered the “Numerical Identification Number” whereas the “Alphabetical Identification Name” could be a form of either the Title or Author; however as a disclaimer, many Book Titles may belong to One Author.  In this instance, it may be advisable to solely stick to Titles as the sortable field.  

The Library will want to be able to query their selection through various means, but for simplicity’s sake, we will want to query their selection Alphabetically.  What attributes should be considered for a Sort function?  Perhaps the Library will want to sort their collection of books by Authors or Publication Year.  

##  Rubric:
Quality is subjectively judged.  Merely turning in a file will not receive a full score.  Some items have a cascading effect with respect to grading.
| **Category**                                                                                                                 | **Grading** |
|------------------------------------------------------------------------------------------------------------------------------|-------------|
| Class Object contains 5 attributes with a mixture of Numeric and Characters/Strings                                          | 10%         |
| Attributes with Getters/Setters (also known as Accessors/Mutators)                                                           | 5%          |
| Class methods to assist with the functionality of your idea -  Example:  Add/Remove/Edit of created objects                  | 20%         |
| Implementation of Comparable Class                                                                                           | 15%         |
| Queryable set of Class Objects -  Console Output (Print) of Information before and after user is prompted to sort by a field | 20%         |
| Self-Documentation through means of appropriate comments and self-explanatory code                                           | 20%         |
| **Total:**                                                                                                                   | 100%        |
| **Bonus Credit:**  Implementation of additional features that provides uniqueness to your project.                           | 5%          |


Disclaimer of Bonus Credit:
Bonus Credits are awarded in recognition of good work, in addition to the max possible points.  As a reminder, quality is subjectively judged.  Merely turning in a file will not receive a full score. Bonus points are used not in "curving" but in possibly pushing an individual student's grade up.
