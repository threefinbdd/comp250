import math

def readFile():
    flowerInfo = list()
    inputFileInfo = open("Flowers.txt")
    for line in inputFileInfo:
        lineSplit = line.split()
        lineOfInfo = list()
        for info in lineSplit:
            lineOfInfo.append(info.strip())
        flowerInfo.append(lineOfInfo)
    return flowerInfo

def main():
        # 1.  Read in Text File
        # 2.  Store Information of Text File
        flowerInfo = readFile()

        # 3.  Print Inventory Menu to User
        print("Thank you for visiting the Flower Shop!")
        print("A list of our current blooming flowers are:  ")
        for flower in flowerInfo:
            for info in flower:
                print(info, end=" ")
            print("", end="\n")

        # 4.  Begin Loop for Receipt generation
        receipt = list()
        total = 0.00
        while(True):
            userInput = ""  #   Fill these fields in every iteration
            flowerType = "" #   Assists in the "receipt" generation
            individual = 0.00
            bouquet = 0.00
            # 5.  Prompt User what flower they would like to purchase
            #  Subtask - validate input
            validInput = False
            while(not validInput):
                userInput = input("What flower would you like from the selection? ").lower()
                for flower, cost, bulk in flowerInfo:
                    if(str(flower).lower() == str(userInput.strip())):
                        validInput = True
                        flowerType = str(userInput)
                        individual = float(cost)
                        bouquet = float(bulk)
                        break

            # 6.  Prompt User quantity of flower
            userCount = int(input("How many would you like to buy? "))

            # 7.  Conditional:  Suggest a Bouquet based on Quantity * Individual Cost
            subTotal = userCount * individual
            countOfBouquet = math.floor(subTotal/bouquet)
            formatting = "Individual"  
            if((subTotal) > bouquet):
                userConfirm = input("Would you like purchase bouquets instead? ")
                if((userConfirm.strip()).lower() == 'y'):
                    subTotal = bouquet*countOfBouquet 
                    count = countOfBouquet
                    formatting = "Bouquet"
                    
                else:
                    count = userCount
            
            # 8.  Write the below format to Receipt Output File:
            #     "[FlowerType] [Individual or Bouquet] x[Quantity] [TotalCost]"
            content = (str(userInput) + "\t" +
                    formatting + " x" + str(count) + "\t" + 
                    str(subTotal) )
            receipt.append(content) # list of receipt lines
            total += subTotal
            # 9.  Prompt User if they would like to purchase another flower        
            #      -if Yes, loop back to 4)
            userConfirm = input("Would you like to purchase more flowers? ")
            if((userConfirm.strip()).lower() == 'n'):
               break

        # 10. Save and Close Written Receipt Output File
        out = open("FlowerShopReceipt.txt", "w")
        for line in receipt:  #  utilize the list of "content" to write to a file
            out.write(line + "\n")
            out.write("\n")
        out.write("\t\t Total: " + str(total))
        # 11. Exit program
        print("Have a nice day, see you again next time!")

main()