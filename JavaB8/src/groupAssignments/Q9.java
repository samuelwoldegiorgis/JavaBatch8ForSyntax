package groupAssignments;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int sum=0;
			String[][]country= {
					{"Mexico","America","Canada"},
					{"Brazil","Argentina","Peru","Chile"},
					{"Britain","France","Germany","Spain"},
					{"Chad","Nigeria","Egypt","South Africa"},
					{"India","Russia","China","Pakistan"}
			};
				for(int i=0; i<country.length; i++) {
					for(int j=0; j<country[i].length;j++) {
						System.out.print(country[i][j]+"   ");
						sum=country.length*country[j].length-1;
					}System.out.println();
				}
				System.out.println(sum);

	}

}
