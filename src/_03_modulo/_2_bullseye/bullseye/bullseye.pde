
void setup() {
 
  // set the size of your sketch
  size(250, 250);
}

void draw() {
  for (int i = 0; i < 9; i++) {
  if (i % 2 == 0) {
  fill(#FF0505); 
  }
  else {
    fill(0,0,0);
  }
  ellipse(125,125,200-(25*i),200-(25*i));
  }
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
