void setup() {
    size(500, 500);
}
void draw() {
  if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
    background(300, 200, 200);
    noStroke();
    fill(255,20,20);
    ellipse(263, 223, 150, 150);
    ellipse(305, 225, 150, 150);
    rect(280, 120, 12, 32);
}
}
