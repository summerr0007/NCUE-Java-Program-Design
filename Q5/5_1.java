import java.util.Scanner;
class CSphere
{
  private int x; // ��ߪ�x �y��
  private int y; // ��ߪ�y �y��
  private int z; // ��ߪ�z �y��
  private int radius; // ��y���b�|
  public void setLocation(int x,int y, int z) {
	  this.x = x;
	  this.y = y;
	  this.z =z;
	  return;
  }
  public void setRadius(int r) {
	this.radius = r;
	return;
  }
  public double surfaceArea() {
	return 4*3.14*Math.pow(radius, 2);
  }
  public double volume() {
	return 4/3*Math.pow(radius, 3)*3.14;
  }
  public void showCenter() {
	System.out.println("("+x+" ,"+y+" ,"+z+")");
  }
  
  CSphere(int x,int y, int z,int r){
	  setLocation(x, y, z);
	  setRadius(r);
  }
}
public class T1 {
	public static void main(String arg[]) {
		int x,y,z,r;
		Scanner scanner = new Scanner(System.in);
		x =scanner.nextInt();
		y =scanner.nextInt();
		z =scanner.nextInt();
		r =scanner.nextInt();
		CSphere cSphere = new CSphere(x, y, z, r);
		cSphere.showCenter();
		System.out.println(cSphere.surfaceArea());
		System.out.println(cSphere.volume());
	}
}
