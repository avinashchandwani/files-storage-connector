package com.file.viewer.ui.entity;
/**
 * A POJO representation of DropBox File/Folder record this is used to display
 * on UI and hold the list for a given folder
 * 
 * @author chaav03
 *
 */
public class DropBoxRecord {
	private String fileName;
	private String parentPath;
	private String type;

	public DropBoxRecord(String parentPath, String fileName, String type) {
		this.parentPath = parentPath;
		this.fileName = fileName;
		this.type = type;
	}

	public String getParentPath() {
		return this.parentPath;
	}

	public void setParentPath(String completePath) {
		this.parentPath = completePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "DropBoxRecord [completePath=" + parentPath + ", fileName=" + fileName + ", type=" + type + "]";
	}
}