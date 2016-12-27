package com.tpadsz.img.api;

import org.hibernate.validator.constraints.NotBlank;

import com.tpadsz.exception.SystemAlgorithmException;
import com.tpadsz.img.vo.ImageOffer;

public interface ImageManager {

	public boolean delete(ImageOffer offer);

	String storageURL(ImageOffer offer, @NotBlank String url) throws SystemAlgorithmException;

	String storageLocalFile(ImageOffer offer, String file)	throws SystemAlgorithmException;

	String storageStr(ImageOffer offer, String file) throws SystemAlgorithmException;

	String deleteTaskResult(String publish_url,String md5)	throws SystemAlgorithmException;
	String getTaskStatus(String taskId) throws  SystemAlgorithmException;
	String storageURL(ImageOffer offer, @NotBlank String url,long time) throws SystemAlgorithmException;

	String storageLocalFile(ImageOffer offer, String file,long time)	throws SystemAlgorithmException;

	String storageStr(ImageOffer offer, String file,long time) throws SystemAlgorithmException;

	
}
