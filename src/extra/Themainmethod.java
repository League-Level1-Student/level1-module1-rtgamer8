package extra;

public class Themainmethod {
public static void main(String[] args) {
	JamesBond James = new JamesBond();
	Vault v = new Vault();
	
	System.out.println(James.findCode(v));
}
}
