package com.peoplesoft.pt.automation.utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.MessageDigest;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.xml.crypto.Data;

import org.apache.poi.xssf.usermodel.BaseXSSFEvaluationWorkbook;

/**
 * @author xiaolson
 *
 */
/**
 * @author xiaolson
 *
 */
/**
 * @author xiaolson
 *
 */
public class FileUtil {

	/**
	 * @param path File Path
	 * @return File create date
	 */
	public static Date getCreateDate(String path) {
		Path p = Paths.get(path);
		BasicFileAttributes attributes = null;
		try {
			attributes = Files.readAttributes(p, BasicFileAttributes.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Long l = attributes.creationTime().toMillis();
		Date date = new Date(l);
		return date;
	}

	/**
	 * 
	 * @param fileA image file
	 * @param fileB image file
	 * @return compare result
	 */

	public static boolean compareImage(File fileA, File fileB) {

		BufferedImage biA = null;
		try {
			biA = ImageIO.read(fileA);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataBuffer dbA = biA.getData().getDataBuffer();

		int sizeA = dbA.getSize();

		BufferedImage biB = null;
		try {
			biB = ImageIO.read(fileB);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataBuffer dbB = biB.getData().getDataBuffer();
		int sizeB = dbB.getSize();
		if (sizeA == sizeB) {
			for (int i = 0; i < sizeA; i++) {
				if (dbA.getElem(i) != dbB.getElem(i)) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 
	 * @param fileA image file path
	 * @param fileB image file path
	 * @return compare result True image file is the same False image fils is not
	 *         the same
	 */
	public static boolean compareImage(String fileA, String fileB) {

		return compareImage(new File(fileA), new File(fileB));

	}

	public static String getContent(File file) {
		int i = 0;
		String sNewLine = System.getProperty("line.separator");
		BufferedReader reader = null;
		String sCurrLine = "";
		String sAllLines = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((sCurrLine = reader.readLine()) != null) {
				sAllLines = sAllLines + sCurrLine + sNewLine;
				i++;
			}
			reader.close();
			if (i == 1) {
				int iAllLine = sAllLines.length();
				sAllLines = sAllLines.substring(0, iAllLine - 1);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sAllLines;

	}
	/**
	 * Get File MD5 value
	 * 
	 * @param filePath
	 * 			path
	 * @return	MD5 string
	 * @throws IOException
	 */
	public static String getFIleMD5(String filePath) {
		File file = new File(filePath);
		if (!file.exists()) {
			return null;
		}
		MessageDigest digest = null;
		FileInputStream inputStream = null;
		byte buffer[] = new byte[1024];
		int len = 0;
		try {
			digest = MessageDigest.getInstance("MD5");
			inputStream = new FileInputStream(file);
			while ((len = inputStream.read(buffer, 0, 1024)) != -1) {
				digest.update(buffer, 0, len);
			}
			inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		BigInteger bigInteger = new BigInteger(1, digest.digest());
		return bigInteger.toString(16);

	}
	
	public static boolean compareFileByMD5(String filePathA,String filePathB) {
		
		if(getFIleMD5(filePathA).equals(getFIleMD5(filePathB))) {
			return true;
		}
		return false;
		
	}
}
