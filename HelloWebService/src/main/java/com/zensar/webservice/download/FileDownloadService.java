package com.zensar.webservice.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class FileDownloadService {
 private static final String textFile = "D:\\text.txt";
 private static final String imageFile = "D:\\Avani\\HTML_CSS\\images\\room.jpg";
 private static final String pdfFile = "D:\\Avani\\HTML_CSS\\payslip.pdf";
 
 @GET
 @Path("/text")
 @Produces("text/plain")
 public Response getTextFile() {
	 File file = new File(textFile);
	  ResponseBuilder builder = Response.ok(file);
	 builder.header("Content-Disposition", "attachment; filename=downloadedFile.txt");
	 return builder.build();
 }
 @GET
 @Path("/image")
 @Produces("image/jpg")
 public Response getImageFile() {
	 File file = new File(imageFile);
	 ResponseBuilder builder = Response.ok(file);
	 builder.header("Content-Disposition", "attachment; filename=Room_Image.jpg");
	 return builder.build();
 }
 @GET
 @Path("/pdf")
 @Produces("application/pdf")
 public Response getPdfFile() {
	 File file = new File(pdfFile);
	 ResponseBuilder builder = Response.ok(file);
	 builder.header("Content-Disposition", "attachment; filename= newfile.pdf");
	 return builder.build();
 }
 
 
}
