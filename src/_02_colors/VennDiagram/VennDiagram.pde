

void draw() {       
 if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
 }
}
void setup() { size(600,600);
fill(255, 0, 0, 100);
ellipse (271, 309, 100, 100);
fill (0,255,0);
text("spiders", 240,313);
fill(0,255,0,100);
ellipse (333, 312, 100, 100);
fill (0, 0, 255);
text("unicorns", 308, 311);
fill(0, 0, 255, 100);
ellipse (301, 384, 100, 100);
fill(255,0,0);
text("butterflies", 265, 386);
}
