package com.tpadsz.img.api;

import org.hibernate.validator.constraints.NotBlank;

import com.tpadsz.exception.SystemAlgorithmException;
import com.tpadsz.img.vo.ImageOffer;

public interface ImageManager {
	
	public boolean delete(ImageOffer offer);

	String storageURL(ImageOffer offer, @NotBlank String url) throws SystemAlgorithmException;

	String storageLocalFile(ImageOffer offer, String file)	throws SystemAlgorithmException;
	
	String storageStr(ImageOffer offer, String file) throws SystemAlgorithmException;
	
}
