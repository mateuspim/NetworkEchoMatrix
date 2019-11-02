package networkEcho_MATRIX;

/**
 * This class starts the multitask server.
 * 
 * @author
 * @version 1.0
 * @since version 1.0
 */
public class ServerStart {
	private static final String module = "Multitask Server";

	/**
	 * The main server program.
	 */
	public static void main(String[] args) {
		System.out.println(Info.getUniformTitle());
		System.out.println(module + " running.");
		System.out.println();

		MultitaskServer server = new MultitaskServer(module);
		server.startServer();
	}
}