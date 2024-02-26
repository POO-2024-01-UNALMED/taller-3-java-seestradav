package taller3.televisores;

public class TV {
private Marca marca;
private int canal;
private int precio;
private boolean estado;
private int volumen;
private Control control;
private static int numTV=0;
TV(Marca marc,boolean bool){
	if (bool==true) {
		this.estado=true;
	}
	else {
		this.estado=false;
	}
}
TV(){
	this.canal =1;
	this.volumen=1;
	this.precio=500;
}
public void setmarca(Marca mar){
	this.marca=mar;
}
public Marca getmarca() {
	return marca;
}
public void setcanal(int can){
	this.canal=can;
}
public int getcanal() {
	return canal;
}
public void setprecio(int pre){
	precio=pre;
}
public int getprecio() {
	return precio;
}
public void setvolumen(int vol){
	volumen=vol;
}
public int getvolumen() {
	return volumen;
}
public void setcontrol(Control cont){
	control=cont;
}
public Control getcontrol() {
	return control;
}
public void setnumTV(int num){
	numTV=num;
}
public int getnumTV() {
	return numTV;
}
public void turnOn() {
	this.estado =true; 
}
public void turnOff() {
	this.estado =false; 
}
public boolean getestado() {
	return estado;
}
public void canalUp() {
	if(canal<120 && estado==true) {
	canal++;	
	}	
}
public void canalDown() {
	if(canal>1 && estado==true) {
		canal--;	
		}
}
public void volumenUp() {
if(volumen<7 && estado==true) {
volumen++;	
}		
}
public void volumenDown() {
if(volumen>0 && estado==true) {
volumen--;	
}
}

}
