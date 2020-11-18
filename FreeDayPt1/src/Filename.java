public class Filename {

	private String fullPath;
	private char pathSeparator, extensionSeparator;

	public Filename(String fullPath, char pathSeperator, char extensionSeperator) {
		this.fullPath = fullPath;
		this.pathSeparator = pathSeperator;
		this.extensionSeparator = extensionSeperator;
	}

	public String extension(){
		int dot = fullPath.lastIndexOf(this.extensionSeparator);
		return fullPath.substring(dot + 1);
	}

	public String filename(){
		int dot = fullPath.lastIndexOf(this.extensionSeparator);
		int separator = fullPath.lastIndexOf(this.pathSeparator);
		return fullPath.substring(separator + 1, dot);
	}

	public String path(){
		int separator = fullPath.lastIndexOf(this.pathSeparator);
		return fullPath.substring(0, separator + 1);
	}

	
}
