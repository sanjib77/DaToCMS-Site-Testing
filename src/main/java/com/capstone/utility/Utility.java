package com.capstone.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.capstone.browserfactory.BrowserFactory;

public class Utility extends BrowserFactory {
	
	
	public void takeSS() throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		String destinationFilename = "DatoCMS" + (new Date()).getTime() + ".png";
		File ss = scrShot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("screenshots/" + destinationFilename);
		FileUtils.copyFile(ss,destinationFile);
	}
}
