package com.elenverve.dynamic;

import com.elenverve.dpo.BannerDpo;
import com.elenverve.dpo.BannerDpo.Slide;
import com.elenverve.dpo.BannerDpo.Slide.Overlay;




public class TestBanner {

	public static void main(String arg[]){
		
		//Banner
		BannerDpo banner = new BannerDpo();
		banner.setDataTransition(BannerDpo.CURTAIN_VERTICAL_3D);
		
		
		//Slide 1
		Slide slide = banner. new Slide();
		slide.setBackGroundImageUrl("slide1.jpg");
		slide.setDataBgPosition(BannerDpo.LEFT_TOP);
		
		// Overlay 1
		Overlay overlay = slide.new Overlay();
		overlay.setCssClass(BannerDpo.TP_CAPTION_LFL);
		overlay.setDataEasing("Back.easeOut");
		overlay.setDataX(-20);
		overlay.setImageUrl("boy.png");
		
		slide.addOverlay(overlay);
		
		// Overlay 2
		overlay = slide.new Overlay();
		overlay.setCssClass(BannerDpo.TP_CAPTION_LFR);
		overlay.setDataX(290);
		overlay.setImageUrl("girl1.png");		
		slide.addOverlay(overlay);		
		banner.addSlide(slide);		
	}
}
