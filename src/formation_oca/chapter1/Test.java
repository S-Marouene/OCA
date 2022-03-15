package formation_oca.chapter1;

public class Test {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		
		Personne p2 = new Personne("marouene");
		
		Personne p3 = new Personne("marouene2",20,16.5);
		
		System.out.println(p1.nom);
		
		System.out.println(p2.nom);
		
		System.out.println(p3.nom);
		/*
		 * byte x = 12;
		 * 
		 * System.out.println(Byte.MIN_VALUE);
		 * 
		 * System.out.println(Byte.MAX_VALUE);
		 * 
		 * 
		 * System.out.println(Integer.MIN_VALUE); System.out.println(Integer.MAX_VALUE);
		 * 
		 * System.out.println(Long.MIN_VALUE); System.out.println(Long.MAX_VALUE);
		 * 
		 * boolean res = true; System.out.println("Res = " + res);
		 * 
		 * String formation="oca"; System.out.println(formation.length());
		 * 
		 * int x=1_000_00_0; System.out.println(x);
		 * 
		 * int _ = 100; System.out.println(_);
		 */

		int x = 100;
		long y = 200;

		long c = 23565547874747655L;

		float ff = 12.5F;

	}

}
