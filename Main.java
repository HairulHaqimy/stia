
public class Main {

	public static void main(String[] args) {
		
		ClassPhone a = new ClassPhone();
		System.out.println(a.Brand);
		
		ClassPhone b = new ClassPhone();
		System.out.println(b.Colour);
								
		ClassPhone c = new ClassPhone();
		c.waterproof();
		
		System.out.println();
		
		ClassPhone1 d = new ClassPhone1();
		System.out.println(d.Brand);
		
		ClassPhone1 e = new ClassPhone1();
		System.out.println(e.Colour + " in colour");
		
		ClassPhone1 f = new ClassPhone1();
		f.waterproof();
		
        System.out.println();
		
		ClassPhone2 g = new ClassPhone2();
		System.out.println(g.Brand);
		
		ClassPhone2 h = new ClassPhone2();
		System.out.println(h.Colour + " in colour");
		
		ClassPhone2 i = new ClassPhone2();
		i.waterproof();

	}

}