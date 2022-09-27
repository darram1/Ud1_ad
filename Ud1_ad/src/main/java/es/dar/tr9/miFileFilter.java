package es.dar.tr9;

import java.io.File;
import java.io.FileFilter;

public class miFileFilter implements FileFilter
{
	public boolean accept(File path) {
		int lastDot = path.getName().lastIndexOf(".");
		return ! path.getName().substring(lastDot+1).equals("txt");
	}
	
}
