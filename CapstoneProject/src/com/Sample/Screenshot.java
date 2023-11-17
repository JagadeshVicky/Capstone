package com.Sample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
		
		public static String getScreenshot(WebDriver driver) throws IOException
		{
			
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			String destination = String.valueOf(System.getProperty("user.dir")) +"/Screenshots/" +timestamp+ ".png";


			
			File Dest = new File(destination);
			
			FileUtils.copyFile(source, Dest);
			return destination;
			
		}

}
