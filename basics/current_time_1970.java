public class Main {
	public static void main(String[] args) {
		long milli = System.currentTimeMillis() ;
		long cs, ts, tmin, chour, cmin, hour, cday, tday;
		ts = System.currentTimeMillis() / 1000;
		tmin = ts / 60;
		cs = ts % 60;
		hour = tmin / 60;
		cmin = tmin % 60;
		tday = hour / 24;
		chour = hour % 24;
//	cday=tday%60;
		System.out.println("Time Now");
		System.out.println("  H : M : S\n  " + chour + "  " + cmin + "  " + cs + "  GMT");
	}
}