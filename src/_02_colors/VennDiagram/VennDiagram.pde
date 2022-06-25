

void draw() {       
 if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
 }
}
void setup() { size(600,600);
fill(255, 0, 0, 100);
ellipse (271, 309, 100, 100);
text("spiders", 244,309);
fill(0,255,0,100);
ellipse (333, 312, 100, 100);
text("unicorns", 308, 311);
fill(0, 0, 255, 100);
ellipse (301, 384, 100, 100);
text("butterflies", 265, 386);
}
