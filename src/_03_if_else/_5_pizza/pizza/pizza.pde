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
  image(pepperoni,288,480);
  image(pepperoni,419,282);
  image(pepperoni,540,361);
  image(mushroom,498,296);
  image(mushroom,347,327);
  image(pepperoni,265,313);
  image(mushroom,252,409);
  image(mushroom, 380,537);
  image(pepperoni, 469,507);
  image(mushroom, 514, 437);
  image(pepperoni, 330,240);
  image(pepperoni, 373,447);
  image(mushroom, 422, 379);
  
}
 
 
