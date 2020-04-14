for (int i = 99; i > 0; i--) {
  print(i + " bottles of beer on the wall, " + i + " bottles of beer." + 
  " Take one down pass it around, " + (i-1) + " bottles of beer on the wall. ");
  if (i==1) {
   print(i + " bottles of beer on the wall, " + i + " bottles of beer." + 
  " Take one down pass it around, no more bottles of beer on the wall. ");
  }
  if (i<1) {
    print("No more bottles of beer on the wall, no more bottles of beer." + 
  " Go to the store and buy some more, 99 bottles of beer on the wall.");
  // to go infinetly// i = 99; change i > 0 to i > -1;
  }
  
}
