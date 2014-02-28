package theApp;

public class CommandRunner {

	public String[] buildCommand() {
		String[] cmdBase;
		String osName = System.getProperties().getProperty("os.name");
		if (osName.indexOf("Windows 9") > -1) { // Win-95, 98
			cmdBase = new String[3];
			cmdBase[0] = "command.com";
			cmdBase[1] = "/c";
			cmdBase[2] = "set";
		} else if ((osName.indexOf("NT") > -1)
				|| (osName.indexOf("Windows 2000") > -1)) {
			cmdBase = new String[3];
			cmdBase[0] = "cmd.exe";
			cmdBase[1] = "/c";
			cmdBase[2] = "set";
		} else {// our last hope, we assume Unix
			cmdBase = new String[3];
			cmdBase[0] = "sh";
			cmdBase[1] = "";
			cmdBase[2] = "export";
		}
		return cmdBase;
	}
}
