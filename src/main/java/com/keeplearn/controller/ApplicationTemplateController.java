package com.keeplearn.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationTemplateController {
	
/*	public static void main(String[] args) {
		
		
	}*/
	
		@RequestMapping(value="home", method=RequestMethod.GET)
		public String getFirstTemplate(){
			return "home";
		}
		
		
		@RequestMapping(value="imageURL", method = RequestMethod.GET)
		public void getImageIcon(@RequestParam(value="displayPic") String displayPic ,HttpServletResponse response){
			getImage(response,displayPic);
		}
		
		
		public void getImage(HttpServletResponse response, String dispalyPic) 
		{
		        
		        try {
		        	
		 
		        	String ext = FilenameUtils.getExtension(dispalyPic);
		            response.setContentType("image/"+ext);
		            File file = new File(dispalyPic);
		            BufferedImage image = ImageIO.read(file);
		            OutputStream baos = response.getOutputStream();
		            ImageIO.write(image, ext, baos);
		            baos.flush();
		            baos.close();
		        } catch (FileNotFoundException e) {
		        	System.out.println("Exception  :"+ e);
		        } catch (IOException e) {
		        	System.out.println("Exception  :"+ e);
		        } catch(Exception e) {
		        	System.out.println("Exception  :"+ e);
		        }
		        
		        return;
		}
		
		
}
