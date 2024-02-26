package taller3.televisores;
public class Control {
private TV tv;
public void turnOn(){
	tv.turnOn();
}
public void turnOff(){
	tv.turnOff();
}
public void canalUp(){
	tv.canalUp();
}
public void canalDown(){
	tv.canalDown();
}
public void volumenUp(){
	tv.volumenUp();
}
public void volumenDown(){
	tv.volumenDown();
}
public void setCanal(int can){
	tv.setCanal(can);
}
public void setVolumen(int can){
	tv.setVolumen(can);
}
public void enlazar(TV tv) {
	this.tv=tv;
	this.tv.setControl(this);
}
public void settv(TV tv1) {
	this.tv=tv1;
}
public TV gettv() {
	return tv;
}
}
