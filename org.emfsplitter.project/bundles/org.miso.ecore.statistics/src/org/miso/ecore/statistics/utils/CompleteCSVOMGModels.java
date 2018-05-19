package org.miso.ecore.statistics.utils;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.Test;

public class CompleteCSVOMGModels {

	private static final CharSequence NEW_LINE_SEPARATOR = "\n";

	@Test
	public void test() {
		
		IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject("org.miso.omg.models");		
		IFolder iFolder = iProject.getFolder("/omgModels");
			
		try {
			FileWriter fileWriter = new FileWriter(iFolder.getLocation().toString().concat("/completeCSV.csv"));
			
			IResource[] members = iFolder.members();
			for (int i = 0; i < members.length; i++) {
				
				IResource currentFolder = members[i];
				
				if (currentFolder instanceof IFolder) {
					
					 FileReader fileReader = new FileReader(currentFolder.getLocation().toString().concat("/StatistiscEcoreZooModularPattern.csv"));
					 
					 BufferedReader bufferedReader = new BufferedReader(fileReader);
					 String line;
					 String[] tokenizedLine;
					 line = bufferedReader.readLine();
					 if (i == 0) {
						 fileWriter.append(line);
						 fileWriter.append(NEW_LINE_SEPARATOR);
					 }
					 while ((line = bufferedReader.readLine()) != null) {
						 fileWriter.append(line);
						 fileWriter.append(NEW_LINE_SEPARATOR);
					 }				
				}				
			}	
			
			fileWriter.flush();
			fileWriter.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("End");
	}

}
