PImage pepperoni;
PImage mushroom;
void setup() {
    size(900,900);
   pepperoni = loadImage("pepperoni.png");
   mushroom = loadImage("mushroom.png");
    }

        
void draw() {
  if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n"); 
}
  fill(255,255,0);
  ellipse(443, 434, 400, 400);
  image(pepperoni,309,285);
  image(pepperoni,246,435);
  
}
 
 
