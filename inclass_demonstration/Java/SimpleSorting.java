class SimpleSorting {

  
  public static void mergeSort(int myList[]){
    int size = myList.length;
    if(size == 1){
      return;
    }
    //  if the original size is even or odd, how does this get handled?
    int[] leftList = new int[size/2];
    int[] rightList = new int[myList.length-(size/2)];
    //  Fill left list and right list respectively
    for(int i = 0; i < myList.length; i++){
      if(i < (myList.length/2)){
        leftList[i] = myList[i]; 
      }else{
        rightList[i-leftList.length] = myList[i];
      }
    }
  
    //  Recursive Call on the new lists
    mergeSort(leftList);
    mergeSort(rightList);
    
    //  Sort My List (Divide-and-Conquer:  O(log(n)))
    //  The lists have been divided in half above, and the recursive call will continue to divide the list in halves per-sorting phase
    //  index for sortedlist along with left and right list
    int leftInd = 0;
    int rightInd = 0;
    int sortInd = 0;
    while(leftInd < leftList.length && rightInd < rightList.length){
      if(leftList[leftInd] <= rightList[rightInd]){  // if left side is less than
        myList[sortInd] = leftList[leftInd];
        leftInd++;  // move to the next left element
      }else{  //  else, the right side is less
        myList[sortInd] = rightList[rightInd];
        rightInd++; // move to the next right element        
      }
      sortInd++;  // fill the next slot for the sortedlist
    }

    //  Merge
  }
  
  public static void main(String[] args) {
    int[] myList = {5, 6, 7, 3, 2, 1, 8};
    System.out.println("Before Sorting");
    for(int i : myList){
      System.out.print(i + " ");
    }
    System.out.println("");

    mergeSort(myList);
    
    System.out.println("After Sorting");
    for(int i : myList){
      System.out.print(i + " ");
    }
    System.out.println("");
  }
}
