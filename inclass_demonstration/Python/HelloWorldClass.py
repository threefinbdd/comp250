'''
    A sample python program showcasing a class object
    and the object's respective attributes.

    A toString() method allows the object to be used in a 
    print() statement.
    a printString() method allows the object to be output
    to the standard output.
'''

class Student:
    def __init__(self, name, university, age, major):
        self.name = name
        self.university = university
        self.age = age
        self.major = major

    def toString(self):
        return {
            str(self.name) + " is a student at " +
            str(self.university) + " studying " +
            str(self.major) + " with the age of " +
            str(self.age) + "."
        }

    def printString(self):
        print({
            str(self.name) + " is a student at " +
            str(self.university) + " studying " +
            str(self.major) + " with the age of " +
            str(self.age) + "."
        })

def main():
    myName = input("What is your name? ")
    myUniversity = input("What is your university's name? ")
    myAge = input("What is your age? ")
    myMajor = input("What is your major? ")
    myself = Student(myName, myUniversity, myAge, myMajor) 
    print(myself.toString())
    myself.printString()

main()