/**mojgan
 *hej hej
 * @author Mojgan
 *
 */
public class sleepIn {

	public static void main(String[] args) {
		sleepIn(false,false);
	}
		public static boolean sleepIn(boolean weekday, boolean vacation) {
			if (!weekday || vacation) {
				return true;
			}
  
			return false;
		}

}
