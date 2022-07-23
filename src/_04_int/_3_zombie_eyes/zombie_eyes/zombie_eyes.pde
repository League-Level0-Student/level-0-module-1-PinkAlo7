
void setup() {
PImage face = loadImage("scary unicorn face.jpeg");
size(800,800);
face.resize(800,800);
image(face,0,0);

}
void draw() {
  fill(255,0,0);
  ellipse(287,235,110,110);
  fill(255,0,0);
  ellipse(361,245,120,120);
  fill(230,230,230);
  ellipse(287,235,15,15);
  fill(230,230,230);
  ellipse(361,245,15,15);
 
}
