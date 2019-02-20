package extra;

public class JamesBond {
	int findCode(Vault v) {

		for (int i = 0; i < 1000000000; i++) {

			if (v.trycode(i)) {

				return i;

			}
		}
		return -1;
	}
}
