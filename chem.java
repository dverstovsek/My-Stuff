import java.util.Scanner;
class chem
{
    public static void main(String[] args)
    {
      Scanner TBD = new Scanner(System.in);
  	System.out.print("Please enter the section number:  ");
			int section = TBD.nextInt();

// Molality
		if (section == 1) {
			System.out.println();
			System.out.println("****Molality****");
			System.out.print("Please enter your unknown number:  ");
			int unknown = TBD.nextInt();

// 1 = molality is unknown
// 2 = moles are unknown
// 3 = kg solvent is unknown
			if (unknown == 1) {
				System.out.println("-------Unknown = Molality-------");
				System.out.println("Enter the number moles:  ");
				double mol1 = TBD.nextDouble();
				System.out.println("Enter the kilograms of the solvent:  ");
				double kg1 = TBD.nextDouble();
				double m1 = mol1 / kg1;
				System.out.printf("The molality = %4.6f",m1);
			}

			if (unknown == 2) {
				System.out.println("-------Unknown = Moles-------");
				System.out.println("Enter the molality of the solution:  ");
				double m2 = TBD.nextDouble();
				System.out.println("Enter the kilograms of the solvent:  ");
				double kg2 = TBD.nextDouble();
				double mol2 = m2 * kg2;
				System.out.printf("The moles = %4.6f",mol2);

			}
				if (unknown == 3) {
				System.out.println("-------Unknown = Kilograms-------");
				System.out.println("Enter the molality of the solution:  ");
				double m3 = TBD.nextDouble();
				System.out.println("Enter the number moles:  ");
				double mol3 = TBD.nextDouble();
				double kg3 = mol3 / m3;
				System.out.printf("The kilograms of the solvent = %4.6f",kg3);
			}
    	}


// Molarity
		if (section == 2) {
			System.out.println();
			System.out.println("****Molarity****");
			System.out.print("Please enter your unknown number:  ");
			int unknown = TBD.nextInt();

// 1 = molarity is unknown
// 2 = moles are unknown
// 3 = liters solvent is unknown
			if (unknown == 1) {
				System.out.println("-------Unknown = Molarity-------");
				System.out.println("Enter the number moles:  ");
				double mol1 = TBD.nextDouble();
				System.out.println("Enter the liters of the solvent:  ");
				double L1 = TBD.nextDouble();
				double M1 = mol1 / L1;
				System.out.printf("The molality = %4.6f",M1);
			}

			if (unknown == 2) {
				System.out.println("-------Unknown = Moles-------");
				System.out.println("Enter the molarity of the solution:  ");
				double M2 = TBD.nextDouble();
				System.out.println("Enter the liters of the solvent:  ");
				double L2 = TBD.nextDouble();
				double mol2 = M2 * L2;
				System.out.printf("The moles = %4.6f",mol2);

			}
				if (unknown == 3) {
				System.out.println("-------Unknown = Liters-------");
				System.out.println("Enter the molarity of the solution:  ");
				double M3 = TBD.nextDouble();
				System.out.println("Enter the number moles:  ");
				double mol3 = TBD.nextDouble();
				double L3 = mol3 / M3;
				System.out.printf("The kilograms of the solvent = %4.6f",L3);
			}
		}
	}
}
